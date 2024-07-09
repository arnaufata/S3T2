package n2exercici2.MetodePagament;

public class Paypal implements MetodePagament {

    @Override
    public void efectuarPagament(double quantiat) {
        System.out.println("Efectuant el pagament amb Paypal pel valor de: " +
                quantiat + " euros.");
    }
}
