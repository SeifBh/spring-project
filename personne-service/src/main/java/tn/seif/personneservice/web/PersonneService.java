package tn.seif.personneservice.web;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RefreshScope
@RestController
public class PersonneService {

    @GetMapping("/hello")
    public String myConfig(){
        var xme  = "Seifeddine";
        return "Seif";
    }


}
