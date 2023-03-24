
package terminaldevendas1;


public class Produto {
    private int cod;
    private String produto;
    private double valor;
    private String unidade;

    public Produto(int cod, String produto, double valor, String unidade) {
        this.cod = cod;
        this.produto = produto;
        this.valor = valor;
        this.unidade = unidade;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
