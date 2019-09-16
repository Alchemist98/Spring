package com.project.SpringAnn;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MediaTech implements MobileProcessor {

	public void process() {
		// TODO Auto-generated method stub
		System.out.println("2nd Best CPU");
	}

}
