package com.example;
 
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.User;
 
//@RepositoryRestResource
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
//	@Query("SELECT u FROM User u WHERE u.name = 'roushan singh'")
	@Query("SELECT u FROM User u WHERE u.name like %:#{[0]}%")
    public List<User> findByName(String name);
	
	@Query("SELECT u FROM User u WHERE u.id= ?#{#usr.id}")
    public List<User> findByUser(@Param("usr") User user);
	
 
}