package com.huios.service;

import com.huios.metier.Compte;
import com.huios.metier.Conseiller;
import com.huios.metier.Gerant;

public interface IServiceGerant {

	public void ajouterConseiller(long idPersonne , Conseiller conseiller);
	public void ajouterGerant(Gerant gerant);
}
