package com.example.loginandregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText)findViewById(R.id.editTextUsername);
        Password = (EditText)findViewById(R.id.editTextPassword);
        Login = (Button)findViewById(R.id.btnLogin);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });
    }

    private void validate(String userName, String userPassword){
        if((userName.equals("Aditya"))&&(userPassword.equals("1234"))){
            Intent intent = new Intent(MainActivity.this, WelcomeActivity.class);

            Bundle b = new Bundle();
            b.putString(Constants.KEY_NAME,Name.getText().toString());
            intent.putExtras(b);

            startActivity(intent);
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Login Successful",
                    Toast.LENGTH_SHORT);
            toast.show();
        }
        else if((userName.equals(""))&&(userPassword.equals(""))){
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Enter UserName and Password",
                    Toast.LENGTH_SHORT);

            toast.show();
        }

        else if((userName.equals("Aditya"))&&(userPassword.equals(""))){
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Enter Password",
                    Toast.LENGTH_SHORT);

            toast.show();
        }
        else if((userName.equals(""))&&(userPassword.equals("1234"))){
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Enter UserName",
                    Toast.LENGTH_SHORT);

            toast.show();


        }

        else{
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Enter Valid Credentials",
                    Toast.LENGTH_SHORT);

            toast.show();
        }

    }
}