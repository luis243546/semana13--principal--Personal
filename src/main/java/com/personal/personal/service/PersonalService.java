package com.personal.personal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.personal.personal.entity.Personal;

@Service
public interface PersonalService {

    public List<Personal> listar();
	
	public Personal verUno(Long id);

    public Personal registrar(Personal personal);

    public Personal actualizar(Personal personal, Long id);

    public void eliminar(Long id);
}
