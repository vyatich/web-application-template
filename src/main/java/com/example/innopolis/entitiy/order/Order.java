package com.example.innopolis.entitiy.order;

import com.example.innopolis.entitiy.user.UserInfo;
import com.example.innopolis.entitiy.user.UserInfoDto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Transient;
import java.util.Objects;

public class Order {

    private Integer id;
    private Integer odredId;
    private UserInfo userInfo;
    @Transient
    private Integer sumCost;

    @JsonIgnore
    public UserInfo getUserInfo() {
        return userInfo;
    }

    @JsonIgnore
    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    @JsonProperty("userInfo")
    public UserInfoDto getUserInfoDto() {
        UserInfoDto userInfoDto = new UserInfoDto();
        userInfoDto.setId(userInfo.getId());
        return userInfoDto;
    }

    @JsonProperty("userInfo")
    public void setUserInfoDto(UserInfoDto userInfoDto) {
        UserInfo userInfo = new UserInfo();
        userInfo.setId(userInfoDto.getId());
        this.userInfo = userInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id) &&
                Objects.equals(odredId, order.odredId) &&
                Objects.equals(userInfo, order.userInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
