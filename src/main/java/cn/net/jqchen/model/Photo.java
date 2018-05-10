package cn.net.jqchen.model;

import java.util.Date;

public class Photo {
    private Integer photoId;

    private String owerId;

    private String photoName;

    private String photoUrl;

    private Date createTime;

    private String photoNote;

    public Integer getPhotoId() {
        return photoId;
    }

    public void setPhotoId(Integer photoId) {
        this.photoId = photoId;
    }

    public String getOwerId() {
        return owerId;
    }

    public void setOwerId(String owerId) {
        this.owerId = owerId;
    }

    public String getPhotoName() {
        return photoName;
    }

    public void setPhotoName(String photoName) {
        this.photoName = photoName == null ? null : photoName.trim();
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl == null ? null : photoUrl.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getPhotoNote() {
        return photoNote;
    }

    public void setPhotoNote(String photoNote) {
        this.photoNote = photoNote == null ? null : photoNote.trim();
    }
}