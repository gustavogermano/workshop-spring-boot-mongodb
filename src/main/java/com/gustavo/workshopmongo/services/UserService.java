package com.gustavo.workshopmongo.services;

import com.gustavo.workshopmongo.domain.User;
import com.gustavo.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired //instancia automaticamente
    private UserRepository repo;

    public List<User> findAll(){
        return repo.findAll();
    }
}
