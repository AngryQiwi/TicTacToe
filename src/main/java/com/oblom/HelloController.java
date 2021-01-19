package com.oblom;

import com.sun.net.httpserver.Authenticator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import org.apache.commons.lang.StringUtils;

import java.lang.ref.ReferenceQueue;


public class HelloController {
    @FXML
    public Line Cross111;
    @FXML
    public Line Cross112;
    @FXML
    public Line Cross121;
    @FXML
    public Line Cross122;
    @FXML
    public Line Cross131;
    @FXML
    public Line Cross132;
    @FXML
    public Line Cross211;
    @FXML
    public Line Cross212;
    @FXML
    public Line Cross221;
    @FXML
    public Line Cross222;
    @FXML
    public Line Cross231;
    @FXML
    public Line Cross232;
    @FXML
    public Line Cross311;
    @FXML
    public Line Cross312;
    @FXML
    public Line Cross321;
    @FXML
    public Line Cross322;
    @FXML
    public Line Cross331;
    @FXML
    public Line Cross332;
    @FXML
    private Circle Circle11;
    @FXML
    public Circle Circle12;
    @FXML
    public Circle Circle13;
    @FXML
    public Circle Circle21;
    @FXML
    public Circle Circle22;
    @FXML
    public Circle Circle23;
    @FXML
    public Circle Circle31;
    @FXML
    public Circle Circle32;
    @FXML
    public Circle Circle33;
    @FXML
    public Line WinH1;
    @FXML
    public Line WinH2;
    @FXML
    public Line WinH3;
    @FXML
    public Line WinV1;
    @FXML
    public Line WinV2;
    @FXML
    public Line WinV3;
    @FXML
    public Line WinD1;
    @FXML
    public Line WinD2;
    @FXML
    public Label Player1ScoreOrWS;
    @FXML
    public Label Player2ScoreOrWS;
    @FXML
    public Rectangle Cell11;
    Cell cell11 = new Cell(11, 0);
    @FXML
    public Rectangle Cell12;
    Cell cell12 = new Cell(12, 0);
    @FXML
    public Rectangle Cell13;
    Cell cell13 = new Cell(13, 0);
    @FXML
    public Rectangle Cell21;
    Cell cell21 = new Cell(21, 0);
    @FXML
    public Rectangle Cell22;
    Cell cell22 = new Cell(22, 0);
    @FXML
    public Rectangle Cell23;
    Cell cell23 = new Cell(23, 0);
    @FXML
    public Rectangle Cell31;
    Cell cell31 = new Cell(31, 0);
    @FXML
    public Rectangle Cell32;
    Cell cell32 = new Cell(32, 0);
    @FXML
    public Rectangle Cell33;
    Cell cell33 = new Cell(33, 0);
    @FXML
    private Button PauseButton;
    @FXML
    private Button StartButton;
    @FXML
    private Button MainMenuButton;
    @FXML
    private Button RetryButton;
    @FXML
    private Label InfoLabel;
    public Player player1 = new Player(1, PlayerStatus.wait, 0);
    public Player player2 = new Player(2, PlayerStatus.wait, 0);
    private static int Mode;
    int P1Score = 0;
    int P2Score = 0;

    public int getMode() {
        return Mode;
    }

    public void setMode(int Mode) {
        HelloController.Mode = Mode;
    }

    Computer computer = new Computer(Mode, 2, PlayerStatus.wait, 0);
    public int Move = 0;

    int LastPlayerMove;

    public HelloController() {
    }

    @FXML
    public void openMainMenu(ActionEvent actionEvent) {
        Cell11.setDisable(false);
        Cell12.setDisable(false);
        Cell13.setDisable(false);
        Cell21.setDisable(false);
        Cell22.setDisable(false);
        Cell23.setDisable(false);
        Cell31.setDisable(false);
        Cell32.setDisable(false);
        Cell33.setDisable(false);
        cell11.setContent(0);
        cell12.setContent(0);
        cell13.setContent(0);
        cell21.setContent(0);
        cell22.setContent(0);
        cell23.setContent(0);
        cell31.setContent(0);
        cell32.setContent(0);
        cell33.setContent(0);
        Cross111.setVisible(false);
        Cross112.setVisible(false);
        Cross121.setVisible(false);
        Cross122.setVisible(false);
        Cross131.setVisible(false);
        Cross132.setVisible(false);
        Cross211.setVisible(false);
        Cross212.setVisible(false);
        Cross221.setVisible(false);
        Cross222.setVisible(false);
        Cross231.setVisible(false);
        Cross232.setVisible(false);
        Cross311.setVisible(false);
        Cross312.setVisible(false);
        Cross321.setVisible(false);
        Cross322.setVisible(false);
        Cross331.setVisible(false);
        Cross332.setVisible(false);
        Circle11.setVisible(false);
        Circle12.setVisible(false);
        Circle13.setVisible(false);
        Circle21.setVisible(false);
        Circle22.setVisible(false);
        Circle23.setVisible(false);
        Circle31.setVisible(false);
        Circle32.setVisible(false);
        Circle33.setVisible(false);
        Move = 0;
        WinH1.setVisible(false);
        WinH2.setVisible(false);
        WinH3.setVisible(false);
        WinV1.setVisible(false);
        WinV2.setVisible(false);
        WinV3.setVisible(false);
        WinD1.setVisible(false);
        WinD2.setVisible(false);
        InfoLabel.setText("Press Start");
        MainMenu.getPrimaryStage().setScene(MainMenu.getMenu());
    }

    @FXML
    public void openGameFieldEasy(ActionEvent actionEvent) {
        MainMenu.getPrimaryStage().setScene(MainMenu.getGame());
        setMode(0);
    }

    @FXML
    public void openGameFieldPVPStandart(ActionEvent actionEvent) {
        MainMenu.getPrimaryStage().setScene(MainMenu.getGame());
        setMode(3);
    }

    @FXML
    public void closeProgram(ActionEvent actionEvent) {
        MainMenu.getPrimaryStage().close();
    }

    @FXML
    public void startGame(ActionEvent actionEvent) {
        InfoLabel.setText("Player 1 Turn");
        if (getMode() <= 2) {
            computer.setDifficulty(Mode);
        }
        Cell11.setDisable(false);
        Cell12.setDisable(false);
        Cell13.setDisable(false);
        Cell21.setDisable(false);
        Cell22.setDisable(false);
        Cell23.setDisable(false);
        Cell31.setDisable(false);
        Cell32.setDisable(false);
        Cell33.setDisable(false);

        player1.setStatus(PlayerStatus.move);
    }

    public void makeAMove11(MouseEvent mouseEvent) {
        if (Move % 2 == 0) {
            Cross111.setVisible(true);
            Cross112.setVisible(true);
            Cell11.setDisable(true);
            cell11.setContent(1);
            LastPlayerMove = 11;
            InfoLabel.setText("Player 2 Turn");
        } else {
            Circle11.setVisible(true);
            cell11.setContent(2);
            InfoLabel.setText("Player 1 Turn");
        }
        if (checkWinner()) return;
        Move += 1;
        int place;
        if (Move % 2 != 0 && getMode() <= 2) {
            place = computer.makeAMove(LastPlayerMove, Move, cell11.getContent(), cell12.getContent(), cell13.getContent(), cell21.getContent(), cell22.getContent(), cell23.getContent(), cell31.getContent(), cell32.getContent(), cell33.getContent());
            computerMoveWriter(place);
            Move += 1;
            InfoLabel.setText("Player 1 Turn");

        }

        if (checkWinner()) return;
    }

    public void makeAMove12(MouseEvent mouseEvent) {
        if (Move % 2 == 0) {
            Cross121.setVisible(true);
            Cross122.setVisible(true);
            Cell12.setDisable(true);
            cell12.setContent(1);
            LastPlayerMove = 12;
            InfoLabel.setText("Player 2 Turn");
        } else {
            Circle12.setVisible(true);
            cell12.setContent(2);
            InfoLabel.setText("Player 1 Turn");

        }
        if (checkWinner()) return;

        Move += 1;
        int place;
        if (Move % 2 != 0 && 2 >= Mode) {
            place = computer.makeAMove(LastPlayerMove, Move, cell11.getContent(), cell12.getContent(), cell13.getContent(), cell21.getContent(), cell22.getContent(), cell23.getContent(), cell31.getContent(), cell32.getContent(), cell33.getContent());
            computerMoveWriter(place);
            Move += 1;
            InfoLabel.setText("Player 1 Turn");

        }
        if (checkWinner()) return;
    }

    public void makeAMove13(MouseEvent mouseEvent) {
        if (Move % 2 == 0) {
            Cross131.setVisible(true);
            Cross132.setVisible(true);
            Cell13.setDisable(true);
            cell13.setContent(1);
            LastPlayerMove = 13;
            InfoLabel.setText("Player 2 Turn");

        } else {
            Circle13.setVisible(true);
            cell13.setContent(2);
            InfoLabel.setText("Player 1 Turn");

        }
        if (checkWinner()) return;

        Move += 1;
        int place;
        if (Move % 2 != 0 && 2 >= Mode) {
            place = computer.makeAMove(LastPlayerMove, Move, cell11.getContent(), cell12.getContent(), cell13.getContent(), cell21.getContent(), cell22.getContent(), cell23.getContent(), cell31.getContent(), cell32.getContent(), cell33.getContent());
            computerMoveWriter(place);
            Move += 1;
            InfoLabel.setText("Player 1 Turn");

        }
        if (checkWinner()) return;
    }

    public void makeAMove21(MouseEvent mouseEvent) {
        if (Move % 2 == 0) {
            Cross211.setVisible(true);
            Cross212.setVisible(true);
            Cell21.setDisable(true);
            cell21.setContent(1);
            LastPlayerMove = 21;
            InfoLabel.setText("Player 2 Turn");

        } else {
            Circle21.setVisible(true);
            cell21.setContent(2);
            InfoLabel.setText("Player 1 Turn");

        }
        if (checkWinner()) return;

        Move += 1;
        int place;
        if (Move % 2 != 0 && 2 >= Mode) {
            place = computer.makeAMove(LastPlayerMove, Move, cell11.getContent(), cell12.getContent(), cell13.getContent(), cell21.getContent(), cell22.getContent(), cell23.getContent(), cell31.getContent(), cell32.getContent(), cell33.getContent());
            computerMoveWriter(place);
            Move += 1;
            InfoLabel.setText("Player 1 Turn");

        }
        if (checkWinner()) return;
    }

    public void makeAMove22(MouseEvent mouseEvent) {
        if (Move % 2 == 0) {
            Cross221.setVisible(true);
            Cross222.setVisible(true);
            Cell22.setDisable(true);
            cell22.setContent(1);
            LastPlayerMove = 22;
            InfoLabel.setText("Player 2 Turn");

        } else {
            Circle22.setVisible(true);
            cell22.setContent(2);
            InfoLabel.setText("Player 1 Turn");

        }
        if (checkWinner()) return;

        Move += 1;
        int place;
        if (Move % 2 != 0 && 2 >= Mode) {
            place = computer.makeAMove(LastPlayerMove, Move, cell11.getContent(), cell12.getContent(), cell13.getContent(), cell21.getContent(), cell22.getContent(), cell23.getContent(), cell31.getContent(), cell32.getContent(), cell33.getContent());
            computerMoveWriter(place);
            Move += 1;
            InfoLabel.setText("Player 1 Turn");

        }
        if (checkWinner()) return;
    }

    public void makeAMove23(MouseEvent mouseEvent) {
        if (Move % 2 == 0) {
            Cross231.setVisible(true);
            Cross232.setVisible(true);
            Cell23.setDisable(true);
            cell23.setContent(1);
            LastPlayerMove = 23;
            InfoLabel.setText("Player 2 Turn");

        } else {
            Circle23.setVisible(true);
            cell23.setContent(2);
            InfoLabel.setText("Player 1 Turn");

        }
        if (checkWinner()) return;

        Move += 1;
        int place;
        if (Move % 2 != 0 && 2 >= Mode) {
            place = computer.makeAMove(LastPlayerMove, Move, cell11.getContent(), cell12.getContent(), cell13.getContent(), cell21.getContent(), cell22.getContent(), cell23.getContent(), cell31.getContent(), cell32.getContent(), cell33.getContent());
            computerMoveWriter(place);
            Move += 1;
            InfoLabel.setText("Player 1 Turn");

        }
        if (checkWinner()) return;
    }

    public void makeAMove31(MouseEvent mouseEvent) {
        if (Move % 2 == 0) {
            Cross311.setVisible(true);
            Cross312.setVisible(true);
            Cell31.setDisable(true);
            cell31.setContent(1);
            LastPlayerMove = 31;
            InfoLabel.setText("Player 2 Turn");

        } else {
            Circle31.setVisible(true);
            cell31.setContent(2);
            InfoLabel.setText("Player 1 Turn");

        }
        if (checkWinner()) return;

        Move += 1;
        int place;
        if (Move % 2 != 0 && 2 >= Mode) {
            place = computer.makeAMove(LastPlayerMove, Move, cell11.getContent(), cell12.getContent(), cell13.getContent(), cell21.getContent(), cell22.getContent(), cell23.getContent(), cell31.getContent(), cell32.getContent(), cell33.getContent());
            computerMoveWriter(place);
            System.out.println(place);
            Move += 1;
            InfoLabel.setText("Player 1 Turn");

        }
        if (checkWinner()) return;
    }

    public void makeAMove32(MouseEvent mouseEvent) {
        if (Move % 2 == 0) {
            Cross321.setVisible(true);
            Cross322.setVisible(true);
            Cell32.setDisable(true);
            cell32.setContent(1);
            LastPlayerMove = 32;
            InfoLabel.setText("Player 2 Turn");

        } else {
            Circle32.setVisible(true);
            cell32.setContent(2);
            InfoLabel.setText("Player 1 Turn");

        }
        if (checkWinner()) return;

        Move += 1;
        int place;
        if (Move % 2 != 0 && 2 >= Mode) {
            place = computer.makeAMove(LastPlayerMove, Move, cell11.getContent(), cell12.getContent(), cell13.getContent(), cell21.getContent(), cell22.getContent(), cell23.getContent(), cell31.getContent(), cell32.getContent(), cell33.getContent());
            computerMoveWriter(place);
            Move += 1;
            InfoLabel.setText("Player 1 Turn");

        }
        if (checkWinner()) return;
    }

    public void makeAMove33(MouseEvent mouseEvent) {
        if (Move % 2 == 0) {
            Cross331.setVisible(true);
            Cross332.setVisible(true);
            Cell33.setDisable(true);
            cell33.setContent(1);
            LastPlayerMove = 33;
            InfoLabel.setText("Player 2 Turn");

        } else {
            Circle33.setVisible(true);
            cell33.setContent(2);
            InfoLabel.setText("Player 1 Turn");

        }
        if (checkWinner()) return;

        Move += 1;
        int place;
        if (Move % 2 != 0 && 2 >= Mode) {
            place = computer.makeAMove(LastPlayerMove, Move, cell11.getContent(), cell12.getContent(), cell13.getContent(), cell21.getContent(), cell22.getContent(), cell23.getContent(), cell31.getContent(), cell32.getContent(), cell33.getContent());
            computerMoveWriter(place);
            Move += 1;
            InfoLabel.setText("Player 1 Turn");

        }
        if (checkWinner()) return;
    }

    public boolean checkWinner() {
        int WinCheck = 0;
        if (cell11.getContent() == 1 && cell12.getContent() == 1 && cell13.getContent() == 1) {
            WinH1.setVisible(true);
            WinCheck = 1;
        }
        if (cell11.getContent() == 2 && cell12.getContent() == 2 && cell13.getContent() == 2) {
            WinH1.setVisible(true);
            WinCheck = 2;
        }
        if (cell21.getContent() == 1 && cell22.getContent() == 1 && cell23.getContent() == 1) {
            WinH2.setVisible(true);
            WinCheck = 1;
        }
        if (cell21.getContent() == 2 && cell22.getContent() == 2 && cell23.getContent() == 2) {
            WinH2.setVisible(true);
            WinCheck = 2;
        }
        if (cell31.getContent() == 1 && cell32.getContent() == 1 && cell33.getContent() == 1) {
            WinH3.setVisible(true);
            WinCheck = 1;
        }
        if (cell31.getContent() == 2 && cell32.getContent() == 2 && cell33.getContent() == 2) {
            WinH3.setVisible(true);
            WinCheck = 2;
        }
        if (cell11.getContent() == 1 && cell21.getContent() == 1 && cell31.getContent() == 1) {
            WinV1.setVisible(true);
            WinCheck = 1;
        }
        if (cell11.getContent() == 2 && cell21.getContent() == 2 && cell31.getContent() == 2) {
            WinV1.setVisible(true);
            WinCheck = 2;
        }
        if (cell12.getContent() == 1 && cell22.getContent() == 1 && cell32.getContent() == 1) {
            WinV2.setVisible(true);
            WinCheck = 1;
        }
        if (cell12.getContent() == 2 && cell22.getContent() == 2 && cell32.getContent() == 2) {
            WinV2.setVisible(true);
            WinCheck = 2;
        }
        if (cell13.getContent() == 1 && cell23.getContent() == 1 && cell33.getContent() == 1) {
            WinV3.setVisible(true);
            WinCheck = 1;
        }
        if (cell13.getContent() == 2 && cell23.getContent() == 2 && cell33.getContent() == 2) {
            WinV3.setVisible(true);
            WinCheck = 2;
        }
        if (cell11.getContent() == 1 && cell22.getContent() == 1 && cell33.getContent() == 1) {
            WinD1.setVisible(true);
            WinCheck = 1;
        }
        if (cell11.getContent() == 2 && cell22.getContent() == 2 && cell33.getContent() == 2) {
            WinD1.setVisible(true);
            WinCheck = 2;
        }
        if (cell13.getContent() == 1 && cell22.getContent() == 1 && cell31.getContent() == 1) {
            WinD2.setVisible(true);
            WinCheck = 1;
        }
        if (cell13.getContent() == 2 && cell22.getContent() == 2 && cell31.getContent() == 2) {
            WinD2.setVisible(true);
            WinCheck = 2;
        }
        if (WinCheck != 0 || Move >= 9) {
            RetryButton.setDisable(false);
            InfoLabel.setText("Draw");
            if (WinCheck == 1) {
                InfoLabel.setText("Crosses Win");
                P1Score += 1;
                Player1ScoreOrWS.setText(String.valueOf(P1Score));
            }

            if (WinCheck == 2) {
                InfoLabel.setText("Circles Win");
                P2Score += 1;
                Player2ScoreOrWS.setText(String.valueOf(P2Score));
            }
            Cell11.setDisable(true);
            Cell12.setDisable(true);
            Cell13.setDisable(true);
            Cell21.setDisable(true);
            Cell22.setDisable(true);
            Cell23.setDisable(true);
            Cell31.setDisable(true);
            Cell32.setDisable(true);
            Cell33.setDisable(true);
            return true;

        }

        return false;
    }

    public void computerMoveWriter(int Place) {
        if (Place == 11) {
            Circle11.setVisible(true);
            cell11.setContent(2);
            Cell11.setDisable(true);

        }
        if (Place == 12) {
            Circle12.setVisible(true);
            cell12.setContent(2);
            Cell12.setDisable(true);
        }
        if (Place == 13) {
            Circle13.setVisible(true);
            cell13.setContent(2);
            Cell13.setDisable(true);
        }
        if (Place == 21) {
            Circle21.setVisible(true);
            cell21.setContent(2);
            Cell21.setDisable(true);

        }
        if (Place == 22) {
            Circle22.setVisible(true);
            cell22.setContent(2);
            Cell22.setDisable(true);

        }
        if (Place == 23) {
            Circle23.setVisible(true);
            cell23.setContent(2);
            Cell23.setDisable(true);

        }
        if (Place == 31) {
            Circle31.setVisible(true);
            cell31.setContent(2);
            Cell31.setDisable(true);

        }
        if (Place == 32) {
            Circle32.setVisible(true);
            cell32.setContent(2);
            Cell32.setDisable(true);

        }
        if (Place == 33) {
            Circle33.setVisible(true);
            cell33.setContent(2);
            Cell33.setDisable(true);

        }

    }

    public void retryGame(ActionEvent actionEvent) {
        Cell11.setDisable(false);
        Cell12.setDisable(false);
        Cell13.setDisable(false);
        Cell21.setDisable(false);
        Cell22.setDisable(false);
        Cell23.setDisable(false);
        Cell31.setDisable(false);
        Cell32.setDisable(false);
        Cell33.setDisable(false);
        cell11.setContent(0);
        cell12.setContent(0);
        cell13.setContent(0);
        cell21.setContent(0);
        cell22.setContent(0);
        cell23.setContent(0);
        cell31.setContent(0);
        cell32.setContent(0);
        cell33.setContent(0);
        Cross111.setVisible(false);
        Cross112.setVisible(false);
        Cross121.setVisible(false);
        Cross122.setVisible(false);
        Cross131.setVisible(false);
        Cross132.setVisible(false);
        Cross211.setVisible(false);
        Cross212.setVisible(false);
        Cross221.setVisible(false);
        Cross222.setVisible(false);
        Cross231.setVisible(false);
        Cross232.setVisible(false);
        Cross311.setVisible(false);
        Cross312.setVisible(false);
        Cross321.setVisible(false);
        Cross322.setVisible(false);
        Cross331.setVisible(false);
        Cross332.setVisible(false);
        Circle11.setVisible(false);
        Circle12.setVisible(false);
        Circle13.setVisible(false);
        Circle21.setVisible(false);
        Circle22.setVisible(false);
        Circle23.setVisible(false);
        Circle31.setVisible(false);
        Circle32.setVisible(false);
        Circle33.setVisible(false);
        WinH1.setVisible(false);
        WinH2.setVisible(false);
        WinH3.setVisible(false);
        WinV1.setVisible(false);
        WinV2.setVisible(false);
        WinV3.setVisible(false);
        WinD1.setVisible(false);
        WinD2.setVisible(false);
        Move = 0;
        InfoLabel.setText("Press Start");
    }
}
