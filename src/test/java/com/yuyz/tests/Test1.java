package com.yuyz.tests;

/**
 * @ClassName FatherModel
 * @Description TODO
 * @Author yuyz
 * @Date 2020/9/17 18:52
 * @Version 1.0
 */
class FatherModel {

    {
        System.out.println("执行父类构造代码块");
    }
    static{
        System.out.println("执行父类静态代码块");
    }
    public FatherModel(){
        System.out.println("执行父类无参构造方法");
    }
    public FatherModel(String arg){
        System.out.println("执行父类有参构造方法1");
    }
    public FatherModel(String arg1,String arg2){
        System.out.println("执行父类有参构造方法2");
    }
}
class SunModel extends FatherModel{
    {
        System.out.println("执行子类构造代码块");
    }
    static{
        System.out.println("执行子类静态代码块");
    }
    public SunModel(){
        System.out.println("执行子类无参构造方法");
    }
    public SunModel(String arg){
        System.out.println("执行子类有参数构造方法1");
    }
    public SunModel(String arg,String arg2){
        System.out.println("执行子类有参数构造方法2");
    }
}
public class Test1 {
    public static void main(String[] args) {
        System.out.println("创建父类实例，不考虑继承情况");
        FatherModel fatherModel1 = new FatherModel();
        System.out.println("------------------------------------------------------");
        FatherModel fatherModel2 = new FatherModel("abc");
        System.out.println("------------------------------------------------------");
        FatherModel fatherModel3 = new FatherModel("abc","efg");
        System.out.println("------------------------------------------------------");
        System.out.println("创建子类实例，考虑继承情况");
        SunModel sunModel1 = new SunModel();
        System.out.println("------------------------------------------------------");
        SunModel sunModel2 = new SunModel();
        System.out.println("------------------------------------------------------");
        SunModel sunModel3 = new SunModel("abc");
        System.out.println("------------------------------------------------------");
        SunModel sunModel4 = new SunModel("abc","efg");
    }

}
