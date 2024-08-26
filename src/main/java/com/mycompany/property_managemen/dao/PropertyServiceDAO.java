package com.mycompany.property_managemen.dao;

import com.mycompany.property_managemen.dto.PropertyDTO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface PropertyServiceDAO {

    PropertyDTO savePropertyInfo(PropertyDTO propertyDTO);

    List<PropertyDTO> getAllProperties();

    PropertyDTO updateProperty(PropertyDTO propertyDTO, long propertyId);

    PropertyDTO updatePropertyDescription(PropertyDTO propertyDTO, long propertyId);

    PropertyDTO updatePropertyPrice (PropertyDTO propertyDTO,long propertyId);

    void deleteProperty(long propertyId);
}