/**
 * FileName: StudentComparable
 * Author:   vegetable
 * Date:     2018/12/24 10:34
 * Description: 学生排序器
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.vegetate.ObjectSort;

import java.util.Comparator;

/**
 * 〈学生排序器〉
 *
 * @author vegetable
 * @create 2018/12/2410:34
 * @since 1.0.0
 */
public class StudentComparable implements Comparator<Student> {
        //对象的排序方式[升、降]   
        public static boolean sortASC=true;
        // 对象的排序属性   
        public static boolean sortByName = false;
        public static boolean sortByAge  = false;
        public static boolean sortByScore= false;

    @Override
    public int compare(Student o1, Student o2) {
        int result=0;
        if(sortASC){
            if(sortByName){
                 String o1name = o1.getName();
                 String o2name = o2.getName();
                 result = o1name.compareTo(o2name);
            }else if(sortByAge) {
                Integer o1Age = o1.getAge();
                Integer o2Age = o2.getAge();
                result = o1Age.compareTo(o2Age);
            }else if (sortByScore){
                Integer o1Score = o1.getScore();
                Integer o2Score = o2.getScore();
                result = o1Score.compareTo(o2Score);
            }
        }else {
            if(sortByName){
                String o1name = o1.getName();
                String o2name = o2.getName();
                result = - o1name.compareTo(o2name);
            }else if(sortByAge) {
                Integer o1Age = o1.getAge();
                Integer o2Age = o2.getAge();
                result = - o1Age.compareTo(o2Age);
            }else if (sortByScore){
                Integer o1Score = o1.getScore();
                Integer o2Score = o2.getScore();
                result = - o1Score.compareTo(o2Score);
            }
        }
       return result;
    }
}