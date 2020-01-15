package com.example.chat_app;

import java.util.Date;

public class Message {
    public String userName;
    public String textMassage;
    private long messegeTime;

    public Message(){}

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTextMassage() {
        return textMassage;
    }

    public void setTextMassage(String textMassage) {
        this.textMassage = textMassage;
    }

    public long getMessegeTime() {
        return messegeTime;
    }

    public void setMessegeTime(long messegeTime) {
        this.messegeTime = messegeTime;
    }

    public Message(String userName, String textmessage){
        this.userName = userName;
        this.textMessage = textMassage;

        this.messegeTime = new Date().getTime();
    }
}
