package com.youcode.docs.collection_framwork;

public class Model {
    private String name;
    private String email;
    private String phone;
    private Integer age;


    public Model initialize(int index){
        this.name = "Mohamed" + index;
        this.email = "mohamed" + index + "@gmail.com";
        this.phone = "06" + index + "123456";
        this.age = 20 + index;
        return this;
    }

    @Override
    public String toString() {
        return "Model{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                '}';
    }
}
