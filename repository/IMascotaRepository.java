package com.crud.pruebaJPACRUD.repository;

import com.crud.pruebaJPACRUD.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMascotaRepository extends JpaRepository <Mascota,Integer> {

}
