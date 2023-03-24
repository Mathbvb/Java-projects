
package att_herancaii_mathiasrecktenvald;

public class Carvalho extends Planta {
    private String folhas;
    private boolean frutas;
    private String genero;
    
    public Carvalho(){
    }
    
    public Carvalho(String folhas, String genero, int idade){
        super(idade);
        this.folhas = folhas;
        this.genero = genero;
    }
    
    public void setFolhas(String folhas){
        this.folhas = folhas;
    }
    
    public String getFolhas(){
        return this.folhas;
    }
    
    public void setFrutas(boolean frtuas){
        this.frutas = frutas;
    }
    
    public boolean getFrutas(){
        return this.frutas;
    }
    
    public void setGenero(String genero){
        this.genero = genero;
    }
    
    public String getGenero(){
        return this.genero;
    }
    
    @Override
    public void mostraPlanta(){
        System.out.println("=====================");
        System.out.println("Carvalho:");
        super.mostraPlanta();
        System.out.println("Folhas: " +getFolhas());
        System.out.println("Frutas: " +getFrutas());
        System.out.println("Genero: " +getGenero());
    }
    
}
