

import Screen.LoginJFrame;
import Screen.MainJFrame;

/**
 * Data: 19/08/2022
 * @author tiagu
 */
public class Consumer extends Thread{

    public static void main(String[] args) {
        MainJFrame mainScreen = new MainJFrame();
        LoginJFrame loginScreen = new LoginJFrame();
        Thread login = new Thread(loginScreen);
        Thread main = new Thread(mainScreen);
        
        login.start();
        while(loginScreen.getLogin() == false){
                System.out.print("");
        }
        login.stop();
        main.start();
        
        
        	
    }
}
