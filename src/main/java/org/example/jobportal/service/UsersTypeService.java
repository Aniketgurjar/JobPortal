package org.example.jobportal.service;

import org.example.jobportal.entity.UsersType;
import org.example.jobportal.repositories.UsersTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
public class UsersTypeService {

    private final UsersTypeRepository usersTypeRepository;
@Autowired
    public UsersTypeService(UsersTypeRepository usersTypeRepository) {
        this.usersTypeRepository = usersTypeRepository;
    }
    public List<UsersType> getAll(){

        return usersTypeRepository.findAll();
    }


}
