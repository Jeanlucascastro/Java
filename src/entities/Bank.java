public class Bank {
    private String nome;
    private Integer quantidade;

    public Bank (String nome, Integer quantidade){
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(){
        this.nome = nome;
    }

    public Integer getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(){
        this.quantidade = quantidade;
    }


}
