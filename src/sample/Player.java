package sample;


import java.util.List;

public class Player {
    private String Name;
    private String Country,Club,Position;
    private int Age,Number;
    private double Height,WeeklySalary;
    public Player()
    {

    }

    public  List<Player> playerList;
    public  Player(String name,String Country,int Age,double Height,String club,String Position,int Number,double WeekSalary) {

        this.Name = name;
        this.Country=Country;
        this.Club=Club;
        this.Height=Height;
        this.WeeklySalary=WeekSalary;
        this.Number=Number;
        this.Position=Position;
        this.Age=Age;

    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setPosition(String position) {
        this.Position = position;
    }

    public void setNumber(int number) {
        this.Number = number;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    public void setClub(String club) {
        this.Club = club;
    }

    public void setCountry(String country) {
        this.Country=country;
    }

    public void setHeight(double height) {
        this.Height = height;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.WeeklySalary = weeklySalary;
    }

    public String getName() {
        return Name;
    }

    public int getNumber() {
        return Number;
    }

    public int getAge() {
        return Age;
    }

    public double getHeight() {
        return Height;
    }

    public double getWeeklySalary() {
        return WeeklySalary;
    }

    public String getPosition() {
        return Position;
    }

    public String getClub() {
        return Club;
    }

    public String getCountry() {
        return Country;
    }

}

