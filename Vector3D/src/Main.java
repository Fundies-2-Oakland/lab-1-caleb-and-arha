//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
Vector3D x = new Vector3D(2,4,6);

        System.out.println(x.getX());
        System.out.println(x.getY());
        System.out.println(x.getZ());
        System.out.println(x.toString());
        System.out.println(x.getMag());
        System.out.println(x.normalize().toString());
        System.out.println(x.multiply(3).toString());
        

    }




}