package n2exercici2;

import n2exercici2.MetodePagament.MetodePagament;

public class PasarelaPagament {
    public void procesarPagament(MetodePagament metodePagament, double quantitat) {
        metodePagament.efectuarPagament(quantitat);
    }
}
