package n1exercici1;

import n1exercici1.Observable.AgentDeBorsa;
import n1exercici1.Observers.Agencia;

public class Main {
    public static void main(String[] args) {
        AgentDeBorsa agentBorsa = new AgentDeBorsa();

        Agencia agencia1 = new Agencia("Agencia1");
        Agencia agencia2 = new Agencia("Agencia2");
        Agencia agencia3 = new Agencia("Agencia3");

        agentBorsa.afegirObserver(agencia1);
        agentBorsa.afegirObserver(agencia2);
        agentBorsa.afegirObserver(agencia3);

        agentBorsa.mostrarLlistaSubscrits();

        agentBorsa.actualitzarEstatStock("El valor de la companyia Amazon a augmentat un 13%");
        agentBorsa.actualitzarEstatStock("L'empresa Appel a perdut un valor del 3%");

        agentBorsa.eliminarObserver(agencia2);

        agentBorsa.mostrarLlistaSubscrits();

    }
}