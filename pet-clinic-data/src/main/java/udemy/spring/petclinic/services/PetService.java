package udemy.spring.petclinic.services;


import udemy.spring.petclinic.model.Pet;

import java.util.Set;

public interface PetService {


    Pet findById(Long id);

    Pet save (Pet pet);

    Set<Pet> findAll();

}
