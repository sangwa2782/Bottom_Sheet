package com.ajayam.bottom_sheet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import com.ajayam.bottom_sheet.adapter.BottomSheetAdapter;
import com.ajayam.bottom_sheet.model.ArrayModel;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button showBottomSheet;
    private BottomSheetDialog bottomSheetDialog;

    ArrayList<ArrayModel> arrayModels = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        getSupportActionBar().hide();


        RecyclerView recyclerView = findViewById(R.id.rv_bottomSheet);
        showBottomSheet=findViewById(R.id.showBottomSheet);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        arrayModels.add(new ArrayModel("Ajay Kumar" ));
        arrayModels.add(new ArrayModel("Ajay Kumar" ));
        arrayModels.add(new ArrayModel("Ajay Kumar" ));
        arrayModels.add(new ArrayModel("Ajay Kumar" ));
        arrayModels.add(new ArrayModel("Ajay Kumar" ));
        arrayModels.add(new ArrayModel("Ajay Kumar" ));
        arrayModels.add(new ArrayModel("Ajay Kumar" ));
        arrayModels.add(new ArrayModel("Ajay Kumar" ));
        arrayModels.add(new ArrayModel("Ajay Kumar" ));



        showBottomSheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                bottomSheetDialog=new BottomSheetDialog(MainActivity.this,R.style.BottomSheetTheme);
                View sheetview = LayoutInflater.from(getApplicationContext()).inflate(R.layout.bottomsheetlayout, null);

                BottomSheetAdapter adapter = new BottomSheetAdapter(this, arrayModels);
                recyclerView.setAdapter(adapter);

                bottomSheetDialog.setContentView(sheetview);
                bottomSheetDialog.show();

            }
        });

    }
}