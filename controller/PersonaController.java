package com.crud.pruebaJPACRUD.controller;


import com.crud.pruebaJPACRUD.model.Persona;
import com.crud.pruebaJPACRUD.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController {

     @Autowired
     private IPersonaService persoServ;


    @GetMapping("/personas/v1/get")
    public List<Persona> getPersonas(){
        return persoServ.getPersonas();
    }

    @PostMapping("/personas/v1/create")
    public String savePersona(@RequestBody Persona perso){
        persoServ.savePersona(perso);
        return "Persona creada correctamente";
    }

    @DeleteMapping("/personas/v1/delete/{id}")
    public String deletePersona(@PathVariable int id){
        persoServ.deletePersona(id);
        return "Persona eliminada correctamente";
    }

    @PutMapping("/personas/v1/editar/{id_original}")
    public Persona editPersona(@PathVariable int id_original,
      @RequestParam(required = false, name = "nombre") String nuevoNombre,
      @RequestParam(required = false, name = "apellido") String nuevoApellido,
      @RequestParam(required = false, name = "edad") int nuevaEdad
    ){
       persoServ.editPersona(id_original,nuevoNombre,nuevoApellido,nuevaEdad);
       return persoServ.findPersona(id_original);

    }

}
