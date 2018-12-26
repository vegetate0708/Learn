/**
 * FileName: PriorityQueue
 * Author:   vegetable
 * Date:     2018/12/25 15:07
 * Description: 优先级队列
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.vegetate.Algorithms;

/**
 * 〈优先级队列〉
 *
 * @author vegetable
 * @create 2018/12/25 15:07
 * @since 1.0.0
 */
public class PriorityQueue {
    //大小
    private int maxSize;
    private long[] arr;
    //有效数
    private int elems;
    //对象的排序方式[升、降]   
    private static boolean sortASC=true;
    public PriorityQueue(int maxSize) {
        this.maxSize = maxSize;
        arr=new long[maxSize];
        elems=0;
    }
    public PriorityQueue(int maxSize,boolean is) {
        this.maxSize = maxSize;
        arr=new long[maxSize];
        sortASC=is;
        elems=0;
    }

    public void insert(long value){
      if(isFull())
            return;
      if(sortASC){//升序优先时 即取出的时候先取最小的
          int i;
          for(i=0;i<elems;i++){
              if(value>arr[i])
                  break;
          }
          for(int j=elems;j>i;j--){
              arr[j]=arr[j-1];
          }
          arr[i]=value;
      }else {//降序  取出时先取到最大值
          int i;
          for(i=0;i<elems;i++){
              if(value<arr[i])
                  break;
          }
          for(int j=elems;j>i;j--){
              arr[j]=arr[j-1];
          }
          arr[i]=value;
      }
      elems++;
    }

    public long remove(){
        long tmp=arr[elems-1];
        elems--;
        return tmp;
    }
    public boolean isEmpty(){
        return elems==0;
    }
    public boolean isFull(){
        return elems==maxSize;
    }

    public int size(){
        return elems;
    }
    public static void main(String[] args){
        PriorityQueue myQueue=new PriorityQueue(5,false);
        System.out.println(myQueue.isEmpty());
        myQueue.insert(8);
        myQueue.insert(3);
        myQueue.insert(6);
        myQueue.insert(5);
        myQueue.insert(9);
        for(int i=0;i<5;i++){
            System.out.println(myQueue.remove());
        }
    }
}