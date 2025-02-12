public class MyPoint {
    private int x ;
    private int y ;
    // hàm khởi tạo
    public MyPoint(){
        this.x = 0;
        this.y = 0;
    };
    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    // phương thức lấy và thiết lập
    public int getX(){
        return x;
    }
    void setX(int x){
        this.x = x;
    }
    public int getY(){
        return y;
    }
    void setY(int y){
        this.y = y;
    }
    public int[] getXY(){
        return new int[]{x,y};
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "("+x+","+y+")";
    }
    // tính khoảng cách
    public double distance(int x, int y){
        return Math.sqrt(Math.pow(this.x - x,2) + Math.pow(this.y - y,2));
    }
    public double distance(MyPoint another){
        return distance(another.getX(), another.getY());
    }
    // tính khoảng cách đến điểm (0,0)
    public double distance(){
        return distance(0,0);
    }
}
