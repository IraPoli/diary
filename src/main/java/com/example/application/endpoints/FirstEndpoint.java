package com.example.application.endpoints;


import com.example.application.First;
import com.example.application.FirstRepository;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import dev.hilla.Endpoint;

import java.util.List;

@Endpoint
@AnonymousAllowed
public class FirstEndpoint {


private FirstRepository firstRepository;


FirstEndpoint(FirstRepository firstRepository){
    this.firstRepository = firstRepository;
}

@AnonymousAllowed
public  List< First> findAll(){

    return firstRepository.findAll();
}


public  First add(String task){
    return firstRepository.save(new First(task));
}


public  First update( First first){
    return firstRepository.save(first);
}

}