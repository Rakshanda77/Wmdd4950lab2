package com.example.basicuilab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = findViewById(R.id.main_button);
        b.setOnClickListener(new View.OnClickListener() {
            int[] cards = new int[52];
            String names[] = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Ace", "Jack", "Queen", "King"};
            String category[] = {"Heart", "Diamond", "Clubes", "Spades"};
            int flag = 52;

            @Override
            public void onClick(View view) {
                TextView t1 = findViewById(R.id.textView);
                TextView t2 = findViewById(R.id.textView3);
                String name = "";
                String categories = "";


                for (int i = 0; i < cards.length; i++) {
                    cards[i] = i;
                }

                for (int i = 0; i < cards.length; i++) {
                    int number = (int) (Math.random() * cards.length);
                    int swap = cards[i];
                    cards[i] = cards[number];
                    cards[number] = swap;
                }

                for (int i = 0; i < cards.length; i++) {
                    name = names[cards[i] % 13];
                    categories = category[cards[i] / 13];

                    /* how to print this */


                }
                flag--;
                t1.setText(name + " " + "of" + " " + categories);
                if(flag >= 0) {
                    t2.setText("Card Remaining" + " :"+ " " + flag);
                }
                else{
                    flag = 51;
                    t2.setText("Card Remaining" + " :"+ " " + flag);

                }
              //  Toast.makeText(MainActivity.this, "Random Number!", Toast.LENGTH_SHORT).show();
               /* if(flag > 0){
                    t2.setText(flag);
                }
                else{
                    flag = 52;

                }*/

            }
        });


    }

}


