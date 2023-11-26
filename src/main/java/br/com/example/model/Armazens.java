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
@Table(name = "armazens_2014")
public class Armazens implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gid;
    @Column(name = "objectid")
    private Integer codigo;
    @Column(name = "uf")
    private String sigla;
    @Column(name = "municipio")
    private String municipio;
    @Column(name = "cap_ton")
    private double capton;
    @Column(name = "geocodigo")
    private Integer geocodigo;
    @Column(name = "geom")
    private Geometry geometria;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    public double getCapton() {
        return capton;
    }

    public void setCapton(double capton) {
        this.capton = capton;
    }

    public Integer getGeocodigo() {
        return geocodigo;
    }

    public void setGeocodigo(Integer geocodigo) {
        this.geocodigo = geocodigo;
    }

    public Geometry getGeometria() {
        return geometria;
    }

    public void setGeometria(Geometry geometria) {
        this.geometria = geometria;
    }

    @Override
    public String toString() {
        return "Armazens [gid=" + gid + ", codigo=" + codigo + ", sigla=" + sigla + ", municipio=" + municipio
                + ", capton=" + capton + ", geocodigo=" + geocodigo + ", geometria=" + geometria + "]";
    }
}
