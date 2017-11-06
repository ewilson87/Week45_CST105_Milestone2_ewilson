/**
 * Program: NFL Draft Final Project 
 * File: DraftFinalProject.java 
 * Summary: The driver main class for the project. Used for testing purposes while building the project
 * Author: Evan W Wilson 
 * Date: November 5, 2017
 **/

package draftfinalproject;

public class DraftFinalProject {

    public static void main(String[] args) {
        
        //Call the test drivers, runs it twice to show randomization
        playerDriver();
        playerDriver();

    }

    //test driver for Player class
    public static void playerDriver() {

        //create a player without parameters
        NFLPlayer player1 = new NFLPlayer();

        //sets random first name
        Manager fName1 = new Manager();
        String randomFirstName1 = fName1.randomFirstNames();
        player1.setFirstName(randomFirstName1);

        //sets random last name
        Manager lName1 = new Manager();
        String randomLastName1 = lName1.randomLastNames();
        player1.setLastName(randomLastName1);

        //sets random height
        Manager height1 = new Manager();
        int randomHeight1 = height1.randomHeights();
        player1.setHeight(randomHeight1);

        //sets random weight
        Manager weight1 = new Manager();
        int randomWeight1 = weight1.randomWeights();
        player1.setWeight(randomWeight1);

        //sets random position
        Manager position1 = new Manager();
        String randomPosition1 = position1.randomPositions();
        player1.setPosition(randomPosition1);

        //sets random 40 yard dash speed
        Manager dash40_1 = new Manager();
        double randomDash40_1 = dash40_1.randomDash40();
        player1.setDash40(randomDash40_1);

        //sets random age
        Manager age1 = new Manager();
        int randomAge1 = age1.randomAges();
        player1.setAge(randomAge1);

        //sets random college
        Manager college1 = new Manager();
        String randomCollege1 = college1.randomColleges();
        player1.setCollege(randomCollege1);
        
        //sets chance of injury
        Manager injury1 = new Manager();
        String randomInjury1 = injury1.randomInjuries();
        player1.setInjury(randomInjury1);

        //sets player college experience
        player1.setExperience(randomAge1);

        //sets BMI
        player1.setBMI(randomWeight1, randomHeight1);

	//print to show the info for the players
        System.out.println(player1.toString());

        System.out.println();

    }

}
