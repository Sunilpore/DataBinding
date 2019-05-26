package com.databindeg2;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.databindeg2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    private User user;
    private ClickHandler clickHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        setSupportActionBar(activityMainBinding.updateActToolBar);

        user = new User();
        user.setFirstName("Sam");
        user.setLastName("Root");
        activityMainBinding.setUser(user);

        clickHandler = new ClickHandler(activityMainBinding.updateContentLay.firstName,activityMainBinding.updateContentLay.lastName);
        activityMainBinding.updateContentLay.setClickHandler(clickHandler);

    }


    public class ClickHandler {

        private EditText fName, lName;

        public ClickHandler(EditText fName, EditText lName) {
            this.fName = fName;
            this.lName = lName;
        }

        public void updateUser(View view){
            user.setFirstName(fName.getText().toString());
            user.setLastName(lName.getText().toString());
            fName.setText("");
            lName.setText("");
        }

    }

}
