package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class cartdata extends AppCompatActivity {

    RecyclerView recview;
    TextView rateview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cartdata);
        getSupportActionBar().hide();

        rateview = findViewById(R.id.rateview);
        getroomdata();
    }

    public void getroomdata(){
        AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "cart-db").allowMainThreadQueries().build();
        ProductDao productDao = db.productDao();

        recview = findViewById(R.id.recview);
        recview.setLayoutManager(new LinearLayoutManager(this));
        List<Product> products = productDao.getallproducts();

        myadapter adapter = new myadapter(products, rateview);
        recview.setAdapter(adapter);
        int sum =0;
        for (int i= 0; i <products.size() ; i++) {
            sum = sum+( products.get(i).getPrice()*products.get(i).getQnt() );

            rateview.setText("Total amount" +sum);
        }
    }
}