package com.first.webapp.model;

public class Holiday {

    private final String day;
    private final String reason;
    private final Type type;

    public enum Type{
        FESTIVAL, FEDERAL

    }

    public Holiday(String day, String reason, Type type){
        this.day = day;
        this.reason = reason;
        this.type = type;
    }


    public String getDay() {
        return this.day;
    }


    public String getReason() {
        return this.reason;
    }


    public Type getType() {
        return this.type;
    }


}
