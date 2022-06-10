public class Decremento {
    public static void main (String [] args){
        int contador = 100; //Declara e inicializa o contador

        while (contador > 0){
            System.out.println(contador + " ");
            if (contador % 30 == 0)
                System.out.println(" "); //Quebra de linha para ver todos os numeros
            contador--; // mesma coisa que utilizar contador = contador - 1
        }
    } //fim do metodo main
} //fim da classe Decremento
