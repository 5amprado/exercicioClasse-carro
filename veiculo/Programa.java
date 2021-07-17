package exercicioClasse.Veiculo;

public class Programa {
    public static void main(String[] args) {

        Carro carro = new Carro("Argo", "Fiat", 2017) {
        };
        carro.setVariante("1.0 DRIVE");
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Variante: " + carro.getVariante());
    }
}
