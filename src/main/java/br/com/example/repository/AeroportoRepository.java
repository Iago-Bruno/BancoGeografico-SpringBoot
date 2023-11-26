package br.com.example.repository;

import br.com.example.model.Aeroporto;
import br.com.example.model.AeroportoVO;
import br.com.example.model.AeroportoVO2;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AeroportoRepository extends JpaRepository<Aeroporto, Integer>{
    // Query 01
    @Query(value ="select m.municipio from Aeroporto m, Estados e where st_within(m.geometria, e.geometria) = true and e.sigla = :sigla")
    public List<String> CidadesComAeroportosNoMunicipio(String sigla);

    // Query 02
    @Query(value ="select m.municipio from Aeroporto m, Estados e where st_within(m.geometria, e.geometria) = true and e.regiao = :regiao")
    public List<String> CidadesComAeroportosNaRegiao(String regiao);

    // Query 03
    @Query(value ="select m.municipio from Aeroporto m, Estados e where st_within(m.geometria, e.geometria) = true and e.nome = :estado")
    public List<String> CidadesComAeroportosNoEstado(String estado);

    // Query 04
    @Query("SELECT new br.com.example.model.AeroportoVO2(a.municipio, distance(a.geometria, m.geometria)) FROM Aeroporto a, Municipio m WHERE m.nome = :municipio ORDER BY distance(a.geometria, m.geometria)")
    List<AeroportoVO2> AeroportoMaisProximoDoMunicipío(String municipio);

    // Query 05
    @Query("SELECT new br.com.example.model.AeroportoVO2(a.municipio, distance(a.geometria, m.geometria)) FROM Aeroporto a, Aeroporto m WHERE a.estado = :estado AND m.municipio = :municipio")
    List<AeroportoVO2> DistanciaDosAeroportosDoEstadoAoMunicpio(String estado, String municipio);

    // Query 06
    @Query("SELECT new br.com.example.model.AeroportoVO2(a.municipio, distance(a.geometria, m.geometria)) FROM Aeroporto a, Aeroporto m WHERE a.estado = :estado AND m.municipio = :municipio ORDER BY distance(a.geometria, m.geometria) ASC")
    List<AeroportoVO2> AeroportoMaisProximoDoEstadoNaCidade(String estado, String municipio);

    // Query 07
    @Query(value = "select new br.com.example.model.AeroportoVO(m.cdv,m.estado,m.regiao,m.municipio,m.geometria) from Aeroporto m, Estados e where st_within(m.geometria, e.geometria) = true and e.regiao  = :regiao")
    List<AeroportoVO> ListarDadosDosAeroportosNaRegiao(String regiao);

    // // Query 07
    // @Query(value = "select new br.com.example.model.AeroportoVO(m.cdv,m.estado,m.regiao,m.municipio,m.geometria) from Aeroporto m, Estados e where st_within(m.geometria, e.geometria) = true and e.sigla = :sigla")
    // List<AeroportoVO> ListarDadosDosAeroportosNoMunicipio(String sigla);

    // // Query 09
    // @Query(value = "select new br.com.example.model.AeroportoVO(m.cdv,m.estado,m.regiao,m.municipio,m.geometria) from Aeroporto m, Estados e where st_within(m.geometria, e.geometria) = true and e.nome  = :estado")
    // List<AeroportoVO> ListarDadosDosAeroportosDoEstado(String estado);
}

