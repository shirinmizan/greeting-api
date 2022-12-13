//package com.example.greeting;
//
//import com.example.greeting.model.Greeting;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//
//public class GreetingApplication2 {
//    package com.example.greeting;
//
//import com.example.greeting.model.Greeting;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//
//    @SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
//    @RestController()
//    public class GreetingApplication {
//        private ArrayList<Greeting> greetings = new ArrayList<>();
//
//        public static void main(String[] args) {
//            SpringApplication.run(GreetingApplication.class, args);
//        }
//
//        // extra to the controller
//        @GetMapping("/welcome")
//        public String sayHi() {
//            return "Welcome to the server side!!";
//        }
//
//        // GET route
////	@GetMapping("/greetings/{id}")
////	public String getGreetingById(@PathVariable int id) {
////	  return greetings.get(id);
////	}
//
//        // INDEX route (GET ALL)
////	@GetMapping("/greetings")
////	public List<String> getGreetings() {
////		return greetings;
////	}
//
//        // CREATE route
//        @PostMapping("/greetings")
//        public String createGreeting(@RequestBody Greeting greeting) {
//            // set the greetings id based on the greetings list
//            // set the created by
//            greeting.setCreatedBy("Ollie");
//            // set the created at timestamp
//            greetings.add(greeting);
//            return "Greeting added";
//        }
//
//        // CHALLENGE (extra to the controller)
////	@GetMapping("/random")
////	public String getRandomGreeting() {
////		// example
////		// could be shortened
////		Random r = new Random();
////		String randomGreeting = greetings.get(r.nextInt(greetings.size()));
////
////		return randomGreeting;
////	}
//
//        // UPDATE route
////	@PutMapping("/greetings/{id}")
////	public String updateGreeting(@PathVariable int id, @RequestBody String newGreeting) {
////		// change the greeting with the new info
////		// set the greeting back into the list
////		greetings.set(id, newGreeting);
////		return newGreeting;
////	}
//
//        // DELETE route
////	@DeleteMapping("/greetings/{id}")
////	public String deleteGreeting(@PathVariable int id) {
////		greetings.remove(greetings.get(id));
////		return "Greeting with id: " + id + " deleted.";
////	}
//
//    }
//    @GetMapping("/greeting/{id}")
//    public String getGreetingById(@PathVariable String id) {
//        return "Good Morning! " +id;
//    }
//
////	http://localhost:8080/greeting?name=shirin
////	@GetMapping("/greeting")
////	public String getCustomGreeting(@RequestParam String name){
////		return "Hello " + name;
////	}
//
//    //list of greetings
//    @RequestMapping("/greetings")
//    public List<String> getGreetings() {
//        String greeting1 = "Hello Shirin";
//        String greeting2 = "No not this";
//
//        List<String> list = new ArrayList<>();
//        list.add(greeting1);
//        list.add(greeting2);
//        return list;
//    }
//
//    @RequestMapping("/greetings2")
//    public List<String> getGreeting(){
//        return List.of("Hi", "Hello", "Shirin");
//    }
//    //path variables & request parameters
//    //why would we need this
//    // pass information on GET requests, from the client (REACT)
//
//    // challenge
//    //add two more endpoints
//    // one for getting a greeting by its id
//    // one for saying hello back to someone
//    List<String> names = List.of("Hello", "Hola", "Bonjour");
//    Random random = new Random();
//    @RequestMapping("/random")
//    public String getRandomGreetings(){
//        String greeting = names.get(random.nextInt(names.size()));
//        return greeting;
//    }
//
//    @PostMapping("/greeting")
//    public String createGreeting(@RequestBody String greeting){
//        names.add(greeting);
//        return greeting + " added";
//    }
//
//    @PutMapping("/greetings/{id}")
//    public String updateGreeting(@PathVariable int id, @RequestBody String newGreeting){
//        //String greeting = greetings.get(id);
//        greetings.set(id, newGreeting);
//        return newGreeting;
//    }
//
//    @DeleteMapping("/greetings/{id}")
//    public String deleteGreeting(@PathVariable String id){
//        greetings.remove(id);
//        return "Greeting with id: " + id + " deleted";
//    }
//
//
//}
