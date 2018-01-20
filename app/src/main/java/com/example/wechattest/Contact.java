package com.example.wechattest;

/**
 * Created by zhangsk on 1/20/18.
 */

public class Contact {
    private String nickName;
    private int photoId;

    public Contact(String nickName, int photoId) {
        this.nickName = nickName;
        this.photoId = photoId;
    }

    public int getPhotoId() {
        return photoId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }
}
