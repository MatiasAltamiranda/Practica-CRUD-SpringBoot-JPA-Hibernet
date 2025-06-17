package com.crud.pruebaJPACRUD.service;

import com.crud.pruebaJPACRUD.model.Persona;

import java.util.List;

public interface IPersonaService {

    public List<Persona> getPersonas();

    public void savePersona(Persona perso);

    public void deletePersona(int id);

    public Persona findPersona(int id);

    public void editPersona(int id, String nuevoNombre, String nuevoApellido, int nuevaEdad);

}
