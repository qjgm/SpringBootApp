package com.service;

import com.data.PersonRepository;
import com.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService{
    @Autowired
    private PersonRepository personRepository;

    @Override
    public void create(Person person) {
        personRepository.save(person);
    }
}
