/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vecmatj.matrices;

/**
 *
 * @author Adam
 */
public class Matrix2 {

    private float i00;
    private float i01;
    private float i10;
    private float i11;

    public Matrix2(float i00, float i01, float i10, float i11) {
        this.i00 = i00;
        this.i01 = i01;
        this.i10 = i10;
        this.i11 = i11;
    }

    public Matrix2() {

    }

    public float getI00() {
        return i00;
    }

    public void setI00(float i00) {
        this.i00 = i00;
    }

    public float getI01() {
        return i01;
    }

    public void setI01(float i01) {
        this.i01 = i01;
    }

    public float getI10() {
        return i10;
    }

    public void setI10(float i10) {
        this.i10 = i10;
    }

    public float getI11() {
        return i11;
    }

    public void setI11(float i11) {
        this.i11 = i11;
    }

    @Override
    public String toString() {
        return "{" + i00 + "," + i01 + "\n" + i10 + "," + i11 + "}";
    }

    public void add(Matrix2 mat) {
        float i1 = this.getI00() + mat.getI00();
        float i2 = this.getI01() + mat.getI01();
        float i3 = this.getI10() + mat.getI10();
        float i4 = this.getI11() + mat.getI11();
        this.setI00(i1);
        this.setI01(i2);
        this.setI10(i3);
        this.setI11(i4);
    }

    public static Matrix2 add(Matrix2 a, Matrix2 b) {
        float i1 = a.getI00() + b.getI00();
        float i2 = a.getI01() + b.getI01();
        float i3 = a.getI10() + b.getI10();
        float i4 = a.getI11() + b.getI11();
        return new Matrix2(i1, i2, i3, i4);
    }

    public void subtract(Matrix2 mat) {
        float i1 = this.getI00() - mat.getI00();
        float i2 = this.getI01() - mat.getI01();
        float i3 = this.getI10() - mat.getI10();
        float i4 = this.getI11() - mat.getI11();
        this.setI00(i1);
        this.setI01(i2);
        this.setI10(i3);
        this.setI11(i4);
    }

    public static Matrix2 subtract(Matrix2 a, Matrix2 b) {
        float i1 = a.getI00() - b.getI00();
        float i2 = a.getI01() - b.getI01();
        float i3 = a.getI10() - b.getI10();
        float i4 = a.getI11() - b.getI11();
        return new Matrix2(i1, i2, i3, i4);
    }

    public void scalarMult(float scalar) {
        this.setI00(this.getI00() * scalar);
        this.setI01(this.getI01() * scalar);
        this.setI10(this.getI10() * scalar);
        this.setI11(this.getI11() * scalar);
    }

    public static Matrix2 scalarMult(Matrix2 mat, float scalar) {
        float i1 = mat.getI00() * scalar;
        float i2 = mat.getI01() * scalar;
        float i3 = mat.getI10() * scalar;
        float i4 = mat.getI11() * scalar;
        return new Matrix2(i1, i2, i3, i4);
    }

    public void mult(Matrix2 a) {
        float i1 = (this.getI00() * a.getI00()) + (this.getI01() * a.getI10());
        float i2 = (this.getI00() * a.getI01()) + (this.getI01() * a.getI11());
        float i3 = (this.getI10() * a.getI00()) + (this.getI11() * a.getI10());
        float i4 = (this.getI10() * a.getI01()) + (this.getI11() * a.getI11());
        this.setI00(i1);
        this.setI01(i2);
        this.setI10(i3);
        this.setI11(i4);
    }

    public static Matrix2 mult(Matrix2 a, Matrix2 b) {
        float i1 = (a.getI00() * b.getI00()) + (a.getI01() * b.getI10());
        float i2 = (a.getI00() * b.getI01()) + (a.getI01() * b.getI11());
        float i3 = (a.getI10() * b.getI00()) + (a.getI11() * b.getI10());
        float i4 = (a.getI10() * b.getI01()) + (a.getI11() * b.getI11());
        return new Matrix2(i1, i2, i3, i4);
    }

    public void invert() {
        float mult = (this.getI00() * this.getI11()) - (this.getI01() * this.getI10());
        float temp = this.getI00();
        this.setI00(this.getI11());
        this.setI11(temp);
        this.setI01(this.getI01() * -1);
        this.setI10(this.getI10() * -1);
        this.scalarMult(1 / mult);
    }

    public static Matrix2 invert(Matrix2 mat) {
        float mult = (mat.getI00() * mat.getI11()) - (mat.getI01() * mat.getI10());
        float temp = mat.getI00();
        mat.setI00(mat.getI11());
        mat.setI11(temp);
        mat.setI01(mat.getI01() * -1);
        mat.setI10(mat.getI10() * -1);
        mat.scalarMult(1 / mult);
        return mat;
    }

    public static Matrix2 divide(Matrix2 a, Matrix2 b) {
        b.invert();
        Matrix2 result = Matrix2.mult(a, b);
        return result;
    }

    public void divide(Matrix2 mat) {
        mat.invert();
        this.mult(mat);
    }

    public void negate() {
        this.setI00(this.getI00() * -1);
        this.setI01(this.getI01() * -1);
        this.setI10(this.getI10() * -1);
        this.setI11(this.getI11() * -1);
    }

    public static Matrix2 negate(Matrix2 mat) {
        float i1 = mat.getI00() * -1;
        float i2 = mat.getI01() * -1;
        float i3 = mat.getI10() * -1;
        float i4 = mat.getI11() * -1;
        return new Matrix2(i1, i2, i3, i4);
    }

    public static Matrix2 transpose(Matrix2 mat) {
        float original[][] = {{mat.i00, mat.i01}, {mat.i10, mat.i11}};
        float transpose[][] = new float[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                transpose[i][j] = original[j][i];
            }
        }
        Matrix2 result = new Matrix2(transpose[0][0], transpose[0][1], transpose[1][0], transpose[1][1]);
        return result;
    }

    public void transpose() {
        float original[][] = {{this.i00, this.i01}, {this.i10, this.i11}};
        float transpose[][] = new float[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                transpose[i][j] = original[j][i];
            }
        }
        this.i00 = transpose[0][0];
        this.i01 = transpose[0][1];
        this.i10 = transpose[1][0];
        this.i11 = transpose[1][1];
    }

    public float getDeterminant() {
        float determinant = (this.getI00() * this.getI11()) - (this.getI01() * this.getI10());
        return determinant;
    }

    public static float getDeterminant(Matrix2 mat) {
        float determinant = (mat.getI00() * mat.getI11()) - (mat.getI01() * mat.getI10());
        return determinant;
    }

    public void zero() {
        this.i00 = 0;
        this.i01 = 0;
        this.i10 = 0;
        this.i11 = 0;
    }

    public static Matrix2 zero(Matrix2 mat) {
        mat.i00 = 0;
        mat.i01 = 0;
        mat.i10 = 0;
        mat.i11 = 0;
        return mat;
    }
}
