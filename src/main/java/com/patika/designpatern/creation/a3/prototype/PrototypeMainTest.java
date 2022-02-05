package com.patika.designpatern.creation.a3.prototype;

public class PrototypeMainTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        MultipleDatabasePrototype mysql= new Mysql();
        System.out.println(mysql.hashCode());
        System.out.println(mysql.toString());

        try {
            MultipleDatabasePrototype postgresql= (MultipleDatabasePrototype) mysql.clone();
            postgresql.setUserName("root2");
            postgresql.getUserPassword("root2");
            System.out.println(postgresql.hashCode());
            System.out.println(postgresql.toString());
        }catch (Exception e){
            e.printStackTrace();
        }




    }

}
