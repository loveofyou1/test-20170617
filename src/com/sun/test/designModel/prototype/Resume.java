package com.sun.test.designModel.prototype;

/**
 * 简历
 * Created by sun on 17-7-18.
 */
public class Resume implements Cloneable {

    private String name;
    private String sex;
    private String age;
    private String timeArea;
    private String company;

    public Resume(String name) {
        this.name = name;
    }


    /**
     * 设置个人信息
     *
     * @param sex
     * @param age
     */
    public void setPersionInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    /**
     * 设置工作经历
     */
    public void setWorkExperience(String timeArea, String company) {
        this.timeArea = timeArea;
        this.company = company;
    }

    public void disPlay() {
        System.out.println(name + "," + sex + "," + age);
        System.out.println("工作经历：" + timeArea + "," + company);
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
