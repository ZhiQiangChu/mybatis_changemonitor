package com.github.changemonitor.enumerate;


public enum DBActionTypeEnum {
    UPDATE("UPDATE", "UPDATE"),
    INSERT("INSERT", "INSERT"),
    DELETE("DELETE", "DELETE");
    private String key;
    private String value;

    private DBActionTypeEnum(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}

