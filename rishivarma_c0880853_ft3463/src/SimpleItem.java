import java.util.Objects;

public class SimpleItem extends Basic {
    String _item;
    public SimpleItem(String item) {
        this._item = item;
    }
    public void print() {
        System.out.println(this._item);
    }
    public int find(String item) {
        if(item.equals(this._item)) {
            return 1;
        } else {
            return -1;
        }
    }
}
