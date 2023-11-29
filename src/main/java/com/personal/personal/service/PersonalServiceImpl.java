package com.personal.personal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personal.personal.entity.Personal;
import com.personal.personal.repository.PersonalDao;

@Service
public class PersonalServiceImpl implements PersonalService{

    @Autowired
    PersonalDao personalDao;


    @Override
    public List<Personal> listar() {
       return (List<Personal>) personalDao.findAll();
    }

    @Override
    public Personal verUno(Long id) {
        return personalDao.findById(id).orElse(null);
    }

    @Override
    public Personal registrar(Personal personal) {
        return personalDao.save(personal);
    }

    @Override
    public Personal actualizar(Personal object, Long id) {
        Optional<Personal> objectExistenteOptional = personalDao.findById(id);

        if (objectExistenteOptional.isPresent()) {
			Personal personalExistente = objectExistenteOptional.get();

			personalExistente.setNombre(object.getNombre());
			personalExistente.setFechaNacimiento(object.getFechaNacimiento());
			personalExistente.setHorasLab(object.getHorasLab());
			personalExistente.setCargo(object.getCargo());
			personalExistente.setLugarTrabajo(object.getLugarTrabajo());

            return personalDao.save(personalExistente);
		} else {
			return null;
		}
    }

    @Override
    public void eliminar(Long id) {
        personalDao.findById(id);
    }
    
}
