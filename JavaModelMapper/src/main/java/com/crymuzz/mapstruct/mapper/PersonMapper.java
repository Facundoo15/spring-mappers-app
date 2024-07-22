package com.crymuzz.mapstruct.mapper;

import com.crymuzz.modeMapper.dto.PersonDefaultDTO;
import com.crymuzz.modeMapper.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    PersonDefaultDTO personToDTO(Person person);
    @Mapping(source = "idDTO", target = "id")
    @Mapping(source = "idDTO", target = "id")
    @Mapping(source = "idDTO", target = "id")
    @Mapping(source = "idDTO", target = "id")
    @Mapping(source = "idDTO", target = "id")
    @Mapping(source = "idDTO", target = "id")
    Person personDTOToPerson(PersonDefaultDTO personDefaultDTO);


}
