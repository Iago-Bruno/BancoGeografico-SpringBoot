package br.com.example.controller;

import br.com.example.repository.MunicipioRepository;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@OpenAPIDefinition(info = @Info(title = "Municípios API", version = "1.0", description = "Dados de Municípios"))
public class MunicipioController {

    @Autowired
    private MunicipioRepository repository;

    // Query 19
    @GetMapping("/qtdeMunicipiosDoEstado/{sigla}/query19")
    public Integer QtdeMunicipiosDoEstado(@PathVariable String sigla){
        Integer result = repository.QtdeMunicipiosDoEstado(sigla);
        return result;
    }

    // Query 20
    @GetMapping("/somaDaAreaDosMunicipios/{municipioA}-{municipioB}/query20")
     public Double SomaDaAreaDosMunicipios(@PathVariable String municipioA, @PathVariable String municipioB){
        double result = repository.SomaDaAreaDosMunicipios(municipioA, municipioB);
        return result;
    }
}