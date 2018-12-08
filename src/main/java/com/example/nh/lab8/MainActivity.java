package com.example.nh.lab8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button1, button2, button3, button4, button5, button6, button7,button8, button9, reset;
    private TextView text;
    private  boolean crossWon = false;
    private boolean naughtWon = false;
    private  String flag = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        /*
        Button bEjemplo = (Button) findViewById(R.id.start);
        bEjemplo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button btn = (Button)findViewById(v.getId());
                btn.setText("Bienvenido");
                //Toast.makeText(this, "Bienvenidoa al juego", Toast.LENGTH_SHORT).show();
                // Do something here
            }
        });
        */
    }

    @Override
    public void onClick(View v){
        Button btn = (Button)findViewById(v.getId());

        switch (v.getId()) {
            case R.id.reset:
                button1.setText("");
                button2.setText("");
                button3.setText("");
                button4.setText("");
                button5.setText("");
                button6.setText("");
                button7.setText("");
                button8.setText("");
                button9.setText("");
                flag = "";
                break;
            default:
                placeObject(v.getId());
                /*
                if (btn.getText() != "X"){
                    btn.setText("X");
                }
                */
        }

    }

    private void placeObject(int id) {
        Button button = (Button)findViewById(id);

        if (button.getText().equals("") ) {
            if (flag == "") {
                flag = "X";
            } else if (flag == "X") {
                flag = "O";
            } else {
                flag = "X";
            }
            button.setText(flag);
        }

        String won = check();
        if (won.equals("X")){
            TextView tv = (TextView)findViewById(R.id.text);
            tv.setText("X won");
        }
        if (won.equals("O")) {
            TextView tv = (TextView)findViewById(R.id.text);
            tv.setText("O won");
        }
    }

    private String check(){
        String [][] mat;
        mat = new String[3][3];
        mat[0][0] = (String)button1.getText();
        mat[0][1] = (String)button2.getText();
        mat[0][2] = (String)button3.getText();
        mat[1][0] = (String)button4.getText();
        mat[1][1] = (String)button5.getText();
        mat[1][2] = (String)button6.getText();
        mat[2][0] = (String)button7.getText();
        mat[2][1] = (String)button8.getText();
        mat[2][2] = (String)button9.getText();

        for ( int row = 0; row < 3 ; row ++) {
            if( mat[row][0].equals("X") && mat[row][1].equals("X") && mat[row][2].equals("X") ) {
                return "X";
            }
            if (mat[row][0].equals("O") && mat[row][1].equals("O") && mat[row][2].equals("O") ) {
                return "O";
            }
        }

        for ( int colum = 0; colum < 3 ; colum ++) {
            if( mat[0][colum].equals("X") && mat[1][colum].equals("X") && mat[2][colum].equals("X") ) {
                return "X";
            }
            if (mat[0][colum].equals("O") && mat[1][colum].equals("O") && mat[2][colum].equals("O")) {
                return "O";
            }
        }

        for ( int i = 0; i < 3 ; i ++) {
            if (mat[i][i].equals("X") && mat[i][i].equals("X") && mat[i][i].equals("X")) {
                return "X";
            }
            if (mat[i][i].equals("O") && mat[i][i].equals("O") && mat[i][i].equals("O")) {
                return "O";
            }
        }

        for ( int i = 2; i >= 0 ; i --) {
            if (mat[i][i].equals("X") && mat[i][i].equals("X") && mat[i][i].equals("X")) {
                return "X";
            }
            if (mat[i][i].equals("O") && mat[i][i].equals("O") && mat[i][i].equals("O")) {
                    return "O";
            }
        }
        return "";

    }


    private void  initView(){
        this.button1 = (Button)findViewById(R.id.button1);
        this.button2 = (Button)findViewById(R.id.button2);
        this.button3 = (Button)findViewById(R.id.button3);
        this.button4 = (Button)findViewById(R.id.button4);
        this.button5 = (Button)findViewById(R.id.button5);
        this.button6 = (Button)findViewById(R.id.button6);
        this.button7 = (Button)findViewById(R.id.button7);
        this.button8 = (Button)findViewById(R.id.button8);
        this.button9 = (Button)findViewById(R.id.button9);
        this.reset = (Button)findViewById(R.id.reset);
        this.text = (TextView) findViewById(R.id.text);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        reset.setOnClickListener(this);
    }

    public void onClickBtnStart2(final View view) {
        Toast.makeText(this, "Bienvenidoa al juego", Toast.LENGTH_SHORT).show();
        //Button b2 = (Button)R.
        //System.out.println("clicked");
    }

}
