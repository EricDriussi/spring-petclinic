package udemy.spring.petclinic.services;

import udemy.spring.petclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save (Vet vet);

    Set<Vet> findAll();

}
