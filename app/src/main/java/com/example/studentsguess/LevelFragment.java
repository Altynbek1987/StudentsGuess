package com.example.studentsguess;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.example.studentsguess.adapter.LevelAdapter;
import com.example.studentsguess.data.GameModel;
import com.example.studentsguess.interf.OnItemClickListener;

import java.util.ArrayList;
import java.util.List;


public class LevelFragment extends Fragment {
    RecyclerView recyclerView;
    LevelAdapter levelAdapter;
    List<GameModel> list = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        LevelFragment fragment = new LevelFragment();
        Bundle bundle = new Bundle();
        bundle.getSerializable("model");
        if (getArguments() != null){
            fragment.setArguments(bundle);
        }
        return inflater.inflate(R.layout.fargment_level, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recycler_view_ma);
        levelAdapter = new LevelAdapter(list);
        recyclerView.setAdapter(levelAdapter);
        getList();
        click();
    }

//    @Override
//    public void onStop() {
//        super.onStop();
//        levelAdapter.setList(list);
//    }
    public void getList() {
        List<GameModel> list = (List<GameModel>) getArguments().getSerializable("model");
        levelAdapter.addData(list);
    }

    private void click() {
        levelAdapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(GameModel gameModel) {
                Bundle bundle = new Bundle();
                bundle.putSerializable("model", gameModel);
                GameFragment fragment = new GameFragment();
                fragment.setArguments(bundle);
                getParentFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container_fragment, fragment).addToBackStack("GameFragment")
                        .commit();
            }
        });
    }
}
