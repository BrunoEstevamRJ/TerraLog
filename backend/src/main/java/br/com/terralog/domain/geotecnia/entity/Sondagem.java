package br.com.terralog.domain.geotecnia.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sondagem {

    private Long id;
    private String codigo;
    private String cliente;
    private String obra;
    private String endereco;
    private LocalDate data;

    private List<CamadaSolo> camadas = new ArrayList<>();

}