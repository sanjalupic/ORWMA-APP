package com.example.project_rma;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView mLog;
    EditText name, pass1 ;
    Button btnLog;
    Button btnNew;

    String mail;
    String password1;

    BaseAdapter baseAdapter;
    DataUser userData;

    String pass2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLog=(TextView)findViewById(R.id.tvLog);
        name = (EditText)findViewById(R.id.etName);
        pass1 = (EditText)findViewById(R.id.etPass);
        btnLog = (Button)findViewById(R.id.btnLog);
        btnNew = (Button)findViewById(R.id.btnNew);


        baseAdapter = new BaseAdapter(this);

        btnNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SignUp.class);
                startActivity(intent);
            }
        });

        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mail = name.getText().toString();
                password1 = pass1.getText().toString();

                userData = baseAdapter.getUser(mail);
                pass2 = userData.getPassword();
                //Toast.makeText(getBaseContext(), password1,Toast.LENGTH_LONG).show();
                if(password1.equals(pass2)) {
                    Intent intent = new Intent(MainActivity.this, ContentPage.class);
                    startActivity(intent);
                }
                else
                    Toast.makeText(getBaseContext(), "Wrong password.", Toast.LENGTH_LONG).show();
            }
        });
    }
}