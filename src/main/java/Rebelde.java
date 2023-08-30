public class Rebelde {

    public String nome;
    public Integer idade;
    public String genero;
    public Localizacao localizacao;
    public Boolean traidor;


    public Rebelde(String nome, Integer idade, String genero, Localizacao localizacao, Boolean traidor) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.localizacao = localizacao;
        this.traidor = traidor;
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

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }

    public Boolean getTraidor() {
        return traidor;
    }

    public void setTraidor(Boolean traidor) {
        this.traidor = traidor;
    }
}
