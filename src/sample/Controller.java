package sample;

import javafx.beans.InvalidationListener;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.net.URL;
import java.util.*;

public class Controller  {
    public  List<Player> playerList;
    public  void writeToFile() throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter("players.txt"));
        try {
           playerList=Club.getPlayerList();
            for (Player p : playerList) {
                bw.write(p.getName() + "," + p.getCountry() + "," + p.getAge() + "," + p.getHeight() + "," + p.getClub() + "," + p.getPosition() + "," + p.getWeeklySalary());
                bw.write("\n");
            }
            bw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }


}