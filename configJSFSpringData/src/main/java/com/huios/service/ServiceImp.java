package com.huios.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.huios.dao.springdata.IDaoConseiller;
import com.huios.dao.springdata.IDaoClient;
import com.huios.dao.springdata.IDaoCompte;
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
	
	
	@Autowired
	private IDaoCompte daoCo;

	@Override
	public Conseiller verificationLogin(String login, String pwd) {
		return daoC.verificationLogin(login, pwd);
	}

	@Override
	public Collection<Client> listerClientsParConseiller(Conseiller conseiller) {
		return daoP.listerClientsParConseiller(conseiller);
	}


	@Override
	public Collection<Compte> listerComptesClient(Client client) {
		return daoCo.listerComptesClient(client);
	}

	@Override
	public Client retourneClientParId(long idClient) {
		return daoP.findOne(idClient);
	}
	@Override
	public Compte getCompteParId(long idCompte) {
		return daoCo.findOne(idCompte);
	}

	@Override
	public Collection<Compte> listerAutresComptes(long idCompte) {
		return daoCo.listerAutresComptes(idCompte);
	}

/*	@Override
	public boolean virementComptes(Compte compteDebiteur, Compte compteCrediteur, double montant) {
		
		return null;	
	}*/

	@Override
	public Conseiller afficherConseiller(long idConseiller) {
		
		return (Conseiller) daoC.findOne(idConseiller);
	}

	/*@Override
	public void modifierClient(Client client) {
		// TODO Auto-generated method stub
		
	}*/
	
	
	
}
