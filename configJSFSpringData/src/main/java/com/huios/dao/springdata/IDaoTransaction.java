package com.huios.dao.springdata;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huios.metier.Transaction;



public interface IDaoTransaction extends JpaRepository<Transaction,Long>{

}
