package com.example.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;

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

    String PLAYER1 = "X";
    String PLAYER2 = "O";
    String TURNCHECK = "Button";
    String CurrPlayer = PLAYER1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonTopLeft = (Button) findViewById(R.id.buttonTopLeft);
        buttonTopMiddle = (Button) findViewById(R.id.buttonTopMiddle);
        buttonTopRight = (Button) findViewById(R.id.buttonTopRight);
        buttonMiddleLeft = (Button) findViewById(R.id.buttonMiddleLeft);
        buttonCenter = (Button) findViewById(R.id.buttonCenter);
        buttonMiddleRight = (Button) findViewById(R.id.buttonMiddleRight);
        buttonBottomLeft = (Button) findViewById(R.id.buttonBottomLeft);
        buttonBottomMiddle = (Button) findViewById(R.id.buttonBottomMiddle);
        buttonBottomRight = (Button) findViewById(R.id.buttonBottomRight);
        buttonNewGame = (Button) findViewById(R.id.buttonNewGame);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonTopLeft:
                if (buttonTopLeft.getText().toString().equals(PLAYER1) || buttonTopLeft.getText().toString().equals(PLAYER2)){
                    break;
                }
                else if (CurrPlayer.equals(PLAYER1)){
                    buttonTopLeft.setText(PLAYER1);
                    CurrPlayer = PLAYER2;
                }
                else{
                    buttonTopLeft.setText(CurrPlayer);
                    CurrPlayer = PLAYER1;
                }
                break;
            case R.id.buttonTopMiddle:
                if (buttonTopMiddle.getText().toString().equals(PLAYER1) || buttonTopMiddle.getText().toString().equals(PLAYER2)){
                    break;
                }
                else if (CurrPlayer.equals(PLAYER1)){
                    buttonTopMiddle.setText(PLAYER1);
                    CurrPlayer = PLAYER2;
                }
                else{
                    buttonTopMiddle.setText(CurrPlayer);
                    CurrPlayer = PLAYER1;
                }
                break;
            case R.id.buttonTopRight:
                if (buttonTopRight.getText().toString().equals(PLAYER1) || buttonTopRight.getText().toString().equals(PLAYER2)){
                    break;
                }
                else if (CurrPlayer.equals(PLAYER1)){
                    buttonTopRight.setText(PLAYER1);
                    CurrPlayer = PLAYER2;
                }
                else{
                    buttonTopRight.setText(CurrPlayer);
                    CurrPlayer = PLAYER1;
                }
                break;
            case R.id.buttonMiddleLeft:
                if (buttonMiddleLeft.getText().toString().equals(PLAYER1) || buttonMiddleLeft.getText().toString().equals(PLAYER2)){
                    break;
                }
                else if (CurrPlayer.equals(PLAYER1)){
                    buttonMiddleLeft.setText(PLAYER1);
                    CurrPlayer = PLAYER2;
                }
                else{
                    buttonMiddleLeft.setText(CurrPlayer);
                    CurrPlayer = PLAYER1;
                }
                break;
            case R.id.buttonCenter:
                if (buttonCenter.getText().toString().equals(PLAYER1) || buttonCenter.getText().toString().equals(PLAYER2)){
                    break;
                }
                else if (CurrPlayer.equals(PLAYER1)){
                    buttonCenter.setText(PLAYER1);
                    CurrPlayer = PLAYER2;
                }
                else{
                    buttonCenter.setText(CurrPlayer);
                    CurrPlayer = PLAYER1;
                }
                break;
        }
    }
}
