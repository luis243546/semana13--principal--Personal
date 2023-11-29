package com.personal.personal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.personal.personal.entity.Personal;
import com.personal.personal.service.PersonalService;

@RestController
public class PersonalController {
    @Autowired
    PersonalService personalService;

    @GetMapping("/lista")
	public List<Personal> verTodo() {
		return personalService.listar();
	}

	@GetMapping("/lista/{id}")
	public Personal verUno(@PathVariable Long id) {
		return personalService.verUno(id);
	}

	@PostMapping("/registrar")
	public Personal registar(@RequestBody Personal personal){
		return personalService.registrar(personal);
	}

	@PutMapping("/actualizar/{id}")
	public Personal actualizar(@RequestBody Personal personal, @PathVariable Long id){
		return personalService.actualizar(personal,id);
	}

	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable Long id){
		personalService.eliminar(id);
	}
}
