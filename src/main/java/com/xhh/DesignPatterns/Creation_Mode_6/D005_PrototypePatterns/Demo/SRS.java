package com.xhh.DesignPatterns.Creation_Mode_6.D005_PrototypePatterns.Demo;

public class SRS implements OfficialDocument {

    @Override
    public OfficialDocument clone() {

        OfficialDocument srs = null;
        try {
            srs = (OfficialDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制！");
        }

        return srs;

    }


    @Override
    public void display() {
        System.out.println("《软件需求规格说明书》");
    }

}