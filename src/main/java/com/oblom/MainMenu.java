package com.oblom;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class MainMenu extends Application {

    static Stage stage;
    public static Scene Menu;
    public static Scene Game;
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    public void start(Stage primarystage) throws Exception {

        stage = primarystage;
        String fxmlMenu = "/fxml/mainMenu.fxml";
        FXMLLoader loader = new FXMLLoader();
        Parent rootNode = (Parent) loader.load(getClass().getResourceAsStream(fxmlMenu));
        Menu = new Scene(rootNode, 600, 433);

        String fxmlGame = "/fxml/gameField.fxml";
        FXMLLoader loaderGame = new FXMLLoader();
        Parent GameRoot = (Parent) loaderGame.load(getClass().getResourceAsStream(fxmlGame));
        Game = new Scene(GameRoot, 600, 400);

        primarystage.setTitle("TTTGame");
        primarystage.setResizable(false);
        primarystage.setScene(Menu);
        primarystage.show();
    }
    public static Stage getPrimaryStage() {
        return stage;
    }
    private void setPrimaryStage(Stage pStage) {
        MainMenu.stage = pStage;
    }
    public static Scene getGame(){
        return Game;
    }
    private void setGame(Scene game) {
        MainMenu.Game = game;
    }
    public static Scene getMenu(){
        return Menu;
    }
    private void setMenu(Scene menu) {
        MainMenu.Menu = menu;
    }
}
