package com.databindeg3;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.databindeg3.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mainBinding;
    private RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        mainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        mainBinding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mainBinding.recyclerView.setHasFixedSize(true);
        adapter = new RecyclerAdapter(this,prepareUser());
        mainBinding.recyclerView.setAdapter(adapter);
    }

    private List<User> prepareUser(){

        List<String> names = Arrays.asList(getResources().getStringArray(R.array.names));
        List<String> emails = Arrays.asList(getResources().getStringArray(R.array.emails));
        int[] imageid = {R.drawable.smith, R.drawable.ramesh, R.drawable.james, R.drawable.rahul, R.drawable.meena, R.drawable.rupal};
        List<User> userNames = new ArrayList<>();

        int count=0;

        for(String name: names){
            userNames.add(new User(name,emails.get(count),imageid[count]));
            count++;
        }

    return userNames;
    }

}
