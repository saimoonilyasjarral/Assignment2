package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    EditText studentName, rollNo,  semester, department, program, dated, contact, subject;
    Button insert,view;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        insert = findViewById(R.id.btn_insert);
        view = findViewById(R.id.btn_view);
        studentName = findViewById(R.id.et_studentName);
        rollNo = findViewById(R.id.et_rollNo);
        semester = findViewById(R.id.et_semester);
        department = findViewById(R.id.et_department);
        program = findViewById(R.id.et_program);
        dated = findViewById(R.id.et_dated);
        contact = findViewById(R.id.et_contact);
        subject = findViewById(R.id.et_subject);
        DB = new DBHelper(this);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, Userlist.class));
            }
        });

        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String studentNameTXT = studentName.getText().toString();
                String rollNoTXT = rollNo.getText().toString();
                String semesterTXT = semester.getText().toString();
                String departmentTXT = department.getText().toString();
                String programTXT = program.getText().toString();
                String datedTXT = dated.getText().toString();
                String contactTXT = contact.getText().toString();
                String subjectTXT = subject.getText().toString();

                Boolean checkinsertdata  = DB.insertuserdata(studentNameTXT, rollNoTXT, semesterTXT, departmentTXT, programTXT, datedTXT, contactTXT, subjectTXT);
                if(checkinsertdata==true)
                {
                    Toast.makeText(HomeActivity.this, "New Entry Inserted", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(HomeActivity.this, "New Entry Not Inserted", Toast.LENGTH_SHORT).show();
                }

            }
        });




    }
}
