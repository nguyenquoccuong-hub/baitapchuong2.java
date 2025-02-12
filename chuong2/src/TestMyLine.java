public class TestMyLine {
    public static void main(String[] args) {
        // tao cac diem
        MyPoint point1 = new MyPoint(1,2);
        MyPoint point2 = new MyPoint(3,4);
        // in thong tin cac diem
        System.out.println("point 1 : ("+point1.getX()+","+point1.getY()+")");
        System.out.println("point 2 : ("+point2.getX()+","+point2.getY()+")");
        // tao doan thang
        MyLine line1 = new MyLine(point1,point2);
        System.out.println("line 1 : "+line1.toString());
        System.out.println("length of line 1 : "+line1.getLength());
        System.out.println("gradient of line 1 (in radian): "+line1.getGradient());
        // thay doi diem dau va in lai thong tin
        line1.setBegin( new MyPoint(2,3));
        System.out.println("updated line 1 : "+line1.toString());
        System.out.println("new length of line 1 : "+line1.getLength());
        System.out.println("new gradient of line 1 (in radians):"+line1.getGradient());
    }
}
