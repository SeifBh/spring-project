package tn.seif.personneservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tn.seif.personneservice.dao.PersonneRepository;
import tn.seif.personneservice.entities.Personne;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.stream.Stream;

@EnableDiscoveryClient
@SpringBootApplication
public class PersonneServiceApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(PersonneServiceApplication.class, args);
    }
    @Autowired
    private PersonneRepository personneRepository;

    @Override
    public void run(String... args) throws Exception {


        Stream.of("Seif", "Yoldez", "Liliane").forEach(p -> {
            personneRepository.save(new Personne(null, p));
        });

        personneRepository.findAll().forEach(System.out::println);


    }

}
