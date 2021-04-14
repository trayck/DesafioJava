
package cargo;

import modelo.Funcionario;

public class AumentoSalarial {
   
    private Funcionario Func;

    public AumentoSalarial(Funcionario func) {
        this.Func = func;
    }
    public double calcularAumento() {
        
        return 0;
        
    }
        
    private double calcGerente() {
       int tempo = this.Func.getTempService();
       double percentual = 0;
       
       if (tempo >= 1 & tempo < 2) {
           percentual = 10;
           
       }else if(tempo <= 3) {
           percentual = 20;
           
       } else {
           percentual = 25;
           
       }
           double salario = this.Func.getSalario();
           double novoSalario = (salario * percentual) / 100;
           novoSalario = salario + novoSalario;
           
        return novoSalario;
    }
    
    private double calcEngenheiro() {
        int tempo = this.Func.getTempService();
        double percentual = 0;
        
        if(tempo >= 1 & tempo < 2) {
            percentual = 15;
        }else if (tempo <= 3){
            percentual = 30;
        }else {
            percentual = 35;
        }
            double salario = this.Func.getSalario();
            double novoSalario = (salario * percentual) / 100;
            novoSalario = salario + novoSalario;
            
        return novoSalario;
    }
    
    private double calcTecnico() {
        int tempo = this.Func.getTempService();
        double percentual = 0;
        if(tempo >= 1 & tempo < 2){
            percentual = 5;
                    
        }else if(tempo <= 3) {
            percentual = 10;
        }else{
            percentual = 15;
        }
        double salario = this.Func.getSalario();
        double novoSalario = (salario * percentual) / 100;
        novoSalario = salario + novoSalario;
        return novoSalario;
    }
    
    private double calcGeral() {
        int tempo = this.Func.getTempService();
        double percentual = 0;
        
        if(tempo > 3){
            
        }
        double salario = this.Func.getSalario();
        double novoSalario = (salario * percentual) / 100;
        return novoSalario;
    }
}
