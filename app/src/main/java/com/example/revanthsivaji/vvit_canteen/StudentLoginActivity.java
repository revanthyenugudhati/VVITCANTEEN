package com.example.revanthsivaji.vvit_canteen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StudentLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login);
    }

    public void login(View view) {
        Intent i=new Intent(StudentLoginActivity.this,ListActivity.class);
            startActivity(i);
    }
}
