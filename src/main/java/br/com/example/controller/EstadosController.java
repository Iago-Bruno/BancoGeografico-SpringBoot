package br.com.example.controller;

import java.util.List;
import br.com.example.repository.EstadosRepository;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@OpenAPIDefinition(info = @Info(title = "Estados API", version = "1.0", description = "Dados dos Estados"))
public class EstadosController {

    @Autowired
    private EstadosRepository repository;

    // Query 08
    @GetMapping("/estadosProximosDoEstado/{estado}/query08")
    public List<String> EstadosProximosDoEstado(@PathVariable String estado){
        List<String> result = repository.EstadosProximosDoEstado(estado);
        return result;
    }

    // Query 09
    @GetMapping("/estadosDaRegiao/{regiao}/query09")
    public List<String> EstadosDaRegiao(@PathVariable String regiao){
        List<String> result = repository.EstadosDaRegiao(regiao);
        return result;
    }

    // Query 10
    @GetMapping("/estadosDistantesDoEstado/{estado}/query10")
    public List<String> EstadosDistantesDoEstado(@PathVariable String estado){
        List<String> result = repository.EstadosDistantesDoEstado(estado);
        return result;
    }
}