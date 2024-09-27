public class Calculadora {
    private double resultadoAtual = 0.0;

    public void somar(int valor){
        valor += this.resultadoAtual;
    }

    public void subtrair(int valor){
        valor -= this.resultadoAtual;
    }

    public String parOuImpar(){
        if(this.resultadoAtual % 2 == 0){
            return "par";
        } else {
            return "impar";
        }
    }
}
