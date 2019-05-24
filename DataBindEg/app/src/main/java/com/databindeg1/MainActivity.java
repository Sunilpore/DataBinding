package com.databindeg1;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.databindeg1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ClickHandler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        Contact contact = new Contact("Captain","America");
        activityMainBinding.setContact(contact);

        setSupportActionBar(activityMainBinding.mainToolBar);

        handler = new ClickHandler(this);
        activityMainBinding.contentLay.setClickHandler(handler);

    }


    public class ClickHandler {

        private Context context;

        public ClickHandler(Context context) {
            this.context = context;
        }

        public void simpleButtonCLick(View view){
            Toast.makeText(context, "Button click", Toast.LENGTH_SHORT).show();
        }

        public boolean simpleButtonLongClick(View view){
            Toast.makeText(context, "Button Long click", Toast.LENGTH_SHORT).show();
            return false;
        }

        public void simpleButtonClickParam(View view,Contact contact){
            Toast.makeText(context, "Button click with Parameter \n"+
                    " First Name: "+contact.firstrName+"\n Last Name: "+contact.lastName,
                    Toast.LENGTH_SHORT).show();
        }

    }


}
