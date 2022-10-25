package com.example.listview_extension;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView lvProgram;
    String[] programName = {"Món mặn", "Món canh", "Món xào"};
    String[] programDescription = {"🍽️5 sản phẩm\n💲5 đang giảm giá","🍽️10 sản phẩm\n💲10 đang giảm giá","🍽️10 sản phẩm\n💲10 đang giảm giá"};
    int[] programImages = {R.drawable.mon_man, R.drawable.mon_canh, R.drawable.mon_xao};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvProgram = findViewById(R.id.lvProgram);
        ProgramAdapter programAdapter = new ProgramAdapter(this, programName, programImages, programDescription);
        lvProgram.setAdapter(programAdapter);

        lvProgram.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0) {
                    startActivity(new Intent(MainActivity.this, ListView_extension2.class));
                } else {

                }
            }
        });
    }
}