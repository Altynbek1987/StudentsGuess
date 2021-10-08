package com.example.studentsguess;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.studentsguess.data.GameModel;

public class GameFragment extends Fragment {
    ImageView imageOne,imageTwo,imageThree,imageFour;
    TextView tvTitle;
    GameModel gameModel;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_game, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tvTitle = view.findViewById(R.id.tv_title);
        imageOne = view.findViewById(R.id.image_one);
        imageTwo = view.findViewById(R.id.image_two);
        imageThree = view.findViewById(R.id.image_three);
        imageFour = view.findViewById(R.id.image_four);
        dataFromLevelFragment();
    }

    private void dataFromLevelFragment() {
        assert getArguments() != null;
        gameModel = (GameModel) getArguments().getSerializable("model");
        tvTitle.setText(gameModel.getLevel());
        Glide.with(imageOne).load(gameModel.getImageAddressFirst()).into(imageOne);
        Glide.with(imageTwo).load(gameModel.getImageAddressSecond()).into(imageTwo);
        Glide.with(imageThree).load(gameModel.getImageAddressThird()).into(imageThree);
        Glide.with(imageFour).load(gameModel.getImageAddressFour()).into(imageFour);
    }
}