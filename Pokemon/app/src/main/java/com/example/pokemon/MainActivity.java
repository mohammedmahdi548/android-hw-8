package com.example.pokemon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<pokemon> myPokemons =new ArrayList<>();

        pokemon p1 = new pokemon("Sandslash", R.drawable.sandslash,100,110,450);
        pokemon p2 = new pokemon("Psyduck", R.drawable.psyduck,52,48,320);
        pokemon p3 = new pokemon("Kadabra", R.drawable.kadabra,35,30,400);
        pokemon p4 = new pokemon("Haunter", R.drawable.haunter,45,50,405);

        myPokemons.add(p1);
        myPokemons.add(p2);
        myPokemons.add(p3);
        myPokemons.add(p4);

        //Manging
        RecyclerView rc = findViewById(R.id.RecyclerView);
        rc.setHasFixedSize(true);
        RecyclerView.LayoutManager man = new LinearLayoutManager(this);
        rc.setLayoutManager(man);

        Adapter adapter = new Adapter(myPokemons,this);
        rc.setAdapter(adapter);











    }
}