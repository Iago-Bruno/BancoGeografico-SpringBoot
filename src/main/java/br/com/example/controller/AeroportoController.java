package br.com.example.controller;

import java.util.List;
import br.com.example.repository.AeroportoRepository;
import br.com.example.model.AeroportoVO;
import br.com.example.model.AeroportoVO2;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@OpenAPIDefinition(info = @Info(title = "Aeroporto API", version = "1.0", description = "Dados dos Aeroportos "))
public class AeroportoController {

    @Autowired
    private AeroportoRepository repository;

    // Query 01
    @GetMapping("/cidadesComAeroportosNoMunicipio/{sigla}/query01")
     public List<String> CidadesComAeroportosNoMunicipio(@PathVariable String sigla){
        List<String> result = repository.CidadesComAeroportosNoMunicipio(sigla);
        return result;
    }

    // Query 02
    @GetMapping("/cidadesComAeroportosNaRegiao/{regiao}/query02")
     public List<String> CidadesComAeroportosNaRegiao(@PathVariable String regiao){
        List<String> result = repository.CidadesComAeroportosNaRegiao(regiao);
        return result;
    }

    // Query 03
    @GetMapping("/cidadesComAeroportosNoEstado/{estado}/query03")
     public List<String> CidadesComAeroportosNoEstado(@PathVariable String estado){
        List<String> result = repository.CidadesComAeroportosNoEstado(estado);
        return result;
    }

    // Query 04
    @GetMapping("/aeroportoMaisProximoDoMunicipío/{municipio}/query04")
     public List<AeroportoVO2> AeroportoMaisProximoDoMunicipío(@PathVariable String municipio){
        List<AeroportoVO2> result = repository.AeroportoMaisProximoDoMunicipío(municipio);
        return result;
    }

    // Query 05
    @GetMapping("/distanciaDosAeroportosDoEstadoAoMunicpio/{estado}/{municipio}/query05")
     public List<AeroportoVO2> DistanciaDosAeroportosDoEstadoAoMunicpio(@PathVariable String estado, String municipio){
        List<AeroportoVO2> result = repository.DistanciaDosAeroportosDoEstadoAoMunicpio(estado, municipio);
        return result;
    }

    // Query 06
    @GetMapping("/aeroportoMaisProximoDoEstadoNaCidade/{estado}/{municipio}/query06")
     public List<AeroportoVO2> AeroportoMaisProximoDoEstadoNaCidade(@PathVariable String estado, String municipio){
        List<AeroportoVO2> result = repository.AeroportoMaisProximoDoEstadoNaCidade(estado, municipio);
        return result;
    }

    // Query 07
    @GetMapping("/listarDadosDosAeroportosNaRegiao/{regiao}/query07")
     public List<AeroportoVO> ListarDadosDosAeroportosNaRegiao(@PathVariable String regiao){
        List<AeroportoVO> result = repository.ListarDadosDosAeroportosNaRegiao(regiao);
        return result;
    }
}