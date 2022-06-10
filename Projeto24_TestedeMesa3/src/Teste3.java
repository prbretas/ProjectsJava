public class Teste3 {
    public static void main (String [] args) {
        int controle = 1;
        long acumulador = 100;
        boolean condicao;
        System.out.println("Numero da interação\tCondicao\tControle\tAcumulador");
        do {
            acumulador -= controle;
            condicao = controle <= 10;
            System.out.println("Interação" + controle + "\t\t\t" + condicao + "\t\t\t" + controle + "\t\t\t" + acumulador);
            controle++;
        } while (controle <= 10);
    } // fim do metodo main
} // fim da classe Teste3
