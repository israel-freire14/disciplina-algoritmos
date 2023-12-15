package freire.israel.atividades_livro.CAPITULO_03;
import javax.swing.JOptionPane;

public class EXER01 {
    /*
        1)A imobiliária Imóbilis vende apenas terrenos retangulares.
        Faça um algoritmo para ler as dimensões de um terreno e depois exibir a área do terreno
     */

    public static void main(String[] args) {

        //declarando variáveis
        double comprimento, largura, area;

        //entrada de dados
        comprimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento do terreno:"+"\n"+ "OBS:Digite o valor em metros"));
        largura = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura do terreno:"+ "\n"+ "OBS:Digite o valor em metros" ));

        //calcular a área do retângulo
        area = comprimento * largura;

        //mostrar dados para o usuário
        JOptionPane.showMessageDialog(null, "A área do terreno é: " + area+ " metros quadrados.");
    }
}


