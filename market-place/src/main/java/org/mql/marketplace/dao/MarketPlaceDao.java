package org.mql.marketplace.dao;

import org.mql.marketplace.models.Marketplace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MarketPlaceDao  extends JpaRepository<Marketplace, Long> {
}
