package Operadores;
public class Relacionais {
    public static void main(String[] args) {
        
        String nomeUm = "Caio";
        String nomeDois = new String ("Cesar");

        System.out.println(nomeUm == nomeDois);

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1 == numero2) {
            System.out.println("A nossa condição é verdadeira!");
        }

        System.out.println("O número 1 é igual ao número 2 " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numero 1 é diferente a numero 2? " + simNao);
    }
}
