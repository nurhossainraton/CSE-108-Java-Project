package sample;

import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Club {

    private static   final String INPUT_FILE_NAME="players.txt";


    private static final String OUTPUT_FILE_NAME = "players.txt";
    public  static List<Player> playerList;


    private Main main;
    @FXML
    private TextField userText;
    @FXML
    private TextField country;
    @FXML
    private TextField club;
    @FXML
    private TextField minsalary;
    @FXML
    private TextField maxsalary;
    @FXML
    private TextField maxSal;
    @FXML
    private TextField maxAge;
    @FXML
    private TextField maxHeight;
    @FXML
    private TextField positionText;
    @FXML
    private TextField clubname;
    @FXML
    private Button submitButton;
    @FXML
    public Text text;
    @FXML
    private TextArea textarea;
    @FXML
    private TextArea textarea2;
    @FXML
    private TextArea textarea4;
    @FXML
    private TextArea textarea5;
    @FXML
    private TextArea textarea6;
    @FXML
    private TextArea textarea3;
    @FXML
    private TextArea textarea1;
    @FXML
    private TextArea textarea7;
    @FXML
    private TextArea textarea8;
    @FXML
    private TextArea textarea9;
    private TableView tableView;

    @FXML
    private Label label;
    @FXML
    private TextField nameIn;

    @FXML
    private TextField clubIn;

    @FXML
    private TextField age;

    @FXML
    private TextField height;

    @FXML
    private TextField country1;

    @FXML
    private TextField position;

    @FXML
    private TextField number;

    @FXML
    private TextField salary;

    public  void readFromFile() throws Exception {

       playerList = new ArrayList();
        // var studentList = new ArrayList();
        BufferedReader br = new BufferedReader(new FileReader("players.txt"));
        // var br = new BufferedReader(new FileReader(INPUT_FILE_NAME));
        while (true) {
            String line = br.readLine();
            if (line == null) break;
            String[] tokens = line.split(",");
            Player p = new Player();
            p.setName(tokens[0]);
            p.setCountry(tokens[1]);

            p.setAge(Integer.parseInt(tokens[2]));
            p.setHeight(Double.parseDouble(tokens[3]));
            p.setClub(tokens[4]);
            p.setPosition(tokens[5]);
            p.setNumber(Integer.parseInt(tokens[6]));
            p.setWeeklySalary(Double.parseDouble((tokens[7])));

            playerList.add(p);
        }
        br.close();

    }

    public static List<Player> getPlayerList() {
        return playerList;
    }

    public Club() throws Exception {


    }


    @FXML
    public  void playerSearch(ActionEvent event)  {

        boolean isPlayer = false;
        String username = userText.getText();

        for (Player players : playerList) {
            if (players.getName().equalsIgnoreCase(username)) {
                try {

                    textarea.setText("Name : " + players.getName() + "\n");
                    textarea.appendText("Country : " + players.getCountry() + "\n");
                    textarea.appendText("Age  : " + players.getAge() + "\n");
                    textarea.appendText("Height : " + players.getHeight() + "\n");
                    textarea.appendText("Club : " + players.getClub() + "\n");
                    textarea.appendText("Position : " + players.getPosition() + "\n");
                    textarea.appendText("Jersy Number : " + players.getNumber() + "\n");
                    textarea.appendText("Weekly Salary : " + players.getWeeklySalary() + "\n");

                } catch (Exception e) {
                    System.out.println(e);
                }

                isPlayer = true;
                break;
            }
        }
        if (isPlayer == false) {

            textarea.setText("No such player with this name");
        }
    }

    public void CountrySearch(ActionEvent event) throws Exception {

        String countryName = new String();
        String clubname = new String();
        countryName = country.getText();
        textarea1.clear();
        clubname = club.getText();
        boolean boolcountry = false;
        if (clubname.equalsIgnoreCase("ANY")) {
            for (Player players : playerList) {

                if (players.getCountry().equalsIgnoreCase(countryName)) {

                    boolcountry = true;
                    try {

                        textarea1.appendText("Name : " + players.getName() + "\n");
                        textarea1.appendText("Country : " + players.getCountry() + "\n");
                        textarea1.appendText("Age  : " + players.getAge() + "\n");
                        textarea1.appendText("Height : " + players.getHeight() + "\n");
                        textarea1.appendText("Club : " + players.getClub() + "\n");
                        textarea1.appendText("Position : " + players.getPosition() + "\n");
                        textarea1.appendText("Jersy Number : " + players.getNumber() + "\n");
                        textarea1.appendText("Weekly Salary : " + players.getWeeklySalary() + "\n\n");


                    } catch (Exception e) {
                        System.out.println(e);
                    }

                }
            }
        } else {
            for (Player players : playerList) {
                if (players.getCountry().equalsIgnoreCase(countryName) && players.getClub().equalsIgnoreCase(clubname)) {
                    boolcountry = true;
                    try {

                        textarea1.appendText("Name : " + players.getName() + "\n");
                        //textarea.appendText("Name : "+players.getCountry()+"\n");
                        textarea1.appendText("Country : " + players.getCountry() + "\n");
                        textarea1.appendText("Age  : " + players.getAge() + "\n");
                        textarea1.appendText("Height : " + players.getHeight() + "\n");
                        textarea1.appendText("Club : " + players.getClub() + "\n");
                        textarea1.appendText("Position : " + players.getPosition() + "\n");
                        textarea1.appendText("Jersy Number : " + players.getNumber() + "\n");
                        textarea1.appendText("Weekly Salary : " + players.getWeeklySalary() + "\n\n");
                        //textarea1.clear();

                    } catch (Exception e) {
                        System.out.println(e);
                    }

                }
            }
        }
        if (boolcountry == false) {
            textarea1.setText("No such player with this country and club");
        }

    }

    public void positionSearch(ActionEvent event) throws Exception {

        boolean boolposition = false;
        String pos = positionText.getText();
        textarea2.clear();
        for (Player players : playerList) {
            if (players.getPosition().equalsIgnoreCase(pos)) {
                boolposition = true;
                try {

                    textarea2.appendText("Name : " + players.getName() + "\n");
                    textarea2.appendText("Country : " + players.getCountry() + "\n");
                    textarea2.appendText("Age  : " + players.getAge() + "\n");
                    textarea2.appendText("Height : " + players.getHeight() + "\n");
                    textarea2.appendText("Club : " + players.getClub() + "\n");
                    textarea2.appendText("Position : " + players.getPosition() + "\n");
                    textarea2.appendText("Jersy Number : " + players.getNumber() + "\n");
                    textarea2.appendText("Weekly Salary : " + players.getWeeklySalary() + "\n\n");

                } catch (Exception e) {
                    System.out.println(e);
                }

            }
        }
        if (boolposition == false) {
            textarea2.appendText("No such player with this position");
        }

    }

    public void SearchBySalary(ActionEvent event) throws Exception {

        boolean boolSalary = false;
        Double lowerLimit, upperLimit;
        lowerLimit = Double.parseDouble(minsalary.getText());
        upperLimit = Double.parseDouble(maxsalary.getText());
        textarea3.clear();
        for (Player players : playerList) {
            if (players.getWeeklySalary() >= lowerLimit && players.getWeeklySalary() <= upperLimit) {
                boolSalary = true;
                try {

                    textarea3.appendText("Name : " + players.getName() + "\n");
                    textarea3.appendText("Country : " + players.getCountry() + "\n");
                    textarea3.appendText("Age  : " + players.getAge() + "\n");
                    textarea3.appendText("Height : " + players.getHeight() + "\n");
                    textarea3.appendText("Club : " + players.getClub() + "\n");
                    textarea3.appendText("Position : " + players.getPosition() + "\n");
                    textarea3.appendText("Jersy Number : " + players.getNumber() + "\n");
                    textarea3.appendText("Weekly Salary : " + players.getWeeklySalary() + "\n\n");

                } catch (Exception e) {
                    System.out.println(e);
                }

            }
        }
        if (boolSalary == false) {
            textarea3.appendText("No such player with this Salary Range");
        }

    }

    public void playerCount(ActionEvent event) throws Exception {

        try {
            String[] country = new String[200];
            int count[] = new int[200];
            int index = 0;
            for (Player players : playerList) {
                // String  temp=players.getCountry();
                boolean isFound = false;
                for (int i = 0; i < country.length; i++) {
                    if (players.getCountry().equalsIgnoreCase(country[i])) {
                        isFound = true;
                        break;
                    }

                }
                if (!isFound) {
                    country[index++] = players.getCountry();
                }
            }
            for (int i = 0; i < index; i++) {
                int c = 0;
                for (Player player : playerList) {
                    if (country[i].equalsIgnoreCase(player.getCountry())) {
                        c++;
                    }
                }
                count[i] = c;
            }
            for (int i = 0; i < index; i++) {
                textarea4.appendText("Number of players from " + country[i] +  " is - ");
                textarea4.appendText(String.valueOf(count[i])+"\n");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }



    public  void maximumSalary(ActionEvent event) throws Exception {

        String club=maxSal.getText();
        textarea5.clear();
        double max = 0.0;
        for (Player players : playerList) {
            if (players.getClub().equalsIgnoreCase(club)) {
                if (players.getWeeklySalary() > max) {
                    max = players.getWeeklySalary();
                }
            }
        }



        for (Player players : playerList) {
            if (players.getClub().equalsIgnoreCase(club)) {

                if (players.getWeeklySalary() == max) {
                    try {

                        textarea5.appendText("Name : " + players.getName() + "\n");
                        textarea5.appendText("Country : " + players.getCountry() + "\n");
                        textarea5.appendText("Age  : " + players.getAge() + "\n");
                        textarea5.appendText("Height : " + players.getHeight() + "\n");
                        textarea5.appendText("Club : " + players.getClub() + "\n");
                        textarea5.appendText("Position : " + players.getPosition() + "\n");
                        textarea5.appendText("Jersy Number : " + players.getNumber() + "\n");
                        textarea5.appendText("Weekly Salary : " + players.getWeeklySalary() + "\n\n");

                    } catch (Exception e) {
                        System.out.println(e);
                    }

                }
            }
        }



    }
    public void maximumAge(ActionEvent event) throws Exception {

        String club=maxAge.getText();
        textarea6.clear();
        int max = 0;
        for (Player players : playerList) {
            if (players.getClub().equalsIgnoreCase(club)) {
                if (players.getAge() > max) {
                    max = players.getAge();
                }
            }
        }


        for (Player players : playerList) {
            if (players.getClub().equalsIgnoreCase(club)) {

                if (players.getAge() == max) {
                    try {

                        textarea6.appendText("Name : " + players.getName() + "\n");
                        textarea6.appendText("Country : " + players.getCountry() + "\n");
                        textarea6.appendText("Age  : " + players.getAge() + "\n");
                        textarea6.appendText("Height : " + players.getHeight() + "\n");
                        textarea6.appendText("Club : " + players.getClub() + "\n");
                        textarea6.appendText("Position : " + players.getPosition() + "\n");
                        textarea6.appendText("Jersy Number : " + players.getNumber() + "\n");
                        textarea6.appendText("Weekly Salary : " + players.getWeeklySalary() + "\n\n");

                    } catch (Exception e) {
                        System.out.println(e);
                    }

                }
            }
        }


    }
    public void maximumHeight(ActionEvent event) throws Exception {

        String club=maxHeight.getText();
        textarea7.clear();
        double max = 0;
        for (Player players : playerList) {
            if (players.getClub().equalsIgnoreCase(club)) {


                if (players.getHeight() > max) {
                    max = players.getHeight();
                }
            }
        }


        for (Player players : playerList) {
            if (players.getClub().equalsIgnoreCase(club)) {

                if (players.getHeight() == max) {
                    try {

                        textarea7.appendText("Name : " + players.getName() + "\n");
                        textarea7.appendText("Country : " + players.getCountry() + "\n");
                        textarea7.appendText("Age  : " + players.getAge() + "\n");
                        textarea7.appendText("Height : " + players.getHeight() + "\n");
                        textarea7.appendText("Club : " + players.getClub() + "\n");
                        textarea7.appendText("Position : " + players.getPosition() + "\n");
                        textarea7.appendText("Jersy Number : " + players.getNumber() + "\n");
                        textarea7.appendText("Weekly Salary : " + players.getWeeklySalary() + "\n\n");

                    } catch (Exception e) {
                        System.out.println(e);
                    }

                }
            }
        }

    }
    public void maximumYearlySalary(ActionEvent event) throws Exception {
        String club=clubname.getText();
        textarea9.clear();
        double max = 0.0, total = 0.0;
        for (Player players : playerList) {
            if (players.getClub().equalsIgnoreCase(club)) {
                total += players.getWeeklySalary();

            }
        }
        textarea9.appendText("The total yearly salary of " + club + " is " );
        textarea9.appendText(String.valueOf( total * 52)+"\n");
    }
    public  boolean canAddName(String name)  {

        boolean isName=false;

        for(Player players: playerList){

            if(players.getName().equalsIgnoreCase(name)){
                isName = true;
                break;
            }
        }
        if(isName ){


            return false;
        }
        else
            return true;

    }
    public  boolean canAddClub(String club){


        int count=0;
        for(Player players: playerList){
            if(players.getClub().equalsIgnoreCase(club)){
                count++;
            }

        }
        if( count>=7){


            return false;
        }
        else
            return true;

    }
    public  void playerAdd(ActionEvent event)  {

        String name;
        String Country;
        int Age;
        double Height;
        String club, Position;
        int Number;
        double WeekSalary;
        name = nameIn.getText();
        boolean nameAdd = canAddName(name);
        if (!nameAdd) {
            try {
                main.failureAdd();
                //break;
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            club = clubIn.getText();

            boolean clubAdd = canAddClub(club);
            if (!clubAdd) {
                try {
                    main.failureAdd();
                   // break;
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            Age=Integer.parseInt(age.getText());
            Height=Double.parseDouble(height.getText());
            Country = country1.getText();
            Position = position.getText();
            Number = Integer.parseInt(number.getText());
            WeekSalary = Double.parseDouble(salary.getText());
            Player p = new Player();
            p.setName(name);
            p.setCountry(Country);
            p.setNumber(Number);
            p.setPosition(Position);
            p.setAge(Age);
            p.setClub(club);
            p.setWeeklySalary(WeekSalary);
            p.setHeight(Height);
            playerList.add(p);
            try{
                main.Successful();

           }catch(Exception e){
               System.out.println(e);
           }
        }
    }


   /* public static void writeToFile() throws Exception {
      BufferedWriter bw = new BufferedWriter(new FileWriter(new File("players.txt")));
      try {
          for (Player p : playerList) {
              bw.write(p.getName() + "," + p.getCountry() + "," + p.getAge() + "," + p.getHeight() + "," + p.getClub() + "," + p.getPosition() + "," + p.getWeeklySalary());
              bw.write("\n");
          }
          bw.close();
      } catch (Exception e) {
          System.out.println(e);
      }
  }*/

     @FXML
     public void mainPage(){
        try{
            main.showMenu();
        }catch(Exception e){
            System.out.println(e);
        }
     }
     public void ShowHomePage(){
         try{
             main.showHomePage();
         }catch(Exception e){
             System.out.println(e);
         }
     }
     @FXML
     public void Playername(){
        try{

            main.PlayerInput();
        }catch(Exception e){
            System.out.println(e);
        }
     }

    public void ClubCountry(ActionEvent event) {
        try{

            main.ClubInput();
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public void BackToSearchMenu(ActionEvent event) {
        try{
            main.showHomePage();
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public void positionInput(ActionEvent event) {
        try{
            main.PositionInput();

        }catch(Exception e){
            System.out.println(e);
        }
    }

    public void SalaryInput(ActionEvent event) {
        try{
            main.SalaryInput();

        }catch(Exception e){
            System.out.println(e);
        }
    }


    public void CountryWiseCount(ActionEvent event) {
        try{
            main.CountryWise();

        }catch(Exception e){
            System.out.println(e);
        }
    }

    public void maxSalary(ActionEvent event) {
        try{
            main.SalaryMax();

        }catch(Exception e){
            System.out.println(e);
        }
    }

    public void maxAge(ActionEvent event) {
        try{
            main.AgeMax();

        }catch(Exception e){
            System.out.println(e);
        }
    }

    public void maxHeight(ActionEvent event) {
        try{
            main.HeightMax();

        }catch(Exception e){
            System.out.println(e);
        }
    }

    public void totalSalary(ActionEvent event) {
        try{
            main.TotalYearlySalary();

        }catch(Exception e){
            System.out.println(e);
        }
    }

    public void BackToClubSearchMenu(ActionEvent event) {
        try{
            main.SearchClub();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public void setMain(Main main) {
        this.main=main;
    }



}

