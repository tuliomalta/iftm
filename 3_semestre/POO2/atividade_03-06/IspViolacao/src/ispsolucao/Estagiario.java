package ispsolucao;

import ispviolacao.*;

public class Estagiario implements FuncionarioEstagiario{
    
    @Override
    public String getCargo(){
        return "Estagiário";
    }
    
    @Override
    public double calculaSalario(){
// lógica para calcular o salario do estagiário
        return 0;
    }
     
    @Override
    public void setInstituicaoEnsino(String instituicao){
//  lógica para setar a instituição de ensino do estagiário 
    }
}
