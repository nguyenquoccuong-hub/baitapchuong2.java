public class MyLine {
    private MyPoint begin;
    private MyPoint end;
    // hàm khởi tạo
    public MyLine(int x1, int y1, int x2, int y2){
        this.begin = new MyPoint(x1,y1);
        this.end = new MyPoint(x2,y2);
    }
    public MyLine(MyPoint begin, MyPoint end){
        this.begin = begin;
        this.end = end;
    }
    // phương thức lấy và thiết lập điểm đầu và điểm cuối
    public MyPoint getBegin(){
        return begin;
    }
    public void setBegin(MyPoint begin){
        this.begin = begin;
    }
    public MyPoint getEnd(){
        return end;
    }
    public void setEnd(MyPoint end){
        this.end = end;
    }
    // phương thức lấy và thiết lập toạ độ
    public int getBiginX(){
        return begin.getX();
    }
    public void setBiginX(int x){
        begin.setX(x);
    }
    public int getBeginY(){
        return begin.getY();
    }
    public void setBeginY(int y){
        begin.setY(y);
    }
    public int getEndX(){
        return end.getX();
    }
    public void setEndX(int x){
        end.setX(x);
    }
    public int getEndY(){
        return end.getX();
    }
    public void setEndY(int y){
        end.setY(y);
    }
    // phương thức lấy toạ độ dưới dạng mảng
    public int[] getBeginXY(){
        return new int[]{begin.getX(), begin.getY()};
    }
    public void setBeginXY(int x, int y){
        setBiginX(x);
        setBeginY(y);
    }
    // tính độ dài đoạn thẳng
    public double getLength(){
        return begin.distance(end);
    }
    // tính góc
    public double getGradient(){
        double yDiff = end.getY() - begin.getY();
        double xDiff = end.getX() - begin.getX();
        return Math.atan2(yDiff, xDiff);// trả về radian
    }
    public String toString(){
        return "Myline [begin=("+begin.getX()+", "+begin.getY()+
                "), end=("+end.getX()+", "+end.getY()+")]";
    }
}
