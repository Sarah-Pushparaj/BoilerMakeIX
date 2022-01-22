package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    ///////// HOME PAGE VARIABLES ////////////////
    public static JFrame mainFrame;
    public static JPanel panel;
    public static JLabel welcomeToApp;
    public static JButton letsGo;



    public static void main(String[] args) {
	// CALL METHODS OF EACH SCREEN
        homePage();
    }

    public static void homePage() {

        //setting up the frame
        mainFrame = new JFrame();
        panel = new JPanel();
        mainFrame.setSize(500, 500);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.add(panel);

        // label for application
        welcomeToApp = new JLabel("Welcome to Music Therapy!");
        welcomeToApp.setBounds(105, 50,500, 25);
        welcomeToApp.setFont(new Font("Serif", Font.PLAIN, 25));
        panel.add(welcomeToApp);

        //button for Let's Go
        letsGo = new JButton("Let's Go!");
        letsGo.setBounds(150, 180, 180, 80);
        letsGo.addActionListener((e) -> {
            mainFrame.setVisible(false);
            mainFrame.dispose();
            // call next screen
        });
        panel.add(letsGo);
        
        panel.setLayout(null);
        mainFrame.setVisible(true);

    }


}
