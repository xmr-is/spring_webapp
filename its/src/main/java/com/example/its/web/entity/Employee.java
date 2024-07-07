package com.example.its.web.entity;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee implements Serializable {

    private String esqId;
    private String password;
    private String employeeName;

    public String getEsqId() {
        return esqId;
    }

    public String setEsqId(String esqId) {
        this.esqId = esqId;
        return esqId;
    }

    public String getPassword() {
        return password;
    }

    public String setPassword(String password) {
        this.password = password;
        return password;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
        return employeeName;
    }
}
