package com.ruoyi.begin.common.core.domain;

public class LoginBody {
    private String username;
    private String password;
    private String code;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public LoginBody() {
    }

    public LoginBody(String username, String password, String code, String uuid) {
        this.username = username;
        this.password = password;
        this.code = code;
        this.uuid = uuid;
    }

    private String uuid;

}
