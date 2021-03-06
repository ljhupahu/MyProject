package com.my.jdk.io.serializable;

import java.io.*;

/**
 * Created by jli on 3/19/2018.
 */
public class SerializableExample {
    public static void main(String[] args) {
        writeObj();
//        readObj();
    }
    public static  void writeObj()
    {
        Student s=new Student();
        s.setId(8);
        s.setName("张三");
        s.countryName="USA";

        Subject subject = new Subject();
        subject.setName("Chinese");

        s.setSubject(subject);

        try {
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:\\Temp\\Temp\\tmp.txt"));
            oos.writeObject(s);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public  static  void  readObj()
    {
        try {
            ObjectInputStream ooi=new ObjectInputStream(new FileInputStream("D:\\Temp\\Temp\\tmp.txt"));
            try {
                Object obj=ooi.readObject();
                Student s=(Student)obj;
                //person s=(person)obj;
                System.out.println("id:"+s.getId()+",name:"+s.getName()+s.countryName);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            ooi.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
