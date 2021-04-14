
package modelo;


public class Funcionario {
    
    private String nome;
    private double salario;
    private int codCargo;
    private int tempService;
    
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
        
    }

    public double getSalario() {
        return salario;
        
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getCodCargo() {
        return codCargo;
    }

    public void setCodCargo(int codCargo) {
        this.codCargo = codCargo;
    }

    public int getTempService() {
        return tempService;
    }

    public void setTempService(int tempService) {
        this.tempService = tempService;
    }
    
}
