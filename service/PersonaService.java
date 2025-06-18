package com.crud.pruebaJPACRUD.service;

import com.crud.pruebaJPACRUD.model.Persona;
import com.crud.pruebaJPACRUD.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    private IPersonaRepository persoRepo;

    @Override
    public List<Persona> getPersonas() {
       return persoRepo.findAll();
    }

    @Override
    public void savePersona(Persona perso) {
        persoRepo.save(perso);
    }

    @Override
    public void deletePersona(int id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona findPersona(int id) {
        return persoRepo.findById(id).orElse(null);
    }

    @Override
    public void editPersona(int id,  String nuevoNombre, String nuevoApellido, int nuevaEdad) {
        Persona perso = this.findPersona(id);
        perso.setNombre(nuevoNombre);
        perso.setApellido(nuevoApellido);
        perso.setEdad(nuevaEdad);
        this.savePersona(perso);
    }

    @Override
    public void editPersona(Persona perso) {
        this.savePersona(perso);
    }
}
