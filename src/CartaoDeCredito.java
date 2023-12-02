import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double limiteDisponivel;
    private List<Compra> compras;

    public double getLimiteDisponivel() {
        return limiteDisponivel;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public CartaoDeCredito(Double limite){
        this.limiteDisponivel = limite;
        this.compras = new ArrayList<>();
    }


    public void comprar(double valor){
        if(limiteDisponivel < valor){
            System.out.println("Sem limite! seu limite é de : " + this.limiteDisponivel);
        } else {
            double novoValor = limiteDisponivel - valor;
            this.limiteDisponivel = novoValor;
            System.out.println("Compra realizada. seu limite é de : " + this.limiteDisponivel);
        }
    }

    public boolean lancaCompra(Compra compra) {
        if(this.limiteDisponivel > compra.getValor()){
            this.limiteDisponivel -= compra.getValor();
            this.compras.add(compra);
            return true;
        }
        return false;
    }
}
