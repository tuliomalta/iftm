package ispsolucao;

import ispviolacao.*;

public class Estagiario implements FuncionarioEstagiario{
    
    @Override
    public String getCargo(){
        return "Estagiário";
    }
    
    @Override
    public double calculaSalario(){
        return 0;
    }
     
    @Override
    public void setInstituicaoEnsino(String instituicao){
    }
}
