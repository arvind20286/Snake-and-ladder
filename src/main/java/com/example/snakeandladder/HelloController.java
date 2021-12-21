package com.example.project_ap;



import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.transform.Translate;
import java.util.HashMap;
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
        int[] place = {4,8,27,42,58,69,99,95,94,90,55,63,43};
        for (int i =0;i<place.length;i++){
            if (player1.getCount() ==place[i]){
                method2 ();
            }
            if(player2.getCount()==place[i]){
                method2 ();
            }
        }



    }
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
        HashMap<Integer, int[]> sandl = new HashMap<Integer, int[]>();
        sandl.put(4, new int[]{8, 4});
        sandl.put(8, new int[]{7, 9});
        sandl.put(27, new int[]{6, 5});
        sandl.put(42, new int[]{3, 0});
        sandl.put(58, new int[]{3, 3});
        sandl.put(69, new int[]{1, 7});
        sandl.put(99, new int[]{3, 0});
        sandl.put(95, new int[]{3, 4});
        sandl.put(94, new int[]{5, 7});
        sandl.put(90, new int[]{6, 9});
        sandl.put(55, new int[]{9, 3});
        sandl.put(63, new int[]{8, 1});
        sandl.put(43, new int[]{8, 2});
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




