package com.example.swaadish;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class manageMenu extends AppCompatActivity {

    EditText namee;
    Button btnadd;
    Spinner res_spinner;
    String year;

    DatabaseReference databaseRes;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_menu);

        databaseRes = FirebaseDatabase.getInstance().getReference("res");

        namee = (EditText) findViewById(R.id.name);
        btnadd = (Button) findViewById(R.id.addd);
        res_spinner = (Spinner) findViewById(R.id.r_spinner);

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addRes();
            }
        });

    }

    private void addRes(){
        String res_name = namee.getText().toString().trim();
        String ress = res_spinner.getSelectedItem().toString();

        
        if(!TextUtils.isEmpty(res_name)){

            String id = databaseRes.push().getKey();

            Restaurant restaurant = new Restaurant(res_name, ress );

            databaseRes.child(id).setValue(restaurant);
            Toast.makeText(this, "res added", Toast.LENGTH_SHORT).show();




            
        }
        else{
            Toast.makeText(this, "enter a name", Toast.LENGTH_SHORT).show();
        }

    }
}