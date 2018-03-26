package com.genericrecyclerview.activity2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.genericrecyclerview.R;
import com.genericrecyclerview.adapter.BaseAdapter;
import com.genericrecyclerview.model.Model2;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity implements OnUserClickListener {

    List<Model2> data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        data = new ArrayList<>();
        data.add(new Model2("Chetan"));
        data.add(new Model2("Agam"));
        data.add(new Model2("Dhrumil"));
        data.add(new Model2("Vishal"));

        RecyclerView recyclerView = findViewById(R.id.rv);
        LinearLayoutManager lm = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(lm);
        recyclerView.setAdapter(new BaseAdapter<>(R.layout.row_test2,data,this));
    }

    @Override
    public void onUserClicked(int position) {
        Toast.makeText(this, data.get(position).name, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onUserEditClicked(int position) {
        Toast.makeText(this, data.get(position).name+" Edit", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onUserDeleteClicked(int position) {
        Toast.makeText(this, data.get(position).name+" Delete", Toast.LENGTH_SHORT).show();
    }
}
