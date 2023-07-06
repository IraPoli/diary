package com.example.application.endpoints;


import com.example.application.First;
import com.example.application.FirstRepository;
import com.example.application.People;
import com.example.application.PeopleRepository;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import dev.hilla.Endpoint;

import java.util.List;

@Endpoint
@AnonymousAllowed
public class PeopleEndpoint {


private PeopleRepository peopleRepository;


PeopleEndpoint(PeopleRepository peopleRepository){
    this.peopleRepository = peopleRepository;
}

@AnonymousAllowed
public  List<People> findAll(){

    return peopleRepository.findAll();
}


public  People add(String firstName, String lastName,String email,String role ){
    return peopleRepository.save(new People(firstName,lastName,email
             ,role));
}


public  People update( People person){
    return peopleRepository.save(person);
}

}