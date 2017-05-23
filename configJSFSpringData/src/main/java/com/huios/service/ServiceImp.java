package com.huios.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.huios.dao.springdata.IDaoConseiller;
import com.huios.dao.springdata.IDaoClient;
import com.huios.metier.Client;
import com.huios.metier.Compte;
import com.huios.metier.Conseiller;
import com.huios.metier.Personne;
import com.huios.metier.User;

@Service
public class ServiceImp implements IServiceConseiller {

	@Autowired
	private IDaoClient daoP;
	
	@Autowired
	private IDaoConseiller daoC;
/*
	@Override
	public Conseiller verificationLogin(String login, String pwd) {
		// TODO Auto-generated method stub
		return null;
	}*/

	@Override
	public Collection<Client> listerClientsParConseiller(Conseiller conseiller) {
		return daoP.listerClientsParConseiller(conseiller);
	}

/*	@Override
	public void modifierClient(Client client) {
		daoP.modifierClient(client);
		
	}*/

/*	@Override
	public Collection<Compte> listerComptesClient(Client client) {
		// TODO Auto-generated method stub
		return null;
	}*/

/*	@Override
	public Client retourneClientParId(long idClient) {
		return daoP.findOne(idClient);
	}*/

/*	@Override
	public Compte getCompteParId(long idCompte) {
		// TODO Auto-generated method stub
		return null;
	}*/

/*	@Override
	public Collection<Compte> listerAutresComptes(long idCompte) {
		// TODO Auto-generated method stub
		return null;
	}*/

/*	@Override
	public boolean virementComptes(Compte compteDebiteur, Compte compteCrediteur, double montant) {
		// TODO Auto-generated method stub
		return false;
	}*/

	@Override
	public Conseiller afficherConseiller(long idConseiller) {
		
		return (Conseiller) daoC.findOne(idConseiller);
	}
	
	
	
}
