package observer;

import java.util.ArrayList;
import java.util.List;

public class Vigilante extends Enemigo implements MyObservable {

    private List<MyObserver> observers = new ArrayList<>();

    public Vigilante(String nombre) {
        super(nombre);
        setActivo(true);
        
    }

    @Override
    public void ataque() {
        System.out.println(getNombre()+ "Vigilante en ataque");    
    }

    @Override
    public void activado() {
        System.out.println(getNombre()+ " enviando mensaje");
        broadcast();      
    }

    @Override
    public void subscribe(MyObserver observer) {
        observers.add(observer);    
    }

    @Override
    public void unsuscribe(MyObserver observer) {
        observers.remove(observer);    
    }

    @Override
    public void broadcast() {
        for(MyObserver observer: observers){
            observer.update();
        }
    }

    
}
