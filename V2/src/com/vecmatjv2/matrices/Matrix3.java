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
public class Matrix3 {

    private final ArrayList<Float> indexes;

    /**
     *
     * @param i00
     * @param i01
     * @param i02
     * @param i10
     * @param i11
     * @param i12
     * @param i20
     * @param i21
     * @param i22
     */
    public Matrix3(float i00, float i01, float i02, float i10, float i11, float i12, float i20, float i21, float i22) {
        indexes = new ArrayList<>();
        indexes.add(i00);
        indexes.add(i01);
        indexes.add(i02);
        indexes.add(i10);
        indexes.add(i11);
        indexes.add(i12);
        indexes.add(i20);
        indexes.add(i21);
        indexes.add(i22);
    }

    /**
     *
     * @param list
     */
    public Matrix3(ArrayList<Float> list) {
        indexes = list;
    }

    /**
     *
     */
    public Matrix3() {
        indexes = new ArrayList<>();
    }

    /**
     *
     * @return
     */
    public float getI00() {
        return this.indexes.get(0);
    }

    /**
     *
     * @param i00
     */
    public void setI00(float i00) {
        this.indexes.set(0, i00);
    }

    /**
     *
     * @return
     */
    public float getI01() {
        return this.indexes.get(1);
    }

    /**
     *
     * @param i01
     */
    public void setI01(float i01) {
        this.indexes.set(1, i01);
    }

    /**
     *
     * @return
     */
    public float getI02() {
        return this.indexes.get(2);
    }

    /**
     *
     * @param i02
     */
    public void setI02(float i02) {
        this.indexes.set(2, i02);
    }

    /**
     *
     * @return
     */
    public float getI10() {
        return this.indexes.get(3);
    }

    /**
     *
     * @param i10
     */
    public void setI10(float i10) {
        this.indexes.set(3, i10);
    }

    /**
     *
     * @return
     */
    public float getI11() {
        return this.indexes.get(4);
    }

    /**
     *
     * @param i11
     */
    public void setI11(float i11) {
        this.indexes.set(4, i11);
    }

    /**
     *
     * @return
     */
    public float getI12() {
        return this.indexes.get(5);
    }

    /**
     *
     * @param i12
     */
    public void setI12(float i12) {
        this.indexes.set(5, i12);
    }

    /**
     *
     * @return
     */
    public float getI20() {
        return this.indexes.get(6);
    }

    /**
     *
     * @param i20
     */
    public void setI20(float i20) {
        this.indexes.set(6, i20);
    }

    /**
     *
     * @return
     */
    public float getI21() {
        return this.indexes.get(7);
    }

    /**
     *
     * @param i21
     */
    public void setI21(float i21) {
        this.indexes.set(7, i21);
    }

    /**
     *
     * @return
     */
    public float getI22() {
        return this.indexes.get(8);
    }

    /**
     *
     * @param i22
     */
    public void setI22(float i22) {
        this.indexes.set(8, i22);
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "{" + this.indexes.get(0) + "," + this.indexes.get(1) + "," + this.indexes.get(2) + "\n" + this.indexes.get(3) + "," + this.indexes.get(4) + "," + this.indexes.get(5) + "\n" + this.indexes.get(6) + "," + this.indexes.get(7) + "," + this.indexes.get(8) + '}';
    }

    /**
     *
     * @param mat
     */
    public void add(Matrix3 mat) {
        for (int i = 0; i < mat.indexes.size(); i++) {
            float f = this.indexes.get(i) + mat.indexes.get(i);
            this.indexes.set(i, f);
        }
    }

    /**
     *
     * @param a
     * @param b
     * @return
     */
    public static Matrix3 add(Matrix3 a, Matrix3 b) {
        Matrix3 mat = new Matrix3();
        for (int i = 0; i < a.indexes.size(); i++) {
            float r = a.indexes.get(i) + b.indexes.get(i);
            mat.indexes.add(r);
        }
        return mat;
    }

    /**
     *
     * @param mat
     */
    public void subtract(Matrix3 mat) {
        for (int i = 0; i < mat.indexes.size(); i++) {
            float f = this.indexes.get(i) - mat.indexes.get(i);
            this.indexes.set(i, f);
        }
    }

    /**
     *
     * @param a
     * @param b
     * @return
     */
    public static Matrix3 subtract(Matrix3 a, Matrix3 b) {
        Matrix3 mat = new Matrix3();
        for (int i = 0; i < a.indexes.size(); i++) {
            float r = a.indexes.get(i) - b.indexes.get(i);
            mat.indexes.add(r);
        }
        return mat;
    }

    /**
     *
     * @param scalar
     */
    public void scalarMult(float scalar) {
        for (int i = 0; i < this.indexes.size(); i++) {
            float f = this.indexes.get(i) * scalar;
            this.indexes.set(i, f);
        }
    }

    /**
     *
     * @param mat
     * @param scalar
     * @return
     */
    public static Matrix3 scalarMult(Matrix3 mat, float scalar) {
        Matrix3 mat2 = new Matrix3();
        for (int i = 0; i < mat.indexes.size(); i++) {
            float r = mat.indexes.get(i) * scalar;
            mat2.indexes.add(r);
        }
        return mat2;
    }

    /**
     *
     * @param a
     */
    public void mult(Matrix3 a) {
        float i1 = (this.getI00() * a.getI00()) + (this.getI01() * a.getI10()) + (this.getI02() * a.getI20());
        float i2 = (this.getI00() * a.getI01()) + (this.getI01() * a.getI11()) + (this.getI02() * a.getI21());
        float i3 = (this.getI00() * a.getI02()) + (this.getI01() * a.getI12()) + (this.getI02() * a.getI22());
        float i4 = (this.getI10() * a.getI00()) + (this.getI11() * a.getI10()) + (this.getI12() * a.getI20());
        float i5 = (this.getI10() * a.getI01()) + (this.getI11() * a.getI11()) + (this.getI12() * a.getI21());
        float i6 = (this.getI10() * a.getI02()) + (this.getI11() * a.getI12()) + (this.getI12() * a.getI22());
        float i7 = (this.getI20() * a.getI00()) + (this.getI21() * a.getI10()) + (this.getI22() * a.getI20());
        float i8 = (this.getI20() * a.getI01()) + (this.getI21() * a.getI11()) + (this.getI22() * a.getI21());
        float i9 = (this.getI20() * a.getI02()) + (this.getI21() * a.getI12()) + (this.getI22() * a.getI22());
        this.setI00(i1);
        this.setI01(i2);
        this.setI02(i3);
        this.setI10(i4);
        this.setI11(i5);
        this.setI12(i6);
        this.setI20(i7);
        this.setI21(i8);
        this.setI22(i9);
    }

    /**
     *
     * @param a
     * @param b
     * @return
     */
    public static Matrix3 mult(Matrix3 a, Matrix3 b) {
        float i1 = (a.getI00() * b.getI00()) + (a.getI01() * b.getI10()) + (a.getI02() * b.getI20());
        float i2 = (a.getI00() * b.getI01()) + (a.getI01() * b.getI11()) + (a.getI02() * b.getI21());
        float i3 = (a.getI00() * b.getI02()) + (a.getI01() * b.getI12()) + (a.getI02() * b.getI22());
        float i4 = (a.getI10() * b.getI00()) + (a.getI11() * b.getI10()) + (a.getI12() * b.getI20());
        float i5 = (a.getI10() * b.getI01()) + (a.getI11() * b.getI11()) + (a.getI12() * b.getI21());
        float i6 = (a.getI10() * b.getI02()) + (a.getI11() * b.getI12()) + (a.getI12() * b.getI22());
        float i7 = (a.getI20() * b.getI00()) + (a.getI21() * b.getI10()) + (a.getI22() * b.getI20());
        float i8 = (a.getI20() * b.getI01()) + (a.getI21() * b.getI11()) + (a.getI22() * b.getI21());
        float i9 = (a.getI20() * b.getI02()) + (a.getI21() * b.getI12()) + (a.getI22() * b.getI22());
        return new Matrix3(i1, i2, i3, i4, i5, i6, i7, i8, i9);
    }

    /**
     *
     */
    public void invert() {
        float det1 = Matrix2.getDeterminant(new Matrix2(this.getI11(), this.getI12(), this.getI21(), this.getI22()));
        float det2 = Matrix2.getDeterminant(new Matrix2(this.getI10(), this.getI12(), this.getI20(), this.getI22()));
        float det3 = Matrix2.getDeterminant(new Matrix2(this.getI10(), this.getI11(), this.getI20(), this.getI21()));
        float det4 = Matrix2.getDeterminant(new Matrix2(this.getI01(), this.getI02(), this.getI21(), this.getI22()));
        float det5 = Matrix2.getDeterminant(new Matrix2(this.getI00(), this.getI02(), this.getI20(), this.getI22()));
        float det6 = Matrix2.getDeterminant(new Matrix2(this.getI00(), this.getI01(), this.getI20(), this.getI21()));
        float det7 = Matrix2.getDeterminant(new Matrix2(this.getI01(), this.getI02(), this.getI11(), this.getI12()));
        float det8 = Matrix2.getDeterminant(new Matrix2(this.getI00(), this.getI02(), this.getI10(), this.getI12()));
        float det9 = Matrix2.getDeterminant(new Matrix2(this.getI00(), this.getI01(), this.getI10(), this.getI11()));
        Matrix3 minorMat = new Matrix3(det1, det2, det3, det4, det5, det6, det7, det8, det9);
        minorMat.setI00(minorMat.getI00());
        minorMat.setI01(minorMat.getI01() * -1);
        minorMat.setI02(minorMat.getI02());
        minorMat.setI10(minorMat.getI10() * -1);
        minorMat.setI11(minorMat.getI11());
        minorMat.setI12(minorMat.getI12() * -1);
        minorMat.setI20(minorMat.getI20());
        minorMat.setI21(minorMat.getI21() * -1);
        minorMat.setI22(minorMat.getI22());
        minorMat.transpose();
        float det = this.getDeterminant();
        Matrix3 resultMat = Matrix3.scalarMult(minorMat, 1 / det);
        this.setI00(resultMat.getI00());
        this.setI01(resultMat.getI01());
        this.setI02(resultMat.getI02());
        this.setI10(resultMat.getI10());
        this.setI11(resultMat.getI11());
        this.setI12(resultMat.getI12());
        this.setI20(resultMat.getI20());
        this.setI21(resultMat.getI21());
        this.setI22(resultMat.getI22());

    }

    /**
     *
     * @param mat
     * @return
     */
    public static Matrix3 invert(Matrix3 mat) {
        float det1 = Matrix2.getDeterminant(new Matrix2(mat.getI11(), mat.getI12(), mat.getI21(), mat.getI22()));
        float det2 = Matrix2.getDeterminant(new Matrix2(mat.getI10(), mat.getI12(), mat.getI20(), mat.getI22()));
        float det3 = Matrix2.getDeterminant(new Matrix2(mat.getI10(), mat.getI11(), mat.getI20(), mat.getI21()));
        float det4 = Matrix2.getDeterminant(new Matrix2(mat.getI01(), mat.getI02(), mat.getI21(), mat.getI22()));
        float det5 = Matrix2.getDeterminant(new Matrix2(mat.getI00(), mat.getI02(), mat.getI20(), mat.getI22()));
        float det6 = Matrix2.getDeterminant(new Matrix2(mat.getI00(), mat.getI01(), mat.getI20(), mat.getI21()));
        float det7 = Matrix2.getDeterminant(new Matrix2(mat.getI01(), mat.getI02(), mat.getI11(), mat.getI12()));
        float det8 = Matrix2.getDeterminant(new Matrix2(mat.getI00(), mat.getI02(), mat.getI10(), mat.getI12()));
        float det9 = Matrix2.getDeterminant(new Matrix2(mat.getI00(), mat.getI01(), mat.getI10(), mat.getI11()));
        Matrix3 minorMat = new Matrix3(det1, det2, det3, det4, det5, det6, det7, det8, det9);
        minorMat.setI00(minorMat.getI00());
        minorMat.setI01(minorMat.getI01() * -1);
        minorMat.setI02(minorMat.getI02());
        minorMat.setI10(minorMat.getI10() * -1);
        minorMat.setI11(minorMat.getI11());
        minorMat.setI12(minorMat.getI12() * -1);
        minorMat.setI20(minorMat.getI20());
        minorMat.setI21(minorMat.getI21() * -1);
        minorMat.setI22(minorMat.getI22());
        minorMat.transpose();
        float det = mat.getDeterminant();
        Matrix3 resultMat = Matrix3.scalarMult(minorMat, 1 / det);
        return resultMat;
    }

    /**
     *
     * @param a
     * @param b
     * @return
     */
    public static Matrix3 divide(Matrix3 a, Matrix3 b) {
        b.invert();
        Matrix3 result = Matrix3.mult(a, b);
        return result;
    }

    /**
     *
     * @param mat
     */
    public void divide(Matrix3 mat) {
        mat.invert();
        this.mult(mat);
    }

    /**
     *
     */
    public void negate() {
        for (int i = 0; i < this.indexes.size(); i++) {
            this.indexes.set(i, this.indexes.get(i) * -1);
        }
    }

    /**
     *
     * @param mat
     * @return
     */
    public static Matrix3 negate(Matrix3 mat) {
        Matrix3 mat2 = new Matrix3();
        mat.indexes.forEach((f) -> {
            mat2.indexes.add(f * -1);
        });
        return mat2;
    }

    /**
     *
     * @param mat
     * @return
     */
    public static Matrix3 transpose(Matrix3 mat) {
        float original[][] = {{mat.getI00(), mat.getI01(), mat.getI02()}, {mat.getI10(), mat.getI11(), mat.getI12()}, {mat.getI20(), mat.getI21(), mat.getI22()}};
        float transpose[][] = new float[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[i][j] = original[j][i];
            }
        }
        Matrix3 result = new Matrix3(transpose[0][0], transpose[0][1], transpose[0][2], transpose[1][0], transpose[1][1], transpose[1][2], transpose[2][0], transpose[2][1], transpose[2][2]);
        return result;
    }

    /**
     *
     */
    public void transpose() {
        float original[][] = {{this.getI00(), this.getI01(), this.getI02()}, {this.getI10(), this.getI11(), this.getI12()}, {this.getI20(), this.getI21(), this.getI22()}};
        float transpose[][] = new float[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[i][j] = original[j][i];
            }
        }
        this.indexes.set(0, transpose[0][0]);
        this.indexes.set(1, transpose[0][1]);
        this.indexes.set(2, transpose[0][2]);
        this.indexes.set(3, transpose[1][0]);
        this.indexes.set(4, transpose[1][1]);
        this.indexes.set(5, transpose[1][2]);
        this.indexes.set(6, transpose[2][0]);
        this.indexes.set(7, transpose[2][1]);
        this.indexes.set(8, transpose[2][2]);
    }

    /**
     *
     * @return
     */
    public float getDeterminant() {
        float detA = this.getI00() * Matrix2.getDeterminant(new Matrix2(this.getI11(), this.getI12(), this.getI21(), this.getI22()));
        float detB = this.getI01() * Matrix2.getDeterminant(new Matrix2(this.getI10(), this.getI12(), this.getI20(), this.getI22()));;
        float detC = this.getI02() * Matrix2.getDeterminant(new Matrix2(this.getI10(), this.getI11(), this.getI20(), this.getI21()));;
        float determinant = detA - detB + detC;
        return determinant;
    }

    /**
     *
     * @param mat
     * @return
     */
    public static float getDeterminant(Matrix3 mat) {
        float detA = mat.getI00() * Matrix2.getDeterminant(new Matrix2(mat.getI11(), mat.getI12(), mat.getI21(), mat.getI22()));
        float detB = mat.getI01() * Matrix2.getDeterminant(new Matrix2(mat.getI10(), mat.getI12(), mat.getI20(), mat.getI22()));;
        float detC = mat.getI02() * Matrix2.getDeterminant(new Matrix2(mat.getI10(), mat.getI11(), mat.getI20(), mat.getI21()));;
        float determinant = detA - detB + detC;
        return determinant;
    }

    /**
     *
     */
    public void zero() {
        for (int i = 0; i < this.indexes.size(); i++) {
            this.indexes.set(i, 0f);
        }
    }

    /**
     *
     * @param mat
     * @return
     */
    public static Matrix3 zero(Matrix3 mat) {
        for (int i = 0; i < mat.indexes.size(); i++) {
            mat.indexes.set(i, 0f);
        }
        return mat;
    }
}
