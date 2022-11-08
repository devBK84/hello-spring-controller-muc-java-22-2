package de.neuefische.hellospringcontrollermucjava222;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
REST Controller
Bereitstellen von REST Endpunkten
@RequestMapping
gibt path an
@GetMapping
stellt Get REST Endpunkt bereit
ruft in der Regel eine Service-Methode auf
gibt Object als Json zurück
 */
@SpringBootApplication
public class HelloSpringControllerMucJava222Application {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringControllerMucJava222Application.class, args);
	}


}
