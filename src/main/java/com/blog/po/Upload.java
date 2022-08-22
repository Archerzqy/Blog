package com.blog.po;

public class Upload<E> {
    private String code;
    private String message;
    private E body;

    public  Upload(String code,String message,E body){
        this.code=code;
        this.message=message;
        this.body=body;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public E getBody() {
        return body;
    }

    public void setBody(E body) {
        this.body = body;
    }


    public static <E>Upload<E> success(E body){
        return new Upload("200","",body);
    }

    public static <E>Upload<E> fail(String code,String message){
        return new Upload(code,message,(Object) null);
    }
}
