package com.mycompany.property_managemen.repository;

import com.mycompany.property_managemen.entity.PropertyEntity;
import org.springframework.data.repository.CrudRepository;

public interface PropertyRepository extends CrudRepository<PropertyEntity, Long> {
}
