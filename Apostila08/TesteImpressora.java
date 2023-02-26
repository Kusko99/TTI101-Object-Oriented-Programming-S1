public class TesteImpressora {
    public static void main(String[] args) {
        Impressora print = new Impressora();

        print.exibir(1);
        print.exibir(1, 5);
        print.exibir(1, "Gustavo");
        print.exibir("Eduardo", 3);
        print.exibir("Gabriel", "Lucas", "Oliver");
        print.exibir(1, 7,"Thomas");
    }
}
