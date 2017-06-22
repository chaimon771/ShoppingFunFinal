package example.haim.shoppingfun.models;

import com.google.firebase.auth.FirebaseUser;

/**
 * Created by DELL e7440 on 22/06/2017.
 */

public class User {
    //Properties
    private String uid;
    private String displayName;
    private String profileImage;


    //Empty Constructor

    public User() {
    }

    //Full Constructor
    public User(FirebaseUser user) {
        this.uid = user.getUid();
        this.displayName = user.getDisplayName();
        if (user.getPhotoUrl() != null)
            this.profileImage = user.getPhotoUrl().toString();
        else
            profileImage = "https://inomics.com/sites/default/files/pictures/picture-95970-1460131169.png";
    }

    //Getters & Setters
    public String getUid() {
        return uid;
    }
    public void setUid(String uid) {
        this.uid = uid;
    }
    public String getDisplayName() {
        return displayName;
    }
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
    public String getProfileImage() {
        return profileImage;
    }
    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    //toString
    @Override
    public String toString() {
        return "User{" +
                "uid='" + uid + '\'' +
                ", displayName='" + displayName + '\'' +
                ", profileImage='" + profileImage + '\'' +
                '}';
    }
}
