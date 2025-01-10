public class Vector3D {
    private double x;
    private double y;
    private double z;

    public Vector3D (double xVal, double yVal, double zVal)
    {
        this.x = xVal;
        this.y = yVal;
        this.z = zVal;
    }
    public double getX()
    {
        return x;
    }
    public double getY()
    {
        return y;
    }
    public double getZ()
    {
        return z;
    }
    public String toString()
    {
        return "(" + x + "," + y + "," + z + ")";
    }
    public double getMag()
    {
        return Math.sqrt((x*x)+(y*y)+(z*z));
    }
    public Vector3D normalize()
    {
        double mag = getMag();
        return new Vector3D(x/mag,y/mag,z/mag);
    }
    public Vector3D add(Vector3D v1, Vector3D v2)
    {
        return new Vector3D(v1.getX()+v2.getX(),v1.getY()+v2.getY(),v1.getZ()+v2.getZ());
    }
    public Vector3D multiply(double num)
    {
        return new Vector3D(x*num,y*num,z*num);
    }
    public double dotProduct(Vector3D v1, Vector3D v2)
    {
        return v1.getX()*v2.getX() + v1.getY()*v2.getY() + v1.getZ()*v2.getZ();
    }



}
