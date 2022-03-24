package com.example.karaoke;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

import adapter.DanhBaAdapter;
import model.DanhBa;

public class MainActivity extends AppCompatActivity {

    private ArrayList<DanhBa> listSDT;
    private ArrayAdapter<DanhBa> adapter;
//    private DanhBaAdapter adapter;
    GridView grvDanhBa;
    EditText edtName,edtPhone;
    Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName = (EditText) findViewById(R.id.edtTen);
        edtPhone = (EditText) findViewById(R.id.edtSDT);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        grvDanhBa = (GridView)findViewById(R.id.grdDanhBa);

        fakeData();
        addControls();
    }

    private void addControls() {
//        adapter = new DanhBaAdapter(MainActivity.this, R.layout.item,listSDT);
//        grvDanhBa.setAdapter(adapter);
        int x = 12;
        int y =15;
        String z = "chinh213";
        adapter = new ArrayAdapter<DanhBa>(this, android.R.layout.simple_list_item_1,listSDT);
        grvDanhBa.setAdapter(adapter);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    private void fakeData() {
        listSDT = new ArrayList<DanhBa>();
        listSDT.add(new DanhBa("User1","123456789"));
        listSDT.add(new DanhBa("User2","0948291344"));
        listSDT.add(new DanhBa("User3","0483928123"));
        listSDT.add(new DanhBa("User4","123456789"));
        listSDT.add(new DanhBa("User5","123456789"));
        listSDT.add(new DanhBa("User6","123456789"));
    }



}