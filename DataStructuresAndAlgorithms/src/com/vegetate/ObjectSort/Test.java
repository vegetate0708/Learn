/**
 * FileName: Test
 * Author:   vegetable
 * Date:     2018/12/24 10:46
 * Description: 学生排序测试类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.vegetate.ObjectSort;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 〈学生排序测试类〉
 *
 * @author vegetable
 * @create 2018/12/2410:46
 * @since 1.0.0
 */
public class Test {
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("刘一", 19, 89));
        students.add(new Student("丁二", 26, 90));
        students.add(new Student("王三", 23, 70));
        students.add(new Student("周五", 18, 80));

        System.out.println("排序前:");
        for (Student student : students) {
            System.out.println("姓名："+student.name+" 年龄："+student.age+" 成绩："+student.score);
        }

//        // 第一种排序方法
//        Collections.sort(students);

        //第二种排序方法
        StudentComparable sort =new StudentComparable();
        StudentComparable.sortASC = true;//降序
        StudentComparable.sortByScore=true; //设置排序属性生效
        Collections.sort(students,sort);
        System.out.println("排序后:");
        for (Student student : students) {
            System.out.println("姓名："+student.name+" 年龄："+student.age+" 成绩："+student.score);
        }
    }

}
