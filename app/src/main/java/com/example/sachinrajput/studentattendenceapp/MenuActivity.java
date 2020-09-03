package com.example.sachinrajput.studentattendenceapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends Activity {

    Button addstudent;
    Button viewstudent;
    Button attendenceperstd;
    Button addfaculty;
    Button viewfaculty;
    Button logoutbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        addstudent = (Button) findViewById(R.id.buttonaddstudent);
        viewstudent = (Button) findViewById(R.id.buttonViewstudent);
        attendenceperstd = (Button) findViewById(R.id.attendancePerStudentButton);
        addfaculty = (Button) findViewById(R.id.buttonaddfaculty);
        viewfaculty = (Button) findViewById(R.id.buttonviewfaculty);
        logoutbtn = (Button) findViewById(R.id.buttonlogout);

        addstudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MenuActivity.this,AddStudentActivity.class);
                startActivity(intent);

            }
        });
        viewstudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MenuActivity.this,ViewStudentActivity.class);
                startActivity(intent);
            }
        });
        attendenceperstd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MenuActivity.this,ViewAttendenceperStudentActivity.class);
                startActivity(intent);
            }

        });

        addfaculty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MenuActivity.this,AddFacultyActivity.class);
                startActivity(intent);
            }
        });
        viewfaculty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MenuActivity.this,ViewFacultyActivity.class);
                startActivity(intent);
            }
        });

        logoutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MenuActivity.this,MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }
        });
    }

}
