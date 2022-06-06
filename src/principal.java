import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nomeProdut1, nomeProdut2;
        String nomeVend;

        classes venda1 = new classes();

        System.out.print("Informe o nome do cliente: ");
            venda1.nomeCli = sc.next();
        System.out.print("Informe o numero de telefone deste cliente: ");
            venda1.telCli = sc.next();
        System.out.print("Informe o e-mail deste cliente: ");
            venda1.emailCli = sc.next();

        System.out.print("Informe qual foi o primeiro produto comprado: ");
            nomeProdut1 = sc.next();
        System.out.print("Informe qual o preço deste produto: ");
            venda1.precProdut1 = sc.nextDouble();
        System.out.print("Informe qual a quantidade comprada deste produto: ");
            venda1.qtdeProdut1 = sc.nextDouble();

        System.out.print("Informe qual foi o segundo produto comprado: ");
            nomeProdut2 = sc.next();
        System.out.print("Informe qual o preço deste produto: ");
            venda1.precProdut2 = sc.nextDouble();
        System.out.print("Informe qual a quantidade comprada deste produto: ");
            venda1.qtdeProdut2 = sc.nextDouble();

        System.out.print("Informe o nome do vendedor: ");
            nomeVend = sc.next();

        System.out.println("\n-------------------------------------------------------------");
        System.out.println("Quem comprou: "+venda1.getclicomplet());
        System.out.println("O que comprou: "+nomeProdut1 +" "+ nomeProdut2);
        System.out.println("Quanto pagou: "+ venda1.getprecomplet());
        System.out.println("Quem vendeu: "+ nomeVend);
        System.out.println("Qual a comissão: "+ venda1.getvendcomplet());
    }
}
