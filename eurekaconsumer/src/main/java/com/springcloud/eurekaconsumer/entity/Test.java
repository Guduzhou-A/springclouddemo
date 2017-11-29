package com.springcloud.eurekaconsumer.entity;

public class Test {

    private String name ;
    private String addr;
    private int tel ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                ", tel=" + tel +
                '}';
    }
}
