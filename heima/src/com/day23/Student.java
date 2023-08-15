package com.day23;

import java.io.Serial;
import java.io.Serializable;

public class Student implements Serializable {
    /*private static  final  long  serialVersionUID=1L;
     * 方式一  */

    //方式二 其实还是方一,只不过不用手动设置啦!
    @Serial
    private static final long serialVersionUID = 3987993070122887352L;

    private String name;
    private int age;
    /*身份证比较重要我不想让他序列化存入本地问价怎么吧办!
     *这时候就有一个关键字-----transient:瞬态关键字
     * 作用:不会把当前属性序列化存入本地 */
    private transient String idCard;


    public Student() {
    }

    public Student(String name, int age, String idCard) {
        this.name = name;
        this.age = age;
        this.idCard = idCard;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     *
     * @return idCard
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * 设置
     *
     * @param idCard
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", idCard='" + idCard + '\'' +
                '}';
    }
}
