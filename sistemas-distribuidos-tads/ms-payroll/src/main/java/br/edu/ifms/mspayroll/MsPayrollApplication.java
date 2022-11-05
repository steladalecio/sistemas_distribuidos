package br.edu.ifms.mspayroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsPayrollApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsPayrollApplication.class, args);
	}

}
