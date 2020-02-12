/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vecmatj.vectors;

/**
 *
 * @author Adam
 */
public class Vector2 {

    private float a;
    private float b;

    public Vector2(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public Vector2() {
        this.a = 0;
        this.b = 0;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public void add(Vector2 b) {
        float ax = this.getA() + b.getA();
        float bx = this.getB() + b.getB();
        this.setA(ax);
        this.setB(bx);
    }

    public void subtract(Vector2 b) {
        float ax = this.getA() - b.getA();
        float bx = this.getB() - b.getB();
        this.setA(ax);
        this.setB(bx);
    }

    public void scale(float scale) {
        float ax = scale * this.getA();
        float bx = scale * this.getB();
        this.setA(ax);
        this.setB(bx);
    }

    public static Vector2 scale(Vector2 vec, float scale) {
        float ax = scale * vec.getA();
        float bx = scale * vec.getB();
        return new Vector2(ax, bx);
    }

    public static Vector2 add(Vector2 a, Vector2 b) {
        float ax = a.getA() + b.getA();
        float bx = a.getB() + b.getB();
        return new Vector2(ax, bx);
    }

    public static Vector2 subtract(Vector2 a, Vector2 b) {
        float ax = a.getA() - b.getA();
        float bx = a.getB() - b.getB();
        return new Vector2(ax, bx);
    }

    public static float dot(Vector2 a, Vector2 b) {
        float ax = a.getA() * b.getA();
        float bx = a.getB() * b.getB();
        return ax + bx;
    }

    public static Vector2 negate(Vector2 vec) {
        return new Vector2(vec.getA() * -1, vec.getB() * -1);
    }

    public void negate() {
        this.setA(this.getA() * -1);
        this.setB(this.getB() * -1);
    }

    public void normalise() {
        float m = this.getMagnitude();
        if (m > 0) {
            this.setA(this.getA() / m);
            this.setB(this.getB() / m);
        }
    }

    public static Vector2 normalise(Vector2 vec) {
        float m = vec.getMagnitude();
        if (m > 0) {
            return new Vector2(vec.getA() / m, vec.getB() / m);
        }
        return vec;
    }

    public float getMagnitude() {
        float ax = this.getA() * this.getA();
        float bx = this.getB() * this.getB();
        return (float) Math.sqrt(ax + bx);
    }

    public float getAngle(Vector2 vec) {
        float by = vec.getB() - this.getB();
        float ax = vec.getA() - this.getA();
        return (float) Math.toDegrees(Math.atan2(by, ax));
    }

    public static float getAngle(Vector2 a, Vector2 b) {
        float by = b.getB() - a.getB();
        float ax = b.getA() - a.getA();
        return (float) Math.toDegrees(Math.atan2(by, ax));
    }

    @Override
    public String toString() {
        return "Vector2{" + "a=" + a + ", b=" + b + '}';
    }

}
