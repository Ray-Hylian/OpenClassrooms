package com.openclassrooms.entrevoisins.ui.neighbour_list;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.openclassrooms.entrevoisins.R;
import com.openclassrooms.entrevoisins.di.DI;
import com.openclassrooms.entrevoisins.model.Neighbour;
import com.openclassrooms.entrevoisins.service.NeighbourApiService;

import butterknife.BindView;
import butterknife.ButterKnife;

public class InfosNeighbourActivity extends AppCompatActivity {

    @BindView(R.id.item_info_avatar)
    ImageView infoAvatar;
    @BindView(R.id.item_info_back_button)
    ImageButton infoBackButton;
    @BindView(R.id.item_avatar_name)
    TextView avatarName;
    @BindView(R.id.item_info_name)
    TextView infoName;
    @BindView(R.id.item_info_address)
    TextView infoAddress;
    @BindView(R.id.item_info_phone_number)
    TextView infoPhoneNumber;
    @BindView(R.id.item_info_web_address)
    TextView infoWebAddress;
    @BindView(R.id.item_info_about_me)
    TextView aboutMe;

private NeighbourApiService mApiService;
private Neighbour mNeighbour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infos_neighbour);
        ButterKnife.bind(this);
        mApiService = DI.getNeighbourApiService();

        Neighbour neighbour = getIntent().getParcelableExtra("Neighbour");

        init(neighbour);

        infoBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    public void init(Neighbour neighbour){
        //display img missing
        avatarName.setText(neighbour.getName());
        infoName.setText(neighbour.getName());
        infoAddress.setText(neighbour.getAddress());
        infoPhoneNumber.setText(neighbour.getPhoneNumber());
        infoWebAddress.setText("www.facebook.fr/"+neighbour.getName().toLowerCase());
        aboutMe.setText(neighbour.getAboutMe());
    }
}