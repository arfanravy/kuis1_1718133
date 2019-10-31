package com.example.kuis1_mobile_1718133;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private keluargaAdapter adapter;
    private ArrayList<keluarga> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView)findViewById(R.id.recyclerview);

        adapter = new keluargaAdapter(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new keluarga("Ojo Sutarjo ", "AYAH", getDrawable(R.drawable.bapak)));
        mahasiswaArrayList.add(new keluarga("Nur Indahyati", "IBU", getDrawable(R.drawable.ibu)));
        mahasiswaArrayList.add(new keluarga("M Arfan Ravy W P", "Anak Pertama", getDrawable(R.drawable.ravyy)));
    }
}
