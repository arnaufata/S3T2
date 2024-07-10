package n2exercici1;

import n2exercici1.MetodePagament.MetodePagament;

public class BotigaSabates {
    private PasarelaPagament pasarelaPagament;

    public BotigaSabates(PasarelaPagament pasarelaPagament) {
        this.pasarelaPagament = pasarelaPagament;
    }

    public void comprarSabates(double preu, MetodePagament metodePagament) {
        pasarelaPagament.procesarPagament(metodePagament, preu);
        System.out.println("Pagament efectuat amb èxit!\n");
    }
}
