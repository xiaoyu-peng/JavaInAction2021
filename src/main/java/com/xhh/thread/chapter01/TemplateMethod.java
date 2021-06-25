package com.xhh.thread.chapter01;

public class TemplateMethod {

    public static void main(String[] args) {
        new TemplateMethod(){
            @Override
            protected void wrapPrint(String message) {
                System.out.println("+++"+ message +"+++");
            }
        }.printMsg("Hello Thread");

        new TemplateMethod(){
            @Override
            protected void wrapPrint(String message) {
                System.out.println("***"+ message +"***");
            }
        }.printMsg("Hello Thread");
    }

    public final void printMsg(String message){
        System.out.println("****************************");
        wrapPrint(message);
        System.out.println("****************************");
    }

    protected void wrapPrint(String message){

    }
}
