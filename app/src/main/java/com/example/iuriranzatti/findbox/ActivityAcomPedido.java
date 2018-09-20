package com.example.iuriranzatti.findbox;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class ActivityAcomPedido extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acom_pedido);

        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_navigation_menu);
    }



    //Aqui ativa o menu hambuguer
//    ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this,
//            drawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close) {
//
//        @Override
//        public void onDrawerClosed(View v) {
//            super.onDrawerClosed(v);
//        }
//
//        @Override
//        public void onDrawerOpened(View v) {
//            super.onDrawerOpened(v);
//        }
//    };

//        drawerLayout.addDrawerListener(actionBarDrawerToggle);
//        actionBarDrawerToggle.syncState();
}
