package br.com.example.repository;

import br.com.example.model.Armazens;
import br.com.example.model.ArmazensVO;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ArmazensRepository extends JpaRepository<Armazens, Integer>{
    // Query 11
    @Query(value ="select m.municipio from Armazens m, Estados e where st_within(m.geometria, e.geometria) = true and e.sigla = :sigla")
    public List<String> ArmazensDentroDoMunicipio(String sigla);

    // Query 12
    @Query(value ="select m.municipio from Armazens m, Estados e where st_within(m.geometria, e.geometria) = true and e.nome = :estado")
    public List<String> ArmazensDentroDoEstado(String estado);

    // Query 13
    @Query(value ="select m.municipio from Armazens m, Estados e where st_within(m.geometria, e.geometria) = true and e.regiao = :regiao")
    public List<String> ArmazensDentroDaRegiao(String regiao);

    // Query 14
    @Query(value = "select distance(geography(a.geometria), geography(b.geometria)) from Armazens a, Armazens b where a.municipio = :municipioA and b.municipio = :municipioB")
    public Double DistanciaEntreArmazensDosMunicipios(String municipioA, String municipioB);

    // Query 15
    @Query(value = "SELECT a.municipio FROM Armazens a, Municipio m where m.nome = :municipio ORDER BY distance(a.geometria, m.geometria)")
    public List<String> ArmazensMaisProximoDoMunicipio(String municipio);

    // Query 16
    @Query(value = "SELECT COUNT(a.municipio) FROM Armazens a, Municipio m WHERE within(a.geometria, m.geometria) = true AND m.sigla = :sigla")
    public Integer QtdeArmazensDoEstado(String sigla);

    // Query 17
    @Query(value = "SELECT new br.com.example.model.ArmazensVO(a.codigo, a.sigla, a.municipio, a.capton, a.geocodigo, a.geometria) from Armazens a, Estados e where st_within(a.geometria, e.geometria) = true and e.regiao = :regiao")
    public List<ArmazensVO> ListarDadosDosArmazensNaRegiao(String regiao);

    // Query 18
    @Query(value = "SELECT new br.com.example.model.ArmazensVO(a.codigo, a.sigla, a.municipio, a.capton, a.geocodigo, a.geometria) from Armazens a, Estados e where st_within(a.geometria, e.geometria) = true and e.nome = :estado")
    public List<ArmazensVO> ListarDadosDosArmazensNoEstado(String estado);
}

