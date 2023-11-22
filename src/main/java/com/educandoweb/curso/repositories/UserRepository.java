package com.educandoweb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.curso.entities.Usuario;

public interface UserRepository extends JpaRepository<Usuario, Long>{
	
}
