package equipamento.multifuncional;

import equipamento.copiadora.Copiadora;
import equipamento.digitalizadora.Digitalizadora;
import equipamento.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora{

    @Override
    public void imprimir() {
        // TODO Auto-generated method stub
        System.out.println("Imprimindo via equipamento multifuncional");
    }

    @Override
    public void digitalizar() {
        // TODO Auto-generated method stub
        System.out.println("Digitalizando via equipamento multifuncional");

    }

    @Override
    public void copiar() {
        // TODO Auto-generated method stub
        System.out.println("Copiando via equipamento multifuncional");

    }
    
}
