package estabelecimento;

import equipamento.copiadora.Copiadora;
import equipamento.digitalizadora.Digitalizadora;
import equipamento.digitalizadora.Scanner;
import equipamento.impressora.Deskjet;
import equipamento.impressora.Impressora;
import equipamento.impressora.Laserjet;
import equipamento.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Scanner scanner = new Scanner();

        Digitalizadora digitalizadora = scanner;

        digitalizadora.digitalizar();
   
    }
}
