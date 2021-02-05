package org.epharm.drug.crud;

import org.epharm.drug.models.Drug;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DrugDao extends JpaRepository<Drug, Long> {

}
