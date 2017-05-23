package configJSFSpringData;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.huios.metier.Conseiller;
import com.huios.service.IServiceConseiller;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
				//1- Chargement du container et creation des beans
				ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
				//2- récuperation d'un bean
				
				
				IServiceConseiller isc = (IServiceConseiller) appContext.getBean("serviceImp");
				
				Conseiller conseiller = (Conseiller) appContext.getBean("conseiller");
				
				conseiller = isc.afficherConseiller(1);
				
				System.out.println(isc.listerClientsParConseiller(conseiller));
				
				
				//SocieteDevLogiciel societe = (SocieteDevLogiciel) appContext.getBean("societe");
				//3- traitement
				System.out.println(conseiller);
				//4- detruire le context
				appContext.close();
		
		
		
	}

}
