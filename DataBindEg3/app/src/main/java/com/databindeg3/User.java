package com.databindeg3;

import android.databinding.BindingAdapter;
import android.support.v4.content.ContextCompat;
import android.view.View;

import de.hdodenhof.circleimageview.CircleImageView;

public class User {

    public String name, email;
    public int imageid;

    User(String name, String email, int imageid) {
        this.name = name;
        this.email = email;
        this.imageid = imageid;
    }

    @BindingAdapter("android:imageUrl")
    public static void loadImage(View view, int imageId) {

        CircleImageView circleImageView = (CircleImageView) view;
        circleImageView.setImageDrawable(ContextCompat.getDrawable(view.getContext(), imageId));
    }


}
