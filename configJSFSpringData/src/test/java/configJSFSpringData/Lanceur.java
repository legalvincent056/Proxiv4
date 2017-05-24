package configJSFSpringData;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.huios.metier.Adresse;
import com.huios.metier.Client;
import com.huios.metier.Compte;
import com.huios.metier.CompteCourant;
import com.huios.metier.CompteEpargne;
import com.huios.metier.Conseiller;
import com.huios.metier.Gerant;
import com.huios.service.IServiceConseiller;
import com.huios.service.IServiceGerant;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
				//1- Chargement du container et creation des beans
				ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
				//2- récuperation d'un bean
				IServiceGerant isg =  (IServiceGerant) appContext.getBean("serviceImp");
				IServiceConseiller isc = (IServiceConseiller) appContext.getBean("serviceImp");
				Gerant gerant1 = (Gerant) appContext.getBean("gerant");
				Gerant gerant2 = (Gerant) appContext.getBean("gerant");
				Conseiller conseiller1 = (Conseiller) appContext.getBean("conseiller");
				Conseiller conseiller2 = (Conseiller) appContext.getBean("conseiller");
				Client client1 = (Client) appContext.getBean("client");
				Client client2 = (Client) appContext.getBean("client");
				Client client3 = (Client) appContext.getBean("client");
				Client client4 = (Client) appContext.getBean("client");
				Client client5 = (Client) appContext.getBean("client");
				Adresse adresse1 = (Adresse) appContext.getBean("adresse");
				Adresse adresse2 = (Adresse) appContext.getBean("adresse");
				Adresse adresse3 = (Adresse) appContext.getBean("adresse");
				Adresse adresse4 = (Adresse) appContext.getBean("adresse");
				Compte compte1 = (Compte) appContext.getBean("compteCourant");
				Compte compteEp1 = (Compte) appContext.getBean("compteEpargne");
				Compte compte2 = (Compte) appContext.getBean("compteCourant");
				Compte compteEp2 = (Compte) appContext.getBean("compteEpargne");
				Compte compte3 = (Compte) appContext.getBean("compteCourant");
				Compte compteEp3 = (Compte) appContext.getBean("compteEpargne");
			
				//3- traitement
				
				conseiller1 = new Conseiller("Robichet", "Robert", "4565458", "roro69@gmail.fr", "demo", "demo");
				conseiller2 = new Conseiller("TheConseiller", "PrenomCon", "9874556", "Conseiller2@gmail.fr", "demo2", "demo2");
				
				client1 = new Client("ZEZE", "Bernard", "05548922852", "berner@hotmail.fr", null, false);
				client2 = new Client("tutu", "alice", "6584572222", "Atutu@hotmail.fr", null, false);
				client3 = new Client("gaga", "Jojo", "9879495925", "jojotutu@hotmail.fr", "MomoEnterprise", true);
				client4 = new Client("momo", "Lulu", "65484821212", "lulu@hotmail.fr", null, false);
				client5 = new Client("LE BAIL", "Jonathan", "6525482323", "jojodu56@hotmail.fr", null, false);

				adresse1 = new Adresse("rue du chat qui tousse", "69740", "GENAS");
				adresse2 = new Adresse("avenue du chateau", "25148", "LOURDE");
				adresse3 = new Adresse("rue du mouton qui broute", "42563", "SAINT-ETIENNE");
				adresse4 = new Adresse("avenue de la rue", "56240", "QUIBERON");

				compte1 = new CompteCourant(2000, "2009-12-05");
				compte2 = new CompteCourant(3000, "2015-02-25");
				compte3 = new CompteCourant(4000, "2013-06-07");

				compteEp1 = new CompteEpargne(20000, "2008-01-30");
				compteEp2 = new CompteEpargne(10000, "2014-08-02");
				compteEp3 = new CompteEpargne(8500, "2012-05-27");

				// collection clients
				Collection<Client> clients = new ArrayList<Client>();
				clients.add(client1);
				clients.add(client2);
				clients.add(client3);
				clients.add(client4);

				Collection<Client> clients2 = new ArrayList<Client>();
				clients2.add(client5);

				// association conseiller-client
				
				conseiller1.setClients(clients);
				conseiller2.setClients(clients2);

				client1.setConseiller(conseiller1);
				client2.setConseiller(conseiller1);
				client3.setConseiller(conseiller1);
				client4.setConseiller(conseiller1);
				client5.setConseiller(conseiller2);

				// association client-adresse
				client1.setAdresse(adresse1);
				client2.setAdresse(adresse2);
				client3.setAdresse(adresse3);
				client4.setAdresse(adresse4);
				client5.setAdresse(adresse2);// Meme adresse que clien2

				// association client-compte
				Collection<Compte> comptes = new ArrayList<Compte>();
				comptes.add(compte1);
				comptes.add(compteEp1);

				client1.setComptes(comptes);
				compte1.setClient(client1);
				compteEp1.setClient(client1);

				comptes = new ArrayList<Compte>();
				comptes.add(compte2);
				client2.setComptes(comptes);
				compte2.setClient(client2);
			
				
				comptes = new ArrayList<Compte>();
				comptes.add(compteEp2);
				client3.setComptes(comptes);
				compteEp2.setClient(client3);
				

				comptes = new ArrayList<Compte>();
				comptes.add(compte3);
				comptes.add(compteEp3);

				client4.setComptes(comptes);
				compte3.setClient(client4);
				compteEp3.setClient(client4);
				
				//gerant
			
//				// conseiller
				isc

//				// clients
//				em.persist(cl1);
//				em.persist(cl2);
//				em.persist(cl3);
//				em.persist(cl4);
//				// adresses
//				em.persist(a1);
//				em.persist(a2);
//				em.persist(a3);
//				em.persist(a4);
//
//				// comptes
//				em.persist(cc1);
//				em.persist(cc2);
//				em.persist(cc3);
//				em.persist(ce1);
//				em.persist(ce2);
//				em.persist(ce3);
//
//				// Conseiller2
//				em.persist(c2);
//
//				// Client 5
//				em.persist(cl5);
//
//				
//				//4- detruire le context
//				appContext.close();
//				IServiceConseiller.ajouterConseiller(conseiller1);
		
		
		
	}

}
