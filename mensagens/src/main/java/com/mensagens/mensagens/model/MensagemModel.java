package com.mensagens.mensagens.model;

import java.sql.Date;
import java.sql.Time;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="mensagens")
public class MensagemModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private Date data_envio;

    @Column
    private Time horario_envio;

    @Column
    private Date data_recebimento;

    @Column
    private Time horario_recebimento;

    @Column
    private String status;

    @Column
    private String conteudo;

    @ManyToOne
    private UsuarioModel emissor;

    @ManyToOne
    private UsuarioModel destinatario;

    public UsuarioModel getEmissor() {
        return emissor;
    }

    public void setEmissor(UsuarioModel emissor) {
        this.emissor = emissor;
    }

    public UsuarioModel getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(UsuarioModel destinatario) {
        this.destinatario = destinatario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData_envio() {
        return data_envio;
    }

    public void setData_envio(Date data_envio) {
        this.data_envio = data_envio;
    }

    public Time getHorario_envio() {
        return horario_envio;
    }

    public void setHorario_envio(Time horario_envio) {
        this.horario_envio = horario_envio;
    }

    public Date getData_recebimento() {
        return data_recebimento;
    }

    public void setData_recebimento(Date data_recebimento) {
        this.data_recebimento = data_recebimento;
    }

    public Time getHorario_recebimento() {
        return horario_recebimento;
    }

    public void setHorario_recebimento(Time horario_recebimento) {
        this.horario_recebimento = horario_recebimento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}
