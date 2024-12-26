package com.codedemonbr.rest_api_bootcamp.controller.dto;

import com.codedemonbr.rest_api_bootcamp.domain.model.Account;

import java.math.BigDecimal;

public record  AccountDto(Long id, String number, String agency, BigDecimal balance, BigDecimal limit) {
    public AccountDto(Account model){
        this(model.getId(), model.getNumber(), model.getAgency(), model.getBalance(), model.getLimit());
    }

    public Account toModel(){
        Account model = new Account();
        model.setId(this.id);
        model.setNumber(this.number);
        model.setAgency(this.agency);
        model.setBalance(this.balance);
        model.setLimit(this.limit);
        return model;
    }
}
