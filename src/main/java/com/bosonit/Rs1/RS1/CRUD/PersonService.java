package com.bosonit.Rs1.RS1.CRUD;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class PersonService {

    //Listado Personas
    private final List<Persona> personas;

    public PersonService(){
        personas = new ArrayList<>();
        //añadimos nuevo clientes
        personas.add(new Persona(1,"Calors","Madrid",35));
        personas.add(new Persona(2,"Jorge","Bilbao",25));
        personas.add(new Persona(3,"Alberto","Logroño",45));
        personas.add(new Persona(4,"Maria","Zaragoza",30));

    }
    //optenemos el listado de personas
    public List<Persona> list(){
        return personas;
    }

    //Busqueda de personas
    public Persona findId(int id){
        Persona match = personas.stream()
                .filter(n-> n.getId() == id)
                .findAny()
                .orElse(null);
        return match;
    }
    public Persona findNom(String nombre){
        for (Persona persona : personas){
            if (Objects.equals(persona.getNombre(), nombre)) {
                return persona;
            }
        }
        return null;
    }


    //Crear Personas
    public Persona save(Persona per){
        personas.add(per);
        return per;
    }

    //Actualizar Cliente
    public  Persona update(int id, Persona per){
        int index = 0;
        for(Persona p : personas){
            if (p.getId() == id){
                p.setId(id);
                personas.set(index,per);
            }
        }
        return per;
    }

    //Eliminar persona
    public  boolean delete(int id){
        for (Persona de : personas ){
            if (de.getId() == id){
                return personas.remove(de);
            }
        }
        return false;
    }
}
