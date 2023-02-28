package com.example.swaadish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class yummyfood extends AppCompatActivity {
    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yummyfood);


        button = (Button) findViewById(R.id.half_tiffin);
        button.setOnClickListener(new View.OnClickListener(){



                                      @Override
                                      public void onClick(View v) {


                                          Intent intent =new Intent(yummyfood.this, payment.class);
                                          startActivity(intent);

                                      }
                                  }

        );

        TextView halfprice =findViewById(R.id.halfprice);
        TextView fullprice =findViewById(R.id.fullprice);


        TextView servicename = findViewById(R.id.yummy_food);
        TextView tiffin_qty = findViewById(R.id.half_yummy);
        TextView tiffin_qtyff = findViewById(R.id.full_yummy);


        button = (Button) findViewById(R.id.half_tiffin);
        button.setOnClickListener(new View.OnClickListener(){


                                      @Override
                                      public void onClick(View v) {

                                          String Value = halfprice.getText().toString();
                                          String Value1 = servicename.getText().toString();
                                          String Value2 = tiffin_qty.getText().toString();

                                          Intent intent =new Intent(yummyfood.this, payment.class);
                                          intent.putExtra("abc", Value);
                                          intent.putExtra("bc", Value1);
                                          intent.putExtra("c", Value2);

                                          startActivity(intent);

                                      }
                                  }

        );


        button = (Button) findViewById(R.id.full_tiffin);
        button.setOnClickListener(new View.OnClickListener(){


                                      @Override
                                      public void onClick(View v) {

                                          String Value2 = fullprice.getText().toString();
                                          String Value1 = servicename.getText().toString();
                                          String Value3 = tiffin_qtyff.getText().toString();



                                          Intent intent =new Intent(yummyfood.this, payment.class);
                                          intent.putExtra("abc", Value2);
                                          intent.putExtra("bc", Value1);
                                          intent.putExtra("c", Value3);
                                          startActivity(intent);

                                      }
                                  }

        );



    }
}