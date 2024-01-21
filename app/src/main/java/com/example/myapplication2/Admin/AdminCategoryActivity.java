package com.example.myapplication2.Admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.myapplication2.MainActivity;
import com.example.myapplication2.R;

public class AdminCategoryActivity extends AppCompatActivity {

    private ImageView printer, cars, heli;
    private ImageView drone, plane;

    private Button LogoutBtn, CheckOrdersBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);


        LogoutBtn = (Button) findViewById(R.id.admin_logout_btn);
        CheckOrdersBtn = (Button) findViewById(R.id.check_orders_btn);



        LogoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });


//        CheckOrdersBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(AdminCategoryActivity.this, AdminNewOrdersActivity.class);
//                startActivity(intent);
//                finish();
//            }
//        });





        printer = (ImageView) findViewById(R.id.printer);
        cars = (ImageView) findViewById(R.id.cars);
        heli = (ImageView) findViewById(R.id.heli);
        drone = (ImageView) findViewById(R.id.drone);
        plane = (ImageView) findViewById(R.id.plane);


        printer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "3d-Printers");
                startActivity(intent);
            }
        });


        cars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "RC Cars");
                startActivity(intent);
            }
        });


        heli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "RC Helicopters");
                startActivity(intent);
            }
        });


        drone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Drones");
                startActivity(intent);
            }
        });


        plane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "RC Planes");
                startActivity(intent);
            }
        });

    }
}

