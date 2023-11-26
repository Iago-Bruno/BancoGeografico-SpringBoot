package br.com.example.model;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class AeroportoVO2 implements Serializable{
    private String municipio;
    private Double distancia;
}