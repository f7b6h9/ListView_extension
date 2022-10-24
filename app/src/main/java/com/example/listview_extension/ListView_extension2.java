package com.example.listview_extension;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

public class ListView_extension2 extends AppCompatActivity {
    ListView lvProgram2;
    String[] programName = {"Sườn nướng", "Gà kho", "Thịt kho trứng", "Nem nướng"};
    String[] programDescription = {"1","2","3","4"};
    int[] programImages = {R.drawable.suon_nuong, R.drawable.ga_kho, R.drawable.thit_kho_trung, R.drawable.nem_nuong};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_extension2);

        lvProgram2 = findViewById(R.id.lvProgram2);
        ProgramAdapter programAdapter = new ProgramAdapter(this, programName, programImages, programDescription);
        lvProgram2.setAdapter(programAdapter);
    }
}