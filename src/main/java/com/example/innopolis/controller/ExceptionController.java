package com.example.innopolis.controller;

import com.example.innopolis.enums.ERROR_CODES;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

@ControllerAdvice
public class ExceptionController {

    private static final int DATA_TOO_LONG_MYSQL_ERROR_CODE = 1406;
    private static final Logger log = LoggerFactory.getLogger(ExceptionController.class);

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<Object> exception(DataIntegrityViolationException e, WebRequest request) {
        String exceptionMsg = e.getMostSpecificCause().getMessage();
        ERROR_CODES errorCodeByException = checkCauseAndGetErrorCode(e);

        log.debug(String.format("Exception with cause %s and message %s", errorCodeByException, exceptionMsg));

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp:", LocalDateTime.now());
        body.put("error code:", errorCodeByException.getCode());
        body.put("message:", exceptionMsg);

        return new ResponseEntity<>(body, HttpStatus.CONFLICT);
    }

    private ERROR_CODES checkCauseAndGetErrorCode(DataIntegrityViolationException e) {
        if (e.getMostSpecificCause() instanceof SQLException) {
            SQLException mostSpecificCause = (SQLException) e.getMostSpecificCause();
            return getErrorCodeBySQLException(mostSpecificCause);
        }
        return ERROR_CODES.CONFLICT_IN_DB;
    }

    private ERROR_CODES getErrorCodeBySQLException(SQLException cause) {
        int causeErrorCode = cause.getErrorCode();
        if (causeErrorCode == DATA_TOO_LONG_MYSQL_ERROR_CODE) {
            return ERROR_CODES.DATA_TOO_LONG;
        }
        return ERROR_CODES.CONFLICT_IN_DB;
    }
}
