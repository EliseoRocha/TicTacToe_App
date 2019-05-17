package com.example.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;
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
    Boolean GameOver = false;
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
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonNewGame:
                CurrPlayer = PLAYER1;
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
        if (CurrButton.getText().toString().equals(PLAYER1) || CurrButton.getText().toString().equals(PLAYER2)){

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
        if (buttonTopLeft.getText().toString().equals(buttonTopMiddle.getText().toString())
                && buttonTopLeft.getText().toString().equals(buttonTopRight.getText().toString())){
            DisableButtons();
            textView.setText(CurrPlayer + "'s Win!");
        }
        else{
            ChangeTurn();
        }
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
}
