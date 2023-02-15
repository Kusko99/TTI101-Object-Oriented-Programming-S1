import javax.swing.JOptionPane;
public class CustoFinalCarro {
    static public void main (String[]args){
        //variáveis
        double custoFabrica;
        double percentualDistribuidor;
        double impostos;
        double custoFinal;
        //entrada
        custoFabrica = Double.parseDouble(JOptionPane.showInputDialog("Digite o custo de fábrica: "));
        //processamento
        percentualDistribuidor = ((custoFabrica*28)/100);
        impostos = ((custoFabrica*45)/100);
        custoFinal = percentualDistribuidor + impostos + custoFabrica;
        //saída
        JOptionPane.showMessageDialog(null,"O custo final do carro será: " + custoFinal);
    }
    
}
