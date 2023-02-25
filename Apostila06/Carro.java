public class Carro {
    
    private String marca;
    private String placa;

    public Carro(String marca,String placa){
        this.marca = marca;
        this.placa = placa;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getMarca(){
        return marca;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public String getPlaca(){
        return placa;
    }

    public void ligado(){
        System.out.print("Carro Ligado");
    }

    public void desligar(){
        System.out.print("Carro Desligado");
    }
}
