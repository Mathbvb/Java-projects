/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author mrmat
 */
public class Calculo {
    private static double v1;
    private static double v2;
    private static String operacao = "vazio";
    private static double result;
    
    public Calculo(){
    
    }

    public static double getV1() {
        return v1;
    }

    public static void setV1(double v1) {
        Calculo.v1 = v1;
    }

    public static double getV2() {
        return v2;
    }

    public static void setV2(double v2) {
        Calculo.v2 = v2;
    }

    public static String getOperacao() {
        return operacao;
    }

    public static void setOperacao(String operacao) {
        Calculo.operacao = operacao;
    }

    public static double getResult() {
        return result;
    }

    public void setResult(double reuslt) {
        this.result = reuslt;
    }
    
    public static void calculaResultado(){
        switch (operacao){
            case "mais":
                result = v1 + v2;break;
            case "menos":
                result = v1 - v2;break;
            case "vezes":
                result = v1 * v2;break;
            case "dividido":
                result = v1 / v2;break;
        }
    }
    
    public static void limpa(){
        v1 = 0;
        v2 = 0;
        operacao = "vazio";
    }
}
