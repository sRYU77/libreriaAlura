package com.aluracursos.libreriaAlura;

import com.aluracursos.libreriaAlura.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibreriaAluraApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LibreriaAluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.muestraMenu();
	}
}
