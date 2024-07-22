package com.crymuzz.mapstruct.mapper;

import com.crymuzz.modeMapper.dto.PersonDefaultDTO;
import com.crymuzz.modeMapper.entity.Person;

public class MapperMain {
    public static void main(String[] args) {
        Person person = new Person(1L, "Favio", "Angulo", "favio@gmail.com", (byte) 21, 'M');

        PersonDefaultDTO defaultDTO =  PersonMapper.INSTANCE.personToDTO(person);
        System.out.println(defaultDTO.toString());

    }
}
