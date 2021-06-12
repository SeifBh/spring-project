package tn.seif.companyservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import tn.seif.companyservice.dao.CompanyRepository;
import tn.seif.companyservice.entities.Company;

import java.util.stream.Stream;


@EnableDiscoveryClient
@SpringBootApplication
public class CompanyServiceApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CompanyServiceApplication.class, args);
    }

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public void run(String... args) throws Exception {


            Stream.of("A", "B", "C").forEach(cn -> {
                companyRepository.save(new Company(null, cn, 100 + Math.random() * 900));
            });

            companyRepository.findAll().forEach(System.out::println);


    }

}
