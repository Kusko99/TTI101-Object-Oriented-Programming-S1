import java.util.Scanner;

public class Comissao {
    
    public static void main(String[] args) {
        
        double comissao, valorPeca, quantidadeVenda, porcentagemComissao;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a porcentagem da comissão: ");
        porcentagemComissao = scanner.nextDouble();
        porcentagemComissao = porcentagemComissao * 0.01;
        
        System.out.print("Digite a o valor da peça: ");
        valorPeca = scanner.nextDouble();

        System.out.print("DIgite a quantidade de peças vendidas: ");
        quantidadeVenda = scanner.nextDouble();

        comissao = (valorPeca*quantidadeVenda) * porcentagemComissao;

        System.out.print("A comissão será igual a: R$" + comissao);

        scanner.close();
    }
    
}
