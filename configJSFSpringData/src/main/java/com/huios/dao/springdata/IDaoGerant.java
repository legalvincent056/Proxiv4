package com.huios.dao.springdata;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.huios.metier.Conseiller;
import com.huios.metier.Gerant;

public interface IDaoGerant extends JpaRepository<Gerant,Long>{

	@Query ("SELECT c FROM Conseiller c WHERE c.gerant = :gerant")
	public Collection<Conseiller> listerConseillerParGerant(@Param("gerant") Gerant gerant);
	
	
	@Query("SELECT g FROM Gerant g WHERE g.login = :login AND g.pwd = :pwd")
	public Gerant verificationLoginGerant(@Param("login")String login,@Param("pwd") String pwd);
}
