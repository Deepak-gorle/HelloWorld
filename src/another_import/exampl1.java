package another_import;

import java.util.Scanner;

public class exampl1 extends ToSee {
    public static void staticTest(){
        System.out.println("this is a static method");
    }
    void area(){
        System.out.println("area is here");
    }
    protected void msg() {
        Scanner myobj = new Scanner(System.in);
        System.out.println("enter the name:");
        String name = myobj.nextLine();
        System.out.println("User name is" + name);
    }
    class Main{
        public static void main(String[] args){
                staticTest();
                exampl1 obj= new exampl1();
                obj.area();
            }
}
