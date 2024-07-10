package n2exercici1.MetodePagament;

public class TargetaCredit implements MetodePagament {

    @Override
    public void efectuarPagament(double quantiat) {
        System.out.println("Efectuant el pagament amb targeta de crèdit pel valor de: " +
                quantiat + " euros.");
    }
}
