package main.java;

/**
 * Created by dorka on 09.08.2017.
 */
public class Person {
    private String name;
    private String surName;
    private String indexNo;

    @Override
    public String toString() {
        return "Person{" +
            "name='" + name + '\'' +
            ", surName='" + surName + '\'' +
            ", indexNo='" + indexNo + '\'' +
            '}';
    }

    public Person(String name, String surName, String indexNo) {
        this.name = name;
        this.surName = surName;
        this.indexNo = indexNo;
    }
}
