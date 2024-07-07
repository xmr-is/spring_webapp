package com.example.its.web.form;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginForm implements Serializable {
    private String esqId;
    private String password;

    public String setEsqId(String esqId) {
        this.esqId = esqId;
        return esqId;
    }

    public String getEsqId() {
        return esqId;
    }

    public String setPassword(String password) {
        this.password = password;
        return password;
    }

    public String getPassword() {
        return password;
    }

}
