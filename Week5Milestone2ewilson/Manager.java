/**
 * Program: NFL Draft Final Project - NFL Manager class
 * File: Manager.java 
 * Summary: The NFL Player class for the project.
 * Author: Evan W Wilson 
 * Date: November 5, 2017
 **/
package draftfinalproject;


//this class is a work in progress for Milestone 3, but being submitted with milestone 2
//for the random generated function.


import java.util.ArrayList;

public class Manager {
        
    
    
        //list of available players
        //static ArrayList<String> availablePlayers = new ArrayList<>();
    	//Constructor which calls createPlayers every time an instance of manager is created
	//public Manager() {
		//createPlayers();
        //}
    

    //String[] playersCreated = new String[10];

    /**public void createPlayers() {

        for (int i = 0; i < availablePlayers.length - 1; i++) {
            NFLPlayer player = new NFLPlayer();

            String firstName = randomFirstNames();
            player.setFirstName(firstName);

            String lastName = randomLastNames();
            player.setLastName(lastName);

            String position = randomPositions();
            player.setPosition(position);

            int age = randomAges();
            player.setAge(age);

            double dash40 = randomDash40();
            player.setDash40(dash40);

            int height = randomHeights();
            player.setHeight(height);

            int weight = randomWeights();
            player.setWeight(weight);

            //double BMI = randomJerseys();
            //player.setJersey(jersey);

            //String injuries = randomInjuries();
            //player.setInjuryHistory(injuries);

            String college = randomColleges();
            player.setCollege(college);

            //playersCreated[i] = toString();
        }
        //return toString();
    }

    //public String output() {
      //  String output = "";
        //for (int i = 0; i < playersCreated.length - 1; i++) {
          //  output = (playersCreated[i]);
            //System.out.print(output);
       // }
        //return output;
    //}
**/
    public String randomFirstNames() {
        String[] randomFirstNames = new String[]{"Billy", "Javier", "Archie", "Buck", "Neville", "Doyle", "Christopher",
            "Harrison", "Ernie", "Marcus"};
        String randomFirstName = randomFirstNames[(int) Math.floor(Math.random() * randomFirstNames.length)];
        return randomFirstName;
    }

    public String randomLastNames() {
        String[] randomLastNames = new String[]{"Johnson", "Huskins", "Linhart", "Matson", "Madriz", "Newcombe", "Fender",
            "Brown", "Gleason", "Campo"};
        String randomLastName = randomLastNames[(int) Math.floor(Math.random() * randomLastNames.length)];
        return randomLastName;
    }

    public String randomPositions() {
        String[] positions = new String[]{"Center", "Offensive Guard", "Offensive Tackle", "Quarterback", "Running Back",
            "Wide Receiver", "Tight End", "Defensive Tacker", "Defensive End", "Line Backer", "Cornerback", "Safety", "Kicker"};
        String position = positions[(int) Math.floor(Math.random() * positions.length)];
        return position;
    }

    public int randomHeights() {
        int randomHeight = (int) ((Math.random() * 25) + 60);
        return randomHeight;
    }

    public int randomWeights() {
        int randomWeight = (int) ((Math.random() * 200) + 160);
        return randomWeight;
    }


    public int randomAges() {
        int randomAge = (int) (Math.random() * 3) + 20;
        return randomAge;
    }

    public double randomDash40() {
        double randomDash40 = (((Math.random() * 4) + 4));
        double roundDash40 = Math.round(randomDash40 * 100.0) / 100.0;
        return roundDash40;
    }

    public String randomColleges() {
        String[] colleges = new String[]{"Oregon", "Ohio State", "Washington", "Arizona", "Alabama",
            "Penn State", "Iowa State", "Georgia", "Kansas State", "Michigan"};
        String college = colleges[(int) Math.floor(Math.random() * colleges.length)];
        return college;
    }

    //creates 20% chance player has a history of injuries
    public String randomInjuries() {
        int randomInjury = (int) (Math.random() * 5);
        if (randomInjury == 0) {
            String injury = "Player has a history of injuries.";
            return injury;
        } else {
            String injury = "Player has no history of injuries.";
            return injury;
        }
    }
}

    


