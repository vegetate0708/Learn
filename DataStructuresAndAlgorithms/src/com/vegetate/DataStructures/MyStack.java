package com.vegetate.DataStructures;
/**
 * FileName: MyStack
 * Author:   vegetable
 * Date:     2018/12/24 15:44
 * Description: 栈的基本实现
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

import java.util.Stack;

/**
 * 〈栈的基本实现〉
 *  栈的基本功能是 先进后出，类似往一个杯子里面倒入沙子，先进的在底部，后进的顶部，取出时相反
 *  使用栈可以进行一些逆向排序功能
 * @author vegetable
 * @create 2018/12/2415:44
 * @since 1.0.0
 */
public class MyStack {
  private int top;
  private long[] arr;
  private int maxSize;
  public MyStack(int size){
      this.maxSize=size;
      arr=new long[maxSize];
      top=-1;
    }

   public boolean isEmpty(){
      return top==-1;
   }
   public boolean isFull(){
       return (top==maxSize-1);
   }

   public void push(long value){
       if(!isFull()){
           arr[++top]=value;
       }

   }

   public long pop(){
       if( !isEmpty()){
           return arr[top--];
       }else{
           System.out.print("栈已为空");
           return 0;
       }
   }

   public static void main(String[] args){
        MyStack myStack=new MyStack(5);
        myStack.push(2);
        myStack.push(12);
        myStack.push(9);
        myStack.push(6);
        myStack.push(8);
        myStack.push(16);

        while (!myStack.isEmpty()){
            System.out.println("取出数据"+myStack.pop());
        }

   }
}