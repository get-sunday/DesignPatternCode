package com.example.admin.patterns.stayss;

/**
 *  为什么组合优于继承
 */
public class User {
       public String name;
       public String email;
       public  String pwd;


       public class Permission{

       }

       public class Customer extends User{

       }
       public class Admin extends User{

       }


       public class Teacher extends User{

       }

}
