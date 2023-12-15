package freire.israel.atividades_livro.CAPITULO_03;
import javax.swing.JOptionPane;
public class EXER03 {
     /*3)A padaria Hotpão vende uma certa quantidade de pães franceses e uma quantidade de broas a  cada dia. Cada pãozinho custa R$0,12 e a broa custa R$1,50.
        Ao final do dia, o dono quer saber quanto arrecadou com a venda dos pães e broas (juntos), e quanto deve guardar numa conta de poupança (10% do total arrecadado).
        Você foi contratado para fazer os cálculos para o dono. Com base neestes fatos, faça um algoritmo para ler as quantidades de pães e de broas,
        e depois calcular os dados solicitados.*/
     public static void main(String[] args) {
         //declarando variáveis
         int qtdPaes, qtdBroas;
         double valorPaes, valorBroas, valorTotal, valorPoupanca;

         //entrada de dados
         qtdPaes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de pães franceses:"));
         qtdBroas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de broas:"));

         //calcular valores das guloseimas
         valorPaes = qtdPaes * 0.12;
         valorBroas = qtdBroas * 1.50;

         //calcular valor total e poupança
         valorTotal = valorPaes + valorBroas;
         valorPoupanca = valorTotal * 0.10;

         //mostrar dados para o usuário
         JOptionPane.showMessageDialog(null, "A arrecadação total é de R$" + valorTotal +  "\nO valor a ser guardado na poupança é de R$" + valorPoupanca);
     }
}
