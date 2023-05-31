package com.example.demo.controller;

import com.example.demo.service.PessoaService;
import com.example.demo.entities.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping
    public ResponseEntity<List<Pessoa>> getPessoa() {
        List<Pessoa> pessoa = (List<Pessoa>) pessoaService.getPessoa();
        if (pessoa.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(pessoa);
        }
    }

    @PostMapping
    public ResponseEntity<Pessoa> postPessoa(@RequestBody Pessoa pessoa) {
        Pessoa newPessoa = pessoaService.save(pessoa);
        return new ResponseEntity<>(newPessoa, HttpStatus.CREATED);
    }

//    @DeleteMapping(value = "/pessoa/v1/{id}")
//    public void deletePessoa(@PathVariable("id") Long id) {
//        this.pessoaService.deletePessoa(id);
//    }
}
