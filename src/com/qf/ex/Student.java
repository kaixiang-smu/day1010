package com.qf.ex;

public class Student {
    private int age;

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                '}';
    }

    // 这里只是声明抛出异常，此异常是编译期异常，必须要处理
    // 因为AgeOutOfBoundsException异常继承的是编译期异常Exception
    // 继承的不是运行期异常RuntimeException及其子类
    public void setAge(int age) throws AgeOutOfBoundsException{
        if (age>=0&&age<=120){
            this.age = age;
        }else {
            // 这里才是真正抛出异常--->抛出异常对象
            throw new AgeOutOfBoundsException(age);
        }
    }

    static class TestStudent{
        public static void main(String[] args) throws AgeOutOfBoundsException {
            Student s = new Student();
            s.setAge(-1);
            System.out.println(s);
        }
    }
}
