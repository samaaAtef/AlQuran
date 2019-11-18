package com.example.sm.quranread.model;

import com.google.gson.annotations.SerializedName;

public class Edition {

    /*"identifier": "quran-simple",
            "language": "ar",
            "name": "Simple",
            "englishName": "Simple",
            "format": "text",
            "type": "quran"*/
    @SerializedName("identifier")
    private String id;
    @SerializedName("language")
    private String language;
    @SerializedName("name")
    private String name;
    @SerializedName("englishName")
    private String englishName;
    @SerializedName("format")
    private String format;
    @SerializedName("type")
    private String type;

}
