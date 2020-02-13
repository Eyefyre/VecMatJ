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
public class Vector2 {

    private float a;
    private float b;

    /**
     * Constructor sets fields to given values
     * @param a float
     * @param b float
     */
    public Vector2(float a, float b) {
        this.a = a;
        this.b = b;
    }

    /**
     * Default constructor sets all fields to 0;
     */
    public Vector2() {
        this.a = 0;
        this.b = 0;
    }

    /**
     * returns the A value of the Vector2
     * @return float
     */
    public float getA() {
        return a;
    }

    /**
     *  Sets the A value of the Vector2
     * @param a float
     */
    public void setA(float a) {
        this.a = a;
    }

    /**
     * returns the B value of the Vector2
     * @return float
     */
    public float getB() {
        return b;
    }

    /**
     * Sets the B value of the Vector2
     * @param b float
     */
    public void setB(float b) {
        this.b = b;
    }

    /**
     * Adds the current Vector2 to a given Vector2
     * @param b Vector2
     */
    public void add(Vector2 b) {
        float ax = this.getA() + b.getA();
        float bx = this.getB() + b.getB();
        this.setA(ax);
        this.setB(bx);
    }

    /**
     * Subtracts a given vector from the current one.
     * Order is important this-b does not equal b-this
     * @param b Vector2
     */
    public void subtract(Vector2 b) {
        float ax = this.getA() - b.getA();
        float bx = this.getB() - b.getB();
        this.setA(ax);
        this.setB(bx);
    }

    /**
     * Scales the current Vector2 by a given factor
     * @param scale
     */
    public void scale(float scale) {
        float ax = scale * this.getA();
        float bx = scale * this.getB();
        this.setA(ax);
        this.setB(bx);
    }

    /**
     * Scales a given vector by a given factor
     * @param vec Vector2
     * @param scale float
     * @return Vector2
     */
    public static Vector2 scale(Vector2 vec, float scale) {
        float ax = scale * vec.getA();
        float bx = scale * vec.getB();
        return new Vector2(ax, bx);
    }

    /**
     * Adds a given vector to another
     * @param a Vector2
     * @param b Vector2
     * @return Vector2
     */
    public static Vector2 add(Vector2 a, Vector2 b) {
        float ax = a.getA() + b.getA();
        float bx = a.getB() + b.getB();
        return new Vector2(ax, bx);
    }

    /**
     * Subtracts a given vector from another.
     * Order is important a-b does not equal b-a
     * @param a Vector2
     * @param b Vector2
     * @return Vector2
     */
    public static Vector2 subtract(Vector2 a, Vector2 b) {
        float ax = a.getA() - b.getA();
        float bx = a.getB() - b.getB();
        return new Vector2(ax, bx);
    }

    /**
     * Returns the dot product of two given 2D vectors
     * @param a Vector2
     * @param b Vector2
     * @return float
     */
    public static float dot(Vector2 a, Vector2 b) {
        float ax = a.getA() * b.getA();
        float bx = a.getB() * b.getB();
        return ax + bx;
    }

    /**
     * Negates the given vector so that the A and B values have their signs reversed and returns it
     * @param vec Vector2 to be negated
     * @return Vector2
     */
    public static Vector2 negate(Vector2 vec) {
        return new Vector2(vec.getA() * -1, vec.getB() * -1);
    }

    /**
     * Negates the current vector so that the A and B values have their signs reversed
     */
    public void negate() {
        this.setA(this.getA() * -1);
        this.setB(this.getB() * -1);
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
        }
    }

    /**
     * Normalises a vector so that it's magnitude is equal to 1 and returns it
     * If the magnitude of the given vector is less than or equal 0, the original vector will be returned
     * @param vec Vector2 to be normalised
     * @return Vector2
     */
    public static Vector2 normalise(Vector2 vec) {
        float m = vec.getMagnitude();
        if (m > 0) {
            return new Vector2(vec.getA() / m, vec.getB() / m);
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
        return (float) Math.sqrt(ax + bx);
    }

    /**
     * Calculates the angle between a given vector and the current vector in degrees
     * @param vec Vector2
     * @return float
     */
    public float getAngle(Vector2 vec) {
        float by = vec.getB() - this.getB();
        float ax = vec.getA() - this.getA();
        return (float) Math.toDegrees(Math.atan2(by, ax));
    }

    /**
     * Calculates the angle between two given vectors in degrees
     * @param a Vector2
     * @param b Vector2
     * @return float
     */
    public static float getAngle(Vector2 a, Vector2 b) {
        float by = b.getB() - a.getB();
        float ax = b.getA() - a.getA();
        return (float) Math.toDegrees(Math.atan2(by, ax));
    }

    /**
     * Returns String representation of a 2D vector
     * @return String
     */
    @Override
    public String toString() {
        return "{" + a + "\n" + b + "}";
    }

}
