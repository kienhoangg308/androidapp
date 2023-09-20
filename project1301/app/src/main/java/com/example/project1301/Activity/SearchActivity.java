package com.example.project1301.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.project1301.Helper.ManagmentCart;
import com.example.project1301.R;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        bottomNavigation();
    }

    private void bottomNavigation() {
        LinearLayout homeBtn=findViewById(R.id.homeBtn);
        LinearLayout cartBtn=findViewById(R.id.cartBtn);
        LinearLayout searchBtn=findViewById(R.id.searchBtn);

        homeBtn.setOnClickListener(v -> startActivity(new Intent(SearchActivity.this,MainActivity.class)));

        cartBtn.setOnClickListener(v -> startActivity(new Intent(SearchActivity.this,CartActivity.class)));

    }


}
