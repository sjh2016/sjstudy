package com.example.demo.event;

import com.google.common.eventbus.Subscribe;

/**
 * 事件监听
 */
public class EventListener {

    @Subscribe
    public void test1(CustomEvent event){
        System.out.println("xxxx");
    }
}
