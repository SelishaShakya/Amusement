package com.example.buddy.amusement;

/**
 * Created by Buddy on 8/5/2016.
 */
public class GetDataAdapter {

    String amusement_name;
    String  amusement_photo;
    String amusement_address;
    double amusement_latitude;
    double amusement_longitude;
    int amusement_photo1;
    int amusement_type;
    String amusement_phone;
    String amusement_openingtime;
    String amusement_fee;

    public GetDataAdapter() {
    }

    public GetDataAdapter(String amusement_name, String amusement_address, String amusement_phone, int amusement_photo1, String amusement_openingtime, String amusement_fee, double amusement_latitude, double amusement_longitude, int amusement_type) {
        this.amusement_name = amusement_name;
        this.amusement_address = amusement_address;
        this.amusement_latitude = amusement_latitude;
        this.amusement_longitude = amusement_longitude;
        this.amusement_type = amusement_type;
        this.amusement_openingtime = amusement_openingtime;
        this.amusement_phone = amusement_phone;
        this.amusement_photo1 = amusement_photo1;
        this.amusement_fee = amusement_fee;
    }

    public String getAmusement_phone() {
        return amusement_phone;
    }

    public void setAmusement_phone(String amusement_phone) {
        this.amusement_phone = amusement_phone;
    }

    public String getAmusement_openingtime() {
        return amusement_openingtime;
    }

    public void setAmusement_openingtime(String amusement_openingtime) {
        this.amusement_openingtime = amusement_openingtime;
    }

    public String getAmusement_fee() {
        return amusement_fee;
    }

    public void setAmusement_fee(String amusement_fee) {
        this.amusement_fee = amusement_fee;
    }

    public int getAmusement_type() {
        return amusement_type;
    }

    public void setAmusement_type(int amusement_type) {
        this.amusement_type = amusement_type;
    }

    public String getAmusement_name() {
        return amusement_name;
    }

    public void setAmusement_name(String amusement_name) {
        this.amusement_name = amusement_name;
    }

    public String getAmusement_address() {
        return amusement_address;
    }

    public void setAmusement_address(String amusement_address) {
        this.amusement_address = amusement_address;
    }

    public String getAmusement_photo() {
        return amusement_photo;
    }

    public void setAmusement_photo(String amusement_photo) {
        this.amusement_photo = amusement_photo;
    }

    public double getAmusement_latitude() {
        return amusement_latitude;
    }

    public void setAmusement_latitude(double amusement_latitude) {
        this.amusement_latitude = amusement_latitude;
    }

    public double getAmusement_longitude() {
        return amusement_longitude;
    }

    public void setAmusement_longitude(double amusement_longitude) {
        this.amusement_longitude = amusement_longitude;
    }

    public int getAmusement_photo1() {
        return amusement_photo1;
    }

    public void setAmusement_photo1(int amusement_photo1) {
        this.amusement_photo1 = amusement_photo1;
    }
}
