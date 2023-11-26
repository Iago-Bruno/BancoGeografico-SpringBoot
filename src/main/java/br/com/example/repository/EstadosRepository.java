package br.com.example.repository;

import br.com.example.model.Estados;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EstadosRepository extends JpaRepository<Estados, Integer>{
    // Query 08
    @Query(value = "select e.nome from Estados m, Estados e where st_touches(m.geometria, e.geometria) = true and m.nome = :estado")
    List<String> EstadosProximosDoEstado(String estado);

    // Query 09
    @Query(value = "select e.nome from Estados m, Estados e where st_touches(m.geometria, e.geometria) = true and m.regiao = :regiao")
    List<String> EstadosDaRegiao(String regiao);

    // Query 10
    @Query(value = "select e.nome from Estados m, Estados e where st_Disjoint(m.geometria, e.geometria) = true and m.nome = :estado")
    List<String> EstadosDistantesDoEstado(String estado);

}