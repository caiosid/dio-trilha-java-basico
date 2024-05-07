import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {

        String [] candidatos = {"Felipe","Marcia","Julia", "Paulo", "Augusto"};
        for (String canditatos : candidatos) {
            
        }

    }

    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }

    public void imprimirSelecionados(){
       String [] candidatos = {"Felipe","Marcia","Julia", "Paulo", "Augusto"};
          System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
       
       for(int indice =0; indice < candidatos.length; indice++){
          System.out.println("O candidato de nº " + (indice + 1) + " é " + candidatos[indice]);
       }

          System.out.println("Forma abreviada de interação for each");

       for (String candidato : candidatos) {
          System.out.println("O canditado selecionado foi:" + candidato);
       }
    }
    

    public void selecaoCandidatos(){
        String [] candidatos = {"Felipe","Marcia","Julia", "Paulo", "Augusto","Mônica","Fabricio", "Mirela", "Daniela"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato" + candidato + "Solicitou este valor de salario " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato" + candidato + "foi selecionado para essa vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato!");
        }else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com uma contra proposta!");
        }else{
            System.out.println("Aguardando os demais candidatos!");
        }
    }
}
