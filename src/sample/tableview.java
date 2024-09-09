package sample;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class tableview {
    private SimpleStringProperty Name;
    private SimpleStringProperty Country,Club,Position;
    private SimpleIntegerProperty Age,Number;
    private SimpleDoubleProperty Height,WeeklySalary;

    public tableview(String name,String Country,int Age,double Height,String club,String Position,int Number,double WeekSalary){
        super();
        this.Name =new SimpleStringProperty (name);
        this.Country=new SimpleStringProperty (Country);
        this.Club=new SimpleStringProperty (club);
        this.Height=new SimpleDoubleProperty(Height);
        this.WeeklySalary=new SimpleDoubleProperty(WeekSalary);
        this.Number=new SimpleIntegerProperty(Number);
        this.Position=new SimpleStringProperty (Position);
        this.Age=new SimpleIntegerProperty(Age);
    }



    public String getName() {
        return Name.get();
    }

    public int getNumber() {
        return Number.get();
    }

    public int getAge() {
        return Age.get();
    }

    public double getHeight() {
        return Height.get();
    }

    public double getWeeklySalary() {
        return WeeklySalary.get();
    }

    public String getPosition() {
        return Position.get();
    }

    public String getClub() {
        return Club.get();
    }

    public String getCountry() {
        return Country.get();
    }
}
