package br.com.sanepar.aula.sst;

import org.springframework.web.bind.annotation.*;

@RestController 
public class Ola {

    @GetMapping(value="/")
    public String getMethodName() {
        return "API no ar";
    }
    
}
