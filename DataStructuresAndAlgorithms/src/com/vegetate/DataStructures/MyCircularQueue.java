/**
 * FileName: MyCircularQueue
 * Author:   vegetable
 * Date:     2018/12/25 9:15
 * Description: 实现循环队列
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */


/**
 * 〈实现循环队列〉
 *
 * @author vegetable
 * @create 2018/12/25 9:15
 * @since 1.0.0
 */
public class MyCircularQueue {
    //大小
    private int maxSize;
    //队头位置
    private int font;
    //队尾
    private int end;
    private long[] arr;
    //有效数
    private int elems;

    public MyCircularQueue(int maxSize) {
        this.maxSize = maxSize;
        arr=new long[maxSize];
        font=0;
        end=-1;
        elems=0;
    }

    public void insert(long value){
       if(end==maxSize-1){
           end=-1;
       }
        if(!isFull()){
            arr[++end]=value;
            elems++;
        }

    }

    public long remove(){
        long tmp=arr[font++];
        if (font==maxSize){
            font=0;
        }
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
        MyCircularQueue myQueue=new MyCircularQueue(3);
        System.out.println(myQueue.isEmpty());
        myQueue.insert(8);
        myQueue.insert(3);
        myQueue.insert(6);
        myQueue.insert(1);
        for(int i=0;i<5;i++){
            System.out.println(myQueue.remove());
        }


    }
}