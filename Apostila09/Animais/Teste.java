public class Teste {
    static public void main(String[] args) {

        //teste cachorro
        String nomeDog = "Dino";
        int patasDog = 0;
        Cachorro dog = new Cachorro(nomeDog,patasDog);

        patasDog = dog.setPatas();

        System.out.println("Oi cachoro chamado " + dog.nome);
        System.out.println("O cachorro tem " + dog.patas + " patas");

        //teste gato
        String nomeCat = "Snow";
        int patasCat = 0;
        Gato cat = new Gato(nomeCat,patasCat);

        patasCat = cat.setPatas();

        System.out.println("Oi gato chamado " + cat.nome);
        System.out.println("O gato tem " + cat.patas + " patas");

    }
}
