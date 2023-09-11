package org.example.rebelde;

import org.example.repository.ItemRepository;
import org.example.repository.LocalizacaoRepository;
import org.example.repository.RebeldeRepository;

public class Rebelde {

    private Integer id;
    private String nome;
    private Integer idade;
    private String genero;


    public Rebelde(String nome, Integer idade, String genero, Integer id) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }

    public Rebelde() {
    }




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


}
