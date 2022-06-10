public class Contador {
    public static void main(String [] args) {
        int contador; //declarando o contador
        contador = 1; //inicializando contador
        while (contador <= 100) {
            System.out.print(contador + " ");
            if (contador % 30 == 0)
                System.out.println(""); //Quebra de linha para ver todos os numeros
            contador++; //mesma coisa que utilizar contador = contador + 1
        }
    } // fim do metodo main
} // fim da classe Contador