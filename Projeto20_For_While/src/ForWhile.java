public class ForWhile {
    public static void main(String [] args){
        int contFor, contWhile;

        //for (inicialização; condição; incremento)
        for (contFor = 0; contFor < 5; contFor++)
            System.out.println("Valor do contFor: " + contFor);

        contWhile = 0; //Inicialização do while

        //While (Condição)
        while(contWhile < 5) {
            System.out.println("Valor do contWhile: " + contWhile);
            contWhile++; // Incremento do while
        }
    }
}
