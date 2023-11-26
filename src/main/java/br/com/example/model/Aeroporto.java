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
@Table(name = "aeroportos_2014")
public class Aeroporto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gid;
    @Column(name = "objectid_1")
    private double codigo;
    @Column(name = "municdv")
    private String cdv;
    @Column(name = "uf")
    private String sigla;
    @Column(name = "nome_uf")
    private String estado;
    @Column(name = "nome_regia")
    private String regiao;
    @Column(name = "municipio")
    private String municipio;
    @Column(name = "pax2010")
    private double pax;
    @Column(name = "internacio")
    private double internacio;
    @Column(name = "geom")
    private Geometry geometria;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public double getCodigo() {
        return codigo;
    }

    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }

    public String getCdv() {
        return cdv;
    }

    public void setCdv(String cdv) {
        this.cdv = cdv;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public double getPax() {
        return pax;
    }

    public void setPax(double pax) {
        this.pax = pax;
    }

    public double getInternacio() {
        return internacio;
    }

    public void setInternacio(double internacio) {
        this.internacio = internacio;
    }

    public Geometry getGeometria() {
        return geometria;
    }

    public void setGeometria(Geometry geometria) {
        this.geometria = geometria;
    }

    @Override
    public String toString() {
        return "Aeroporto{" + "gid=" + gid + ", codigo=" + codigo + ", cdv=" + cdv + ", sigla=" + sigla + ", estado=" + estado + ", região=" + regiao + ", municipio=" + municipio + ", pax=" + pax + ", internacio=" + internacio + ", geometria=" + geometria +'}';
    }
}
