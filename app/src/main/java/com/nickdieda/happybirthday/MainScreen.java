package com.nickdieda.happybirthday;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;



public class MainScreen extends AppCompatActivity {
    LinearLayout addProduct,editItem,viewItems,deleteItem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main_screen);
    addProduct = findViewById(R.id.addItem);
    editItem = findViewById(R.id.editItem);
    viewItems = findViewById(R.id.viewItems);
    deleteItem = findViewById(R.id.deleteItem);



    addProduct.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
           // Toast.makeText(getApplicationContext(), "I have been clicked !!!",Toast.LENGTH_SHORT).show();
            startActivity(new Intent(getApplicationContext(),AddProduct.class));

           //Intent intent=new Intent(getApplicationContext(),AddProduct.class);
           //startActivity(intent);
        }
    });
    editItem.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(getApplicationContext(),Edit.class));
        }
    });


viewItems.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(getApplicationContext(),ViewItems.class));
    }
});
deleteItem.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
      startActivity(new Intent(getApplicationContext(),Delete.class));
    }
});

    }





    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }
}
