package com.zensar.actuator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;
import com.zensar.repo.*;
@Component
public class OrderInfoActuator implements InfoContributor{
	
	@Autowired
	JSONDataMessagesRepo jsonDataMessagesRepo;
	@Autowired
	XMLDataMessagesRepo xmlDataMessagesRepo;

	@Override
	public void contribute(Builder builder) {
		builder.withDetail("JSON messages count", jsonDataMessagesRepo.count())
		.withDetail("XML messages count", xmlDataMessagesRepo.count());
		
		
		
	}

}
