package com.delta_airlines.utilities;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Component
public class EmailServiceimpl implements EmailService {
	
	@Autowired
	private JavaMailSender sender;
	

	@Override
	public void sendEmail(String toAddress, String filePath) {
		MimeMessage message=sender.createMimeMessage();
		try {
				MimeMessageHelper messageHelper=new MimeMessageHelper(message,true);
				messageHelper.setTo(toAddress);
				messageHelper.setSubject("Itinerary of Flight");
				messageHelper.setText("Please find the attachment");
				messageHelper.addAttachment("Itinerary", new File(filePath));
				sender.send(message);
			}catch(MessagingException e) {
				e.printStackTrace();
			}
}
	
}
