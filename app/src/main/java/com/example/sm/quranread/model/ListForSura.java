package com.example.sm.quranread.model;

import com.google.gson.annotations.SerializedName;

public class ListForSura {

    @SerializedName("name")
    private String name;
    @SerializedName("englishName")
    private String englishname;
    @SerializedName("englishNameTranslation")
    private String englishNameTranslation;
    @SerializedName("numberOfAyahs")
    private int numberOfAyahs;
    @SerializedName("revelationType")
    private String revelationType;

    public int getNumber() {
        return number;
    }

    @SerializedName("number")

    private int number;


    public String getName() {
        return name;
    }

    public String getEnglishNameTranslation() {
        return englishNameTranslation;
    }

    public int getNumberOfAyahs() {
        return numberOfAyahs;
    }

    public String getRevelationType() {
        return revelationType;
    }

    public String getEnglishname() {

        return englishname;
    }
}
