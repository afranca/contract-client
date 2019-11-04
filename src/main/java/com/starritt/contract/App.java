package com.starritt.contract;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.starritt.contract.client.ContractClient;
import com.starritt.contract.dto.Contract;

@SpringBootApplication
public class App implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(App.class);
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		
	}
	
	@Autowired
	private ContractClient contractClient;

	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Contract contracts = contractClient.getContract(3);
		logger.info("Response: {}", contracts);
		logger.info("Response: {}", contracts.getName());
		logger.info("Response: {}", contracts.getId());
		
	}

}
