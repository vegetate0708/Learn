package com.vegetate.DataStructures;
/**
 * FileName: LinkList
 * Author:   vegetable
 * Date:     2018/12/29 13:45
 * Description: 链表
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 〈链表的实现〉
 *
 * @author vegetable
 * @create 2018/12/29 13:45
 * @since 1.0.0
 */
public class LinkList {
   private Link first;
   public void insert(long value){
      Link link=new Link(value);
      if(link==null){
         first=link;
      }else {
         link.setNext(first);
         first=link;
      }
   }
   public void display(){
      Link current=first;
      while (current!=null){
         System.out.println(current.getData());
         current=current.getNext();
      }

   }

   public void insert(long value,int pos){
      Link current=first;
      for(int i=0;i<pos-1;i++){
         current=current.getNext();
      }
      Link link=new Link(value);
      link.setNext(current.getNext());
      current.setNext(link);
   }

   //删除指定节点
   public void delete(long key){
      Link current=first;
      Link ago=first;
      while (current.getData()!=key){  // 如果没走循环，说明第一个数的值就是key
         if (current.getNext()==null){ //如果循环到最后还没找到key说明不在链表里面
            return;
         }else {
            ago=current;
            current=current.getNext();
         }
      }
      if (current==first){  //如果第一个值是key，删除后，第一个值就是他后面的
         first=first.getNext();
      }else {
         ago.setNext(current.getNext());
      }

   }
   //查找节点
   public Link find(long key){
      Link current=first;
      while (first.getData()!=key){
         if (first.getNext()==null){
            return null;
         }
         current=current.getNext();
      }
      return current;
   }

   public static void main(String[] args){
      LinkList linkList=new LinkList();
      linkList.insert(2);
      linkList.insert(5);
      linkList.insert(7);
      linkList.insert(1);

      linkList.insert(3,2);

      linkList.display();

      Link link=linkList.find(1);
      System.out.print(link.getData());
   }
}