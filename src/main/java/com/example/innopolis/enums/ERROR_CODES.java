package com.example.innopolis.enums;

public enum ERROR_CODES {

    CONFLICT_IN_DB(1),
    DATA_TOO_LONG(2);

    private int code;

    ERROR_CODES(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
