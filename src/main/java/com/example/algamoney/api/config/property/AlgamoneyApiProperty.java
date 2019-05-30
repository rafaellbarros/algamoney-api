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
	
	@Getter
	private final Mail mail = new Mail();
	
	@Getter
	private final S3 s3 = new S3();
	
	public static class Seguranca {
		
		@Setter @Getter
		private boolean enableHttps;
	}
	
	@Setter @Getter
	public static class Mail {
		private String host;
		private Integer port;
		private String username;
		private String password;
	}
	
	@Setter @Getter
	public static class S3 {
		private String accessKeyId;
		private String secretAccessKey;
		private String bucket = "aws-algamoney-dev-arquivos";
	}

}
