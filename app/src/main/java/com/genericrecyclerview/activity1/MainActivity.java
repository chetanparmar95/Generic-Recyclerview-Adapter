package com.genericrecyclerview.activity1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.genericrecyclerview.R;
import com.genericrecyclerview.adapter.BaseAdapter;
import com.genericrecyclerview.model.Model1;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements OnUserClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Model1> data = new ArrayList<>();
        data.add(new Model1("Chetan"));
        data.add(new Model1("Agam"));
        data.add(new Model1("Dhrumil"));
        data.add(new Model1("Vishal"));

        RecyclerView recyclerView = findViewById(R.id.rv);
        LinearLayoutManager lm = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(lm);
        recyclerView.setAdapter(new BaseAdapter<>(R.layout.row_test,data,this));
    }

    @Override
    public void onUserClicked(String username) {
        Toast.makeText(this, username, Toast.LENGTH_SHORT).show();
    }
}
