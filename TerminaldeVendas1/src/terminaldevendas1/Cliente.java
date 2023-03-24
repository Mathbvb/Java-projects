
package terminaldevendas1;


public class Cliente {
    private int cod;
    private String nome;
    private String cpf;
    private String endereco;

    public Cliente(int cod, String nome, String cpf, String endereco) {
        this.cod = cod;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    
}
