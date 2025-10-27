package observer;

public interface MyObservable {
    void subscribe(MyObserver observer);

    void unsuscribe(MyObserver observer);

    void broadcast();
    
} 