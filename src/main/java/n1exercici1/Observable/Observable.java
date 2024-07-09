package n1exercici1.Observable;

import n1exercici1.Observers.Observer;

public interface Observable {
    void afegirObserver(Observer observer);
    void eliminarObserver(Observer observer);
    void notificarObservers();
    void mostrarLlistaSubscrits();
}
