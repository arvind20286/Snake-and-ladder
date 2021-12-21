package com.example.snakeandladder;



import javafx.fxml.FXML;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.transform.Translate;
import org.controlsfx.control.spreadsheet.Grid;

import java.util.HashMap;
import java.util.Objects;
import java.util.Random;


public class HelloController {
    public ImageView diceImage;
    public GridPane gridPane;
    @FXML
    private ImageView token1;

    @FXML
    private ImageView token2;

    public Button dice;
    public Label num;
    int i;
    Token player1;
    Token player2;
    HashMap<Integer, int[]> sandl;

    public void initialize(){
        player1 = new Token(token1);
        player2 = new Token(token2);
        i = 1;
        sandl = new HashMap<Integer, int[]>();
        sandl.put(4, new int[]{8, 4,25});
        sandl.put(8, new int[]{7, 9,31});
        sandl.put(27, new int[]{6, 5,46});
        sandl.put(42, new int[]{3, 0,80});
        sandl.put(58, new int[]{3, 3,77});
        sandl.put(69, new int[]{1, 7,93});
        sandl.put(99, new int[]{3, 0,80});
        sandl.put(95, new int[]{3, 4,76});
        sandl.put(94, new int[]{5, 7,53});
        sandl.put(90, new int[]{6, 9,50});
        sandl.put(55, new int[]{9, 2,18});
        sandl.put(63, new int[]{5, 0,60});
        sandl.put(43, new int[]{8, 1,22});

    }

    public void diceMove(MouseEvent mouseEvent) {
        Random rand = new Random();
        int rand_int1 = rand.nextInt(6) + 1;
        num.setText(String.valueOf(rand_int1));

        if(i%2 !=0 && ((player1.getCount() + rand_int1) <= 100)) {
            player1.moveLftRit(rand_int1);
            gridPane.getChildren().remove(token1);

            if(sandl.containsKey(player1.getCount())){
                player1.setCurrRow(sandl.get(player1.getCount())[0]);
                player1.setCurrCol(sandl.get(player1.getCount())[1]);
                player1.setCount(sandl.get(player1.getCount())[2]);
                System.out.println("Blue");
                System.out.println("CurrRow = " + player1.getCurrRow());
                System.out.println("CurrCol = " + player1.getCurrCol());
                System.out.println();

            }
        }
        if(i%2 == 0 && ((player2.getCount() + rand_int1) <= 100)) {
            player2.moveLftRit(rand_int1);
            if(sandl.containsKey(player2.getCount())){
                player2.setCurrRow(sandl.get(player2.getCount())[0]);
                player2.setCurrCol(sandl.get(player2.getCount())[1]);
                player2.setCount(sandl.get(player2.getCount())[2]);
                System.out.println("Red");
                System.out.println("CurrRow = " + player2.getCurrRow());
                System.out.println("CurrCol = " + player2.getCurrCol());
                System.out.println();
            }
        }
        i++;

    }

    /*
    public void movement1 (){

        if (player1.getCount()==4){
            player1.setCount(25);
            GridPane.setRowIndex(this.token1, 8);
            GridPane.setColumnIndex(this.token1, 4);


        }

        if (player1.getCount()==8){
            player1.setCount(31);
            GridPane.setRowIndex(this.token1, 7);
            GridPane.setColumnIndex(this.token1, 9);

        }
        if (player1.getCount()==27){
            player1.setCount(46);
            GridPane.setRowIndex(this.token1, 6);
            GridPane.setColumnIndex(this.token1, 5);

        }
        if (player1.getCount()==42){
            player1.setCount(80);
            GridPane.setRowIndex(this.token1, 3);
            GridPane.setColumnIndex(this.token1, 0);
        }
        if (player1.getCount()==58){
            player1.setCount(77);
            GridPane.setRowIndex(this.token1, 3);
            GridPane.setColumnIndex(this.token1, 3);

        }
        if (player1.getCount()==69){
            player1.setCount(93);
            GridPane.setRowIndex(this.token1, 1);
            GridPane.setColumnIndex(this.token1, 7);

        }
        if (player1.getCount()==99){
            player1.setCount(80);
            GridPane.setRowIndex(this.token1, 3);
            GridPane.setColumnIndex(this.token1, 0);

        }
        if (player1.getCount()==95){
            player1.setCount(76);
            GridPane.setRowIndex(this.token1, 3);
            GridPane.setColumnIndex(this.token1, 4);

        }
        if (player1.getCount()==94){
            player1.setCount(53);
            GridPane.setRowIndex(this.token1, 5);
            GridPane.setColumnIndex(this.token1, 7);

        }
        if (player1.getCount()==90){
            player1.setCount(50);
            GridPane.setRowIndex(this.token1, 6);
            GridPane.setColumnIndex(this.token1, 9);

        }
        if (player1.getCount()==55){
            player1.setCount(18);
            GridPane.setRowIndex(this.token1, 9);
            GridPane.setColumnIndex(this.token1, 3);

        }
        if (player1.getCount()==63){
            player1.setCount(60);
            GridPane.setRowIndex(this.token1, 8);
            GridPane.setColumnIndex(this.token1, 1);

        }
        if (player1.getCount()==43){
            player1.setCount(22);
            GridPane.setRowIndex(this.token1, 8);
            GridPane.setColumnIndex(this.token1, 2);

        }

    }


    public void movement2 (){

        if (player2.getCount()==4){
            player2.setCount(25);
            GridPane.setRowIndex(this.token2, 8);
            GridPane.setColumnIndex(this.token2, 4);


        }

        if (player2.getCount()==8){
            player2.setCount(31);
            GridPane.setRowIndex(this.token2, 7);
            GridPane.setColumnIndex(this.token2, 9);

        }
        if (player2.getCount()==27){
            player2.setCount(46);
            GridPane.setRowIndex(this.token2, 6);
            GridPane.setColumnIndex(this.token2, 5);

        }
        if (player2.getCount()==42){
            player2.setCount(80);
            GridPane.setRowIndex(this.token2, 3);
            GridPane.setColumnIndex(this.token2, 0);
        }
        if (player2.getCount()==58){
            player2.setCount(77);
            GridPane.setRowIndex(this.token2, 3);
            GridPane.setColumnIndex(this.token2, 3);

        }
        if (player2.getCount()==69){
            player2.setCount(93);
            GridPane.setRowIndex(this.token2, 1);
            GridPane.setColumnIndex(this.token2, 7);

        }
        if (player2.getCount()==99){
            player2.setCount(80);
            GridPane.setRowIndex(this.token2, 3);
            GridPane.setColumnIndex(this.token2, 0);

        }
        if (player2.getCount()==95){
            player2.setCount(76);
            GridPane.setRowIndex(this.token2, 3);
            GridPane.setColumnIndex(this.token2, 4);

        }
        if (player2.getCount()==94){
            player2.setCount(53);
            GridPane.setRowIndex(this.token2, 5);
            GridPane.setColumnIndex(this.token2, 7);

        }
        if (player2.getCount()==90){
            player2.setCount(50);
            GridPane.setRowIndex(this.token2, 6);
            GridPane.setColumnIndex(this.token2, 9);

        }
        if (player2.getCount()==55){
            player2.setCount(18);
            GridPane.setRowIndex(this.token2, 9);
            GridPane.setColumnIndex(this.token2, 3);

        }
        if (player2.getCount()==63){
            player2.setCount(60);
            GridPane.setRowIndex(this.token2, 8);
            GridPane.setColumnIndex(this.token2, 1);

        }
        if (player2.getCount()==43){
            player2.setCount(22);
            GridPane.setRowIndex(this.token2, 8);
            GridPane.setColumnIndex(this.token2, 2);

        }

    }



    public void method2(){


        for (Integer key : sandl.keySet()){
            if (player1.getCount()==key){
                GridPane.setRowIndex(this.token1, sandl.get(key)[0]);
                GridPane.setColumnIndex(this.token1, sandl.get(key)[1]);
            }
            if (player2.getCount()==key){
                GridPane.setRowIndex(this.token2, sandl.get(key)[0]);
                GridPane.setColumnIndex(this.token2, sandl.get(key)[1]);
            }
        }
    }

     */

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

    public void setCurrRow(int row){
        currRow = row;
        GridPane.setRowIndex(this.token, currRow);
    }
    public void setCurrCol(int col){
        currCol = col;
        GridPane.setColumnIndex(this.token, currCol);
    }
    public int getCount(){
        return count;
    }

    public void setCount(int count){
        this.count = count;
    }


}




