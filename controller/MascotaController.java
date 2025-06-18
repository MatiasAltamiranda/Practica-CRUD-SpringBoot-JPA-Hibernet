package com.crud.pruebaJPACRUD.controller;

import com.crud.pruebaJPACRUD.model.Mascota;
import com.crud.pruebaJPACRUD.service.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MascotaController {

    @Autowired
    private IMascotaService mascoServ;

    @PostMapping("/mascotas/v1/create")
    public String savePersona(@RequestBody Mascota masco){
        mascoServ.saveMascota(masco);
        return "Mascota creada correctamente";
    }

}
