package com.example.chat_app;

import java.util.Date;

public class Message {
    public String userName;
    public String textMassage;
    private long messegeTime;

    public Message(){}
    public Message(String userName, String textmessage){
        this.userName = userName;
        this.textMessage = textMassage;

        this.messegeTime = new Date().getTime();
    }
}
