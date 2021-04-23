package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class Controller {

    //FXML nodes
        //Stu = Student
        //Prof = Professor
        //Go = Go to page, etc GoStuLog means go to student log in page
    @FXML Button btnGoStuLog;
    @FXML Button btnGoStuSign;
    @FXML Button btnGoProfLog;
    @FXML Button btnGoProfSign;
    @FXML Button btnStuLog;
    @FXML Button btnProfLog;
    @FXML Button btnStuSignUp;
    @FXML Button btnProfSignUp;
    @FXML Button btnStuLogGoBack;
    @FXML Button btnStuSignGoBack;
    @FXML Button btnProfLogGoBack;
    @FXML Button btnProfSignGoBack;
    @FXML TextField txtStuEmail;
    @FXML TextField txtStuPassword;
    @FXML TextField txtProfEmail;
    @FXML TextField txtProfPassword;
    @FXML Label lblStuWelcome;
    @FXML Button btnAddClass;
    @FXML Button btnRemoveClass;
    @FXML TextField txtEnterClass;
    @FXML Button btnAddClassProf;
    @FXML Button btnRemoveClassProf;
    @FXML Button btnShowStudents;
    @FXML TextField txtEnterClassProf;



    //Main Page Buttons

    public void handleBtnGoStuLog(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("stuLogIn.fxml"));
        Stage window = (Stage) btnGoStuLog.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }

    public void handleBtnGoStuSign(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("stuSignUp.fxml"));
        Stage window = (Stage) btnGoStuSign.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }

    public void handleBtnProfLogIn(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("profLogIn.fxml"));
        Stage window = (Stage) btnGoProfLog.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }

    public void handleProfSignUp(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("profSignUp.fxml"));
        Stage window = (Stage) btnGoProfSign.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }



    //Student Sign in Buttons

        //student sign in button
    public void handleBtnStuSignUp(ActionEvent actionEvent) throws IOException {


    }

        //Student Sign in go back button
    public void handleBtnStuSignGoBack(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Stage window = (Stage) btnStuSignGoBack.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }


    //Student Log in Buttons
        // Student log in button
    public void handleStuLog(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("stuMain.fxml"));
        Stage window = (Stage) btnStuLog.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }

        //student log in go back button
    public void handleStuLogGoBack(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Stage window = (Stage) btnStuLogGoBack.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }



    //Professor Sign in Buttons
        //Professor Sign in button
    public void handleBtnProfSignUp(ActionEvent actionEvent) {
    }

        //Professor sign in go back button
    public void handleBtnSignGoBack(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Stage window = (Stage) btnProfSignGoBack.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }



    //Professor Log in Buttons


    public void handleBtnProfLog(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("profMain.fxml"));
        Stage window = (Stage) btnProfLog.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }

    public void handleBtnProfLogGoBack(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Stage window = (Stage) btnProfLogGoBack.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }

}
