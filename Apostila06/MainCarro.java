public class MainCarro {
    public static void main(String[] args) {
        
        Carro carro1 = new Carro("Toyota","EFG1234");
        Carro carro2 = new Carro("Honda","RTY6789");

        carro1.setMarca("Toyota");
        carro1.setPlaca("EFG1234");
        carro2.setMarca("Honda");
        carro2.setPlaca("RTY6789");

        carro1.ligado();
        carro2.ligado();
        carro1.desligar();
        carro2.desligar();
    }
}
