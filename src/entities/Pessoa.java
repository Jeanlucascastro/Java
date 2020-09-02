package entities;

public class Pessoa {
    private Integer id;
    private String nome;
    private Integer quantidade;

    public Pessoa(int id, String nome, int quantidade){
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
    }
    public int getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(){
        this.nome = nome;
    }

    public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(){
        this.quantidade = quantidade;
    }
    public void totalSalgados (int quantidade){

    }

    public String toString(){
        return id + nome + quantidade;
    }
}
