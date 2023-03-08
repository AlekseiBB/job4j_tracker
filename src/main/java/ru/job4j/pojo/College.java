package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullname("Ivanov Ivan Sergeevich");
        student.setGroup("Functional programming");
        student.setReceiptDate(new Date());
        System.out.println(student.getFullname() + " studying in a group " + student.getGroup() + ": " + student.getReceiptDate());
    }
}
