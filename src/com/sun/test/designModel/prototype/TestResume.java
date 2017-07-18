package com.sun.test.designModel.prototype;

/**
 * Created by sun on 17-7-18.
 */
public class TestResume {

    public  static void main(String agrs[]) throws CloneNotSupportedException {
        Resume resume = new Resume("大鸟");
        resume.setPersionInfo("男","20");
        resume.setWorkExperience("1998-2017","Microsoft");

        Resume resume1 = (Resume) resume.clone();
        //Resume resume1 = new Resume("大鸟");
        //resume1.setPersionInfo("男","20");
        //resume1.setWorkExperience("1998-2017","Microsoft");

        Resume resume2 = (Resume) resume.clone();
        //Resume resume2 = new Resume("大鸟");
        /*resume2.setPersionInfo("男","20");
        resume2.setWorkExperience("1998-2017","Microsoft");*/


        resume.disPlay();
        resume1.disPlay();
        resume2.disPlay();
    }
}
