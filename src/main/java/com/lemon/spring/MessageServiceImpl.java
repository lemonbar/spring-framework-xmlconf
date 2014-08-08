package com.lemon.spring;

/**
 * Created by 305032265 on 14-8-8.
 */
public class MessageServiceImpl implements MessageService {
    @Override
    public String getMessage() {
        return "Hello world!";
    }
}