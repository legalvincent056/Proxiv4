package com.huios.dao.springdata;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.huios.metier.Client;
import com.huios.metier.Conseiller;


public interface IDaoClient extends JpaRepository<Client,Long> {

	

	//public Conseiller verificationLogin(String login, String pwd);
	
	
	@Query ("SELECT c FROM Personne c WHERE c.conseiller = :conseiller")
	public Collection<Client> listerClientsParConseiller(Conseiller conseiller);

	

	
	
}
