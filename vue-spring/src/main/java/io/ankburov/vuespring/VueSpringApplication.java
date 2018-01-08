package io.ankburov.vuespring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class VueSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(VueSpringApplication.class, args);
	}
}
