public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();
        System.out.println(p1);
        p1.setX(8);
        p1.setY(6);
        System.out.println("x is : "+p1.getX());
        System.out.println("y is : "+p1.getY());
        // điểm thứ 1
        p1.setXY(3,5);
        System.out.println(p1.getXY()[0]);
        System.out.println(p1.getXY()[1]);
        System.out.println(p1);
        MyPoint p2 = new MyPoint(0,4);// điểm thứ 2
        System.out.println(p2);
        // khoảng cách từ 1 đến 2
        System.out.println(p1.distance(p2));
        // khoảng cách từ 2 đến 1
        System.out.println(p2.distance(p1));
        // khoảng cách từ 1 điểm thứ 3
        System.out.println(p1.distance(5,6));
        // khoang cách từ 1 đến 0
        System.out.println(p1.distance());

    }
}
