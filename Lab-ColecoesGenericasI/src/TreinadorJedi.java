
public class TreinadorJedi {
    public String nome;
    public String titulacao;

    public TreinadorJedi() {

    }

    public TreinadorJedi (String nome, String titulacao) {
        this.nome = nome;
        this.titulacao = titulacao;
  
    }

    public String getDescricao() {
        String xmsg = this.nome + " " + this.titulacao;
        return xmsg;
    }

    
}


