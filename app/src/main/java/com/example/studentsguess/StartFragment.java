package com.example.studentsguess;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.studentsguess.data.GameModel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class StartFragment extends Fragment {
    Button btnStart, btnExit;
    List<GameModel> list = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        GameFragment fragment = new GameFragment();
//        Bundle bundle = new Bundle();
//        bundle.getSerializable("model");
//        gameList = GameClient.getGame();
//        if (getArguments() != null){
//            fragment.setArguments(bundle);
//        }
        return inflater.inflate(R.layout.fragment_start, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btnStart = view.findViewById(R.id.btn_start);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendArrayModel();
            }
        });


//        if (getArguments() != null) {
//            Glide.with(imageOne).load(gameList).circleCrop().into(imageOne);
//        }
    }
    private void sendArrayModel() {
        GameModel model1 = new GameModel("One",
                "https://static.dw.com/image/48299247_303.jpg",
                "https://cdn-st1.rtr-vesti.ru/vh/pictures/xw/214/550/3.jpg",
                "https://icdn.lenta.ru/images/2019/10/23/14/20191023144102516/square_320_7f4e7ebca6193a6af0eeb414b58bdce0.jpg",
                "https://bigasia.ru/upload/iblock/b03/b034e5975ae5a1b118386b9858a581a4.png",
                "Сноуден");
        GameModel model2 = new GameModel("Two",
                "https://static.dw.com/image/48299247_303.jpg",
                "https://cdn-st1.rtr-vesti.ru/vh/pictures/xw/214/550/3.jpg",
                "https://icdn.lenta.ru/images/2019/10/23/14/20191023144102516/square_320_7f4e7ebca6193a6af0eeb414b58bdce0.jpg",
                "https://bigasia.ru/upload/iblock/b03/b034e5975ae5a1b118386b9858a581a4.png",
                "Сноуден");

        list.add(model1);
        list.add(model2);

        Bundle bundle = new Bundle();
        bundle.putSerializable("model", (Serializable) list);
        LevelFragment fragment = new LevelFragment();
        fragment.setArguments(bundle);

        getParentFragmentManager()
                .beginTransaction()
                .replace(R.id.container_fragment, fragment)
                .commit();
    }
}
