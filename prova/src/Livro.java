public class Livro {
    private String titulo;
    private String autor;
    private String ISBN;
    private boolean disponivel;

    public String emprestar(){
        if(disponivel){
            disponivel = false;
        }
        return "livro indisponivel";
    }
}
