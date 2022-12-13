package com.example.greeting;

import com.example.greeting.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//      Repository
//
//      CrudRepository
//
//      JpaRepository

@Repository
public interface GreetingRepository extends JpaRepository<Greeting, String> {
}
