package com.example.studify;

public class Msg {
    String id, text, sender_id, group_id,time;

    public Msg() {
    }
    public Msg(String id, String text, String sender_id, String group_id, String time) {
        this.id = id;
        this.text = text;
        this.sender_id = sender_id;
        this.group_id = group_id;
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSender_id() {
        return sender_id;
    }

    public void setSender_id(String sender_id) {
        this.sender_id = sender_id;
    }

    public String getGroup_id() {
        return group_id;
    }

    public void setGroup_id(String group_id) {
        this.group_id = group_id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
