package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import static java.lang.System.exit;
import static javafx.application.Application.launch;

public class MenuShow  {

   private Main main;




    @FXML
     public void ShowSearchPlayerOptions(ActionEvent event) {
             try {
                 main.showHomePage();
             } catch (Exception e) {
                 System.out.println(e);
             }
         }


    public void setMain(Main main) {
           this.main=main;
    }

   @FXML
    public void ShowSearchClubOptions(ActionEvent event) {
         try{
             main.SearchClub();
         }catch(Exception e){
             System.out.println(e);
         }
    }

    public void AddPlayer(ActionEvent event) {
        try{
            main.PlayerAdd();
        }catch(Exception e){
            System.out.println(e);
        }
    }

  @FXML
    public void exitsystem(ActionEvent event) throws Exception {
        Controller controller=new Controller();
       // controller.writeToFile();
        exit(1);
  }


}

