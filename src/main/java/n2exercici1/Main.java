package n2exercici1;

import n2exercici1.MetodePagament.DeuteCompteBancari;
import n2exercici1.MetodePagament.MetodePagament;
import n2exercici1.MetodePagament.Paypal;
import n2exercici1.MetodePagament.TargetaCredit;

public class Main {
    public static void main(String[] args) {

        PasarelaPagament pasarelaPagament = new PasarelaPagament();

        BotigaSabates botigaSabates = new BotigaSabates(pasarelaPagament);

        MetodePagament targetaCredit = new TargetaCredit();
        MetodePagament paypal = new Paypal();
        MetodePagament compteBancari = new DeuteCompteBancari();

        botigaSabates.comprarSabates(75.0, targetaCredit);
        botigaSabates.comprarSabates(120.0, paypal);
        botigaSabates.comprarSabates(99.99, compteBancari);
    }
}
