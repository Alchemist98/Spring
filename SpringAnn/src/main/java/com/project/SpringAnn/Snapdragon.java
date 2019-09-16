package com.project.SpringAnn;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Snapdragon implements MobileProcessor {

	public void process() {
		// TODO Auto-generated method stub
		System.out.println("World best cpu");
	}

}
