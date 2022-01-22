package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

public class Main {


    /////////// PAGE 3 (EMOTION-CHOOSING) VARIABLES ////////////
    public static JFrame frame3;
    public static JPanel panel3;
    public static JLabel page3Title;


    /////////// EXCITED VARIABLES ////////////
    public static JFrame excitedFrame;
    public static JPanel excitedPanel;
    public static JLabel excitedEmotion;
    public static JTextArea excitedInfoText;

    /////////// HOPEFUL VARIABLES ////////////
    public static JFrame hopefulFrame;
    public static JPanel hopefulPanel;
    public static JLabel hopefulEmotion;
    public static JTextArea hopefulInfoText;

    /////////// OPTIMISTIC VARIABLES ////////////
    public static JFrame optimisticFrame;
    public static JPanel optimisticPanel;
    public static JLabel optimisticEmotion;
    public static JTextArea optimisticInfoText;

    /////////// NERVOUS VARIABLES ////////////
    public static JFrame nervousFrame;
    public static JPanel nervousPanel;
    public static JLabel nervousEmotion;
    public static JTextArea nervousInfoText;

    /////////// CONFUSED VARIABLES ////////////
    public static JFrame confusedFrame;
    public static JPanel confusedPanel;
    public static JLabel confusedEmotion;
    public static JTextArea confusedInfoText;

    //////////// MAIN PAGE BUTTONS //////////////
    public static JButton happy;
    public static JButton sad;
    public static JButton anxious;
    public static JButton unmotivated;
    public static JButton motivated;
    public static JButton lethargic;
    public static JButton hype;
    public static JButton excited;
    public static JButton hopeful;
    public static JButton optimistic;
    public static JButton tearful;
    public static JButton cheerful;
    public static JButton moody;
    public static JButton angry;
    public static JButton nervous;
    public static JButton confused;
    public static JButton heartbroken;


    ///////// HOME PAGE VARIABLES ////////////////
    public static JFrame mainFrame;
    public static JPanel panel;
    public static JLabel welcomeToApp;
    public static JButton letsGo;

    ////////// SAD PAGE VARIABLES /////////////
    public static JFrame sadFrame;
    public static JPanel sadPanel;
    public static JLabel sadEmotion;
    public static JTextArea sadInfoText;
    public static JButton sadButton;

    ////////// ANXIOUS PAGE VARIABLES /////////
    public static JFrame anxiousFrame;
    public static JPanel anxiousPanel;
    public static JLabel anxiousEmotion;
    public static JTextArea anxiousInfoText;
    public static JButton anxiousButton;

    ////////// UNMOTIVATED PAGE VARIABLES ///////
    public static JFrame unmotivatedFrame;
    public static JPanel unmotivatedPanel;
    public static JLabel unmotivatedEmotion;
    public static JTextArea unmotivatedInfoText;
    public static JButton unmotivatedButton;

    /////////// TEARFUL PAGE VARIABLES ////////////
    public static JFrame tearfulFrame;
    public static JPanel tearfulPanel;
    public static JLabel tearfulEmotion;
    public static JTextArea tearfulInfoText;
    public static JButton tearfulButton;

    //////////// HEARTBROKEN VARIABLES ////////////
    public static JFrame heartbrokenFrame;
    public static JPanel heartbrokenPanel;
    public static JLabel heartbrokenEmotion;
    public static JTextArea heartbrokenInfoText;
    public static JButton heartbrokenButton;

    static String playlistLink = "";

    ////////// SECOND (INFO) PAGE /////////////
    static JFrame infoFrame;
    static JPanel infoPanel;
    static JTextArea mentalHealthInfo;
    static JTextArea whyMusic;
    static JTextArea musicMentalHealth;
    static JButton next;

    ///////////// HAPPY VARIABLES //////////////
    static JFrame happyFrame;
    static JPanel happyPanel;
    static JLabel happyEmotion;
    static JTextArea happyText;
    static JButton happyButton;

    ///////////// LETHARGIC VARIABLES //////////
    static JFrame lethargicFrame;
    static JPanel lethargicPanel;
    static JLabel lethargicEmotion;
    static JTextArea lethargicText;
    static JButton lethargicButton;

    ///////////// HYPE VARIABLES /////////////
    static JFrame hypeFrame;
    static JPanel hypePanel;
    static JLabel hypeEmotion;
    static JTextArea hypeText;
    static JButton hypeButton;

    ///////////// MOODY VARIABLES ///////////
    static JFrame moodyFrame;
    static JPanel moodyPanel;
    static JLabel moodyEmotion;
    static JTextArea moodyText;
    static JButton moodyButton;

    ///////////// ANGRY VARIABLES ///////////
    static JFrame angryFrame;
    static JPanel angryPanel;
    static JLabel angryEmotion;
    static JTextArea angryText;
    static JButton angryButton;



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
            infoPage();
        });
        panel.add(letsGo);

        panel.setLayout(null);
        mainFrame.setVisible(true);
    }

    public static void infoPage() {
        //Mental Health Info Page
        infoFrame = new JFrame();
        infoPanel = new JPanel();
        infoFrame.setSize(600,500);
        infoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        infoFrame.add(infoPanel);


        //Labels
        //mental health info
        //why music
        //music x mental health

        mentalHealthInfo = new JTextArea("Mental Health. It’s critically important to our well being and yet not addressed enough.\n" +
                "Each person has their own state of mental health and that’s why it’s important for \n" + "each person to check in with their well-being.\n" +
                "With this app, YOU can identify how you feel, \n" + "what that means, and listen to music - \n" +
                "whether it lifts you up, or leaves you content \n" + "with how you’re feeling.\n");

        mentalHealthInfo.setBounds(60, 20, 500, 75);
        mentalHealthInfo.setFont(new Font("Serif", Font.PLAIN, 14));

        infoPanel.add(mentalHealthInfo);


        whyMusic = new JTextArea("Music is powerful. The combination of notes, melodies, voices:\n" +
                "it transfixes our minds, our emotions. How?\n" +
                "The amygdala, the part of our brain that regulates our mood, processes \n" +
                "the music we hear.\n");
        whyMusic.setBounds(60, 100, 500, 75);
        whyMusic.setFont(new Font("Serif", Font.PLAIN, 14));
        infoPanel.add(whyMusic);

        musicMentalHealth = new JTextArea("Music is incredibly complex and holds so much influence over how we feel.\n" +
                "Each emotion is connected to a curated playlist. With this app,\n" +
                "we hope to elevate mental health awareness through meaning and melodies.\n");


        musicMentalHealth.setBounds(60, 180, 500, 75);
        musicMentalHealth.setFont(new Font("Serif", Font.PLAIN, 14));
        infoPanel.add(musicMentalHealth);

        next = new JButton();

        next = new JButton("Next");
        next.setBounds(150, 300, 280, 50);
        next.addActionListener((e) -> {
            infoFrame.setVisible(false);
            infoFrame.dispose();
            // call next screen
            Page3();

        });
        infoPanel.add(next);

        // set panel and frame to show
        infoPanel.setLayout(null);
        infoFrame.setVisible(true);


    }

    public static void Page3(){
        // setting up the frame
        frame3 = new JFrame();
        panel3 = new JPanel();
        frame3.setSize(800,800);
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.add(panel3);

        // label for the title of page 3
        page3Title = new JLabel("How are you feeling?");
        page3Title.setBounds(280, 20, 500, 35);
        page3Title.setFont(new Font("Serif", Font.PLAIN, 25));
        panel3.add(page3Title);

        //button for Happy
        happy = new JButton("Happy");
        happy.setBounds(150, 180, 100, 60);
        happy.addActionListener((e) -> {
            happyPage();
        });
        panel3.add(happy);

        //button for Sad
        sad = new JButton("Sad");
        sad.setBounds(250, 180, 100, 60);
        sad.addActionListener((e) -> {
            sadPage();
        });
        panel3.add(sad);

        //button for Anxious
        anxious = new JButton("Anxious");
        anxious.setBounds(350, 180, 100, 60);
        anxious.addActionListener((e) -> {
            anxiousPage();
        });
        panel3.add(anxious);

        //button for Unmotivated
        unmotivated = new JButton("Unmotivated");
        unmotivated.setBounds(450, 180, 100, 60);
        unmotivated.addActionListener((e) -> {
            unmotivated();
        });
        panel3.add(unmotivated);

        //button for Lethargic
        lethargic = new JButton("Lethargic");
        lethargic.setBounds(550, 180, 100, 60);
        lethargic.addActionListener((e) -> {
            lethargicPage();
        });
        panel3.add(lethargic);

        //button for Hype
        hype = new JButton("Hype");
        hype.setBounds(150, 280, 100, 60);
        hype.addActionListener((e) -> {
            hypePage();
        });
        panel3.add(hype);

        //button for Excited
        excited = new JButton("Excited");
        excited.setBounds(250, 280, 100, 60);
        excited.addActionListener((e) -> {
            excited();
        });
        panel3.add(excited);

        //button for Hopeful
        hopeful = new JButton("Hopeful");
        hopeful.setBounds(350, 280, 100, 60);
        hopeful.addActionListener((e) -> {
            hopeful();
        });
        panel3.add(hopeful);

        //button for Optimistic
        optimistic = new JButton("Optimistic");
        optimistic.setBounds(450, 280, 100, 60);
        optimistic.addActionListener((e) -> {
            optimistic();
        });
        panel3.add(optimistic);

        //button for Tearful
        tearful = new JButton("Tearful");
        tearful.setBounds(550, 280, 100, 60);
        tearful.addActionListener((e) -> {
            tearful();
        });
        panel3.add(tearful);

        //button for Moody
        moody = new JButton("Moody");
        moody.setBounds(250, 380, 100, 60);
        moody.addActionListener((e) -> {
            moodyPage();
        });
        panel3.add(moody);

        //button for Angry
        angry = new JButton("Angry");
        angry.setBounds(350, 380, 100, 60);
        angry.addActionListener((e) -> {
            angryPage();
        });
        panel3.add(angry);

        //button for Nervous
        nervous = new JButton("Nervous");
        nervous.setBounds(450, 380, 100, 60);
        nervous.addActionListener((e) -> {
            nervous();
        });
        panel3.add(nervous);

        //button for Confused
        confused = new JButton("Confused");
        confused.setBounds(550, 380, 100, 60);
        confused.addActionListener((e) -> {
            confused();
        });
        panel3.add(confused);

        //button for Heartbroken
        heartbroken = new JButton("Heartbroken");
        heartbroken.setBounds(150, 380, 100, 60);
        heartbroken.addActionListener((e) -> {
            heartbroken();
        });
        panel3.add(heartbroken);


        panel3.setLayout(null);
        frame3.setVisible(true);
    }






    //////////// EMOTION METHODS////////////////

    public static void sadPage() {

        //setting up the frame
        sadFrame = new JFrame();
        sadPanel = new JPanel();
        sadFrame.setSize(500, 500);
        sadFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sadFrame.add(sadPanel);

        // label for "SAD" emotion
        sadEmotion = new JLabel("Sad");
        sadEmotion.setBounds(40, 60,500, 50);
        sadEmotion.setFont(new Font("Serif", Font.PLAIN, 40));
        sadPanel.add(sadEmotion);

        // text for sad emotion
        sadInfoText = new JTextArea("When you are feeling sad, you feel a sense of sorrow in your \n" + "chest heaviness in the limbs, watery eyes, \n" + "or an overall decrease from your mood. Sadness is common! \n" +
                "Don’t beat yourself down for feeling sad :(, \n" + "it is common to feel sadness in ourselves and towards others. \n" +
                "However, it’s important that we channel that energy in a constructive way. \n" +
                "Here is a playlist that can give you some \n" + "comfort when you are experiencing this emotion.");

        sadInfoText.setBounds(120, 50, 350, 75);
        sadInfoText.setFont(new Font("Serif", Font.PLAIN, 14));

        sadButton = new JButton("Sad Playlist");
        sadButton.setBounds(100, 250, 280, 50);
        sadButton.addActionListener((e) -> {
            sadFrame.setVisible(false);
            sadFrame.dispose();
            // call next screen
        });
        sadPanel.add(sadButton);

        sadPanel.add(sadInfoText);
        sadPanel.setLayout(null);
        sadFrame.setVisible(true);
    }

    public static void anxiousPage() {

        //setting up the frames
        anxiousFrame = new JFrame();
        anxiousPanel = new JPanel();
        anxiousFrame.setSize(500, 500);
        anxiousFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        anxiousFrame.add(anxiousPanel);

        // label for "ANXIOUS" emotion
        anxiousEmotion = new JLabel("Anxious");
        anxiousEmotion.setBounds(40, 60,500, 50);
        anxiousEmotion.setFont(new Font("Serif", Font.PLAIN, 40));
        anxiousPanel.add(anxiousEmotion);

        // text for anxious emotion
        anxiousInfoText = new JTextArea("We all get a little nervous sometimes about some impending situation \n" +
                "in our lives. It’s quite natural and we gotta embrace it to alleviate it. \n" + "Here are some tracks " +
                "to calm down your nerves \n" + "and put everything back into perspective.\n");
        anxiousInfoText.setBounds(120, 50, 350, 75);
        anxiousInfoText.setFont(new Font("Serif", Font.PLAIN, 14));

        anxiousButton = new JButton("Anxious Playlist");
        anxiousButton.setBounds(150, 180, 180, 80);
        anxiousButton.addActionListener((e) -> {
            anxiousFrame.setVisible(false);
            anxiousFrame.dispose();
            // call next screen
        });
        anxiousPanel.add(anxiousButton);


        anxiousPanel.add(anxiousInfoText);
        anxiousPanel.setLayout(null);
        anxiousFrame.setVisible(true);
    }

    public static void unmotivated() {

        //setting up the frames
        unmotivatedFrame = new JFrame();
        unmotivatedPanel = new JPanel();
        unmotivatedFrame.setSize(500, 500);
        unmotivatedFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        unmotivatedFrame.add(unmotivatedPanel);

        // label for "ANXIOUS" emotion
        unmotivatedEmotion = new JLabel("Unmotivated");
        unmotivatedEmotion.setBounds(40, 60,500, 50);
        unmotivatedEmotion.setFont(new Font("Serif", Font.PLAIN, 40));
        unmotivatedPanel.add(unmotivatedEmotion);

        // text for anxious emotion
        unmotivatedInfoText = new JTextArea("Procrastinating? Need a little dose of motivation. Did you know action \n" +
                "produces motivation and not the other way around. \n" + "Nevertheless, here’s some music to get you going \n" +
                "and start off that task you keep putting off.\n"); // text about anxious info
        unmotivatedInfoText.setBounds(120, 50, 350, 75);
        unmotivatedInfoText.setFont(new Font("Serif", Font.PLAIN, 14));

        unmotivatedButton = new JButton("Unmotivated Playlist");
        unmotivatedButton.setBounds(150, 180, 180, 80);
        unmotivatedButton.addActionListener((e) -> {
            unmotivatedFrame.setVisible(false);
            unmotivatedFrame.dispose();
            // call next screen
        });
        unmotivatedPanel.add(unmotivatedButton);

        unmotivatedPanel.add(unmotivatedInfoText);
        unmotivatedPanel.setLayout(null);
        unmotivatedFrame.setVisible(true);
    }

    public static void tearful() {

        //setting up the frames
        tearfulFrame = new JFrame();
        tearfulPanel = new JPanel();
        tearfulFrame.setSize(500, 500);
        tearfulFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tearfulFrame.add(tearfulPanel);

        // label for "ANXIOUS" emotion
        tearfulEmotion = new JLabel("Tearful");
        tearfulEmotion.setBounds(40, 60,500, 50);
        tearfulEmotion.setFont(new Font("Serif", Font.PLAIN, 40));
        tearfulPanel.add(tearfulEmotion);

        // text for anxious emotion
        tearfulInfoText = new JTextArea("Whether it’s someone leaving you or saying something mean. \n" +
                "Or maybe it’s just the hundred things going wrong with your life. \n" +
                "Life gets moody sometimes. Sometimes, that’s the way it is. \n" +
                "Listen to these sad bops and let the tears flow. \n");
        tearfulInfoText.setBounds(120, 50, 350, 75);
        tearfulInfoText.setFont(new Font("Serif", Font.PLAIN, 14));

        tearfulButton = new JButton("Tearful Playlist");
        tearfulButton.setBounds(150, 180, 180, 80);
        tearfulButton.addActionListener((e) -> {
            tearfulFrame.setVisible(false);
            tearfulFrame.dispose();
            // call next screen
        });
        tearfulPanel.add(tearfulButton);

        tearfulPanel.add(tearfulInfoText);
        tearfulPanel.setLayout(null);
        tearfulFrame.setVisible(true);
    }

    public static void heartbroken() {
        // setting up the frames
        heartbrokenFrame = new JFrame();
        heartbrokenPanel = new JPanel();
        heartbrokenFrame.setSize(500, 500);
        heartbrokenFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        heartbrokenFrame.add(heartbrokenPanel);

        // label for "ANXIOUS" emotion
        heartbrokenEmotion = new JLabel("Heartbroken");
        heartbrokenEmotion.setBounds(40, 60,500, 50);
        heartbrokenEmotion.setFont(new Font("Serif", Font.PLAIN, 40));
        heartbrokenPanel.add(heartbrokenEmotion);

        // text for anxious emotion
        heartbrokenInfoText = new JTextArea("Let’s not talk about it. Let the music do the talking. \n" +
                "Just know that it always gets better with time!\n");
        heartbrokenInfoText.setBounds(120, 50, 350, 75);
        heartbrokenInfoText.setFont(new Font("Serif", Font.PLAIN, 14));

        heartbrokenButton = new JButton("Heartbroken Playlist");
        heartbrokenButton.setBounds(150, 180, 180, 80);
        heartbrokenButton.addActionListener((e) -> {
            heartbrokenFrame.setVisible(false);
            heartbrokenFrame.dispose();
            // call next screen
        });
        heartbrokenPanel.add(heartbrokenButton);

        heartbrokenPanel.add(tearfulInfoText);
        heartbrokenPanel.setLayout(null);
        heartbrokenFrame.setVisible(true);

    }

    public static void excited(){
        // setting up the frame
        excitedFrame = new JFrame();
        excitedPanel = new JPanel();
        excitedFrame.setSize(500, 500);
        excitedFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        excitedFrame.add(excitedPanel);

        // label for "excited" emotion
        excitedEmotion = new JLabel("Excited");
        excitedEmotion.setBounds(50, 50, 500, 50);
        excitedEmotion.setFont(new Font("Serif", Font.PLAIN, 40));
        excitedEmotion.add(excitedEmotion);

        // text for excited emotion


        excitedPanel.setLayout(null);
        excitedFrame.setVisible(true);

    }

    public static void hopeful(){
        // setting up the frame
        hopefulFrame = new JFrame();
        hopefulPanel = new JPanel();
        hopefulFrame.setSize(500, 500);
        hopefulFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        hopefulFrame.add(hopefulPanel);

        // label for hopeful emotion
        hopefulEmotion = new JLabel("Hopeful");
        hopefulEmotion.setBounds(50, 50, 500, 50);
        hopefulEmotion.setFont(new Font("Serif", Font.PLAIN, 40));
        hopefulEmotion.add(hopefulEmotion);

        // text for hopeful emotion
        hopefulInfoText = new JTextArea("Hope is what keeps us going, hope for a better tomorrow! And just sometimes, \n" +
                "our hopes become our reality too. Just keep going and never give in! We hope these beats increase your \n" +
                "faith in your hopes!");
        hopefulInfoText.setBounds(120, 50, 350, 75);
        hopefulInfoText.setFont(new Font("Serif", Font.PLAIN, 14));

        hopefulPanel.setLayout(null);
        hopefulFrame.setVisible(true);

    }

    public static void optimistic(){
        // setting up the frame
        optimisticFrame = new JFrame();
        optimisticPanel = new JPanel();
        optimisticFrame.setSize(500, 500);
        optimisticFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        optimisticFrame.add(optimisticPanel);

        // label for optimistic emotion
        optimisticEmotion = new JLabel("Excited");
        optimisticEmotion.setBounds(50, 50, 500, 50);
        optimisticEmotion.setFont(new Font("Serif", Font.PLAIN, 40));
        optimisticEmotion.add(optimisticEmotion);

        // text for optimistic emotion
        optimisticInfoText = new JTextArea("Looking for a dose of positivity? You’ve come to the right place! It's all about \n" +
                "the mindset. You can’t control what happens to you, but you can always control how you react to it. \n" +
                "So, tie your laces, and get ready to have the best reaction to whatever life throws at you!");
        optimisticInfoText.setBounds(120, 50, 350, 75);
        optimisticInfoText.setFont(new Font("Serif", Font.PLAIN, 14));

        excitedPanel.setLayout(null);
        optimisticFrame.setVisible(true);

    }

    public static void nervous(){
        // setting up the frame
        nervousFrame = new JFrame();
        nervousPanel = new JPanel();
        nervousFrame.setSize(500, 500);
        nervousFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        nervousFrame.add(nervousPanel);

        // label for nervous emotion
        nervousEmotion = new JLabel("Excited");
        nervousEmotion.setBounds(50, 50, 500, 50);
        nervousEmotion.setFont(new Font("Serif", Font.PLAIN, 40));
        nervousEmotion.add(nervousEmotion);

        // text for nervous emotion
        nervousInfoText = new JTextArea("Worried about a presentation, or is something more serious? Well, just know that you \n" +
                "have the power to get through it. Sometimes, being nervous is what makes you perform even better. \n" +
                "Hope you don’t get overwhelmed by it and have a good one! Oop, totally forgot to add, these beats might give \n" +
                "you a little bit of help.");
        nervousInfoText.setBounds(120, 50, 350, 75);
        nervousInfoText.setFont(new Font("Serif", Font.PLAIN, 14));

        nervousPanel.setLayout(null);
        nervousFrame.setVisible(true);

    }

    public static void confused(){
        // setting up the frame
        confusedFrame = new JFrame();
        confusedPanel = new JPanel();
        confusedFrame.setSize(500, 500);
        confusedFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        confusedFrame.add(excitedPanel);

        // label for confused emotion
        confusedEmotion = new JLabel("Excited");
        confusedEmotion.setBounds(50, 50, 500, 50);
        confusedEmotion.setFont(new Font("Serif", Font.PLAIN, 40));
        confusedEmotion.add(confusedEmotion);

        // text for confused emotion
        confusedInfoText = new JTextArea("Confused: Hmm what is going on?? Life sometimes throws us curve balls and we don’t \n" +
                "know how to react. Sometimes, this makes us genuinely curious, something it leaves us annoyed. \n" +
                "Either way, this playlist’s greatness is not confusing.");
        confusedInfoText.setBounds(120, 50, 350, 75);
        confusedInfoText.setFont(new Font("Serif", Font.PLAIN, 14));

        confusedPanel.setLayout(null);
        confusedFrame.setVisible(true);

    }

    public static void happyPage() {
        //frame
        happyFrame = new JFrame();
        happyPanel = new JPanel();
        happyFrame.setSize(500, 500);
        happyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //label
        happyEmotion = new JLabel("Happy");
        happyEmotion.setBounds(50, 50, 500, 50);
        happyEmotion.setFont(new Font("Serif", Font.PLAIN, 40));

        //text
        happyText = new JTextArea("Yay! Happy! With happiness, you experience contentedness and a brightened perspective.\n" +
                "Happiness doesn’t always mean everything is alright, perhaps you’re choosing to focus on the positive.\n" +
                "With a smile on your face, a twinkle in your eye, and a bounce in your step, you’re ready to take on the day!\n" +
                "Happiness stems from multiple sources, whether it’s family, friends, food, or anything else!\n" +
                "Whatever it is, here’s a playlist to match your bubbly vibes!\n");

        happyText.setBounds(120, 50, 350, 75);
        happyText.setFont(new Font("Serif", Font.PLAIN, 14));

        //button
        happyButton = new JButton("Happy Playlist");
        happyButton.setBounds(100, 250, 280, 50);
        ActionListener actionListener = new ActionListener() {
            //@Override
            public  void actionPerformed(ActionEvent e) {
                if (e.getSource() == happyButton) {
                    playlistLink = "https://open.spotify.com/playlist/37i9dQZF1EpzeGfr1URgOo";
                    openPlaylist(playlistLink);
                }
            }
        };
        happyButton.addActionListener(actionListener);
        happyFrame.add(happyPanel);
        happyPanel.add(happyEmotion);
        happyPanel.add(happyText);
        happyPanel.add(happyButton);

        happyPanel.setLayout(null);
        happyFrame.setVisible(true);
    }

    //lethargic page
    public static void lethargicPage() {
        //frame
        lethargicFrame = new JFrame();
        lethargicPanel = new JPanel();
        lethargicFrame.setSize(500, 500);
        lethargicFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //label
        lethargicEmotion = new JLabel("Lethargic");
        lethargicEmotion.setBounds(50, 50, 500, 50);
        lethargicEmotion.setFont(new Font("Serif", Font.PLAIN, 40));

        //text
        lethargicText = new JTextArea("Tired of all your workload? You should be proud of how hard you have been\n" +
                "working(or not) and jam into these beats to get the energy flowing.\n");

        lethargicText.setBounds(225, 40, 1000, 50);
        lethargicText.setFont(new Font("Serif", Font.PLAIN, 14));

        //button
        lethargicButton = new JButton("Lethargic Playlist");
        lethargicButton.setBounds(550, 300, 200, 50);
        ActionListener actionListener = new ActionListener() {
            //@Override
            public  void actionPerformed(ActionEvent e) {
                if (e.getSource() == lethargicButton) {
                    playlistLink = "https://open.spotify.com/playlist/1owLRaO5czacdHIi33fSaX";
                    openPlaylist(playlistLink);
                }
            }
        };
        lethargicButton.addActionListener(actionListener);
        lethargicFrame.add(lethargicPanel);
        lethargicPanel.add(lethargicEmotion);
        lethargicPanel.add(lethargicText);
        lethargicPanel.add(lethargicButton);

        lethargicPanel.setLayout(null);
        lethargicFrame.setVisible(true);
    }

    //hype page
    public static void hypePage() {
        //frame
        hypeFrame = new JFrame();
        hypePanel = new JPanel();
        hypeFrame.setSize(500, 500);
        hypeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //label
        hypeEmotion = new JLabel("Hype");
        hypeEmotion.setBounds(50, 50, 500, 50);
        hypeEmotion.setFont(new Font("Serif", Font.PLAIN, 40));

        //text
        hypeText = new JTextArea("Let’s get excited! The way you perceive things matters a lot!\n" +
                "Getting hyped for little things makes them a ton more exciting!\n" +
                "So put on the speakers and let's get hyped!");

        hypeText.setBounds(175, 25, 500, 65);
        hypeText.setFont(new Font("Serif", Font.PLAIN, 14));

        //button
        hypeButton = new JButton("Hype Playlist");
        hypeButton.setBounds(550, 300, 200, 50);
        ActionListener actionListener = new ActionListener() {
            //@Override
            public  void actionPerformed(ActionEvent e) {
                if (e.getSource() == hypeButton) {
                    playlistLink = "https://open.spotify.com/playlist/7zldOMl7Rk6GPJzE6GRE86";
                    openPlaylist(playlistLink);
                }
            }
        };
        hypeButton.addActionListener(actionListener);
        hypeFrame.add(hypePanel);
        hypePanel.add(hypeEmotion);
        hypePanel.add(hypeText);
        hypePanel.add(hypeButton);

        hypePanel.setLayout(null);
        hypeFrame.setVisible(true);
    }

    //angry page
    public static void angryPage() {
        //frame
        angryFrame = new JFrame();
        angryPanel = new JPanel();
        angryFrame.setSize(500, 500);
        angryFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //label
        angryEmotion = new JLabel("Angry");
        angryEmotion.setBounds(50, 50, 500, 50);
        angryEmotion.setFont(new Font("Serif", Font.PLAIN, 40));

        //text
        angryText = new JTextArea("Angry at how life is/ the world works?\n" +
                "Well, let’s channel that anger into something productive.\n" +
                "Let’s hope these beats stop you from throwing all the plates out of the window!");

        angryText.setBounds(175, 30, 500, 60);
        angryText.setFont(new Font("Serif", Font.PLAIN, 14));

        //button
        angryButton = new JButton("Angry Playlist");
        angryButton.setBounds(550, 300, 200, 50);
        ActionListener actionListener = new ActionListener() {
            //@Override
            public  void actionPerformed(ActionEvent e) {
                if (e.getSource() == angryButton) {
                    playlistLink = "https://open.spotify.com/playlist/37i9dQZF1DX4JAvHpjipBk";
                    openPlaylist(playlistLink);
                }
            }
        };
        angryButton.addActionListener(actionListener);
        angryFrame.add(angryPanel);
        angryPanel.add(angryEmotion);
        angryPanel.add(angryText);
        angryPanel.add(angryButton);

        angryPanel.setLayout(null);
        angryFrame.setVisible(true);
    }

    //moody page
    public static void moodyPage() {
        //frame
        moodyFrame = new JFrame();
        moodyPanel = new JPanel();
        moodyFrame.setSize(500, 500);
        moodyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //label
        moodyEmotion = new JLabel("Moody");
        moodyEmotion.setBounds(50, 50, 500, 50);
        moodyEmotion.setFont(new Font("Serif", Font.PLAIN, 40));

        //text
        moodyText = new JTextArea("Aw man, sometimes you’re just not in a good mood.\n" +
                "Things may not going right, you might not be feeling well,\n" +
                "but may we offer a playlist to potentially make you feel better?\n");

        moodyText.setBounds(175, 30, 500, 60);
        moodyText.setFont(new Font("Serif", Font.PLAIN, 14));

        //button
        moodyButton = new JButton("Moody Playlist");
        moodyButton.setBounds(550, 300, 200, 50);
        ActionListener actionListener = new ActionListener() {
            //@Override
            public  void actionPerformed(ActionEvent e) {
                if (e.getSource() == moodyButton) {
                    playlistLink = "https://open.spotify.com/playlist/37i9dQZEVXbtQvNrKya7Fk";
                    openPlaylist(playlistLink);
                }
            }
        };
        moodyButton.addActionListener(actionListener);
        moodyFrame.add(moodyPanel);
        moodyPanel.add(moodyEmotion);
        moodyPanel.add(moodyText);
        moodyPanel.add(moodyButton);

        moodyPanel.setLayout(null);
        moodyFrame.setVisible(true);
    }

    //Opens respective playlist
    private static void openPlaylist(String playlistLink) {
        try {
            Desktop desktop = java.awt.Desktop.getDesktop();
            URI oURL = new URI(playlistLink);
            desktop.browse(oURL);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


