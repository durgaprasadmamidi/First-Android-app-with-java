package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void btnClicked(View view){
        EditText firstName = findViewById(R.id.firstNamePlnTxt);
        EditText lastName = findViewById(R.id.lastNamePlnTxt);
        EditText email = findViewById(R.id.emailPlnTxt);
        TextView firstNameTxt = findViewById(R.id.firstNameTxtView);
        TextView lastNameTxt = findViewById(R.id.lastNameTxtView);
        TextView emailTxt = findViewById(R.id.emailTxtView);

        firstNameTxt.setText("First Name : "+firstName.getText().toString());
        lastNameTxt.setText("Last Name : "+lastName.getText().toString());
        emailTxt.setText("Email : " + email.getText().toString());

    }
}
