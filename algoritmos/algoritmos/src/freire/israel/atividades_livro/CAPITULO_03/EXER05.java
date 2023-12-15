package freire.israel.atividades_livro.CAPITULO_03;
import javax.swing.JOptionPane;
public class EXER05 {

    /*5)Um motorista deseja colocar no seu tanque X reais de gasolina.
     Escreva um algoritmo para ler o preço do litro da gasolina e o valor do pagamento, e exibir quantos litros ele conseguiu colocar no tanque*/
    public static void main(String[] args) {

        //declarar variáveis
        double precoLitro, valorPagamento, litrosAbastecidos;

        //entrada de dados
        precoLitro = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do litro da gasolina:"));
        valorPagamento = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do pagamento:"));

        //calcular litros abastecidos
        litrosAbastecidos = valorPagamento / precoLitro;

        //mostra dados para o usuário
        JOptionPane.showMessageDialog(null, "Você conseguiu abastecer " + litrosAbastecidos + " litros de gasolina.");
    }
}
