package org.example.virtualkey.screens;
import org.example.virtualkey.services.DirectoryService;
import org.example.virtualkey.services.ScreenService;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WelcomeScreen implements Screen {

    private String welcomeText = "Welcome to VirtualKey!";
    private String developerText = "Developer: Akash";

    private ArrayList<String> options = new ArrayList<>();


    public WelcomeScreen() {
        options.add("1. Show Files");
        options.add("2. Show File Options Menu");
        options.add("3. Quit");

    }
    
    public void introWS() {
    	System.out.println(welcomeText);
        System.out.println(developerText);
        System.out.println("\n");
        Show();
    }
    
    
    
    @Override
    public void Show() {
    	System.out.println("Main Menu");
        for (String s : options)  {
            System.out.println(s);
        }

    }

    public void GetUserInput() throws Exception {
        int selectedOption  = 0;
        while ((selectedOption = this.getOption()) != 3) {
            this.NavigateOption(selectedOption);
        }
    }

    @Override
    public void NavigateOption(int option) throws Exception  {
        try {
			switch(option) {

			    case 1: // Show Files in Directory
			        this.ShowFiles();
			        
			        this.Show();
			        
			        break;
			        
			    case 2: // Show File Options menu
			    	ScreenService.setCurrentScreen(ScreenService.FileOptionsScreen);
			        ScreenService.getCurrentScreen().Show();
			        ScreenService.getCurrentScreen().GetUserInput();
			        
			        this.Show();
			        
			        break;
			        
			    default:
			        System.out.println("Invalid Option");
			        break;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }

    public void ShowFiles() {

    	
    	//Finished 

        System.out.println("List of Files: ");
    	DirectoryService.PrintFiles();

    }
    
    private int getOption() {
		Scanner in = new Scanner(System.in);
		{
			System.out.println("Enter your choice:");
			System.out.println("-------------------------------");
		}
        int returnOption = 0;
        try {
            returnOption = in.nextInt();
        }
        catch (InputMismatchException ex) {

        }
        return returnOption;

    }
}

