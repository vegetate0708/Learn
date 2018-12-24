/**
 * FileName: MyStack
 * Author:   vegetable
 * Date:     2018/12/24 15:44
 * Description: ջ�Ļ���ʵ��
 * History:
 * <author>          <time>          <version>          <desc>
 * ��������           �޸�ʱ��           �汾��              ����
 */
package com.vegetate.Algorithms;

import java.util.Stack;

/**
 * ��ջ�Ļ���ʵ�֡�
 *  ջ�Ļ��������� �Ƚ������������һ���������浹��ɳ�ӣ��Ƚ����ڵײ�������Ķ�����ȡ��ʱ�෴
 *  ʹ��ջ���Խ���һЩ����������
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
           System.out.print("ջ��Ϊ��");
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
            System.out.println("ȡ������"+myStack.pop());
        }

   }
}