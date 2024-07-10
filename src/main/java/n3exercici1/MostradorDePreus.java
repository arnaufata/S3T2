package n3exercici1;

public class MostradorDePreus {
    private Convertidor convertidor;

    public MostradorDePreus(Convertidor convertidor) {
        this.convertidor = convertidor;
    }

    public void mostrarPreu(Producte producte, String monedaDesti) {
        double preuConvertit = convertidor.convertir(producte.getPreu(), monedaDesti);
        String preuFormat = String.format("%.2f", preuConvertit);
        System.out.println("El preu de " + producte.getNom() + " en " + monedaDesti + " és: " + preuFormat);
    }
}
