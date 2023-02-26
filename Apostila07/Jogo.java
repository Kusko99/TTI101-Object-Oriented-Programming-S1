public class Jogo {
    public static void main(String[] args) throws InterruptedException {
    Personagem cacador = new Personagem("John",10,0,0);
    Personagem soneca = new Personagem ("Soneca",2,6,4);
    Personagem oliver = new Personagem("Oliver", 0, 0, 0);
    while (true){
        cacador.cacar();
        soneca.dormir();
        oliver.dormir();
        cacador.comer();
        soneca.dormir();
        oliver.comer();
        cacador.dormir();
        soneca.dormir();
        oliver.comer();
        cacador.cacar();
        soneca.comer();
        oliver.cacar();
        cacador.cacar();
        soneca.cacar();
        oliver.dormir();
        System.out.println("====================");
        Thread.sleep(3000);
        }
    }
}
