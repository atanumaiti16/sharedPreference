package com.example.atanu.sharedpreference;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.content.SharedPreferences;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username , password;
    Button login;
    SharedPreferences SP;

    SharedPreferences.Editor editor;
    Boolean saveLogin;
    CheckBox saveLoginCheckbox;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.et_username);
        password = (EditText) findViewById(R.id.et_password);
        login = (Button) findViewById(R.id.btn_login);

        SP = getSharedPreferences("loginref",MODE_PRIVATE);
        saveLoginCheckbox = findViewById(R.id.cb_remember);

        editor = SP.edit();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // loginfunc();

            }
        });

        saveLogin = SP.getBoolean("savelogin",true);
        if(saveLogin == true){
            username.setText(SP.getString("username",null));
            password.setText(SP.getString("password",null));
        }


        public void loginfunc() {
//            String user = username.getText().toString();
//            String  pass = password.getText().toString();
//
//            if(user.equals("Atanu")&& pass.equals("1234")){
//                Intent i = new Intent(MainActivity.this, SecondActivity.class);
//                startActivity(i);
//
//                if(saveLoginCheckbox.isChecked()){
//                    editor.putBoolean("savelogin",true);
//                    editor.putString("username",user);
//                    editor.putString("password",pass);
//                    editor.commit();
//
//                }
//                else{
//                    Toast.makeText(this, "username and password will not be saved",Toast.LENGTH_SHORT).show();
//                }
//
//
//            }
        }




    }
}
