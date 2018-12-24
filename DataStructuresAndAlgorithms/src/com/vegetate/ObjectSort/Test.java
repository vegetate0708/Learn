/**
 * FileName: Test
 * Author:   vegetable
 * Date:     2018/12/24 10:46
 * Description: ѧ�����������
 * History:
 * <author>          <time>          <version>          <desc>
 * ��������           �޸�ʱ��           �汾��              ����
 */
package com.vegetate.ObjectSort;

import java.util.ArrayList;
import java.util.Collections;

/**
 * ��ѧ����������ࡵ
 *
 * @author vegetable
 * @create 2018/12/2410:46
 * @since 1.0.0
 */
public class Test {
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("��һ", 19, 89));
        students.add(new Student("����", 26, 90));
        students.add(new Student("����", 23, 70));
        students.add(new Student("����", 18, 80));

        System.out.println("����ǰ:");
        for (Student student : students) {
            System.out.println("������"+student.name+" ���䣺"+student.age+" �ɼ���"+student.score);
        }

//        // ��һ�����򷽷�
//        Collections.sort(students);

        //�ڶ������򷽷�
        StudentComparable sort =new StudentComparable();
        StudentComparable.sortASC = true;//����
        StudentComparable.sortByScore=true; //��������������Ч
        Collections.sort(students,sort);
        System.out.println("�����:");
        for (Student student : students) {
            System.out.println("������"+student.name+" ���䣺"+student.age+" �ɼ���"+student.score);
        }
    }

}
