package com.example.studentsguess;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.example.studentsguess.data.GameClient;
import com.example.studentsguess.data.GameModel;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;


public class GameFragment extends Fragment {
    ImageView imageOne, imageTwo, imageThree, imageFour;
    GameModel gameModel;
    private List<GameModel> gameList = new ArrayList<>();
    int position;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        GameFragment fragment = new GameFragment();
        Bundle bundle = new Bundle();
        bundle.getSerializable("model");
        if (getArguments() != null){
            fragment.setArguments(bundle);

        }
        return inflater.inflate(R.layout.fragment_game, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        imageOne = view.findViewById(R.id.image_one);
        imageTwo = view.findViewById(R.id.image_two);
        imageThree = view.findViewById(R.id.image_three);
        imageFour = view.findViewById(R.id.image_four);

        if (gameModel != null) {
            Glide.with(imageOne).load(gameModel.getImageAddressFirst()).circleCrop().into(imageOne);
            Log.e("TAG", "onViewCreated: " + gameModel.getImageAddressFirst());
        }

    }
}
