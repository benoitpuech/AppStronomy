package com.laguigne.appstronomy.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by benoitpuech on 13/05/2019.
 */

public class Planet implements Parcelable{

    private String name, type;
    private int image, size, rotation, revolution, starDistance;
    private ArrayList<Satellite> satellites;


    public Planet(String name, String type, int image, int size, int rotation, int revolution, int starDistance, ArrayList<Satellite>satellites)
    {
        this.name = name;
        this.type = type;
        this.image = image;
        this.size = size;
        this.rotation = rotation;
        this.revolution = revolution;
        this.starDistance = starDistance;
        this.satellites = satellites;
    }


    protected Planet(Parcel in) {
    }

    public static final Creator<Planet> CREATOR = new Creator<Planet>() {
        @Override
        public Planet createFromParcel(Parcel in) {
            return new Planet(in);
        }

        @Override
        public Planet[] newArray(int size) {
            return new Planet[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }
}
