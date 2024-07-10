package n3exercici1;

public class Main {
    public static void main(String[] args) {
        Convertidor convertidorDivisa = new Convertidor();

        MostradorDePreus show = new MostradorDePreus(convertidorDivisa);

        Producte bamba = new Producte("Nike Air", 120.00);
        Producte pc = new Producte("Monitor", 157.87);
        Producte bicicleta = new Producte("Orbea Focus", 1700.00);

        show.mostrarPreu(bamba, "USD");
        show.mostrarPreu(pc, "JPY");
        show.mostrarPreu(bicicleta, "THB");
        show.mostrarPreu(bicicleta, "CNY");
    }

}
