package com.example.sm.quranread.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Data {

    @SerializedName("name")
    private String name;
    @SerializedName("number")
    private int number;
    @SerializedName("englishName")
    private String englishname;
    @SerializedName("englishNameTranslation")
    private String englishNameTranslation;
    @SerializedName("numberOfAyahs")
    private int numberOfAyahs;
    @SerializedName("revelationType")
    private String revelationType;
    @SerializedName("ayahs")
    private ArrayList<Ayahs> ayahses;

    public ArrayList<Ayahs> getAyahses() {
        return ayahses;
    }

    @SerializedName("edition")
    private Edition edition;

}
