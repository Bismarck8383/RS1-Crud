package com.bosonit.Rs1.RS1.CRUD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/persona")
@RestController
public class PersonaControllers {

    //importamos el metodo Person Service
    @Autowired
     PersonService service;

    public PersonaControllers(PersonService service){
        this.service = service;
    }

    @GetMapping
    public Iterable<Persona> list(){
        return service.list();
    }

    //Buscador por parametro Id o nombre
    @GetMapping("/id/{id}")
    public  Persona findId(@PathVariable int id){
        return service.findId(id);
    }
    @GetMapping("/nombre/{nombre}")
    public Persona  findNom(@PathVariable String nombre){
        return service.findNom(nombre);
    }


    //Guardar o crear nuevo persona
    @PostMapping
    public Persona create(@RequestBody Persona persona){
        return service.save(persona);
    }

    //Actualizar persona
    @PutMapping ("/{id}")
    public Persona update(@PathVariable int id, @RequestBody Persona persona){
        return service.update(id,persona);
    }

    //Eliminar persona
    @DeleteMapping ("/{id}")
    public  Boolean delete(@PathVariable int id){
        return service.delete(id);
    }
}

