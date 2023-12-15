package freire.israel.atividades_livro.CAPITULO_04;
import javax.swing.JOptionPane;
public class EXER02 {

    /*
        2) O indice de massa corpórea (IMC) é calculado a partir da seguinte fórmula:
        IMC= peso(kg)/ altura²(m)
    */
    public static void main(String[] args) {

        //declarar variáveis
        double peso, altura, imc;

        //entrada de dados
        peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso em quilogramas:"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura em metros:"));

        //Calcula o IMC
        imc = peso / (altura * altura);

        //Mostrar dados para o usuário
        if (imc < 18.5) {
            JOptionPane.showMessageDialog(null,"IMC:"+imc+"\n"+"Está abaixo do peso");
        } else if (imc >= 18.5 && imc < 25) {
            JOptionPane.showMessageDialog(null,"IMC:"+imc+"\n"+"Está com peso normal");
        } else if (imc >= 25 && imc < 30) {
            JOptionPane.showMessageDialog(null,"IMC:"+imc+"\n"+" Está com sobrepeso");
        } else if (imc >= 30 && imc < 35) {
            JOptionPane.showMessageDialog(null,"IMC:"+imc+"\n"+"Está com obesidade leve");
        } else if (imc >= 35 && imc < 40) {
            JOptionPane.showMessageDialog(null,"IMC:"+imc+"\n"+"Está com obesidade moderada");
        } else {
            JOptionPane.showMessageDialog(null,"IMC:"+imc+"\n"+"Está com obesidade mórbida");
        }
    }
}
