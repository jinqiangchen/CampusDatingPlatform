package cn.net.jqchen.model;

import java.util.Date;

public class Video {
    private Integer videoId;

    private String owerId;

    private String videoName;

    private String videoUrl;

    private Date createTime;

    private String videoNote;

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public String getOwerId() {
        return owerId;
    }

    public void setOwerId(String owerId) {
        this.owerId = owerId;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName == null ? null : videoName.trim();
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl == null ? null : videoUrl.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getVideoNote() {
        return videoNote;
    }

    public void setVideoNote(String videoNote) {
        this.videoNote = videoNote == null ? null : videoNote.trim();
    }
}