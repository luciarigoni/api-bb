package com.example.demo.dto;

import com.example.demo.entities.Pessoa;
import org.modelmapper.ModelMapper;

public class PessoaDTO {

    private Long id;

    private String nome;

    public PessoaDTO() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static PessoaDTO create(Pessoa p) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(p, PessoaDTO.class);
    }
}
