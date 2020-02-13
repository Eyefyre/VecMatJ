/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vecmatjv2.matrices;

import java.util.ArrayList;

/**
 *
 * @author Adam
 */
public class Matrix2 {

    private final ArrayList<Float> indexes;


    public Matrix2(float i00, float i01, float i10, float i11) {
        indexes = new ArrayList<>();
        indexes.add(i00);
        indexes.add(i01);
        indexes.add(i10);
        indexes.add(i11);
    }
    
    public Matrix2(ArrayList<Float> list) {
        indexes = list;
    }


    public Matrix2() {
        indexes = new ArrayList<>();
    }

    public float getI00() {
        return indexes.get(0);
    }

    public void setI00(float i00) {
        this.indexes.set(0, i00);
    }


    public float getI01() {
        return indexes.get(1);
    }


    public void setI01(float i01) {
        this.indexes.set(1, i01);
    }


    public float getI10() {
        return indexes.get(2);
    }


    public void setI10(float i10) {
        this.indexes.set(2, i10);
    }

 
    public float getI11() {
        return indexes.get(3);
    }

    public void setI11(float i11) {
        this.indexes.set(3, i11);
    }


    @Override
    public String toString() {
        return "{" + indexes.get(0) + "," + indexes.get(1) + "\n" + indexes.get(2) + "," + indexes.get(3) + "}";
    }


    public void add(Matrix2 mat) {
        for (int i = 0; i < mat.indexes.size(); i++) {
            float r = this.indexes.get(i) + mat.indexes.get(i);
            this.indexes.set(i, r);
        }
    }

    public static Matrix2 add(Matrix2 a, Matrix2 b) {
        Matrix2 mat = new Matrix2();
        for (int i = 0; i < a.indexes.size(); i++) {
            float r = a.indexes.get(i) + b.indexes.get(i);
            mat.indexes.add(r);
        }
        return mat;
    }


    public void subtract(Matrix2 mat) {
        for (int i = 0; i < mat.indexes.size(); i++) {
            float r = this.indexes.get(i) - mat.indexes.get(i);
            this.indexes.set(i, r);
        }
    }


    public static Matrix2 subtract(Matrix2 a, Matrix2 b) {
        Matrix2 mat = new Matrix2();
        for (int i = 0; i < a.indexes.size(); i++) {
            float r = a.indexes.get(i) - b.indexes.get(i);
            mat.indexes.add(r);
        }
        return mat;
    }


    public void scalarMult(float scalar) {
        for (int i = 0; i < this.indexes.size(); i++) {
            float r = this.indexes.get(i) * scalar;
            this.indexes.set(i, r);
        }
    }


    public static Matrix2 scalarMult(Matrix2 mat, float scalar) {
        Matrix2 mat2 = new Matrix2();
        for (int i = 0; i < mat.indexes.size(); i++) {
            float r = mat.indexes.get(i) * scalar;
            mat2.indexes.add(r);
        }
        return mat2;
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
        for (int i = 0; i < this.indexes.size(); i++) {
            this.indexes.set(i, this.indexes.get(i) * -1);
        }
    }

 
    public static Matrix2 negate(Matrix2 mat) {
        Matrix2 mat2 = new Matrix2();
        mat.indexes.forEach((f) -> {
            mat2.indexes.add(f * -1);
        });
        return mat2;
    }


    public static Matrix2 transpose(Matrix2 mat) {
        float original[][] = {{mat.getI00(), mat.getI01()}, {mat.getI10(), mat.getI11()}};
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
        float original[][] = {{this.getI00(), this.getI01()}, {this.getI10(), this.getI11()}};
        float transpose[][] = new float[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                transpose[i][j] = original[j][i];
            }
        }
        this.setI00(transpose[0][0]);
        this.setI01(transpose[0][1]);
        this.setI10(transpose[1][0]);
        this.setI11(transpose[1][1]);
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
        for (int i = 0; i < this.indexes.size(); i++) {
            this.indexes.set(i, 0f);
        }
    }

    public static Matrix2 zero(Matrix2 mat) {
        for (int i = 0; i < mat.indexes.size(); i++) {
            mat.indexes.set(i, 0f);
        }
        return mat;
    }
}
