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
public class Vector3 {

    private float a;
    private float b;
    private float c;

    public Vector3(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Vector3() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
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

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public void add(Vector3 b) {
        float ax = this.getA() + b.getA();
        float bx = this.getB() + b.getB();
        float cx = this.getC() + b.getC();
        this.setA(ax);
        this.setB(bx);
        this.setC(cx);
    }

    public void subtract(Vector3 b) {
        float ax = this.getA() - b.getA();
        float bx = this.getB() - b.getB();
        float cx = this.getC() - b.getC();
        this.setA(ax);
        this.setB(bx);
        this.setC(cx);
    }

    public void scale(float scale) {
        float ax = scale * this.getA();
        float bx = scale * this.getB();
        float cx = scale * this.getC();
        this.setA(ax);
        this.setB(bx);
        this.setC(cx);
    }

    public static Vector3 scale(Vector3 vec, float scale) {
        float ax = scale * vec.getA();
        float bx = scale * vec.getB();
        float cx = scale * vec.getC();
        return new Vector3(ax, bx, cx);
    }

    public static Vector3 add(Vector3 a, Vector3 b) {
        float ax = a.getA() + b.getA();
        float bx = a.getB() + b.getB();
        float cx = a.getC() + b.getC();
        return new Vector3(ax, bx, cx);
    }

    public static Vector3 subtract(Vector3 a, Vector3 b) {
        float ax = a.getA() - b.getA();
        float bx = a.getB() - b.getB();
        float cx = a.getC() - b.getC();
        return new Vector3(ax, bx, cx);
    }

    public static Vector3 negate(Vector3 vec) {
        return new Vector3(vec.getA() * -1, vec.getB() * -1, vec.getC() * -1);
    }

    public void negate() {
        this.setA(this.getA() * -1);
        this.setB(this.getB() * -1);
        this.setC(this.getC() * -1);
    }

    public void normalise() {
        float m = this.getMagnitude();
        if (m > 0) {
            this.setA(this.getA() / m);
            this.setB(this.getB() / m);
            this.setC(this.getC() / m);
        }
    }

    public static Vector3 normalise(Vector3 vec) {
        float m = vec.getMagnitude();
        if (m > 0) {
            return new Vector3(vec.getA() / m, vec.getB() / m, vec.getC() / m);
        }
        return vec;
    }

    public float getMagnitude() {
        float ax = this.getA() * this.getA();
        float bx = this.getB() * this.getB();
        float cx = this.getC() * this.getC();
        return (float) Math.sqrt(ax + bx + cx);
    }

    public float getAngle(Vector3 vec) {
        float ax = this.getA() * vec.getA();
        float by = this.getB() * vec.getB();
        float cz = this.getC() * vec.getC();
        float numerator = ax + by + cz;
        float denominator = (float) (Math.sqrt((this.getA() * this.getA()) + (this.getB() * this.getB()) + (this.getC() * this.getC())) * Math.sqrt((vec.getA() * vec.getA()) + (vec.getB() * vec.getB()) + (vec.getC() * vec.getC())));;
        return (float) Math.toDegrees(Math.acos(numerator / denominator));
    }

    public static float getAngle(Vector3 a, Vector3 b) {
        float ax = a.getA() * b.getA();
        float by = a.getB() * b.getB();
        float cz = a.getC() * b.getC();
        float numerator = ax + by + cz;
        float denominator = (float) (Math.sqrt((a.getA() * a.getA()) + (a.getB() * a.getB()) + (a.getC() * a.getC())) * Math.sqrt((b.getA() * b.getA()) + (b.getB() * b.getB()) + (b.getC() * b.getC())));;
        return (float) Math.toDegrees(Math.acos(numerator / denominator));
    }

    public static float dot(Vector3 a, Vector3 b) {
        float ax = a.getA() * b.getA();
        float bx = a.getB() * b.getB();
        float cx = a.getC() * b.getC();
        return ax + bx + cx;
    }
    
    public static Vector3 cross(Vector3 a, Vector3 b) {
        float s1 = (a.getB()*b.getC())-(a.getC()*b.getB());
        float s2 = (a.getC()*b.getA())-(a.getA()*b.getC());
        float s3 = (a.getA()*b.getB())-(a.getB()*b.getA());
        return new Vector3(s1,s2,s3);
    }
}
