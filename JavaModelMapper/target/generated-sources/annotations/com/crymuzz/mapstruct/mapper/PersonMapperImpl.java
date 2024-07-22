package com.crymuzz.mapstruct.mapper;

import com.crymuzz.modeMapper.dto.PersonDefaultDTO;
import com.crymuzz.modeMapper.entity.Person;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-21T20:36:18-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.12 (Amazon.com Inc.)"
)
public class PersonMapperImpl implements PersonMapper {

    @Override
    public PersonDefaultDTO personToDTO(Person person) {
        if ( person == null ) {
            return null;
        }

        PersonDefaultDTO personDefaultDTO = new PersonDefaultDTO();

        personDefaultDTO.setId( person.getId() );
        personDefaultDTO.setName( person.getName() );
        personDefaultDTO.setLastName( person.getLastName() );
        personDefaultDTO.setEmail( person.getEmail() );
        personDefaultDTO.setAge( person.getAge() );
        personDefaultDTO.setGender( person.getGender() );

        return personDefaultDTO;
    }

    @Override
    public Person personDTOToPerson(PersonDefaultDTO personDefaultDTO) {
        if ( personDefaultDTO == null ) {
            return null;
        }

        Person person = new Person();

        person.setId( personDefaultDTO.getId() );
        person.setName( personDefaultDTO.getName() );
        person.setLastName( personDefaultDTO.getLastName() );
        person.setEmail( personDefaultDTO.getEmail() );
        person.setAge( personDefaultDTO.getAge() );
        person.setGender( personDefaultDTO.getGender() );

        return person;
    }
}
