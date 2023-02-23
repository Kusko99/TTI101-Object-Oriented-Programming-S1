import javax.swing.JOptionPane;
public class SenhaValida {
    static public void main (String[]args){
        //entrada
        String senha = JOptionPane.showInputDialog("Digite a sua senha: ");
        //inicialização de variáveis
        boolean comprimento1 = false;
        boolean temImpar = false;
        //processamento
        int comprimento = senha.length();
        if (comprimento == 4) {
            comprimento1 = true;
        }
        String senhaMinuscula = senha.toLowerCase();
        boolean começa = senhaMinuscula.startsWith("a");
        //tentar de novo usando o metodo matches
        boolean tem1 = senha.contains("1");
        boolean tem3 = senha.contains("3");
        boolean tem5 = senha.contains("5");
        boolean tem7 = senha.contains("7");
        boolean tem9 = senha.contains("9");
        if (tem1 || tem3 || tem5 || tem7 || tem9){
            temImpar = true;
        }
        //saída
        if (comprimento1 && temImpar && começa){
            JOptionPane.showMessageDialog(null,"Senha válida");
        }
        else{
            JOptionPane.showMessageDialog(null,"Senha não válida");
        }
    }
}

