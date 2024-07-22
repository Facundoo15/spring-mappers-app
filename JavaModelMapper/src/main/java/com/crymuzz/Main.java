package com.crymuzz;

import com.crymuzz.modeMapper.dto.PersonCustomDTO;
import com.crymuzz.modeMapper.dto.PersonDefaultDTO;
import com.crymuzz.modeMapper.entity.Person;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;

public class Main {
    public static void main(String[] args) {

        // MODEL MAPPER
        ModelMapper modelMapper = new ModelMapper();
        Person person = new Person(1L, "Favio", "Angulo", "favio@gmail.com", (byte) 21, 'M');
        System.out.println("PERSON");
        System.out.println(person.toString());
        // MODEL MAPPER - DEFAULT
        PersonDefaultDTO defaultDTO = modelMapper.map(person, PersonDefaultDTO.class);
        System.out.println("DTO(DEFAULT) -- PERSON");
        System.out.println(defaultDTO.toString());

        // MODEL MAPPER - CUSTOM
        TypeMap<Person, PersonCustomDTO> propertyMap = modelMapper.createTypeMap(Person.class, PersonCustomDTO.class);
        propertyMap.addMapping(Person::getId, PersonCustomDTO::setIdDTO);
        propertyMap.addMapping(Person::getName, PersonCustomDTO::setNameDTO);
        propertyMap.addMapping(Person::getLastName, PersonCustomDTO::setLastNameDTO);
        propertyMap.addMapping(Person::getEmail, PersonCustomDTO::setEmailDTO);
        propertyMap.addMapping(Person::getAge, PersonCustomDTO::setAgeDTO);
        propertyMap.addMapping(Person::getGender, PersonCustomDTO::setGenderDTO);

        System.out.println("DTO(CUSTOM) -- PERSON");
        PersonCustomDTO customDTO = propertyMap.map(person);
        System.out.println("DTO(CUSTOM) -- PERSON");
        System.out.println(customDTO);


    }
}