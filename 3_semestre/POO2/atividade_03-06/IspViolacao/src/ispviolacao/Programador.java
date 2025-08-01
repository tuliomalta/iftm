package ispviolacao;

public class Programador implements Funcionario {
    
    @Override
    public String getCargo(){
        return "Programador";
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
