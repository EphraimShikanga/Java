class Furniture{
    public static void main(String[] args) {
    furns one = new furns();
    one.setName("chairs");
    System.out.println(one.getName());
    }
}

class furns {
    private String name;
    int legs;
    String color;

    furns () {
        name = "chair";
        legs = 4;
        color = "brown";
    }

    furns (String name, int legs, String color) {
        this.name = name;
        this.legs = legs;
        this.color = color;
    }

    public String getName(){
        return name;
    }

    public void setName ( String name){
        this.name = name;
    }
}