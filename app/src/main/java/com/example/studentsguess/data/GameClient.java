package com.example.studentsguess.data;

import com.example.studentsguess.R;

import java.util.ArrayList;
import java.util.List;

public class GameClient {
    public static List<GameModel> list = new ArrayList<>();
    public static GameModel getBookByPosition(int position){
        return list.get(position);
    }

    public static List<GameModel> getGame(){
        list.add(new GameModel("One",
               "https://static.dw.com/image/48299247_303.jpg",
                "https://cdn-st1.rtr-vesti.ru/vh/pictures/xw/214/550/3.jpg",
                "https://icdn.lenta.ru/images/2019/10/23/14/20191023144102516/square_320_7f4e7ebca6193a6af0eeb414b58bdce0.jpg",
                "https://bigasia.ru/upload/iblock/b03/b034e5975ae5a1b118386b9858a581a4.png",
                "Сноуден"));
        list.add(new GameModel("Two",
                "https://static.dw.com/image/48299247_303.jpg",
                "https://cdn-st1.rtr-vesti.ru/vh/pictures/xw/214/550/3.jpg",
                "https://icdn.lenta.ru/images/2019/10/23/14/20191023144102516/square_320_7f4e7ebca6193a6af0eeb414b58bdce0.jpg",
                "https://bigasia.ru/upload/iblock/b03/b034e5975ae5a1b118386b9858a581a4.png",
                "Сноуден"));
        return list;
    }
    //https://static.dw.com/image/48299247_303.jpg
}
