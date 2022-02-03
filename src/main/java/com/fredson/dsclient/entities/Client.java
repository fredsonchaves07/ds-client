package com.fredson.dsclient.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Entity
@Table(name = "tb_client")
public class Client implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant birhDate;
    
    private String name;
    private String cpf;
    private Double income;

    private Integer children;

    public Client() {}

    public Client(Instant birhDate, String name, String cpf, Double income, Integer children) {
        this.birhDate = birhDate;
        this.name = name;
        this.cpf = cpf;
        this.income = income;
        this.children = children;
    }

    public Long getId() {
        return id;
    }

    public Instant getBirhDate() {
        return birhDate;
    }

    public void setBirhDate(Instant birhDate) {
        this.birhDate = birhDate;
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
