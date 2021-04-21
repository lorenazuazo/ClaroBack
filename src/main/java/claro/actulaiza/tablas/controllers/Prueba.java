package claro.actulaiza.tablas.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import claro.actulaiza.tablas.entities.Internacional;
import claro.actulaiza.tablas.repositories.InternacionalRepository;


@Controller
@RequestMapping("/api")
public class Prueba {
	
	@Autowired
	InternacionalRepository interRepo;
	
	@GetMapping("/prueba")
	public ResponseEntity<?> consultar() {
		try {
			Optional<Internacional> a = interRepo.findById("KA");
			return ResponseEntity.ok(a);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
		
	}

}
