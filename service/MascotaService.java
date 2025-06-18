package com.crud.pruebaJPACRUD.service;

import com.crud.pruebaJPACRUD.model.Mascota;
import com.crud.pruebaJPACRUD.model.Persona;
import com.crud.pruebaJPACRUD.repository.IMascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaService implements IMascotaService {

    @Autowired
    IMascotaRepository repoMasco;

    @Override
    public List<Mascota> getMascotas() {
        return repoMasco.findAll();
    }

    @Override
    public void saveMascota(Mascota masco) {
        repoMasco.save(masco);
    }

    @Override
    public void deleteMascota(int id) {
        repoMasco.deleteById(id);
    }

    @Override
    public Mascota findMascota(int id) {
        return repoMasco.findById(id).orElse(null);
    }

    @Override
    public void editMascota(int id, String nuevoNombre, String nuevaEspecie, String nuevaRaza, String nuevoColor) {
        Mascota masco = this.findMascota(id);
        masco.setNombre(nuevoNombre);
        masco.setEspecie(nuevaEspecie);
        masco.setRaza(nuevaRaza);
        masco.setColor(nuevoColor);
        this.saveMascota(masco);
    }
}
