public class Fan {
    public int slow=1;
    public int medium=2;
    public int fast=3;

    private int speed=slow;
    private boolean on= false;
    private double radius= 5;
    private String color = "blue";

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean getOn() {
        return on;
    }
    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan(){


    }

    public String changeToString(){
        if(this.on){
            return "Speed of Fan: "+this.speed +" Color: "+this.color+ " Radius: "+ this.radius + "Fan is on";
        }else {
            return "Color: "+ this.color+ " Radius: "+ this.radius +"Fan is off";
        }
    }

    public static void main(String[] args) {
        Fan fan1=new Fan();

        fan1.setOn(true);
        fan1.setSpeed(fan1.fast);
        fan1.setRadius(10);
        fan1.setColor("Yellow");

        Fan fan2=new Fan();

        fan2.setOn(false);
        fan2.setSpeed(fan2.medium);
        fan2.setRadius(5);
        fan2.setColor("blue");

        System.out.println(fan1.changeToString());
        System.out.println(fan2.changeToString());
    }
}
