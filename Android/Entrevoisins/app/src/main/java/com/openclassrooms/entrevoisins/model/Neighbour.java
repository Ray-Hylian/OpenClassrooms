package com.openclassrooms.entrevoisins.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Objects;

/**
 * Model object representing a Neighbour
 */
public class Neighbour implements Parcelable {

    /** Identifier */
    private long id;
    /** Full name */
    private String name;
    /** Avatar */
    private String avatarUrl;
    /** Adress */
    private String address;
    /** Phone number */
    private String phoneNumber;
    /** About me */
    private String aboutMe;
    /** fav or not */
    private boolean favoriteNeighbour;
    /** back button */

    /**
     *
     * @param id
     * @param name
     * @param avatarUrl
     * @param address
     * @param phoneNumber
     * @param aboutMe
     * @param favoriteNeighbour
     */
    public Neighbour(long id, String name, String avatarUrl, String address,
                     String phoneNumber, String aboutMe, boolean favoriteNeighbour) {
        this.id = id;
        this.name = name;
        this.avatarUrl = avatarUrl;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.aboutMe = aboutMe;
        this.favoriteNeighbour = favoriteNeighbour;}


    protected Neighbour(Parcel in) {
        id = in.readLong();
        name = in.readString();
        avatarUrl = in.readString();
        address = in.readString();
        phoneNumber = in.readString();
        aboutMe = in.readString();
        favoriteNeighbour = in.readByte() != 0;}


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Neighbour neighbour = (Neighbour) o;
        return Objects.equals(id, neighbour.id); }


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(id);
        dest.writeString(name);
        dest.writeString(avatarUrl);
        dest.writeString(address);
        dest.writeString(phoneNumber);
        dest.writeString(aboutMe);
        dest.writeByte((byte) (favoriteNeighbour ? 1 : 0));}


    @Override
    public int describeContents() {return 0;}

    public static final Creator<Neighbour> CREATOR = new Creator<Neighbour>() {
        @Override
        public Neighbour createFromParcel(Parcel in) {
            return new Neighbour(in);}
        @Override
        public Neighbour[] newArray(int size) {
            return new Neighbour[size];}};


    public long getId() {return id;}
    public void setId(long id) {this.id = id;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getAvatarUrl() {return avatarUrl;}
    public void setAvatarUrl(String avatarUrl) {this.avatarUrl = avatarUrl;}

    public String getAddress() {return address;}
    public void setAddress(String address) {this.address = address;}

    public String getPhoneNumber() {return phoneNumber;}
    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}

    public String getAboutMe() {return aboutMe;}
    public void setAboutMe(String aboutMe) {this.aboutMe = aboutMe;}

    public boolean isFavoriteNeighbour() {return favoriteNeighbour;}
    public void setFavoriteNeighbour(boolean favoriteStatus) {this.favoriteNeighbour = favoriteStatus;}
/*
    @Override
    public String toString() {
        return "Neighbour{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", avatarUrl='" + avatarUrl + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", aboutMe='" + aboutMe + '\'' +
                ", favoriteNeighbour=' " + favoriteNeighbour + '\'' +
                '}';
    }

 */
}
