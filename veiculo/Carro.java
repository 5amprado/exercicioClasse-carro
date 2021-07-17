package exercicioClasse.Veiculo;

public class Carro {
    private String marca;
    private Integer ano;
    private String modelo;
    public String variante;

    public Carro(String modelo, String marca, int ano){
        this.marca = marca;
        this.ano = ano;
        this.modelo = modelo;

    }

    public String getModelo(){
        return modelo;
    }

    public Integer getAno(){
        return ano;
    }

    public String getVariante(){
        return variante;
    }

    public void setVariante(String variante){
        this.variante = variante;
    }

    public String getMarca(){
        return marca;
    }
}
