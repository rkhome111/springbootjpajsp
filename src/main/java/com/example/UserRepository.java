package com.example;
 
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.User;
 
//@RepositoryRestResource
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
 
}