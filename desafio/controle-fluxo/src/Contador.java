import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        git 
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int numeroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int numeroDois = terminal.nextInt();

        try {
            
            contar(numeroUm, numeroDois);

        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

    
        realizarContagem(parametroUm, parametroDois);
    }

    static void realizarContagem(int inicio, int fim) {
        
        int quantidade = fim - inicio + 1;

        
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Imprimindo o número " + (inicio + i));
        }
    }
}

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }

 }


