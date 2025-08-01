package ispviolacao;

public class Estagiario implements Funcionario{
    
    @Override
    public String getCargo(){
        return "Estagiário";
    }
    
    @Override
    public double calculaSalario(){
        return 0;
    }
     
    @Override
    public double calcula13o(){
        return 0;
    }
}
