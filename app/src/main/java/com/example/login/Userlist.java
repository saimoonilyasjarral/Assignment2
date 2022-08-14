package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;



    public class Userlist extends AppCompatActivity {
        MyApplication myApplication;
        List<ApplicationForm> applicationFormList;
        RecyclerView recyclerView;
        ArrayList<String> Studentname, rollno,semester;
        DBHelper DB;
        MyAdapter adapter;

        public Userlist() {
            myApplication = (MyApplication) this.getApplication();
        }

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_userlist);
            applicationFormList = myApplication.getCardFormList();
            DB = new DBHelper(this);
            Studentname = new ArrayList<>();
            rollno = new ArrayList<>();
            semester = new ArrayList<>();
            recyclerView = findViewById(R.id.recyclerview);
            adapter = new MyAdapter(applicationFormList, Userlist.this);
            recyclerView.setAdapter(adapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            displaydata();
        }
    private void displaydata()
    {
        Cursor cursor = DB.getdata();
        if(cursor.getCount()==0)
        {
            Toast.makeText(Userlist.this, "No Entry Exists", Toast.LENGTH_SHORT).show();
            return;
        }
        else
        {
            while(cursor.moveToNext())
            {
                Studentname.add(cursor.getString(0));
                rollno.add(cursor.getString(1));
                semester.add(cursor.getString(2));
            }
        }
    }
}
