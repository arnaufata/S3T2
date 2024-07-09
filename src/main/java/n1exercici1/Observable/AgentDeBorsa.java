package n1exercici1.Observable;

import n1exercici1.Observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class AgentDeBorsa implements Observable{
    private List<Observer> observers = new ArrayList<>();
    private String estatStock;

    @Override
    public void afegirObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void eliminarObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notificarObservers() {
        for (Observer observer : observers) {
            observer.actualitzar(estatStock);
        }
    }

    @Override
    public void mostrarLlistaSubscrits() {
        for(int i = 0; i < observers.size(); i++) {
            System.out.println((i + 1) + ".- " + observers.get(i));
        }
    }

    public void actualitzarEstatStock(String estatStock) {
        this.estatStock = estatStock;
        notificarObservers();
    }
}
