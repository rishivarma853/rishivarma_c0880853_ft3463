public class Moving extends Basic{
    Box[] _box;
    int _boxCount;

    public Moving(int count) {
        this._box = new Box[count];
        this._boxCount = 0;
    }
    public void addBox(Box box) {
        this._box[this._boxCount] = box;
        this._boxCount++;
    }
    public void print() {
        System.out.println("The Objects of my move are :-");
        for(Box box : this._box) {
            box.print();
        }
    }
    public int find(String item) {
        for(int i = 0; i < this._boxCount; i++) {
            int found = this._box[i].find(item);
            if(found > 0) {
                return this._box[i]._boxNumber;
            }
        }
        return -1;
    }

}
