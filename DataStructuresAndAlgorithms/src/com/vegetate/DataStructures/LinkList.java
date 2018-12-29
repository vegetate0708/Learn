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
   private void insert(long value){
      Link link=new Link(value);
      if(link==null){
         first=link;
      }else {
         link.setNext(first);
         first=link;
      }
   }
}