package udemy.springframework.model.petclinic.services;

import udemy.springframework.model.petclinic.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
