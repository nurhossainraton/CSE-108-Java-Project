package sample;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

public class Main extends Application {

    private Stage stage;

    private  List<Player> playerList;
    public Main() throws Exception {

    }

    public Stage getStage() {
        return stage;
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        showMenu();
        Club clb=new Club();
        clb.readFromFile();
    }

    public  void showMenu() throws Exception {
        // XML Loading using FXMLLoader

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("sample.fxml"));

        Parent root = loader.load();

        // Loading the controller
        MenuShow controller = loader.getController();
        controller.setMain(this);

        // Set the primary stage
        stage.setTitle("Main Page");
        stage.setScene(new Scene(root, 900, 750));
        stage.show();
    }

    public void showHomePage() throws Exception {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("MenuShow.fxml"));
        Parent root = loader.load();

        // Loading the controller
        Club controller = loader.getController();
       // controller.init(userName);

        controller.setMain(this);

        // Set the primary stage
        stage.setTitle("Home");
        stage.setScene(new Scene(root, 800, 700));
        stage.show();
    }
    public void SearchClub() throws Exception {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ClubMenu.fxml"));
        Parent root = loader.load();

        // Loading the controller
        Club controller = loader.getController();
        // controller.init(userName);
        controller.setMain(this);

        // Set the primary stage
        stage.setTitle("Home");
        stage.setScene(new Scene(root, 800, 900));
        stage.show();
    }
    public void PlayerInput() throws Exception {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("InputText.fxml"));
        Parent root = loader.load();

        // Loading the controller

        Club controller = loader.getController();


        controller.setMain(this);

        // Set the primary stage
        stage.setTitle("Home");
        stage.setScene(new Scene(root, 800, 900));
        stage.show();
    }
    public void ShowInfo() throws Exception {

        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("Showinfo.fxml"));
        Parent root = loader.load();

        // Loading the controller
        Club controller = loader.getController();
        //controller.init();

      //  controller.load();
        controller.setMain(this);

        // Set the primary stage
        stage.setTitle("Show Info");
        stage.setScene(new Scene(root, 800, 900));
        stage.show();

    }
    public void ClubInput() throws Exception {

        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("ClubCountryInput.fxml"));
        Parent root = loader.load();

        // Loading the controller
        Club controller = loader.getController();

        controller.setMain(this);
        // Set the primary stage
        stage.setTitle("Show Info");
        stage.setScene(new Scene(root, 800, 900));
        stage.show();

    }

    public void PositionInput() throws Exception {
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("Position.fxml"));
        Parent root = loader.load();

        // Loading the controller
        Club controller = loader.getController();

        controller.setMain(this);

        // Set the primary stage
        stage.setTitle("Show Info");
        stage.setScene(new Scene(root, 800, 900));
        stage.show();
    }
    public void SalaryInput() throws Exception {

        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("SalaryInput.fxml"));
        Parent root = loader.load();

        // Loading the controller
        Club controller = loader.getController();

        controller.setMain(this);
        // Set the primary stage
        stage.setTitle("Show Info");
        stage.setScene(new Scene(root, 800, 900));
        stage.show();

    }
    public void CountryWise() throws Exception {

        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("CountryWise.fxml"));
        Parent root = loader.load();

        // Loading the controller
        Club controller = loader.getController();

        controller.setMain(this);
        // Set the primary stage
        stage.setTitle("Show Info");
        stage.setScene(new Scene(root, 800, 900));
        stage.show();

    }
    public void SalaryMax() throws Exception {

        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("MaxSalary.fxml"));
        Parent root = loader.load();

        // Loading the controller
        Club controller = loader.getController();

        controller.setMain(this);
        // Set the primary stage
        stage.setTitle("Show Info");
        stage.setScene(new Scene(root, 800, 900));
        stage.show();

    }
    public void AgeMax() throws Exception {

        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("MaxAge.fxml"));
        Parent root = loader.load();

        // Loading the controller
        Club controller = loader.getController();

        controller.setMain(this);
        // Set the primary stage
        stage.setTitle("Show Info");
        stage.setScene(new Scene(root, 800, 900));
        stage.show();

    }
    public void HeightMax() throws Exception {

        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("MaxHeight.fxml"));
        Parent root = loader.load();

        // Loading the controller
        Club controller = loader.getController();

        controller.setMain(this);
        // Set the primary stage
        stage.setTitle("Show Info");
        stage.setScene(new Scene(root, 800, 900));
        stage.show();

    }
    public void TotalYearlySalary() throws Exception {

        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("TotalSalary.fxml"));
        Parent root = loader.load();

        // Loading the controller
        Club controller = loader.getController();

        controller.setMain(this);
        // Set the primary stage
        stage.setTitle("Show Info");
        stage.setScene(new Scene(root, 800, 900));
        stage.show();

    }


    public void PlayerAdd() throws Exception {

        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("AddPlayer.fxml"));
        Parent root = loader.load();

        // Loading the controller
        Club controller = loader.getController();

        controller.setMain(this);
        // Set the primary stage
        stage.setTitle("Show Info");
        stage.setScene(new Scene(root, 800, 900));
        stage.show();

    }

    public void failureAdd() throws Exception {
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("Failure.fxml"));
        Parent root = loader.load();

        // Loading the controller
        Club controller = loader.getController();

        controller.setMain(this);
        // Set the primary stage
        stage.setTitle("Show Info");
        stage.setScene(new Scene(root, 800, 900));
        stage.show();
    }

    public void Successful() throws Exception{
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("Succesful.fxml"));
        Parent root = loader.load();

        // Loading the controller
        Club controller = loader.getController();

        controller.setMain(this);
        // Set the primary stage
        stage.setTitle("Show Info");
        stage.setScene(new Scene(root, 800, 900));
        stage.show();
    }

   public static void main(String[] args) throws Exception {

        launch(args);
   }
}
