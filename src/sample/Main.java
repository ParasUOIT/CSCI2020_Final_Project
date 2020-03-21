package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        homepage(primaryStage);

    }

    private void homepage(Stage primaryStage) {
        DropShadow dropShadow = new DropShadow();
        dropShadow.setOffsetX(5);
        dropShadow.setOffsetY(5);

        Text scenetitle = new Text("Chatter");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.BOLD, 30));
        scenetitle.setEffect(dropShadow);

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        grid.add(scenetitle, 1, 0, 2, 1);

        Button loginbtn = new Button("Login");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_LEFT);
        hbBtn.getChildren().add(loginbtn);
        grid.add(hbBtn, 1, 2);
        Button registerbtn = new Button("Register");
        HBox reghbbtn = new HBox(10);
        reghbbtn.setAlignment(Pos.BOTTOM_RIGHT);
        reghbbtn.getChildren().add(registerbtn);
        grid.add(reghbbtn, 2, 2);

        loginbtn.setOnAction(e -> loginpage(primaryStage));
        registerbtn.setOnAction(e -> registerpage(primaryStage));

        primaryStage.setTitle("Home Page");
        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void loginpage(Stage primaryStage) {
        primaryStage.hide();
        Stage loginstage = new Stage();
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);

        Button logbtn = new Button("Login");

        Button gobackbtn = new Button("Go back");

        HBox logBtn = new HBox(5);
        logBtn.setAlignment(Pos.BOTTOM_LEFT);
        logBtn.getChildren().add(logbtn);
        grid.add(logBtn, 1, 3);

        HBox gobackbutton = new HBox(5);
        gobackbutton.setAlignment(Pos.BOTTOM_RIGHT);
        gobackbutton.getChildren().add(gobackbtn);
        grid.add(gobackbutton, 1, 3);

        loginstage.setTitle("Login Page");
        Scene scene2 = new Scene(grid, 300, 275);
        loginstage.setScene(scene2);
        loginstage.show();

        gobackbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                loginstage.hide();
                homepage(primaryStage);
            }
        });

    }

    private void registerpage(Stage primaryStage) {
        primaryStage.hide();
        Stage registerstage = new Stage();
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Label FullName = new Label("Full Name:");
        grid.add(FullName, 0, 0);

        TextField nameTextField = new TextField();
        grid.add(nameTextField, 1, 0);

        Label DOB = new Label("Date of Birth:");
        grid.add(DOB, 0, 1);

        DatePicker birthdate = new DatePicker();
        grid.add(birthdate, 1, 1);

        Label UserName = new Label("User Name:");
        grid.add(UserName, 0, 2);

        TextField UserTextField = new TextField();
        grid.add(UserTextField, 1, 2);

        Label pw = new Label("Password:");
        grid.add(pw, 0, 3);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 3);

        Button registerbtn = new Button("Register");

        Button gobackbtn = new Button("Go back");

        HBox regBtn = new HBox(5);
        regBtn.setAlignment(Pos.BOTTOM_LEFT);
        regBtn.getChildren().add(registerbtn);
        grid.add(regBtn, 1, 4);

        HBox gobackbutton = new HBox(5);
        gobackbutton.setAlignment(Pos.BOTTOM_RIGHT);
        gobackbutton.getChildren().add(gobackbtn);
        grid.add(gobackbutton, 1, 4);

        registerstage.setTitle("Registration Page");
        Scene scene3 = new Scene(grid, 500, 275);
        registerstage.setScene(scene3);
        registerstage.show();

        gobackbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                registerstage.hide();
                homepage(primaryStage);
            }
        });


    }


    public static void main(String[] args) {
        launch(args);
    }
}
