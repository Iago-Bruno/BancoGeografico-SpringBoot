package br.com.example.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.vividsolutions.jts.geom.Geometry;

@Entity
@Table(name = "br_uf_2020")
public class Estados implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gid;
    @Column(name = "cd_uf")
    private String codigo;
    @Column(name = "nm_uf")
    private String nome;
    @Column(name = "sigla_uf")
    private String sigla;
    @Column(name = "nm_regiao")
    private String regiao;
    @Column(name = "geom")
    private Geometry geometria;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setAreaKm2(String regiao) {
        this.codigo = regiao;
    }

    public Geometry getGeometria() {
        return geometria;
    }

    public void setGeometria(Geometry geometria) {
        this.geometria = geometria;
    }
    
    @Override
    public String toString() {
        return "Municipio{" + "gid=" + gid + ", codigo=" + codigo + ", nome=" + nome + ", sigla=" + sigla + ", região=" + regiao + ", geometria=" + geometria + '}';
    }  
}
