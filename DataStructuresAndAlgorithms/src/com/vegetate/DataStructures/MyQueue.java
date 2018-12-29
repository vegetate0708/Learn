/**
 * FileName: MyQueue
 * Author:   vegetable
 * Date:     2018/12/24 16:23
 * Description: 队列的实现
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 〈队列的实现〉
 *
 * @author vegetable
 * @create 2018/12/24 16:23
 * @since 1.0.0
 */
public class MyQueue {
    //大小
    private int maxSize;
    //队头位置
    private int font;
    //队尾
    private int end;
    private long[] arr;
    //有效数
    private int elems;

    public MyQueue(int maxSize) {
        this.maxSize = maxSize;
        arr=new long[maxSize];
        font=0;
        end=-1;
        elems=0;
    }

    public void insert(long value){
        if(!isFull()){
            arr[++end]=value;
            elems++;
        }

    }

    public long remove(){
        elems--;
        return arr[font++];
    }
    public boolean isEmpty(){
        return elems==0;
    }
    public boolean isFull(){
        return end==maxSize-1;
    }

    public int size(){
        return elems;
    }

    public static void main(String[] args){
          MyQueue myQueue=new MyQueue(3);
          myQueue.insert(8);
          myQueue.insert(3);
          myQueue.insert(6);
          myQueue.insert(1);
          while (!myQueue.isEmpty()){
              System.out.println(myQueue.remove());
          }

    }
}