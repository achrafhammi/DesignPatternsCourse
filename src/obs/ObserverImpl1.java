package obs;

public class ObserverImpl1 implements Observer {
    @Override
    public void update(Observable observable) {
        if(observable instanceof ObservableImpl){
            int state = ((ObservableImpl)observable).getState();
            System.out.println("******OBS1*******");
            System.out.println("State value = "+state);
            System.out.println("******************");
        }
    }
}
