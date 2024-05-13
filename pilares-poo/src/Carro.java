public class Carro extends Veiculo{
    
    public void Ligar(){
        System.out.println("Carro ligado!");
        confereCombustivel();
        confereCambio();
    }

    private void confereCombustivel(){
        System.out.println("Conferindo combustivel");
    }

    private void confereCambio(){
        System.out.println("Conferindo o câmbio!");
    }
}
