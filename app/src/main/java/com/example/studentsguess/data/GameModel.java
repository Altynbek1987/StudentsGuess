package com.example.studentsguess.data;

import java.io.Serializable;

public class GameModel implements Serializable {
    String level;
    String imageAddressFirst;
    String imageAddressSecond;
    String imageAddressThird;
    String imageAddressFour;
    String answer;

    public GameModel(String level, String imageAddressFirst, String imageAddressSecond, String imageAddressThird, String imageAddressFour, String answer) {
        this.level = level;
        this.imageAddressFirst = imageAddressFirst;
        this.imageAddressSecond = imageAddressSecond;
        this.imageAddressThird = imageAddressThird;
        this.imageAddressFour = imageAddressFour;
        this.answer = answer;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getImageAddressFirst() {
        return imageAddressFirst;
    }

    public void setImageAddressFirst(String imageAddressFirst) {
        this.imageAddressFirst = imageAddressFirst;
    }

    public String getImageAddressSecond() {
        return imageAddressSecond;
    }

    public void setImageAddressSecond(String imageAddressSecond) {
        this.imageAddressSecond = imageAddressSecond;
    }

    public String getImageAddressThird() {
        return imageAddressThird;
    }

    public void setImageAddressThird(String imageAddressThird) {
        this.imageAddressThird = imageAddressThird;
    }

    public String getImageAddressFour() {
        return imageAddressFour;
    }

    public void setImageAddressFour(String imageAddressFour) {
        this.imageAddressFour = imageAddressFour;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
