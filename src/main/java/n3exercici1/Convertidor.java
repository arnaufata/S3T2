package n3exercici1;

import java.util.HashMap;
import java.util.Map;

public class Convertidor implements ConvertidorDivisa{
    private Map<String, Double> taxesCanvi;

    public Convertidor() {
        taxesCanvi = new HashMap<>();
        taxesCanvi.put("USD", 1.08);
        taxesCanvi.put("JPY", 174.78);
        taxesCanvi.put("THB", 39.37);
        taxesCanvi.put("CNY", 7.87);
    }

    @Override
    public double convertir(double preu, String monedaDesti) {
        double taxaCanvi = taxesCanvi.get(monedaDesti);
        return preu * taxaCanvi;
    }
}
