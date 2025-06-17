package com.crud.pruebaJPACRUD.repository;

import com.crud.pruebaJPACRUD.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Integer> {

}
