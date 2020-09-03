package com.example.sachinrajput.studentattendenceapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends Activity {
    Spinner spinner;
    EditText username;
    EditText password;
    Button login;
    String userrole;
    private String[] userRoleString = new String[]{"admin", "faculty"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        spinner = (Spinner) findViewById(R.id.spinnerloginas);
        username = (EditText) findViewById(R.id.editTextusername);
        password = (EditText) findViewById(R.id.editTextpassword);
        login = (Button) findViewById(R.id.buttonlogin);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                userrole = (String) spinner.getSelectedItem();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        ArrayAdapter<String> adapter_role = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, userRoleString);
        adapter_role.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter_role);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (userrole.equals("admin")) {
                    String user_name = username.getText().toString();
                    String user_pass= password.getText().toString();

                    if (TextUtils.isEmpty(user_name)){
                        username.setError("Invalid User Name");
                    }
                    else if (TextUtils.isEmpty(user_pass)){
                        password.setError("enter password");
                    }
                    else {


                        if (user_name.equals("admin")& user_pass.equals("admin123")){
                            Intent intent =new Intent(LoginActivity.this,MenuActivity.class);
                            startActivity(intent);
                            Toast.makeText(LoginActivity.this, "Log in successful", Toast.LENGTH_SHORT).show();
                        }else {
                            Toast.makeText(LoginActivity.this, "log in failed", Toast.LENGTH_SHORT).show();
                        }
                    }

                }

            }
        });
    }

}
