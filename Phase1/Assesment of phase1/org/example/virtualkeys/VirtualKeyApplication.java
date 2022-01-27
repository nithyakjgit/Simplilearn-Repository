package org.example.virtualkeys;
import org.example.virtualkey.screens.WelcomeScreen;
public class VirtualKeyApplication {

    public static void main(String[] args) throws Exception {
    	
    	WelcomeScreen welcome = new WelcomeScreen();
    	welcome.introWS();
    	welcome.GetUserInput();

    }
}
