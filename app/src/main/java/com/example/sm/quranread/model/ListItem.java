package com.example.sm.quranread.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class ListItem {


    @SerializedName("data")
    public ArrayList<ListForSura> listForSura;
}
