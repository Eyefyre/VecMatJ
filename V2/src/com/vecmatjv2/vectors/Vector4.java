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
public class Vector4 {

    private float a;
    private float b;
    private float c;
    private float d;

    /**
     * Constructor sets fields to given values
     *
     * @param a
     * @param b
     * @param c
     * @param d
     */
    public Vector4(float a, float b, float c, float d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    /**
     * Default constructor sets all fields to 0;
     */
    public Vector4() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
    }

    /**
     * returns the A value of the Vector4
     *
     * @return float
     */
    public float getA() {
        return a;
    }

    /**
     * Sets the A value of the Vector4
     *
     * @param a float
     */
    public void setA(float a) {
        this.a = a;
    }

    /**
     * returns the B value of the Vector4
     *
     * @return float
     */
    public float getB() {
        return b;
    }

    /**
     * Sets the B value of the Vector4
     *
     * @param b float
     */
    public void setB(float b) {
        this.b = b;
    }

    /**
     * returns the C value of the Vector4
     *
     * @return float
     */
    public float getC() {
        return c;
    }

    /**
     * Sets the C value of the Vector4
     *
     * @param c float
     */
    public void setC(float c) {
        this.c = c;
    }

    /**
     * returns the D value of the Vector4
     *
     * @return float
     */
    public float getD() {
        return d;
    }

    /**
     * Sets the D value of the Vector4
     *
     * @param d float
     */
    public void setD(float d) {
        this.d = d;
    }

    /**
     * Adds the current Vector4 to a given Vector4
     *
     * @param b Vector4
     */
    public void add(Vector4 b) {
        float ax = this.getA() + b.getA();
        float bx = this.getB() + b.getB();
        float cx = this.getC() + b.getC();
        float dx = this.getD() + b.getD();
        this.setA(ax);
        this.setB(bx);
        this.setC(cx);
        this.setD(dx);
    }

    /**
     * Subtracts a given vector from the current one. Order is important this-b
     * does not equal b-this
     *
     * @param b Vector4
     */
    public void subtract(Vector4 b) {
        float ax = this.getA() - b.getA();
        float bx = this.getB() - b.getB();
        float cx = this.getC() - b.getC();
        float dx = this.getD() - b.getD();
        this.setA(ax);
        this.setB(bx);
        this.setC(cx);
        this.setD(dx);
    }

    /**
     * Scales the current Vector4 by a given factor
     *
     * @param scale
     */
    public void scale(float scale) {
        float ax = scale * this.getA();
        float bx = scale * this.getB();
        float cx = scale * this.getC();
        float dx = scale * this.getD();
        this.setA(ax);
        this.setB(bx);
        this.setC(cx);
        this.setD(dx);
    }

    /**
     * Scales a given vector by a given factor
     *
     * @param vec Vector4
     * @param scale float
     * @return Vector4
     */
    public static Vector4 scale(Vector4 vec, float scale) {
        float ax = scale * vec.getA();
        float bx = scale * vec.getB();
        float cx = scale * vec.getC();
        float dx = scale * vec.getD();
        return new Vector4(ax, bx, cx, dx);
    }

    /**
     * Adds a given vector to another
     *
     * @param a Vector4
     * @param b Vector4
     * @return Vector4
     */
    public static Vector4 add(Vector4 a, Vector4 b) {
        float ax = a.getA() + b.getA();
        float bx = a.getB() + b.getB();
        float cx = a.getC() + b.getC();
        float dx = a.getD() + b.getD();
        return new Vector4(ax, bx, cx, dx);
    }

    /**
     * Subtracts a given vector from another. Order is important a-b does not
     * equal b-a
     *
     * @param a Vector4
     * @param b Vector4
     * @return Vector4
     */
    public static Vector4 subtract(Vector4 a, Vector4 b) {
        float ax = a.getA() - b.getA();
        float bx = a.getB() - b.getB();
        float cx = a.getC() - b.getC();
        float dx = a.getD() - b.getD();
        return new Vector4(ax, bx, cx, dx);
    }

    /**
     * Negates the given vector so that the A and B values have their signs
     * reversed and returns it
     *
     * @param vec Vector4 to be negated
     * @return Vector4
     */
    public static Vector4 negate(Vector4 vec) {
        return new Vector4(vec.getA() * -1, vec.getB() * -1, vec.getC() * -1, vec.getD() * -1);
    }

    /**
     * Negates the current vector so that the A and B values have their signs
     * reversed
     */
    public void negate() {
        this.setA(this.getA() * -1);
        this.setB(this.getB() * -1);
        this.setC(this.getC() * -1);
        this.setD(this.getD() * -1);
    }

    /**
     * Normalises a vector so that it's magnitude is equal to 1 If the magnitude
     * of the given vector is less than or equal 0, nothing is changed
     */
    public void normalise() {
        float m = this.getMagnitude();
        if (m > 0) {
            this.setA(this.getA() / m);
            this.setB(this.getB() / m);
            this.setC(this.getC() / m);
            this.setD(this.getD() / m);
        }
    }

    /**
     * Normalises a vector so that it's magnitude is equal to 1 and returns it
     * If the magnitude of the given vector is less than or equal 0, the
     * original vector will be returned
     *
     * @param vec Vector4 to be normalised
     * @return Vector4
     */
    public static Vector4 normalise(Vector4 vec) {
        float m = vec.getMagnitude();
        if (m > 0) {
            return new Vector4(vec.getA() / m, vec.getB() / m, vec.getC() / m, vec.getD() / m);
        }
        return vec;
    }

    /**
     * Calculates the magnitude of the current vector
     *
     * @return float
     */
    public float getMagnitude() {
        float ax = this.getA() * this.getA();
        float bx = this.getB() * this.getB();
        float cx = this.getC() * this.getC();
        float dx = this.getD() * this.getD();
        return (float) Math.sqrt(ax + bx + cx + dx);
    }

    /**
     * Calculates the angle between a given vector and the current vector in
     * degrees
     *
     * @param vec Vector4
     * @return float
     */
    public float getAngle(Vector4 vec) {
        float ax = this.getA() * vec.getA();
        float by = this.getB() * vec.getB();
        float cz = this.getC() * vec.getC();
        float dw = this.getD() * vec.getD();
        float numerator = ax + by + cz + dw;
        float denominator = (float) (Math.sqrt((this.getA() * this.getA()) + (this.getB() * this.getB()) + (this.getC() * this.getC()) + (this.getD() * this.getD())) * Math.sqrt((vec.getA() * vec.getA()) + (vec.getB() * vec.getB()) + (vec.getC() * vec.getC()) + (vec.getD() * vec.getD())));;
        return (float) Math.toDegrees(Math.acos(numerator / denominator));
    }

    /**
     * Calculates the angle between two given vectors in degrees
     *
     * @param a Vector4
     * @param b Vector4
     * @return float
     */
    public static float getAngle(Vector4 a, Vector4 b) {
        float ax = a.getA() * b.getA();
        float by = a.getB() * b.getB();
        float cz = a.getC() * b.getC();
        float dw = a.getD() * b.getD();
        float numerator = ax + by + cz + dw;
        float denominator = (float) (Math.sqrt((a.getA() * a.getA()) + (a.getB() * a.getB()) + (a.getC() * a.getC()) + (a.getD() * a.getD())) * Math.sqrt((b.getA() * b.getA()) + (b.getB() * b.getB()) + (b.getC() * b.getC()) + (b.getD() * b.getD())));;
        return (float) Math.toDegrees(Math.acos(numerator / denominator));
    }

    /**
     * Returns String representation of a Vector4
     *
     * @return String
     */
    @Override
    public String toString() {
        return "{" + a + "\n" + b + "\n" + c + "\n" + d + '}';
    }

}
