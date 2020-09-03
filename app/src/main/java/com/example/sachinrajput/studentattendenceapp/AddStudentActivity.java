package com.example.sachinrajput.studentattendenceapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class AddStudentActivity extends Activity {

    Button registerButton;
    EditText textFirstName;
    EditText textLastName;

    EditText txtcontact;
    EditText txtaddress;

    Spinner spinnerbranch,spinneryear;
    String userrole,branch,year;
    private String[]branchString=new String[]{"cse"};
    private String[]yearString=new String[]{"SE","TE","BE"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);
    }
}
