public class CalculadoraCientifica {
    double raiz(int a){
        return Math.sqrt(a);
    }
    double raiz(double a){
        return Math.sqrt(a);
    }
    double raiz(String a){
        double b = Double.parseDouble(a);
        return Math.sqrt(b);
    }

    double potencia(byte a, byte b){
        return Math.pow(a, b);
    }
    double potencia(String a, String b){
        double c = Double.parseDouble(a);
        double d = Double.parseDouble(b);
        return Math.pow(c, d);
    }
    double potencia(int a, double b){
        return Math.pow(a, b);
    }
}
