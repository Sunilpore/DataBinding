package com.databindeg2;

import android.databinding.BaseObservable;
import android.databinding.Bindable;


public class User extends BaseObservable {

    public String firstName, lastName;


    @Bindable
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);  //It is automatically generated class by databinding
    }

    @Bindable
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);  //It is automatically generated class by databinding
    }

}
