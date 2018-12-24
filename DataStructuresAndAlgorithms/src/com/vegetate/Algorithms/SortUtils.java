package com.vegetate.Algorithms;

/**
 * 〈冒泡排序〉
 *
 * @author vegetate
 * @create 2018/12/17 16:09
 */
public class SortUtils {
    /**
     * 原理：比较两个相邻的元素，将值大的元素交换至右端。
     *
     * 思路：依次比较相邻的两个数，将小数放在前面，大数放在后面。
     * 即在第一趟：首先比较第1个和第2个数，将小数放前，大数放后。
     * 然后比较第2个数和第3个数，将小数放前，大数放后，如此继续，直至比较最后两个数，将小数放前，大数放后。
     * 重复第一趟步骤，直至全部排序完成。
     * @param a
     * @return
     */
    public static int[] bubbleort(int[] a){
        int m;
         for(int i=0;i<a.length;i++){  //外层控制排序次数
             for(int j=0;j<a.length-i-1;j++){ //内层控制需要排序的数字序号(每一次排序多少次)
                 m=a[j];
                 if( a[j]>a[j+1]){
                     a[j]=a[j+1];
                     a[j+1]=m;
                 }
             }
         }
         return a;
    }

    /**
     * 首先找到数组中最小的那个元素，
     * 其次，将它和数组的第一个元素交换位置（如果第一个元素就是最小元素，那么它就和自己交换。
     * 如果只剩下最后一个元素，就没必要排了，它就是最大的）。
     * 再次在剩下的元素中找最小的元素，将它与数组中的第二个元素交换。
     * 如此往复，直到将整个数组排序。
     *
     * 为什么叫它选择排序？因为从上面的算法中可以看到它一直不断地在选择剩余元素中的最小值。
     * @param a
     * @return
     */
    public static long[] selectSort(long[] a){
        long m;
        for(int i=0;i<a.length-1;i++){  //外层控制排序次数 最后一次是a[length-2] a[length-1]
            for(int j=i+1;j<a.length;j++){ //内层控制需要排序的数字序号(每一次排序多少次)
                if( a[i]>a[j]){
                    m=a[i];
                    a[i]=a[j];
                    a[j]=m;
                }
            }
        }
        return a;
    }

    /**
     * 插入排序法的排序思想就是从数组的第二个元素开始,将数组中的每一个元素按照规则插入到已排好序的数组中以达到排序的目的.
     * 一般情况下将数组的第一个元素作为启始元素,从第二个元素开始依次插入.
     * 由于要插入到的数组是已经排好序的,所以只是要从右向左找到比插入点(下面程序中的insertNote)小(对升序而言)的第一个数组元素就插入到其后面.直到将最后一个数组元素插入到数组中,整个排序过程就算完成.
     *
     * @param sorts
     * @return
     */
    public static long[] insertSort(long[] sorts){
        long m;
        for(int i=1;i<sorts.length;i++){
            m=sorts[i];//要插入的数据
            int j=0; //待插入数据的下标
           for(j=i;j>0&&sorts[j-1]>=m;j--){ //0 —（i-1）为已排序好的数组  从数组的最后一位依次与待插入数据进行比较，直到循环找出插入下表
               sorts[j]=sorts[j-1];
           }
           sorts[j]=m;
        }
        return sorts;
    }


   public static void main(String[] s){
        long[] a={9,1,2,10,7,3,8,7,20,15};
        long[] b=insertSort(a);
        for (int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }

   }

}