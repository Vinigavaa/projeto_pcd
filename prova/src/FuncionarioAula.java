import java.time.Duration;
import java.time.LocalDateTime;

public class FuncionarioAula {
    private double bancoHoras;
    private String nome;
    private double horas;
    private double valorSalario;

    public void setSalario(double salario){
        this.valorSalario = salario;
    }

    //aumentar salario em porcentagem
    public double aumentarSalario(double porcentagem){
        this.valorSalario += (this.valorSalario*(porcentagem/100));
        return this.valorSalario;
    }

    //descobrir o intervalo de tempo de horas entre duas datas.
    public long registrarPonto(LocalDateTime entrada, LocalDateTime saida){
        Duration duration = Duration.between(entrada, saida);
        long horasTrabalhadas = duration.toHours();
        this.horas = horasTrabalhadas;

        return horasTrabalhadas;
    }

    public double fazerPagamento(){
        if (horas > 100){
            bancoHoras += (horas - 100);

            this.horas = 0;
            return valorSalario*100;
        }

        double valorPago = valorSalario*horas;
        horas = 0;

        return valorPago;
    }


}
