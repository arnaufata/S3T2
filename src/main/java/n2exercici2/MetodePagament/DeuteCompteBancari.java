package n2exercici2.MetodePagament;

public class DeuteCompteBancari implements MetodePagament {

    @Override
    public void efectuarPagament(double quantiat) {
        System.out.println("Efectuant el pagament amb dèbit bancari, pel valor de: " +
                quantiat + " euros.");
    }
}
