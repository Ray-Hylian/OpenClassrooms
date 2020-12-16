package com.openclassrooms.entrevoisins.ui.neighbour_list;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.openclassrooms.entrevoisins.R;
import com.openclassrooms.entrevoisins.di.DI;
import com.openclassrooms.entrevoisins.model.Neighbour;
import com.openclassrooms.entrevoisins.service.NeighbourApiService;

import butterknife.BindView;
import butterknife.ButterKnife;

public class InfosNeighbourActivity extends AppCompatActivity {

    @BindView(R.id.avatar_neighbour)
    ImageView avatarNeighbour;

    @BindView(R.id.name_avatar_neighbour)
    TextView nameAvatarNeighbour;

    @BindView(R.id.address)
    TextView address;

    @BindView(R.id.phoneNumber)
    TextView phoneNumber;

    @BindView(R.id.aboutMe)
    TextView aboutMe;

private NeighbourApiService mApiService;
private Neighbour mNeighbour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infos_neighbour);
        ButterKnife.bind(this);
        mApiService = DI.getNeighbourApiService();
        getNeighbour();
    }
    private void getNeighbour() {
        mNeighbour = getIntent().getParcelableExtra("Neighbour");
    }
}