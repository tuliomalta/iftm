package ispviolacao;

public class Gerente implements Funcionario{
    
    @Override
    public String getCargo(){
        return "Gerente";
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
