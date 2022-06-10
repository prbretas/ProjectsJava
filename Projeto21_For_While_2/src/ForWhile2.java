public class ForWhile2 {
    public static void main (String [] args) {
        int contadorFor, contadorWhile;

        ////for(inicialização; condição; decremento)
        for(contadorFor = 10; contadorFor > 0; contadorFor--)
            System.out.println("*");

        System.out.println("");
        contadorWhile = 10; //inicialização do while

        //while (condição)

        while (contadorWhile > 0) {
            System.out.println("*");
            contadorWhile--; //Decremento do while
        }
    }
}
