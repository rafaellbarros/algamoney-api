package com.example.algamoney.api.config.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

@ConfigurationProperties("algamoney")
public class AlgamoneyApiProperty {
	
	@Setter @Getter
	private String originPermitida = "http://localhost:8000";
	
	@Getter
	private final Seguranca seguranca = new Seguranca();
	
	public static class Seguranca {
		
		@Setter @Getter
		private boolean enableHttps;
	}

}
