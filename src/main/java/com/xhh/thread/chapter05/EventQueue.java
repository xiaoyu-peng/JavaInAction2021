package com.xhh.thread.chapter05;

import java.util.LinkedList;

/**
 * 测试 wait 和 notify
 * @author PengHui
 */
public class EventQueue {

    private final int max;

    static class Event {
    }

    private final LinkedList<Event> eventQueue = new LinkedList<>();

    private final static int DEFAULT_MAX_EVENTS = 10;


    public EventQueue() {
        this(DEFAULT_MAX_EVENTS);
    }

    public EventQueue(int max) {
        this.max = max;
    }


    public void offer(Event event) {
        synchronized (eventQueue) {
            while (eventQueue.size() >= max){
                try {
                    console(" The queue is full.");
                    eventQueue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            console("The new event is submitted.");
            eventQueue.add(event);
            eventQueue.notifyAll();
        }
    }
    
    public Event take(){
        synchronized(eventQueue){
            while(eventQueue.isEmpty()){
                try {
                    console(" The queue is empty.");
                    eventQueue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            Event event = eventQueue.removeFirst();
            eventQueue.notify();
            console("The event "+ event +" is handled.");
            return event;
        }
        
    }
    
    private void console(String message){
        System.out.printf("%s:%s\n", Thread.currentThread().getName(), message);
    }

}
