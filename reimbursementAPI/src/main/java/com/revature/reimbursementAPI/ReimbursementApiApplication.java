package com.revature.reimbursementAPI;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ReimbursementApiApplication {

	private static final Logger LOGGER = LogManager.getLogger(ReimbursementApiApplication.class);

	public static void main(String[] args) {
		try {

			SpringApplication.run(ReimbursementApiApplication.class, args);
			LOGGER.info("app running");
		}
		catch (Exception ex) {
			throw ex;
		}
	}

}
