public class TesteComPolimorfimos {
    public static void main(String[] args) {
        Animal a1 = new Gato();
        Animal a2 = new Cachorro();
        a1.fazerBarulho();
        a2.fazerBarulho();
    }
}
