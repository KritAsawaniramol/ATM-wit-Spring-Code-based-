package atm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        //Bank bankXYZ = new Bank("My Bank", new DataSourceDB());
        //Bank bankABC = new Bank("My Bank", new DataSourceFile("customerABC.txt"));
        //ATM atm = new ATM(bankXYZ);
        //AtmUI atmUI = new AtmUI(atm);

        ApplicationContext context = new AnnotationConfigApplicationContext(ATMConfig.class);
        AtmUI atmUI = context.getBean(AtmUI.class);

        atmUI.run();
    }
}
