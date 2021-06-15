package com.example.project_rma;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignUp extends AppCompatActivity {

    TextView mtvSig;
    EditText metName2, metPass2;
    Button btnSig;

    String name, password;

    BaseAdapter baseAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        initialUI();


        baseAdapter = new BaseAdapter(this);
    }

    private void initialUI() {

        mtvSig = (TextView) findViewById(R.id.tvSig);
        metName2 = (EditText) findViewById(R.id.etName2);
        metPass2 = (EditText) findViewById(R.id.etPass2);
        btnSig = (Button) findViewById(R.id.btnSig);


        btnSig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name=metName2.getText().toString();
                password=metPass2.getText().toString();
                if(name==null){
                    Context context=getApplicationContext();
                    Toast toast = Toast.makeText(context, "Insert your mail. ", Toast.LENGTH_LONG );
                    return;
                }
                baseAdapter.insertUser(name, password);
                Intent intent= new Intent(SignUp.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}


