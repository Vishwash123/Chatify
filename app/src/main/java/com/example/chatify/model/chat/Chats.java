package com.example.chatify.model.chat;

public class Chats {

    public String dataTime;
    public String textMessage;
    public String type;
    public String sender;
    public String receiver;

    public Chats(String dataTime, String textMessage, String type, String sender, String receiver) {
        this.dataTime = dataTime;
        this.textMessage = textMessage;
        this.type = type;
        this.sender = sender;
        this.receiver = receiver;
    }

    public String getDataTime() {
        return dataTime;
    }

    public void setDataTime(String dataTime) {
        this.dataTime = dataTime;
    }

    public String getTextMessage() {
        return textMessage;
    }

    public void setTextMessage(String textMessage) {
        this.textMessage = textMessage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }
}
