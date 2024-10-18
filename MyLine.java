public class MyLine {
    private MyPoint begin;
    private MyPoint end;
    public MyLine(int x1, int y1, int x2, int y2) {
        begin = new MyPoint(x1, y1);
        end = new MyPoint(x2, y2);
    }
    public MyLine(MyPoint begin,MyPoint end) {
        this.begin = begin;
        this.end = end;

    }
    public MyPoint getBegin() {
        return begin;
    }
    public MyPoint getEnd() {
        return end;
    }
    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }
    public void setEnd(MyPoint end) {
        this.end = end;
    }
    public int getBeginX() {
        return begin.getX();
    }
    public void setBeginX(int beginX) {
        this.begin.setX(beginX);
    }
    public int getBeginY() {
        return begin.getY();
    }
    public void setBeginY(int beginY) {
        this.begin.setY(beginY);
    }
    public int getEndX() {
        return end.getX();
    }
    public void setEndX(int endX) {
        this.end.setX(endX);
    }
    public int getEndY() {
        return end.getY();
    }
    public void setEndY(int endY) {
        this.end.setY(endY);
    }
    public int[] getBeginXY() {
        return new int[]{begin.getX(), begin.getY()};
    }
    public void setBeginXY(int[] beginXY) {
        this.begin.setX(beginXY[0]);
    }
    public int[] getEndXY() {
        return new int[]{end.getX(), end.getY()};
    }
    public void setEndXY(int[] endXY) {
        this.end.setX(endXY[0]);
        this.end.setY(endXY[1]);
    }
    public double getLength() {
        return Math.sqrt(Math.pow(end.getX()-begin.getX(),2)+Math.pow(end.getY()-begin.getY(),2));
    }
/*    public double getGradient() {
        return
    }*/
    public String toString() {
        return "MyLine [begin=" + begin + ", end=" + end + "]";
    }
}
