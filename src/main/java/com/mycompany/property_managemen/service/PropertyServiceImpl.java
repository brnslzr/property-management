package com.mycompany.property_managemen.service;

import com.mycompany.property_managemen.converter.PropertyConverter;
import com.mycompany.property_managemen.dao.PropertyServiceDAO;
import com.mycompany.property_managemen.dto.PropertyDTO;
import com.mycompany.property_managemen.entity.PropertyEntity;
import com.mycompany.property_managemen.repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PropertyServiceImpl implements PropertyServiceDAO {
    @Autowired
    private PropertyRepository propertyRepository;

    @Autowired
    private PropertyConverter propertyConverter;

    @Override
    public PropertyDTO savePropertyInfo(PropertyDTO propertyDTO) {
        //convert DTO to entity

        PropertyEntity pe = propertyConverter.convertDTOtoEntity(propertyDTO);

        pe = propertyRepository.save(pe);

        propertyDTO = propertyConverter.convertEntityToDTO(pe);

        return propertyDTO;
    }

    @Override
    public List<PropertyDTO> getAllProperties() {
        List<PropertyEntity> listOfProps = (List<PropertyEntity>) propertyRepository.findAll();
        List<PropertyDTO> propsList = new ArrayList<>();
        for (PropertyEntity pe : listOfProps) {
            PropertyDTO dto = propertyConverter.convertEntityToDTO(pe);
            propsList.add(dto);
        }
        return propsList;
    }

    @Override
    public PropertyDTO updateProperty(PropertyDTO propertyDTO, long propertyId) {
        Optional<PropertyEntity> optionalEntity = propertyRepository.findById(propertyId);
        PropertyDTO dto = null;
        if (optionalEntity.isPresent()) {
            PropertyEntity pe = optionalEntity.get();
            pe.setTitle(propertyDTO.getTitle());
            pe.setDescription(propertyDTO.getDescription());
            pe.setAddress(propertyDTO.getAddress());
            pe.setOwnerEmail(propertyDTO.getOwnerEmail());
            pe.setOwnerName(propertyDTO.getOwnerName());
            dto = propertyConverter.convertEntityToDTO(pe);
            propertyRepository.save(pe);
        }
        return dto;
    }

    @Override
    public PropertyDTO updatePropertyDescription(PropertyDTO propertyDTO, long propertyId) {
        Optional<PropertyEntity> optionalEntity = propertyRepository.findById(propertyId);
        PropertyDTO dto = null;
        if (optionalEntity.isPresent()) {
            PropertyEntity pe = optionalEntity.get();
            pe.setDescription(propertyDTO.getDescription());
            dto = propertyConverter.convertEntityToDTO(pe);
            propertyRepository.save(pe);
        }
        return dto;
    }

    @Override
    public PropertyDTO updatePropertyPrice(PropertyDTO propertyDTO, long propertyId) {
        Optional<PropertyEntity> optionalEntity = propertyRepository.findById(propertyId);
        PropertyDTO dto = null;
        if (optionalEntity.isPresent()) {
            PropertyEntity pe = optionalEntity.get();
            pe.setPrice(propertyDTO.getPrice());
            dto = propertyConverter.convertEntityToDTO(pe);
            propertyRepository.save(pe);
        }
        return dto;
    }

    @Override
    public void deleteProperty(long propertyId) {
        propertyRepository.deleteById(propertyId);
    }
}
