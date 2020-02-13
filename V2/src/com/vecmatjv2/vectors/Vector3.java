/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vecmatjv2.vectors;

/**
 *
 * @author Adam
 */
public class Vector3 {

    private float a;
    private float b;
    private float c;

    /**
     * Constructor sets fields to given values
     * @param a
     * @param b
     * @param c
     */
    public Vector3(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Default constructor sets all fields to 0;
     */
    public Vector3() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    /**
     * returns the A value of the Vector3
     * @return float
     */
    public float getA() {
        return a;
    }

    /**
     * Sets the A value of the Vector3
     * @param a float
     */
    public void setA(float a) {
        this.a = a;
    }

    /**
     * returns the B value of the Vector3
     * @return float
     */
    public float getB() {
        return b;
    }

    /**
     * Sets the B value of the Vector3
     * @param b float
     */
    public void setB(float b) {
        this.b = b;
    }

    /**
     * returns the C value of the Vector3
     * @return float
     */
    public float getC() {
        return c;
    }

    /**
     * Sets the C value of the Vector3
     * @param c float
     */
    public void setC(float c) {
        this.c = c;
    }

    /**
     * Adds the current Vector3 to a given Vector3
     * @param b Vector3
     */
    public void add(Vector3 b) {
        float ax = this.getA() + b.getA();
        float bx = this.getB() + b.getB();
        float cx = this.getC() + b.getC();
        this.setA(ax);
        this.setB(bx);
        this.setC(cx);
    }

    /**
     * Subtracts a given vector from the current one.
     * Order is important this-b does not equal b-this
     * @param b Vector3
     */
    public void subtract(Vector3 b) {
        float ax = this.getA() - b.getA();
        float bx = this.getB() - b.getB();
        float cx = this.getC() - b.getC();
        this.setA(ax);
        this.setB(bx);
        this.setC(cx);
    }

    /**
     * Scales the current Vector3 by a given factor
     * @param scale
     */
    public void scale(float scale) {
        float ax = scale * this.getA();
        float bx = scale * this.getB();
        float cx = scale * this.getC();
        this.setA(ax);
        this.setB(bx);
        this.setC(cx);
    }

    /**
     * Scales a given vector by a given factor
     * @param vec Vector3
     * @param scale float
     * @return Vector3
     */
    public static Vector3 scale(Vector3 vec, float scale) {
        float ax = scale * vec.getA();
        float bx = scale * vec.getB();
        float cx = scale * vec.getC();
        return new Vector3(ax, bx, cx);
    }

    /**
     * Adds a given vector to another
     * @param a Vector3
     * @param b Vector3
     * @return Vector3
     */
    public static Vector3 add(Vector3 a, Vector3 b) {
        float ax = a.getA() + b.getA();
        float bx = a.getB() + b.getB();
        float cx = a.getC() + b.getC();
        return new Vector3(ax, bx, cx);
    }

    /**
     * Subtracts a given vector from another.
     * Order is important a-b does not equal b-a
     * @param a Vector3
     * @param b Vector3
     * @return Vector3
     */
    public static Vector3 subtract(Vector3 a, Vector3 b) {
        float ax = a.getA() - b.getA();
        float bx = a.getB() - b.getB();
        float cx = a.getC() - b.getC();
        return new Vector3(ax, bx, cx);
    }

    /**
     * Negates the given vector so that the A and B values have their signs reversed and returns it
     * @param vec Vector3 to be negated
     * @return Vector3
     */
    public static Vector3 negate(Vector3 vec) {
        return new Vector3(vec.getA() * -1, vec.getB() * -1, vec.getC() * -1);
    }

    /**
     * Negates the current vector so that the A and B values have their signs reversed
     */
    public void negate() {
        this.setA(this.getA() * -1);
        this.setB(this.getB() * -1);
        this.setC(this.getC() * -1);
    }

    /**
     * Normalises a vector so that it's magnitude is equal to 1
     * If the magnitude of the given vector is less than or equal 0, nothing is changed
     */
    public void normalise() {
        float m = this.getMagnitude();
        if (m > 0) {
            this.setA(this.getA() / m);
            this.setB(this.getB() / m);
            this.setC(this.getC() / m);
        }
    }

    /**
     * Normalises a vector so that it's magnitude is equal to 1 and returns it
     * If the magnitude of the given vector is less than or equal 0, the original vector will be returned
     * @param vec Vector3 to be normalised
     * @return Vector3
     */
    public static Vector3 normalise(Vector3 vec) {
        float m = vec.getMagnitude();
        if (m > 0) {
            return new Vector3(vec.getA() / m, vec.getB() / m, vec.getC() / m);
        }
        return vec;
    }

    /**
     * Calculates the magnitude of the current vector
     * @return float
     */
    public float getMagnitude() {
        float ax = this.getA() * this.getA();
        float bx = this.getB() * this.getB();
        float cx = this.getC() * this.getC();
        return (float) Math.sqrt(ax + bx + cx);
    }

    /**
     * Calculates the angle between a given vector and the current vector in degrees
     * @param vec Vector3
     * @return float
     */
    public float getAngle(Vector3 vec) {
        float ax = this.getA() * vec.getA();
        float by = this.getB() * vec.getB();
        float cz = this.getC() * vec.getC();
        float numerator = ax + by + cz;
        float denominator = (float) (Math.sqrt((this.getA() * this.getA()) + (this.getB() * this.getB()) + (this.getC() * this.getC())) * Math.sqrt((vec.getA() * vec.getA()) + (vec.getB() * vec.getB()) + (vec.getC() * vec.getC())));;
        return (float) Math.toDegrees(Math.acos(numerator / denominator));
    }

    /**
     * Calculates the angle between two given vectors in degrees
     * @param a Vector3
     * @param b Vector3
     * @return float
     */
    public static float getAngle(Vector3 a, Vector3 b) {
        float ax = a.getA() * b.getA();
        float by = a.getB() * b.getB();
        float cz = a.getC() * b.getC();
        float numerator = ax + by + cz;
        float denominator = (float) (Math.sqrt((a.getA() * a.getA()) + (a.getB() * a.getB()) + (a.getC() * a.getC())) * Math.sqrt((b.getA() * b.getA()) + (b.getB() * b.getB()) + (b.getC() * b.getC())));;
        return (float) Math.toDegrees(Math.acos(numerator / denominator));
    }

     /**
     * Returns the dot product of two given Vector3s
     * @param a Vector3
     * @param b Vector3
     * @return float
     */

    public static float dot(Vector3 a, Vector3 b) {
        float ax = a.getA() * b.getA();
        float bx = a.getB() * b.getB();
        float cx = a.getC() * b.getC();
        return ax + bx + cx;
    }
    
    /**
     * Returns the cross product of two given Vector3s
     * @param a Vector3
     * @param b Vector3
     * @return Vector3
     */
    public static Vector3 cross(Vector3 a, Vector3 b) {
        float s1 = (a.getB()*b.getC())-(a.getC()*b.getB());
        float s2 = (a.getC()*b.getA())-(a.getA()*b.getC());
        float s3 = (a.getA()*b.getB())-(a.getB()*b.getA());
        return new Vector3(s1,s2,s3);
    }

    /**
     * Returns String representation of a Vector3
     * @return String
     */
    @Override
    public String toString() {
        return "{" + a + "\n" + b + "\n" + c + '}';
    }
    
    
}
