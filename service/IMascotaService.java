package com.crud.pruebaJPACRUD.service;

import com.crud.pruebaJPACRUD.model.Mascota;
import com.crud.pruebaJPACRUD.model.Persona;

import java.util.List;

public interface IMascotaService {

    public List<Mascota> getMascotas();

    public void saveMascota(Mascota masco);

    public void deleteMascota(int id);

    public Mascota findMascota(int id);

    public void editMascota(int id, String nuevoNombre, String nuevaEspecie, String nuevaRaza, String nuevoColor);

}
