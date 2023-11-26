package br.com.example.model;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import com.vividsolutions.jts.geom.Geometry;

@Data
@AllArgsConstructor
public class AeroportoVO implements Serializable{
    private String cdv;
    private String estado;
    private String regiao;
    private String municipio;
    private Geometry geometria;
}
