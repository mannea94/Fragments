package com.example.manne.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by manne on 05.12.2017.
 */

public class Fragment3 extends Fragment {
    @BindView(R.id.imageView)
    ImageView imageView;
    private Unbinder mUnbinder;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment3, null);
        mUnbinder = ButterKnife.bind(this, view);
//        imageView.setImageResource(R.drawable.husky);
        Picasso.with(getActivity())
                .load("https://vignette4.wikia.nocookie.net/readyplayerone/images/0/09/Rubik%27s_Cube.png/revision/latest?cb=20120905191549")
                .fit()
                .centerInside()
                .into(imageView);
        return view;
    }
}
