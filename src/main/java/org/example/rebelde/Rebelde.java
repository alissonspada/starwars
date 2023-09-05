package org.example.rebelde;

public class Rebelde {

    private Integer id;
    private String nome;
    private Integer idade;
    private String genero;
    private Boolean traidor;

    public Rebelde(String nome, Integer idade, String genero, Boolean traidor, Integer id) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.traidor = traidor;
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


    public boolean getTraidor() {
        return traidor;
    }

    public void setTraidor(Boolean traidor) {
        this.traidor = traidor;
    }

}
