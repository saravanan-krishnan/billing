package com.example.demo.db;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@EnableAutoConfiguration
public class Employee {
    @Id
    @JsonInclude
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
    private Long id;
    private String firstName;
    private String lastName;
    private String inputEmail;
    private String inputAddress;
    private String inputAddress2;
    private String inputState;
    private int inputZip;

    @Override
    public String toString() {
        return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", inputEmail="
                + inputEmail + ", inputAddress=" + inputAddress
                + ", inputAddress2=" + inputAddress2 + ", inputState=" + inputState
                + ", inputZip=" + inputZip + "]";
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getInputEmail() {
        return inputEmail;
    }

    public void setInputEmail(String inputEmail) {
        this.inputEmail = inputEmail;
    }

    public String getInputAddress() {
        return inputAddress;
    }

    public void setInputAddress(String inputAddress) {
        this.inputAddress = inputAddress;
    }

    public String getInputAddress2() {
        return inputAddress2;
    }

    public void setInputAddress2(String inputAddress2) {
        this.inputAddress2 = inputAddress2;
    }

    public String getInputState() {
        return inputState;
    }

    public void setInputState(String inputState) {
        this.inputState = inputState;
    }

    public int getInputZip() {
        return inputZip;
    }

    public void setInputZip(int inputZip) {
        this.inputZip = inputZip;
    }
}
