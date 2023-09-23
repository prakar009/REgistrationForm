package com.example.plogin;


import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.plogin.Adapters.recipeAdapter;
import com.example.plogin.Models.recipeModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.RV2);
        ArrayList <recipeModel> list = new ArrayList<>();
        list.add(new recipeModel(R.drawable.bb, "Burger"));
        list.add(new recipeModel(R.drawable.cc, "Burger"));
        list.add(new recipeModel(R.drawable.bbb, "Burger"));
        list.add(new recipeModel(R.drawable.cc, "Burger"));
        list.add(new recipeModel(R.drawable.blogg, "Burger"));
        list.add(new recipeModel(R.drawable.c, "Burger"));
        list.add(new recipeModel(R.drawable.aa, "Burger"));



        recipeAdapter adapter = new recipeAdapter(list, this);
        recyclerView.setAdapter(adapter);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(gridLayoutManager);


//        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true);
//        recyclerView.setLayoutManager(layoutManager);
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(layoutManager);




        recyclerView = findViewById(R.id.RV1);
        ArrayList <recipeModel> list2 = new ArrayList<>();
        list2.add(new recipeModel(R.drawable.bb, "Burger"));
        list2.add(new recipeModel(R.drawable.cc, "Burger"));
        list2.add(new recipeModel(R.drawable.bbb, "Burger"));
        list2.add(new recipeModel(R.drawable.cc, "Burger"));
        list2.add(new recipeModel(R.drawable.blogg, "Burger"));
        list2.add(new recipeModel(R.drawable.aa, "Burger"));



        recipeAdapter adapter2 = new recipeAdapter(list, this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true);
        recyclerView.setLayoutManager(layoutManager);
    }
}