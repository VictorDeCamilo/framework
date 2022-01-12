package utils;

import org.apache.commons.lang3.RandomStringUtils;

public class MassaDeDados {

	public void gerarEmails() {
		
		String generatedEmail = RandomStringUtils.randomAlphabetic(2);
		System.out.println("victor" + generatedEmail + "@teste.com");
		
	}
	
	public void gerarNomes() {
		
		String generatedName = RandomStringUtils.randomAlphabetic(2);
		System.out.println("victor" + generatedName);
		
	}
	
}
