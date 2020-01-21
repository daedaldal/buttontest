package com.example.buttontest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String myPW = "qwerty";
        final String myUN = "dalyyyyy";


        final TextView msg = findViewById(R.id.text);
        final Button btn = findViewById(R.id.butt1);
        final EditText Username = findViewById(R.id.username);
        final EditText Password = findViewById(R.id.password);
        final TextView msg1 = findViewById(R.id.msg1);

        msg.setText("Facebook");
        btn.setText("Sign-in");

        btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String typedPW = String.valueOf(Password.getText());
                        String typedUN = String.valueOf(Username.getText());

                        if (typedUN.equals(myUN) && typedPW.equalsIgnoreCase(myPW)) {
                            Toast.makeText(MainActivity.this,
                                    "You logged in successfully.",
                                    Toast.LENGTH_LONG).show();
                            msg1.setText("");
                        }
                        else {
                            Toast.makeText(MainActivity.this,
                                    "Your username or password is incorrect.",
                                    Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );


    }
}
