import java.util.Scanner;

public class Menu{

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double limite = sc.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        int sair = 1;
        while(sair != 0) {
            System.out.println("Digite a descrição da compra:");
            String descricao = sc.next();

            System.out.println("Digite o valor da compra:");
            double valor = sc.nextDouble();

            Compra compra = new Compra(descricao, valor);
            boolean compraRealizada = cartao.lancaCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                sair = sc.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                sair = 0;
            }
        }

        System.out.println("-::::::::::::::::::::-");
        System.out.println("- COMPRAS REALIZADAS:\n");

        for (Compra c : cartao.getCompras()) {
            System.out.println(c.getNome() + " - " +c.getValor());
        }
        System.out.println("\n-::::::::::::::::::::-");

        System.out.println("\nLimite disponível no cartão: " +cartao.getLimiteDisponivel());


    }

}