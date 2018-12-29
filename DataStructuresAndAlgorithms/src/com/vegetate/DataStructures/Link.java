/**
 * FileName: Link
 * Author:   vegetable
 * Date:     2018/12/27 9:27
 * Description: 连接点
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 〈连接点〉
 *
 * @author vegetable
 * @create 2018/12/27 9:27
 * @since 1.0.0
 */
public class Link {
    private long data;
    private Link next;

    public Link(long data) {
        this.data = data;
    }

    public long getData() {
        return data;
    }

    public void setData(long data) {
        this.data = data;
    }

    public Link getNext() {
        return next;
    }

    public void setLink(Link next) {
        this.next = next;
    }
}