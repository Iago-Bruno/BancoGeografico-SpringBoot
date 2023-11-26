package br.com.example.repository;

import br.com.example.model.Municipio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MunicipioRepository extends JpaRepository<Municipio, Integer>{
    // Query 19
    @Query(value ="SELECT COUNT(a.nome) FROM Municipio a, Municipio b WHERE within(a.geometria, b.geometria) = true AND a.sigla = :sigla")
    public Integer QtdeMunicipiosDoEstado(String sigla);

    // Query 20
    @Query(value ="SELECT (st_area(a.geometria) + st_area(b.geometria)) FROM Municipio a, Municipio b WHERE a.nome = :municipioA AND b.nome = :municipioB")
    public Double SomaDaAreaDosMunicipios(String municipioA, String municipioB);
}