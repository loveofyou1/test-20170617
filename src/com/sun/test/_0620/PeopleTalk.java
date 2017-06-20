package com.sun.test._0620;

/**
 * Created by sun on 2017/6/20.
 */
public class PeopleTalk implements ITalk {
    public String username;
    public String age;

    public PeopleTalk(String username, String age) {
        this.username = username;
        this.age = age;
    }

    public void talk(String msg) {
        System.out.println(msg + "!���,����" + username + "����������" + age);
    }

    public String getName() {
        return username;
    }

    public void setName(String name) {
        this.username = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

}
