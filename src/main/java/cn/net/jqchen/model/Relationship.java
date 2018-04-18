package cn.net.jqchen.model;

public class Relationship {
    private Integer owerId;

    private Integer friendId;

    private String note;

    public Integer getOwerId() {
        return owerId;
    }

    public void setOwerId(Integer owerId) {
        this.owerId = owerId;
    }

    public Integer getFriendId() {
        return friendId;
    }

    public void setFriendId(Integer friendId) {
        this.friendId = friendId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}