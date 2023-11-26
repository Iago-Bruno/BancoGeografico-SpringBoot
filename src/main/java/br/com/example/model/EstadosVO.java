package br.com.example.model;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import com.vividsolutions.jts.geom.Geometry;

@Data
@AllArgsConstructor
public class EstadosVO implements Serializable{
    private String codigo;
    private String nome;
    private String sigla;
    private String regiao;
    private Geometry geometria;
}
