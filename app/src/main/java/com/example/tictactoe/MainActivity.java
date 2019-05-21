package com.example.tictactoe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
implements OnClickListener{

    private Button buttonTopLeft;
    private Button buttonTopMiddle;
    private Button buttonTopRight;
    private Button buttonMiddleLeft;
    private Button buttonCenter;
    private Button buttonMiddleRight;
    private Button buttonBottomLeft;
    private Button buttonBottomMiddle;
    private Button buttonBottomRight;
    private Button buttonNewGame;
    private TextView textView;

    String PLAYER1 = "X";
    String PLAYER2 = "O";
    String CurrPlayer = PLAYER1;
    Button CurrButton = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonTopLeft = findViewById(R.id.buttonTopLeft);
        buttonTopMiddle = findViewById(R.id.buttonTopMiddle);
        buttonTopRight = findViewById(R.id.buttonTopRight);
        buttonMiddleLeft = findViewById(R.id.buttonMiddleLeft);
        buttonCenter = findViewById(R.id.buttonCenter);
        buttonMiddleRight = findViewById(R.id.buttonMiddleRight);
        buttonBottomLeft = findViewById(R.id.buttonBottomLeft);
        buttonBottomMiddle = findViewById(R.id.buttonBottomMiddle);
        buttonBottomRight = findViewById(R.id.buttonBottomRight);
        buttonNewGame = findViewById(R.id.buttonNewGame);
        textView = findViewById(R.id.textView);
        NewGame();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonNewGame:
                CurrPlayer = PLAYER1;
                textView.setText(CurrPlayer + "'s Turn");
                buttonTopLeft.setText("Button");
                buttonTopLeft.setEnabled(true);
                buttonTopMiddle.setText("Button");
                buttonTopMiddle.setEnabled(true);
                buttonTopRight.setText("Button");
                buttonTopRight.setEnabled(true);
                buttonMiddleLeft.setText("Button");
                buttonMiddleLeft.setEnabled(true);
                buttonCenter.setText("Button");
                buttonCenter.setEnabled(true);
                buttonMiddleRight.setText("Button");
                buttonMiddleRight.setEnabled(true);
                buttonBottomLeft.setText("Button");
                buttonBottomLeft.setEnabled(true);
                buttonBottomMiddle.setText("Button");
                buttonBottomMiddle.setEnabled(true);
                buttonBottomRight.setText("Button");
                buttonBottomRight.setEnabled(true);
                break;

            case R.id.buttonTopLeft:
                CurrButton = buttonTopLeft;
                CheckTurn();
                break;
            case R.id.buttonTopMiddle:
                CurrButton = buttonTopMiddle;
                CheckTurn();
                break;
            case R.id.buttonTopRight:
                CurrButton = buttonTopRight;
                CheckTurn();
                break;
            case R.id.buttonMiddleLeft:
                CurrButton = buttonMiddleLeft;
                CheckTurn();
                break;
            case R.id.buttonCenter:
                CurrButton = buttonCenter;
                CheckTurn();
                break;
            case R.id.buttonMiddleRight:
                CurrButton = buttonMiddleRight;
                CheckTurn();
                break;
            case R.id.buttonBottomLeft:
                CurrButton = buttonBottomLeft;
                CheckTurn();
                break;
            case R.id.buttonBottomMiddle:
                CurrButton = buttonBottomMiddle;
                CheckTurn();
                break;
            case R.id.buttonBottomRight:
                CurrButton = buttonBottomRight;
                CheckTurn();
                break;
        }
    }
    public void CheckTurn(){
        if (!CurrButton.getText().toString().equals("Button")
                && CurrButton.getText().toString().equals(PLAYER1) || CurrButton.getText().toString().equals(PLAYER2)){

        }
        else{
            ChangeButton();
            CheckWinner();
        }
    }

    private void ChangeTurn() {
        if (CurrPlayer.equals(PLAYER1)){
            CurrPlayer = PLAYER2;
            textView.setText(CurrPlayer + "'s Turn");
        }
        else{
            CurrPlayer = PLAYER1;
            textView.setText(CurrPlayer + "'s Turn");
        }
    }

    private void ChangeButton() {
        if (CurrPlayer.equals(PLAYER1)){
            CurrButton.setText(PLAYER1);
        }
        else{
            CurrButton.setText(PLAYER2);
        }
    }

    private void CheckWinner() {
        if (!buttonTopLeft.getText().toString().equals("Button")
                && buttonTopLeft.getText().toString().equals(buttonTopMiddle.getText().toString())
                && buttonTopLeft.getText().toString().equals(buttonTopRight.getText().toString())){
            DisableButtons();
            textView.setText(CurrPlayer + "'s Win!");
        }
        else if (!buttonTopLeft.getText().toString().equals("Button")
                && buttonTopLeft.getText().toString().equals(buttonMiddleLeft.getText().toString())
                && buttonTopLeft.getText().toString().equals(buttonBottomLeft.getText().toString())){
            DisableButtons();
            textView.setText(CurrPlayer + "'s Win!");
        }
        else if (!buttonTopLeft.getText().toString().equals("Button")
                && buttonTopLeft.getText().toString().equals(buttonCenter.getText().toString())
                && buttonTopLeft.getText().toString().equals(buttonBottomRight.getText().toString())){
            DisableButtons();
            textView.setText(CurrPlayer + "'s Win!");
        }
        else if (!buttonMiddleLeft.getText().toString().equals("Button")
                && buttonMiddleLeft.getText().toString().equals(buttonCenter.getText().toString())
                && buttonMiddleLeft.getText().toString().equals(buttonMiddleRight.getText().toString())){
            DisableButtons();
            textView.setText(CurrPlayer + "'s Win!");
        }
        else if (!buttonBottomLeft.getText().toString().equals("Button")
                && buttonBottomLeft.getText().toString().equals(buttonBottomMiddle.getText().toString())
                && buttonBottomLeft.getText().toString().equals(buttonBottomRight.getText().toString())){
            DisableButtons();
            textView.setText(CurrPlayer + "'s Win!");
        }
        else if (!buttonTopMiddle.getText().toString().equals("Button")
                && buttonTopMiddle.getText().toString().equals(buttonCenter.getText().toString())
                && buttonTopMiddle.getText().toString().equals(buttonBottomMiddle.getText().toString())){
            DisableButtons();
            textView.setText(CurrPlayer + "'s Win!");
        }
        else if (!buttonTopRight.getText().toString().equals("Button")
                && buttonTopRight.getText().toString().equals(buttonMiddleRight.getText().toString())
                && buttonTopRight.getText().toString().equals(buttonBottomRight.getText().toString())){
            DisableButtons();
            textView.setText(CurrPlayer + "'s Win!");
        }
        else if (!buttonTopRight.getText().toString().equals("Button")
                && buttonTopRight.getText().toString().equals(buttonCenter.getText().toString())
                && buttonTopRight.getText().toString().equals(buttonBottomLeft.getText().toString())){
            DisableButtons();
            textView.setText(CurrPlayer + "'s Win!");
        }
        else if (!buttonCenter.getText().toString().equals("Button")
                && buttonCenter.getText().toString().equals(buttonTopMiddle.getText().toString())
                && buttonCenter.getText().toString().equals(buttonBottomMiddle.getText().toString())){
            DisableButtons();
            textView.setText(CurrPlayer + "'s Win!");
        }
        else if (!buttonBottomMiddle.getText().toString().equals("Button")
                && buttonBottomMiddle.getText().toString().equals(buttonCenter.getText().toString())
                && buttonBottomMiddle.getText().toString().equals(buttonTopMiddle.getText().toString())){
            DisableButtons();
            textView.setText(CurrPlayer + "'s Win!");
        }
        else if(TieGame() == true){
            DisableButtons();
            textView.setText("Tie Game!");
        }
        else{
            ChangeTurn();
        }
    }

    private boolean TieGame() {
        if (!buttonTopLeft.getText().toString().equals("Button")
                && !buttonTopMiddle.getText().toString().equals("Button")
                && !buttonTopRight.getText().toString().equals("Button")
                && !buttonMiddleLeft.getText().toString().equals("Button")
                && !buttonCenter.getText().toString().equals("Button")
                && !buttonMiddleRight.getText().toString().equals("Button")
                && !buttonBottomLeft.getText().toString().equals("Button")
                && !buttonBottomMiddle.getText().toString().equals("Button")
                && !buttonBottomRight.getText().toString().equals("Button")){
            return true;
        }
        return false;
    }

    private void DisableButtons() {
        buttonTopLeft.setEnabled(false);
        buttonTopMiddle.setEnabled(false);
        buttonTopRight.setEnabled(false);
        buttonMiddleLeft.setEnabled(false);
        buttonCenter.setEnabled(false);
        buttonMiddleRight.setEnabled(false);
        buttonBottomLeft.setEnabled(false);
        buttonBottomMiddle.setEnabled(false);
        buttonBottomRight.setEnabled(false);
    }

    private void NewGame(){
        CurrPlayer = PLAYER1;
        textView.setText(CurrPlayer + "'s Turn");
    }
}
