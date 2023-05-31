package com.example.demo.service;

import com.example.demo.entities.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.PessoaRepository;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public Iterable<Pessoa> getPessoa() {
        return pessoaRepository.findAll();
    }

    public Pessoa save(Pessoa pessoa) {
        if(pessoa.getId()== null || pessoa.getNome() == null) {
            throw new IllegalArgumentException("Digite todos os campos");
        }
        return pessoaRepository.save(pessoa);
    }

}
