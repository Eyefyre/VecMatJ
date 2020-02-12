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
public class Vector4 {

    private float a;
    private float b;
    private float c;
    private float d;

    public Vector4(float a, float b, float c, float d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Vector4() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
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

    public float getD() {
        return d;
    }

    public void setD(float d) {
        this.d = d;
    }

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

    public static Vector4 scale(Vector4 vec, float scale) {
        float ax = scale * vec.getA();
        float bx = scale * vec.getB();
        float cx = scale * vec.getC();
        float dx = scale * vec.getD();
        return new Vector4(ax, bx, cx, dx);
    }

    public static Vector4 add(Vector4 a, Vector4 b) {
        float ax = a.getA() + b.getA();
        float bx = a.getB() + b.getB();
        float cx = a.getC() + b.getC();
        float dx = a.getD() + b.getD();
        return new Vector4(ax, bx, cx, dx);
    }

    public static Vector4 subtract(Vector4 a, Vector4 b) {
        float ax = a.getA() - b.getA();
        float bx = a.getB() - b.getB();
        float cx = a.getC() - b.getC();
        float dx = a.getD() - b.getD();
        return new Vector4(ax, bx, cx, dx);
    }

    public static Vector4 negate(Vector4 vec) {
        return new Vector4(vec.getA() * -1, vec.getB() * -1, vec.getC() * -1, vec.getD() * -1);
    }

    public void negate() {
        this.setA(this.getA() * -1);
        this.setB(this.getB() * -1);
        this.setC(this.getC() * -1);
        this.setD(this.getD() * -1);
    }

    public void normalise() {
        float m = this.getMagnitude();
        if (m > 0) {
            this.setA(this.getA() / m);
            this.setB(this.getB() / m);
            this.setC(this.getC() / m);
            this.setD(this.getD() / m);
        }
    }

    public static Vector4 normalise(Vector4 vec) {
        float m = vec.getMagnitude();
        if (m > 0) {
            return new Vector4(vec.getA() / m, vec.getB() / m, vec.getC() / m, vec.getD() / m);
        }
        return vec;
    }

    public float getMagnitude() {
        float ax = this.getA() * this.getA();
        float bx = this.getB() * this.getB();
        float cx = this.getC() * this.getC();
        float dx = this.getD() * this.getD();
        return (float) Math.sqrt(ax + bx + cx + dx);
    }

    public float getAngle(Vector4 vec) {
        float ax = this.getA() * vec.getA();
        float by = this.getB() * vec.getB();
        float cz = this.getC() * vec.getC();
        float dw = this.getD() * vec.getD();
        float numerator = ax + by + cz + dw;
        float denominator = (float) (Math.sqrt((this.getA() * this.getA()) + (this.getB() * this.getB()) + (this.getC() * this.getC()) + (this.getD() * this.getD())) * Math.sqrt((vec.getA() * vec.getA()) + (vec.getB() * vec.getB()) + (vec.getC() * vec.getC()) + (vec.getD() * vec.getD())));;
        return (float) Math.toDegrees(Math.acos(numerator / denominator));
    }

    public static float getAngle(Vector4 a, Vector4 b) {
        float ax = a.getA() * b.getA();
        float by = a.getB() * b.getB();
        float cz = a.getC() * b.getC();
        float dw = a.getD() * b.getD();
        float numerator = ax + by + cz + dw;
        float denominator = (float) (Math.sqrt((a.getA() * a.getA()) + (a.getB() * a.getB()) + (a.getC() * a.getC()) + (a.getD() * a.getD())) * Math.sqrt((b.getA() * b.getA()) + (b.getB() * b.getB()) + (b.getC() * b.getC()) + (b.getD() * b.getD())));;
        return (float) Math.toDegrees(Math.acos(numerator / denominator));
    }


}
