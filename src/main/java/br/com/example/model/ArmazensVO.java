package br.com.example.model;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import com.vividsolutions.jts.geom.Geometry;

@Data
@AllArgsConstructor
public class ArmazensVO implements Serializable{
    private Integer codigo;
    private String sigla;
    private String municipio;
    private double capton;
    private Integer geocodigo;
    private Geometry geometria;
}
