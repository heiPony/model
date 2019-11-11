package com.pony.model.enumTest;

public enum ErrorCode {

    ERROR_A(100, "错误A"),
    OK(0, "成功"),
    ERROR_B(200, "错误A");

    ErrorCode(int code, String description) {
        this.code = code;
        this.description = description;
    }

    private int code;
    private String description;

    public static void main(String[] args) {
        for (ErrorCode item : ErrorCode.values()) {
            System.out.println(item.code+"===="+item.description);
        }
    }
}
