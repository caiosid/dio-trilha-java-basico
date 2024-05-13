public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("878787");
        //jeep.Ligar();

        Moto z400 = new Moto();
        z400.setChassi("454545");
        //z400.Ligar();

        Veiculo coringa = z400;

        coringa.Ligar();
    }
}
