package obs;

import java.util.ArrayList;
import java.util.List;

public class ObserverImpl2 implements Observer {
    private List<Integer> history = new ArrayList<>();

    @Override
    public void update(Observable observable) {
        if(observable instanceof ObservableImpl) {
            System.out.println("-----------OBS 2------------");
            history.add(((ObservableImpl) observable).getState());
            double sum = 0;
            for (Integer s : history) {
                sum += s;
            }
            System.out.println("stage avg => " + sum / history.size());
            System.out.println("***************************");
        }
    }
}
