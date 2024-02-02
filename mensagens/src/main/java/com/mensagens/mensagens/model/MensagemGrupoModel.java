package com.mensagens.mensagens.model;

import java.sql.Date;
import java.sql.Time;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mensagens_grupos")
public class MensagemGrupoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private Date data_envio;

    @Column
    private Time horario_envio;

    @Column
    private int emissor;

    @Column
    private int grupo_id;

    @Column
    private String tipo_conteudo;

    @Column
    private String conteudo;
}
