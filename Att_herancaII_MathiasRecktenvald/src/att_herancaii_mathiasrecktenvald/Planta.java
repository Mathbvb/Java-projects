
package att_herancaii_mathiasrecktenvald;

public class Planta {
    private String altura;
    private int idade;
    private String grupo;
    
    public Planta(){
    }
    
    public Planta(int idade){
        this.idade = idade;
    }
    
    public Planta(String altura, String grupo){
        this.altura = altura;
        this.grupo = grupo;
    }
    
    public void setAltura(String altura){
        this.altura = altura;
    }
    
    public String getAltura(){
        return this.altura;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void setGrupo(String grupo){
        this.grupo = grupo;
    }
    
    public String getGrupo(){
        return this.grupo;
    }
    
    public void mostraPlanta(){
        System.out.println("Dados da planta:");
        System.out.println("Altura: " +getAltura());
        System.out.println("Idade: " +getIdade());
        System.out.println("Grupo: " +getGrupo());
    }
}
