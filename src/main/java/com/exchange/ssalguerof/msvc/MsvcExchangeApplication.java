package com.exchange.ssalguerof.msvc;

import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Encoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.security.Key;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.exchange.ssalguerof.msvc.conversiondivisas.client")
public class MsvcExchangeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsvcExchangeApplication.class, args);

		/*BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String rawPassword = "password";
		String encodedPassword = encoder.encode(rawPassword);

		System.out.println( "passbase: "+ encodedPassword);


		Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);
		String encodedKey = Encoders.BASE64.encode(key.getEncoded());
		System.out.println("Generated Key: " + encodedKey);*/
	}

}
