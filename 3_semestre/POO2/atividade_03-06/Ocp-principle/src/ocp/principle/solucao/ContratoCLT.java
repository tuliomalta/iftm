package ocp.principle.solucao;

public class ContratoCLT implements Remuneravel {
    private double salario;
   
    // construtor
    
    @Override
    public double remuneracao(){
        return salario;
    }
}

