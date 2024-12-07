import obs.ObservableImpl;
import obs.Observer;
import obs.ObserverImpl1;
import obs.ObserverImpl2;

public class Main {
    public static void main(String[] args) {
        ObservableImpl observable = new ObservableImpl();
        observable.setState(90);
        observable.setState(30);
        Observer observer1 = new ObserverImpl1();
        observable.subscribe(observer1);
        observable.subscribe(new ObserverImpl2());
        observable.setState(70);
        observable.setState(50);
        observable.setState(60);
        observable.unsubscribe(observer1);
        System.out.println("------------------");
        observable.setState(44);
        observable.setState(9025);
    }
}