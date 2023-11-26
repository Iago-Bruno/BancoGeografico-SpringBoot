package br.com.example.controller;

import java.util.List;
import br.com.example.repository.ArmazensRepository;
import br.com.example.model.ArmazensVO;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@OpenAPIDefinition(info = @Info(title = "Armazens API", version = "1.0", description = "Dados dos Armazens"))
public class ArmazensController {

    @Autowired
    private ArmazensRepository repository;

    // Query 11
    @GetMapping("/armazensDentroDoMunicipio/{sigla}/query11")
    public List<String> ArmazensDentroDoMunicipio(@PathVariable String sigla){
        List<String> result = repository.ArmazensDentroDoMunicipio(sigla);
        return result;
    }

    // Query 12
    @GetMapping("/armazensDentroDoEstado/{estado}/query12")
    public List<String> ArmazensDentroDoEstado(@PathVariable String estado){
        List<String> result = repository.ArmazensDentroDoEstado(estado);
        return result;
    }

    // Query 13
    @GetMapping("/armazensDentroDaRegiao/{regiao}/query13")
    public List<String> ArmazensDentroDaRegiao(@PathVariable String regiao){
        List<String> result = repository.ArmazensDentroDaRegiao(regiao);
        return result;
    }

    // Query 14
    @GetMapping("/distanciaEntreArmazensDosMunicipios/{municipioA}-{municipioB}/query14")
    public Double DistanciaEntreArmazensDosMunicipios(@PathVariable String municipioA, String municipioB){
        Double result = repository.DistanciaEntreArmazensDosMunicipios(municipioA, municipioB);
        return result;
    }

    // Query 15
    @GetMapping("/armazensMaisProximoDoMunicipio/{municipio}/query15")
    public List<String> ArmazensMaisProximoDoMunicipio(@PathVariable String municipio){
        List<String> result = repository.ArmazensMaisProximoDoMunicipio(municipio);
        return result;
    }

    // Query 16
    @GetMapping("/qtdeArmazensDoEstado/{sigla}/query16")
    public Integer QtdeArmazensDoEstado(@PathVariable String sigla){
        Integer result = repository.QtdeArmazensDoEstado(sigla);
        return result;
    }

    // Query 17
    @GetMapping("/listarDadosDosArmazensNaRegiao/{regiao}/query17")
    public List<ArmazensVO> ListarDadosDosArmazensNaRegiao(@PathVariable String regiao){
        List<ArmazensVO> result = repository.ListarDadosDosArmazensNaRegiao(regiao);
        return result;
    }

    // Query 18
    @GetMapping("/listarDadosDosArmazensNoEstado/{estado}/query18")
    public List<ArmazensVO> ListarDadosDosArmazensNoEstado(@PathVariable String estado){
        List<ArmazensVO> result = repository.ListarDadosDosArmazensNoEstado(estado);
        return result;
    }
}