package com.example.swaadish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class payment extends AppCompatActivity {

    public Button button;






    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        TextView servicee = findViewById(R.id.rest_anna);
        TextView tiffinn_qty = findViewById(R.id.tiffin_qty);






        TextView subtotal = findViewById(R.id.sub_total);
        Bundle bn = getIntent().getExtras();
        String name = bn.getString("abc");
        subtotal.setText(String.valueOf(name));

        String name2 = bn.getString("bc");
        servicee.setText(String.valueOf(name2));

        String name3 = bn.getString("c");
        tiffinn_qty.setText(String.valueOf(name3));




        Button submitt = findViewById(R.id.cash);



        button = (Button) findViewById(R.id.cash);
        button.setOnClickListener(new View.OnClickListener(){


                                      @Override
                                      public void onClick(View v) {
                                          Intent intent =new Intent(payment.this, orderConfirmed.class);
                                          startActivity(intent);




                                      }
                                  }

        );

        button = (Button) findViewById(R.id.card);
        button.setOnClickListener(new View.OnClickListener(){


                                      @Override
                                      public void onClick(View v) {
                                          Intent intent =new Intent(payment.this, cardPayment.class);
                                          startActivity(intent);

                                      }
                                  }

        );





    }
}