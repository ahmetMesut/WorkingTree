package com.ahmetmesut.singlesponsibility;

public class UserServive {

 /*   This way is bad for solid principles.We should separate this code block .

  public void changeEmail(Object user){
        if(checkAccess(user)){
            //......
        }
    }
    public boolean checkAccess(Object user){
        //.....
        return false;
    }
    */
    public void changeEmail(Object user){
        if(SecurityService.checkAccess(user)){
            //....
        }
    }
}
