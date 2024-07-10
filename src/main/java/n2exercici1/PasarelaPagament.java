package n2exercici1;

import n2exercici1.MetodePagament.MetodePagament;

public class PasarelaPagament {
    public void procesarPagament(MetodePagament metodePagament, double quantitat) {
        metodePagament.efectuarPagament(quantitat);
    }
}
