package java8;

/**
 * @program: Java8-Tutorial->TestDefault
 * @description: 测试java8的默认实现
 * @author: liushuai
 * @create: 2019-08-22 16:57
 **/

public class TestDefault {

    public static void main(String[] args) {

        //通过匿名内部类方式访问接口
        Formual formual = new Formual() {
            @Override
            public double calculate(int a) {
                return sqrt(a);
            }
        };

        System.out.println(formual.calculate(100));  //100.0
        System.out.println(formual.sqrt(16)); //4.0
    }
}
