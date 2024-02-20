import java.util.Scanner;
public class CopyPerson {
    public static void main(String[] args) {
        Person p = new Person();    //定义初始对象
        System.out.println("请输入p对象的姓名：");   //为初始对象赋值
        Scanner myScanner = new Scanner(System.in);
        p.name = myScanner.next();
        System.out.println("请输入p对象的年龄：");
        p.age = myScanner.nextInt();
        MyTools mt = new MyTools();     //定义工具对象
        Person p2 = mt.copyPerson(p);   //调用工具对象的克隆方法，并将初始对象传入进行克隆
        System.out.println("p的姓名为：" + p.name + "，年龄为" + p.age); //输出初始对象的值
        System.out.println("p2的姓名为：" + p2.name + "，年龄为" + p2.age);  //输出克隆对象的值
        int ph = p.hashCode(),ph2 = p2.hashCode();  //定义变量接收p对象和p2对象的hashcode值
        System.out.println("p的hashcode值为：" + ph + "\np2的hashcode值为："  + ph2);
        System.out.println("两者的hashcode比较结果为：" + (ph == ph2) ); //通过判断p对象和p2对象的hashcode值可以得知二者为不同对象
    }
}

class Person{   //定义Person类
    String name;
    int age;
}

class MyTools{  //定义工具类
    public Person copyPerson( Person p){    //定义克隆方法
        Person p2 = new Person();   //定义临时中转对象，用以接收传入方法的值
        p2.name = p.name;
        p2.age = p.age;
        return p2;  //返回p2对象的引用地址
    }
}