package org.example.Seminar2.cw;

public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector() {
    }

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    /**
     * @return длину вектора
     */
    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    /**
     * @return скалярное произведение двух векторов
     */
    public double scalar(Vector vector) {
        return x * vector.x + y * vector.y + z * vector.z;

    }

    public Vector vecMult(Vector vector) {
        return new Vector(y * vector.z - z * vector.y, z * vector.x - x * vector.z, x * vector.y - y * vector.x);
    }

    public double cosinus(Vector vector){
        return scalar(vector)/(length()* vector.length());
    }

    /**
     *
     * @param vector прибавляемый
     * @return вектор результирующий
     */
    public Vector vecSum(Vector vector){
        return new Vector(x+ vector.x,y+ vector.y, z + vector.z);
    }

    /**
     *
     * @param vector ВЫЧИТАЕМЫЙ
     * @return результирующий
     */
    public Vector vecDif(Vector vector){
        return new Vector(x- vector.x,y- vector.y, z- vector.z);
    }
}