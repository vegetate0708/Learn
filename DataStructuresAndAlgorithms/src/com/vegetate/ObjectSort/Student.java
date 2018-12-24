/**
 * FileName: Student
 * Author:   vegetable
 * Date:     2018/12/24 10:30
 * Description: 学生自动排序类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.vegetate.ObjectSort;

/**
 * 〈学生自动排序类〉
 *
 * @author vegetable
 * @create 2018/12/2410:30
 * @since 1.0.0
 */
public class Student implements Comparable<Student>{
    String name;
    int age;
    int score;

    public Student(String name, int age,int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        return this.score - o.score;
    }
}