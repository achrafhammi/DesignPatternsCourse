import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        Context context = new Context();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("which strategy");
            String strategyClassName = scanner.nextLine();
            Strategy strategy = (Strategy) Class.forName(strategyClassName).newInstance();
            context.setStrategy(strategy);
            context.effectuerOperation();
        }

    }
}