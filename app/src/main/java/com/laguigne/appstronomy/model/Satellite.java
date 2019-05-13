package com.laguigne.appstronomy.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by benoitpuech on 13/05/2019.
 */

public class Satellite implements Parcelable{

    private String name;
    private int size, rotation, revolution, planetDistance;

    public Satellite(String name, int size, int rotation, int revolution, int planetDistance)
    {
        this.name = name;
        this.size = size;
        this.rotation = rotation;
        this.revolution = revolution;
        this.planetDistance = planetDistance;
    }

    protected Satellite(Parcel in) {
        name = in.readString();
        size = in.readInt();
        rotation = in.readInt();
        revolution = in.readInt();
        planetDistance = in.readInt();
    }

    public static final Creator<Satellite> CREATOR = new Creator<Satellite>() {
        @Override
        public Satellite createFromParcel(Parcel in) {
            return new Satellite(in);
        }

        @Override
        public Satellite[] newArray(int size) {
            return new Satellite[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(size);
        dest.writeInt(rotation);
        dest.writeInt(revolution);
        dest.writeInt(planetDistance);
    }
}
