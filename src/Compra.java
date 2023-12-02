public class Compra {
    private String nome;
    private double valor;

    Compra(String nome, double valor){
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Compra: " +
                "nome = " + nome + ", valor = " + valor;
    }
}
