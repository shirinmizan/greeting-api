package com.example.greeting;
import com.example.greeting.model.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.Integer.parseInt;

@RestController
public class GreetingController {
    private ArrayList<Greeting> greetings = new ArrayList<>();

    //dependency injection
        // avoids us needing to make a new instance
    @Autowired
    GreetingRepository repository;

    @GetMapping("/greeting/{id}")
    public Greeting getGreetingById(@PathVariable String id) {
        return greetings.stream()
                .filter(greeting -> greeting.getId() == parseInt(id))
                .findFirst()
                .orElse(null);
    }


    @GetMapping("/greetings")
    public List<Greeting> getAllGreetings() {
        return greetings;
    }

    @GetMapping("/random")
    public Greeting getRandomGreeting1() {
        // example
        // could be shortened
        Random r = new Random();
        Greeting randomGreeting = greetings.get(r.nextInt(greetings.size()));

        return randomGreeting;
    }

    @GetMapping("/random")
    public Greeting getRandomGreeting() {
        // Random r = new Random();
        //Greeting randomGreeting = greetings.get(r.nextInt(greetings.size()));


        Random r = new Random();
        // refactor to get random greeting from database, not greetings array
        // .count to find number of entries in repository / .findById with repository.count() as argument
        // int index = 1 + r.nextInt((int) (repository.count()));
        // return repository.findByid(index);


        // .findAll (already written ^^) to get all of the existing greetings
        List<Greeting> allGreetings = getAllGreetings();
        Greeting randomGreeting = allGreetings.get(r.nextInt(allGreetings.size()));

        return randomGreeting;
    }

    @PostMapping("/greetings")
    public String createGreeting(@RequestBody Greeting greeting) {
        // set the greetings id based on the greetings list
        // set the created by
        greeting.setId(greetings.size() + 1);
        greeting.setCreatedBy("Ollie");
        greeting.setDateCreated(new Timestamp(System.currentTimeMillis()));
        greetings.add(greeting);
        return "Greeting added";
    }

    // UPDATE route
    @PutMapping("/greetings/{id}")
    public String updateFullGreeting(@PathVariable int id, @RequestBody Greeting newGreeting){
        Greeting updatedGreeting = greetings.get(id);
        updatedGreeting.setGreeting(newGreeting.getGreeting());
        updatedGreeting.setCreatedBy(newGreeting.getCreatedBy());
        updatedGreeting.setOriginCountry(newGreeting.getGreeting());
        return "Greeting with id: " + id + "changed to" + newGreeting;
    }

    // DELETE route
    @DeleteMapping("/greetings/{id}")
    public String deleteGreeting(@PathVariable int id) {
        greetings.remove(greetings.get(id));
        return "Greeting with id: " + id + " deleted.";
    }

}
