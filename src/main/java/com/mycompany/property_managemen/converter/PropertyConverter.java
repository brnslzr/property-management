package com.mycompany.property_managemen.converter;

import com.mycompany.property_managemen.dto.PropertyDTO;
import com.mycompany.property_managemen.entity.PropertyEntity;
import org.springframework.stereotype.Component;

@Component
public class PropertyConverter {
    public PropertyEntity convertDTOtoEntity(PropertyDTO propertyDTO) {
        PropertyEntity pe = new PropertyEntity();
        pe.setTitle(propertyDTO.getTitle());
        pe.setDescription(propertyDTO.getDescription());
        pe.setAddress(propertyDTO.getAddress());
        pe.setOwnerEmail(propertyDTO.getOwnerEmail());
        pe.setOwnerName(propertyDTO.getOwnerName());
        pe.setPrice(propertyDTO.getPrice());

        return pe;
    }

    public PropertyDTO convertEntityToDTO(PropertyEntity propertyEntity){
        PropertyDTO po = new PropertyDTO();
        po.setTitle(propertyEntity.getTitle());
        po.setDescription(propertyEntity.getDescription());
        po.setAddress(propertyEntity.getAddress());
        po.setOwnerEmail(propertyEntity.getOwnerEmail());
        po.setOwnerName(propertyEntity.getOwnerName());
        po.setPrice(propertyEntity.getPrice());

        return po;
    }
}
