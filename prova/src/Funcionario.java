public class Funcionario {
    private String nome;
    private double salario;

    private int horasTrabalhadas;

    public double concederAumentoPercentual(double percentual){
        this.salario += (this.salario)*(percentual/100);
        return this.salario;
    }

    public double concederAumentoFixo(double valor){
        this.salario += valor;
        return this.salario;
    }

    public int registarHorasTrabalhadas(int horas){
        this.horasTrabalhadas += horas;
        return this.horasTrabalhadas;
    }

    public double realizarPagamento(){
       if(this.horasTrabalhadas >= 200){
           return this.salario*2;
       }else{
           return salario*horasTrabalhadas;
       }
    }
}
