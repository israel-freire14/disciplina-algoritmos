package freire.israel.atividades_livro.CAPITULO_04;
import javax.swing.JOptionPane;
public class EXER05 {

    /*
        5) Entar com a distância percorrida (Km) e a quantidade de combustivel (Litros) gasto.
        Depois informe quantos quilômetros são percorridos por litro.
        Sabendo que um carro econômico percorre 15Km/l, diga se o veículo em questão é econômico ou não.
    */

    public static void main(String[] args) {

        //declarar variáveis
        double distancia, combustivel, consumo;

        distancia = Double.parseDouble(JOptionPane.showInputDialog("Distância percorrida (Km):"));
        combustivel = Double.parseDouble(JOptionPane.showInputDialog("Quantidade de combustível (Litros):"));

        //calcular consumo
        consumo = distancia / combustivel;

        //mostrar dados para o usuário
        JOptionPane.showMessageDialog(null, "O consumo é de " + consumo + " Km/l.");
        if (consumo < 15) {
            JOptionPane.showMessageDialog(null, "O veículo não é econômico.");
        } else {
            JOptionPane.showMessageDialog(null, "O veículo é econômico.");
        }
    }
}
