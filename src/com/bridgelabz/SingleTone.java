package com.bridgelabz;

public class SingleTone {
    String name;
    String address;
    int rollNo;
    private static SingleTone instance;

    private SingleTone(String name, String address, int rollNo) {
        this.name = name;
        this.address = address;
        this.rollNo = rollNo;
    }
    public static SingleTone getInstance(String name,String address,int rollNo) {
        if (instance == null) {
            instance = new SingleTone(name,address,rollNo);
        }
        return instance;
    }
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getRollNo() {
        return rollNo;
    }

    @Override
    public String toString() {
        return "SingleTone{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }


}
