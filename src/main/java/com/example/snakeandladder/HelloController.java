package com.example.snakeandladder;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.transform.Translate;

import java.util.Objects;
import java.util.Random;


public class HelloController {
    public ImageView diceImage;
    @FXML
    private ImageView token1;

    @FXML
    private ImageView token2;

    public Button dice;
    public Label num;
    int i;
    Token player1;
    Token player2;

    public void initialize(){
        player1 = new Token(token1);
        player2 = new Token(token2);
        i = 1;
        
    }

    public void diceMove(MouseEvent mouseEvent) {
        Random rand = new Random();
        int rand_int1 = rand.nextInt(6) + 1;
        num.setText(String.valueOf(rand_int1));
        if(i%2 !=0 && ((player1.getCount() + rand_int1) <= 100))
            player1.moveLftRit(rand_int1);
        if(i%2 == 0 && ((player2.getCount() + rand_int1) <= 100))
            player2.moveLftRit(rand_int1);
        i++;
    }

}

class Token{
    private int count;
    private int currRow;
    private int currCol;
    private ImageView token;

    public Token(ImageView token){
        this.count = 1;
        this.token = token;
        GridPane.setRowIndex(this.token, 10);
        currRow = 10;
        GridPane.setColumnIndex(this.token, 0);
        currCol = 0;
        if(GridPane.getColumnIndex(this.token) == null)
            currCol = 0;
        else
            currCol = GridPane.getColumnIndex(this.token);
    }

    public void moveLftRit(int steps){
        System.out.println("Steps = " + steps);
        int stepsTaken = 0;
        System.out.println("StepsTaken = " + stepsTaken);
        System.out.println("Initial location = (" + currRow + ", " + currCol + ")");
        if((count >= 1 && count <= 10) || (count >= 21 && count <= 30)
                || (count >= 41 && count <= 50) || (count >= 61 && count <= 70) || (count >= 81 && count <= 90)) {
            System.out.println("Moving Right...");
            if((getCurrCol() + steps) > 9){
                System.out.println("getCurrCol() + steps) > 9");
                stepsTaken = 9 - getCurrCol();
                System.out.println("StepsTaken = " + stepsTaken);
                currCol = currCol + stepsTaken;
                System.out.println("Next location = (" + currRow + ", " + currCol + ")");
                GridPane.setColumnIndex(token, currCol);
                if(stepsTaken < steps) {
                    System.out.println("    StepsTaken < " + steps + "Moving up");
                    moveUp();
                    stepsTaken++;
                    System.out.println("    StepsTaken = " + stepsTaken);
                }
                if(stepsTaken < steps){
                    currCol = currCol - steps + stepsTaken;
                    System.out.println("    StepsTaken < " + steps + " Moving to column = " + currCol);
                    GridPane.setColumnIndex(token, currCol);
                    stepsTaken = steps;
                    System.out.println("    StepsTaken = " + stepsTaken);
                }
            }
            else {
                currCol = currCol + steps;
                System.out.println("StepsTaken " + steps + "Moving to column = " + currCol);
                GridPane.setColumnIndex(token, currCol);
            }
        }
        else {
            System.out.println("Moving Left...");
            if((getCurrCol() - steps) < 0){
                System.out.println("getCurrCol() - steps) > 0");
                stepsTaken = getCurrCol();
                System.out.println("StepsTaken = " + stepsTaken);
                currCol = currCol - stepsTaken;
                System.out.println("Next location = (" + currRow + ", " + currCol + ")");
                GridPane.setColumnIndex(token, currCol);
                if(stepsTaken < steps) {
                    System.out.println("    StepsTaken < " + steps + "Moving up");
                    moveUp();
                    stepsTaken++;
                    System.out.println("    StepsTaken = " + stepsTaken);

                }
                if(stepsTaken < steps){
                    currCol = currCol + steps - stepsTaken;
                    System.out.println("    StepsTaken < " + steps + "Moving to column = " + currCol);
                    GridPane.setColumnIndex(token, currCol);
                    stepsTaken = steps;
                    System.out.println("    StepsTaken = " + stepsTaken);
                }
            }
            else {
                currCol = currCol - steps;
                System.out.println("StepsTaken " + steps + "Moving to column = " + currCol);
                GridPane.setColumnIndex(token, currCol);
            }

        }
        count += steps;
        System.out.println("Count = " + count);
        System.out.println();
    }

    public void moveUp(){
        currRow--;
        GridPane.setRowIndex(token,currRow);
    }

    public int getCurrRow(){
        return currRow;
    }

    public int getCurrCol(){
        return currCol;
    }

    public int getCount(){
        return count;
    }

    public void setCount(int count){
        this.count = count;
    }
}



