package com.rest.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.Model.Bank;

public interface BankRepo extends JpaRepository<Bank, Integer> {

}
