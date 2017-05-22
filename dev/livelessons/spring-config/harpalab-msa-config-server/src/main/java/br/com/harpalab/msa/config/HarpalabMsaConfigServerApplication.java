package br.com.harpalab.msa.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class HarpalabMsaConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HarpalabMsaConfigServerApplication.class, args);
	}
	
}
