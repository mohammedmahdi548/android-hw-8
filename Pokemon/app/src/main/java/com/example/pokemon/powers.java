package com.example.pokemon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class powers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_powers);

        Bundle b = getIntent().getExtras();
       pokemon pok = (pokemon) b.getSerializable("pokemon");


        TextView name = findViewById(R.id.textView);
        TextView atk = findViewById(R.id.Attack);
        TextView def = findViewById(R.id.Defence);
        TextView tot = findViewById(R.id.Total);
        ImageView pic = findViewById(R.id.imageView2);


        name.setText(pok.getName());
        atk.setText(pok.getAttack()+"");
        def.setText(pok.getDefence()+"");
        tot.setText(pok.getTotal()+"");
        pic.setImageResource(pok.getImage());




    }
}