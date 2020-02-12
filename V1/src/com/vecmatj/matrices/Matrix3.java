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
public class Matrix3 {

    private float i00;
    private float i01;
    private float i02;
    private float i10;
    private float i11;
    private float i12;
    private float i20;
    private float i21;
    private float i22;

    public Matrix3(float i00, float i01, float i02, float i10, float i11, float i12, float i20, float i21, float i22) {
        this.i00 = i00;
        this.i01 = i01;
        this.i02 = i02;
        this.i10 = i10;
        this.i11 = i11;
        this.i12 = i12;
        this.i20 = i20;
        this.i21 = i21;
        this.i22 = i22;
    }

    public Matrix3() {
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

    public float getI02() {
        return i02;
    }

    public void setI02(float i02) {
        this.i02 = i02;
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

    public float getI12() {
        return i12;
    }

    public void setI12(float i12) {
        this.i12 = i12;
    }

    public float getI20() {
        return i20;
    }

    public void setI20(float i20) {
        this.i20 = i20;
    }

    public float getI21() {
        return i21;
    }

    public void setI21(float i21) {
        this.i21 = i21;
    }

    public float getI22() {
        return i22;
    }

    public void setI22(float i22) {
        this.i22 = i22;
    }

    @Override
    public String toString() {
        return "{" + i00 + "," + i01 + "," + i02 + "\n" + i10 + "," + i11 + "," + i12 + "\n" + i20 + "," + i21 + "," + i22 + '}';
    }

    public void add(Matrix3 mat) {
        float i1 = this.getI00() + mat.getI00();
        float i2 = this.getI01() + mat.getI01();
        float i3 = this.getI02() + mat.getI02();
        float i4 = this.getI10() + mat.getI10();
        float i5 = this.getI11() + mat.getI11();
        float i6 = this.getI12() + mat.getI12();
        float i7 = this.getI20() + mat.getI20();
        float i8 = this.getI21() + mat.getI21();
        float i9 = this.getI22() + mat.getI22();
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

    public static Matrix3 add(Matrix3 a, Matrix3 b) {
        float i1 = a.getI00() + b.getI00();
        float i2 = a.getI01() + b.getI01();
        float i3 = a.getI02() + b.getI02();
        float i4 = a.getI10() + b.getI10();
        float i5 = a.getI11() + b.getI11();
        float i6 = a.getI12() + b.getI12();
        float i7 = a.getI20() + b.getI20();
        float i8 = a.getI21() + b.getI21();
        float i9 = a.getI22() + b.getI22();
        return new Matrix3(i1, i2, i3, i4, i5, i6, i7, i8, i9);
    }

    public void subtract(Matrix3 mat) {
        float i1 = this.getI00() - mat.getI00();
        float i2 = this.getI01() - mat.getI01();
        float i3 = this.getI02() - mat.getI02();
        float i4 = this.getI10() - mat.getI10();
        float i5 = this.getI11() - mat.getI11();
        float i6 = this.getI12() - mat.getI12();
        float i7 = this.getI20() - mat.getI20();
        float i8 = this.getI21() - mat.getI21();
        float i9 = this.getI22() - mat.getI22();
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

    public static Matrix3 subtract(Matrix3 a, Matrix3 b) {
        float i1 = a.getI00() - b.getI00();
        float i2 = a.getI01() - b.getI01();
        float i3 = a.getI02() - b.getI02();
        float i4 = a.getI10() - b.getI10();
        float i5 = a.getI11() - b.getI11();
        float i6 = a.getI12() - b.getI12();
        float i7 = a.getI20() - b.getI20();
        float i8 = a.getI21() - b.getI21();
        float i9 = a.getI22() - b.getI22();
        return new Matrix3(i1, i2, i3, i4, i5, i6, i7, i8, i9);
    }

    public void scalarMult(float scalar) {
        this.setI00(this.getI00() * scalar);
        this.setI01(this.getI01() * scalar);
        this.setI02(this.getI02() * scalar);
        this.setI10(this.getI10() * scalar);
        this.setI11(this.getI11() * scalar);
        this.setI12(this.getI12() * scalar);
        this.setI20(this.getI20() * scalar);
        this.setI21(this.getI21() * scalar);
        this.setI22(this.getI22() * scalar);
    }

    public static Matrix3 scalarMult(Matrix3 mat, float scalar) {
        float i1 = mat.getI00() * scalar;
        float i2 = mat.getI01() * scalar;;
        float i3 = mat.getI02() * scalar;
        float i4 = mat.getI10() * scalar;
        float i5 = mat.getI11() * scalar;
        float i6 = mat.getI12() * scalar;
        float i7 = mat.getI20() * scalar;
        float i8 = mat.getI21() * scalar;
        float i9 = mat.getI22() * scalar;
        return new Matrix3(i1, i2, i3, i4, i5, i6, i7, i8, i9);
    }

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
        return new Matrix3(i1, i2, i3, i4,i5,i6,i7,i8,i9);
    }
    
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
        Matrix3 minorMat = new Matrix3(det1,det2,det3,det4,det5,det6,det7,det8,det9);
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
        Matrix3 resultMat = Matrix3.scalarMult(minorMat, 1/det);
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
        Matrix3 minorMat = new Matrix3(det1,det2,det3,det4,det5,det6,det7,det8,det9);
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
        Matrix3 resultMat = Matrix3.scalarMult(minorMat, 1/det);
        return resultMat;
    }

    public static Matrix3 divide(Matrix3 a, Matrix3 b) {
        b.invert();
        Matrix3 result = Matrix3.mult(a, b);
        return result;
    }

    public void divide(Matrix3 mat) {
        mat.invert();
        this.mult(mat);
    }
    public void negate() {
        this.setI00(this.getI00() * -1);
        this.setI01(this.getI01() * -1);
        this.setI02(this.getI02() * -1);
        this.setI10(this.getI10() * -1);
        this.setI11(this.getI11() * -1);
        this.setI12(this.getI12() * -1);
        this.setI20(this.getI20() * -1);
        this.setI21(this.getI21() * -1);
        this.setI22(this.getI22() * -1);
    }

    public static Matrix3 negate(Matrix3 mat) {
        float i1 = mat.getI00() * -1;
        float i2 = mat.getI01() * -1;
        float i3 = mat.getI02() * -1;
        float i4 = mat.getI10() * -1;
        float i5 = mat.getI11() * -1;
        float i6 = mat.getI12() * -1;
        float i7 = mat.getI20() * -1;
        float i8 = mat.getI21() * -1;
        float i9 = mat.getI22() * -1;

        return new Matrix3(i1, i2, i3, i4, i5, i6, i7, i8, i9);
    }

    public static Matrix3 transpose(Matrix3 mat) {
        float original[][] = {{mat.i00, mat.i01, mat.i02}, {mat.i10, mat.i11, mat.i12}, {mat.i20, mat.i21, mat.i22}};
        float transpose[][] = new float[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[i][j] = original[j][i];
            }
        }
        Matrix3 result = new Matrix3(transpose[0][0], transpose[0][1], transpose[0][2], transpose[1][0], transpose[1][1], transpose[1][2], transpose[2][0], transpose[2][1], transpose[2][2]);
        return result;
    }

    public void transpose() {
        float original[][] = {{this.i00, this.i01, this.i02}, {this.i10, this.i11, this.i12}, {this.i20, this.i21, this.i22}};
        float transpose[][] = new float[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[i][j] = original[j][i];
            }
        }
        this.i00 = transpose[0][0];
        this.i01 = transpose[0][1];
        this.i02 = transpose[0][2];
        this.i10 = transpose[1][0];
        this.i11 = transpose[1][1];
        this.i12 = transpose[1][2];
        this.i20 = transpose[2][0];
        this.i21 = transpose[2][1];
        this.i22 = transpose[2][2];
    }

    public float getDeterminant() {
        float detA = this.getI00() * Matrix2.getDeterminant(new Matrix2(this.getI11(), this.getI12(), this.getI21(), this.getI22()));
        float detB = this.getI01() * Matrix2.getDeterminant(new Matrix2(this.getI10(), this.getI12(), this.getI20(), this.getI22()));;
        float detC = this.getI02() * Matrix2.getDeterminant(new Matrix2(this.getI10(), this.getI11(), this.getI20(), this.getI21()));;
        float determinant = detA - detB + detC;
        return determinant;
    }

    public static float getDeterminant(Matrix3 mat) {
        float detA = mat.getI00() * Matrix2.getDeterminant(new Matrix2(mat.getI11(), mat.getI12(), mat.getI21(), mat.getI22()));
        float detB = mat.getI01() * Matrix2.getDeterminant(new Matrix2(mat.getI10(), mat.getI12(), mat.getI20(), mat.getI22()));;
        float detC = mat.getI02() * Matrix2.getDeterminant(new Matrix2(mat.getI10(), mat.getI11(), mat.getI20(), mat.getI21()));;
        float determinant = detA - detB + detC;
        return determinant;
    }

    public void zero() {
        this.i00 = 0;
        this.i01 = 0;
        this.i02 = 0;
        this.i10 = 0;
        this.i11 = 0;
        this.i12 = 0;
        this.i20 = 0;
        this.i21 = 0;
        this.i22 = 0;
    }

    public static Matrix3 zero(Matrix3 mat) {
        mat.i00 = 0;
        mat.i01 = 0;
        mat.i02 = 0;
        mat.i10 = 0;
        mat.i11 = 0;
        mat.i12 = 0;
        mat.i20 = 0;
        mat.i21 = 0;
        mat.i22 = 0;
        return mat;
    }
}
