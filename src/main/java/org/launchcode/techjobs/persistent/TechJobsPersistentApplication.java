package org.launchcode.techjobs.persistent;

import org.launchcode.techjobs.persistent.models.AbstractEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TechJobsPersistentApplication extends AbstractEntity {

	public static void main(String[] args) {
		SpringApplication.run(TechJobsPersistentApplication.class, args);
	}

}
