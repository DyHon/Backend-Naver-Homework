package com.likelion.threetier.person.service.PersonServiceImpl;

import com.likelion.threetier.person.entity.Person;
import com.likelion.threetier.person.repository.PersonRepository;
import com.likelion.threetier.person.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PersonServiceImpl implements PersonService {
    @Autowired
    PersonRepository personRepository;

    List<Person> lstPerson = personRepository.findAll();
}
