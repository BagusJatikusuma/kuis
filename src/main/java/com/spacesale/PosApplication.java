package com.spacesale;

import com.spacesale.model.Kuisioner;
import com.spacesale.repository.KuisionerDao;
import com.spacesale.repository.KuisionerPesertaDao;
import com.spacesale.repository.PesertaDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PosApplication {
	public static final Logger LOGGER = LoggerFactory.getLogger(PosApplication.class);

	public static void main(String[] args) {
		ApplicationContext ctx =
				SpringApplication.run(PosApplication.class, args);

	}
}
