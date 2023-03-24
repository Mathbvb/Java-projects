package att_herancaii_mathiasrecktenvald;

public class Executa {

    public static void main (String[] args){
    Planta pl;
    Carvalho cv;
    
    pl = new Planta("27 metros", "Gimnospermas");
    pl.setIdade(26);
    cv = new Carvalho("lobadas", "Lithocarpus", 36);
    cv.setAltura("9 metros");
    cv.setFrutas(false);
    cv.setGrupo("Angiospermas");
    pl.mostraPlanta();
    cv.mostraPlanta();
    } 
    
}