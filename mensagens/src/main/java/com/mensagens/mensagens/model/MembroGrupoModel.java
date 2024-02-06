package com.mensagens.mensagens.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "membros_grupos")
public class MembroGrupoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    UsuarioModel usuarioModel = new UsuarioModel();
    @Column
    private int usuario_id = usuarioModel.getId();

    GrupoModel grupoModel = new GrupoModel();
    @Column
    private int grupo_id = grupoModel.getId();
    
}
