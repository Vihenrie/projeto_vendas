public class classes {

    String nomeCli, telCli, emailCli;

    public String getclicomplet() {
        String clicomplet = nomeCli+" | "+telCli+" | "+emailCli;
        return clicomplet;
    }

    double precProdut1, qtdeProdut1;
    double precProdut2, qtdeProdut2;
    double tot = 0;

    public double getprecomplet(){
        tot = (precProdut1 * qtdeProdut1) + (precProdut2 * qtdeProdut2);
        return tot;
    }

    double comis;

    public double getvendcomplet() {
        tot = (precProdut1 * qtdeProdut1) + (precProdut2 * qtdeProdut2);
        comis = tot * 0.1;
        return comis;
    }
}
