import javax.swing.JOptionPane;
public class SalarioRevendedorCarros {
    static public void main (String[]args){
        //variáveis
        double salarioFixo;
        double numeroDeCarrosVendidos;
        double valorTotalDasVendas;
        double valorRecibidoPorCarroVendido;
        double comissaoFixaPorCarro;
        double cincoPorcentoDasVendas;
        double salarioFinal;
        //entrada
        salarioFixo = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário fixo do funcionário: "));
        numeroDeCarrosVendidos = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de carros vendidos por ele esse mês: "));
        valorTotalDasVendas = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor total das vendas desse funcionário esse mês: "));
        valorRecibidoPorCarroVendido = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor recibido por venda pelo funcionário: "));
        //processamento
        comissaoFixaPorCarro = numeroDeCarrosVendidos*valorRecibidoPorCarroVendido;
        cincoPorcentoDasVendas = valorTotalDasVendas * 0.5;
        salarioFinal = salarioFixo +  comissaoFixaPorCarro + cincoPorcentoDasVendas ;
        //saída
        JOptionPane.showMessageDialog(null,"O salário final do funcionário será: " + salarioFinal);
    }
    
}
