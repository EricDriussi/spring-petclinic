package udemy.spring.petclinic.services;

import udemy.spring.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
