package src.lanchonete.atendimento.cozinha;

public class Cozinheiro {
    
    public void adicionarLancheNoBalcao(){
        System.out.println("Adicionando lanche natural hamburguer no balcao");
    }

    public void adicionarSucoNoBalcao(){
        System.out.println("Adicionando suco no balcao");
    }
    
    private void prepararVitamina(){
        System.out.println("Preparando vitamina");
    }

    public void adicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    private void selecionarIngredientesLanches(){
        System.out.println("Selecionando pão, carne, sala e ovo");
    }

    private void prepararLanche(){
        System.out.println("Prearando lanche do tipo hamburguer");
    }

    private void prepararCombo(){
        prepararLanche();
        prepararVitamina();
    }

    private void fritarIngredientesLanches(){
        System.out.println("Fritando a carne e ovo para o hamburguer");
    }

    public void ingredientesVitamina(){
        System.out.println("Selecioando fruta, leite e suco");
    }

    private void lavarIngredientes(){
        System.out.println("Lanvando os ingredientes");
    }

    private void baterVitaminaLiquidificador(){
        System.out.println("Batendo vitamina liquidificador");
    }

    private void pedirParaTrocarGas(Almoxarife meuAmigo){
        meuAmigo.trocarGas();
    }

    private void pedirIngredientes(Almoxarife almoxarife){
        almoxarife.entregarIngredientes();
    }
}
