package com.fredson.dsclient.dto;

import com.fredson.dsclient.entities.Client;

import java.io.Serializable;
import java.time.Instant;

public class ClientDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private String cpf;
    private Instant birthDate;
    private Double income;
    private Integer children;

    public ClientDTO(String name, String cpf, Instant birthDate, Double income, Integer children) {
        this.name = name;
        this.cpf = cpf;
        this.birthDate = birthDate;
        this.income = income;
        this.children = children;
    }

    public ClientDTO(Client client) {
        this.id = client.getId();
        this.name = client.getName();
        this.cpf = client.getCpf();
        this.birthDate = client.getBirhDate();
        this.income = client.getIncome();
        this.children = client.getChildren();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Instant getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Instant birthDate) {
        this.birthDate = birthDate;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public Integer getChildren() {
        return children;
    }

    public void setChildren(Integer children) {
        this.children = children;
    }
}
