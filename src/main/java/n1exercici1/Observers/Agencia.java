package n1exercici1.Observers;

public class Agencia implements Observer {
    private String nom;

    public Agencia(String nom) {
        this.nom = nom;
    }

    @Override
    public void actualitzar(String estatStock) {
        System.out.println("Actualització del stock per a l'agència: " + nom + ". " + estatStock);
    }

    @Override
    public String toString() {
        return "Agència: " + nom;
    }
}
