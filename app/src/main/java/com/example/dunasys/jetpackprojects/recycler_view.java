package com.example.dunasys.jetpackprojects;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class recycler_view extends AppCompatActivity {

    RecyclerView recyclerView;
    String[] mData = {"php","Java","C++","Android","Kotline","C","Content Provider","Test","gradle","Service","Options","NodeJs","Angilar-Js","JavaScript","Espresso","Mars","Pluto","Asteria","Techno-Centre","Youtube","Linked-In"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);




        recyclerView =(RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(mData,this));



    }




}
