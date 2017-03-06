package com.example.hjh.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by HJH on 2017/3/3 0003.
 */
public class UserBean implements Parcelable {
    private  String name;
    private String password;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.password);
    }

    public UserBean() {
    }

    protected UserBean(Parcel in) {
        this.name = in.readString();
        this.password = in.readString();
    }

    public static final Parcelable.Creator<UserBean> CREATOR = new Parcelable.Creator<UserBean>() {
        @Override
        public UserBean createFromParcel(Parcel source) {
            return new UserBean(source);
        }

        @Override
        public UserBean[] newArray(int size) {
            return new UserBean[size];
        }
    };
}
