public class Pessoa{

    private String nome;
    private String endereco;
    private String telefone;

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getEndereco(){
        return this.endereco;
    }
    public void setEndereco(String endereco){
        this.endereco=endereco;
    }
    public String getTelefone(){
        return this.telefone;
    }
    public void setTelefone(String telefone){
        this.telefone=telefone;
    }

    //Temos 7 metodos nessa classe, sendo 1 oculto, o método construtor//

}