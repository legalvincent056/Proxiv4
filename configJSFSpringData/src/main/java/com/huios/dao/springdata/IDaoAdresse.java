package com.huios.dao.springdata;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huios.metier.Adresse;

public interface IDaoAdresse extends JpaRepository<Adresse,Long> {

}
