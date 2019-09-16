package com.project.SpringAnn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//if you don't give id a name then eclipse will give it a default name which will be same as your class name
@Component("mySamsung")
public class Samsung {
	@Autowired
	MobileProcessor cpu;
	
	
	public MobileProcessor getCpu() {
		return cpu;
	}



	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}



	public void Config() {	
		
		System.out.println("Octa Core 4GB RAM");
		cpu.process();
	}
}
