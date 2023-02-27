package com.example.swaadish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class spicebox extends AppCompatActivity {
    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spicebox);


        button = (Button) findViewById(R.id.half_tiffin);
        button.setOnClickListener(new View.OnClickListener(){



                                      @Override
                                      public void onClick(View v) {


                                          Intent intent =new Intent(spicebox.this, payment.class);
                                          startActivity(intent);

                                      }
                                  }

        );

        TextView halfprice =findViewById(R.id.halfprice);
        TextView fullprice =findViewById(R.id.fullprice);

        button = (Button) findViewById(R.id.half_tiffin);
        button.setOnClickListener(new View.OnClickListener(){


                                      @Override
                                      public void onClick(View v) {

                                          String Value = halfprice.getText().toString();

                                          Intent intent =new Intent(spicebox.this, payment.class);
                                          intent.putExtra("abc", Value);
                                          startActivity(intent);

                                      }
                                  }

        );


        button = (Button) findViewById(R.id.full_tiffin);
        button.setOnClickListener(new View.OnClickListener(){


                                      @Override
                                      public void onClick(View v) {

                                          String Value2 = fullprice.getText().toString();


                                          Intent intent =new Intent(spicebox.this, payment.class);
                                          intent.putExtra("abc", Value2);
                                          startActivity(intent);

                                      }
                                  }

        );









    }
}