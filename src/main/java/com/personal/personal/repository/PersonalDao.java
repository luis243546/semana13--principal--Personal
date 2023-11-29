package com.personal.personal.repository;

import org.springframework.data.repository.CrudRepository;

import com.personal.personal.entity.Personal;

public interface PersonalDao extends CrudRepository<Personal, Long>{
    
}
