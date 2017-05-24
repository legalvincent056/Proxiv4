package com.huios.mbeans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.annotation.SessionScope;

import com.huios.metier.Gerant;
import com.huios.service.IServiceConseiller;
@Controller
@SessionScope
public class GerantBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 448662768824935812L;
	@Autowired
	private IServiceConseiller service;
	@Autowired
	private static Gerant gerant;
	
	
	public Gerant getGerant() {
		return gerant;
	}
	public void setGerant(Gerant gerant) {
		this.gerant = gerant;
	}
	public IServiceConseiller getService() {
		return service;
	}
	public void setService(IServiceConseiller service) {
		this.service = service;
	}

}
