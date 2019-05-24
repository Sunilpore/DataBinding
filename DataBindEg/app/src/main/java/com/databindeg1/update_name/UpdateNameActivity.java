package com.databindeg1.update_name;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.databindeg1.R;
import com.databindeg1.databinding.ActivityMainBinding;

public class UpdateNameActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_update_name);

        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_update_name);

    }

}
