public class Box extends Basic {
    SimpleItem[] _simpleItem;
    Box[] _box;
    public int _boxNumber;
    int _itemCount = 0;
    int _boxCount = 0;
    public Box(int count, int num) {
        this._simpleItem = new SimpleItem[count];
        this._boxNumber = num;
        this._box = new Box[count];
        this._itemCount = 0;
        this._boxCount = 0;
    }
    public void addItem(SimpleItem simpleItem) {
        try {
            this._simpleItem[this._itemCount] = simpleItem;
            this._itemCount++;
        } catch(Exception e) {
            System.out.println(e.getMessage());

        }
    }
    public void addItem(Box box) {
        this._box[this._boxCount] = box;
        this._boxCount++;
    }
    public void print() {
        if(this._itemCount > 0) {
            for(int i = 0; i < this._itemCount; i++) {
                this._simpleItem[i].print();
            }
        }
        if(this._boxCount > 0) {
            for(int i = 0; i < this._boxCount; i++) {
                this._box[i].print();
            }
        }
    }
    public int find(String item) {
        if(this._itemCount > 0) {
            for(int i = 0; i < this._itemCount; i++) {
                int found = this._simpleItem[i].find(item);
                if(found > 0) {
                    return this._boxNumber;
                }
            }
        }
        if(this._boxCount > 0) {
            for(int i = 0; i < this._boxCount; i++) {
                int found = this._box[i].find(item);
                if(found > 0) {
                    return this._boxNumber;
                }
            }
        }
        return -1;
    }
}
