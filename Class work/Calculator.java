public class Calculator {
    public static void main(String[] args) {
        rectangle rectangle = new rectangle(5, 6);
        rectangle.findArea();

        square square = new square(5);
        square.findArea();
    }
    
}


class area {
    int side1;
    int side2;

    area (int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }


    public void findArea(){
        int area = side1 * side2;
        System.out.println(area);

    }
      
}

class rectangle extends area{
    int length;
    int width;

    rectangle (int length, int width ) {
        super(length, width);
    }


}
class square extends area {
    int side;

    square (int side) {
        super(side, side);
    }

} 