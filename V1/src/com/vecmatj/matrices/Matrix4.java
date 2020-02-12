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
public class Matrix4 {

    private float i00;
    private float i01;
    private float i02;
    private float i03;
    private float i10;
    private float i11;
    private float i12;
    private float i13;
    private float i20;
    private float i21;
    private float i22;
    private float i23;
    private float i30;
    private float i31;
    private float i32;
    private float i33;

    public Matrix4(float i00, float i01, float i02, float i03, float i10, float i11, float i12, float i13, float i20, float i21, float i22, float i23, float i30, float i31, float i32, float i33) {
        this.i00 = i00;
        this.i01 = i01;
        this.i02 = i02;
        this.i03 = i03;
        this.i10 = i10;
        this.i11 = i11;
        this.i12 = i12;
        this.i13 = i13;
        this.i20 = i20;
        this.i21 = i21;
        this.i22 = i22;
        this.i23 = i23;
        this.i30 = i30;
        this.i31 = i31;
        this.i32 = i32;
        this.i33 = i33;
    }

    public Matrix4() {
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

    public float getI03() {
        return i03;
    }

    public void setI03(float i03) {
        this.i03 = i03;
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

    public float getI13() {
        return i13;
    }

    public void setI13(float i13) {
        this.i13 = i13;
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

    public float getI23() {
        return i23;
    }

    public void setI23(float i23) {
        this.i23 = i23;
    }

    public float getI30() {
        return i30;
    }

    public void setI30(float i30) {
        this.i30 = i30;
    }

    public float getI31() {
        return i31;
    }

    public void setI31(float i31) {
        this.i31 = i31;
    }

    public float getI32() {
        return i32;
    }

    public void setI32(float i32) {
        this.i32 = i32;
    }

    public float getI33() {
        return i33;
    }

    public void setI33(float i33) {
        this.i33 = i33;
    }

    public void add(Matrix4 mat) {
        float i1 = this.getI00() + mat.getI00();
        float i2 = this.getI01() + mat.getI01();
        float i3 = this.getI02() + mat.getI02();
        float i4 = this.getI03() + mat.getI03();
        float i5 = this.getI10() + mat.getI10();
        float i6 = this.getI11() + mat.getI11();
        float i7 = this.getI12() + mat.getI12();
        float i8 = this.getI13() + mat.getI13();
        float i9 = this.getI20() + mat.getI20();
        float i100 = this.getI21() + mat.getI21();
        float i110 = this.getI22() + mat.getI22();
        float i120 = this.getI23() + mat.getI23();
        float i130 = this.getI30() + mat.getI30();
        float i14 = this.getI31() + mat.getI31();
        float i15 = this.getI32() + mat.getI32();
        float i16 = this.getI33() + mat.getI33();
        this.setI00(i1);
        this.setI01(i2);
        this.setI02(i3);
        this.setI03(i4);
        this.setI10(i5);
        this.setI11(i6);
        this.setI12(i7);
        this.setI13(i8);
        this.setI20(i9);
        this.setI21(i100);
        this.setI22(i110);
        this.setI23(i120);
        this.setI30(i130);
        this.setI31(i14);
        this.setI32(i15);
        this.setI33(i16);
    }

    public static Matrix4 add(Matrix4 a, Matrix4 b) {
        float i1 = a.getI00() + b.getI00();
        float i2 = a.getI01() + b.getI01();
        float i3 = a.getI02() + b.getI02();
        float i4 = a.getI03() + b.getI03();
        float i5 = a.getI10() + b.getI10();
        float i6 = a.getI11() + b.getI11();
        float i7 = a.getI12() + b.getI12();
        float i8 = a.getI13() + b.getI13();
        float i9 = a.getI20() + b.getI20();
        float i100 = a.getI21() + b.getI21();
        float i110 = a.getI22() + b.getI22();
        float i120 = a.getI23() + b.getI23();
        float i130 = a.getI30() + b.getI30();
        float i14 = a.getI31() + b.getI31();
        float i15 = a.getI32() + b.getI32();
        float i16 = a.getI33() + b.getI33();
        return new Matrix4(i1, i2, i3, i4, i5, i6, i7, i8, i9, i100, i110, i120, i130, i14, i15, i16);
    }

    public void subtract(Matrix4 mat) {
        float i1 = this.getI00() - mat.getI00();
        float i2 = this.getI01() - mat.getI01();
        float i3 = this.getI02() - mat.getI02();
        float i4 = this.getI03() - mat.getI03();
        float i5 = this.getI10() - mat.getI10();
        float i6 = this.getI11() - mat.getI11();
        float i7 = this.getI12() - mat.getI12();
        float i8 = this.getI13() - mat.getI13();
        float i9 = this.getI20() - mat.getI20();
        float i100 = this.getI21() - mat.getI21();
        float i110 = this.getI22() - mat.getI22();
        float i120 = this.getI23() - mat.getI23();
        float i130 = this.getI30() - mat.getI30();
        float i14 = this.getI31() - mat.getI31();
        float i15 = this.getI32() - mat.getI32();
        float i16 = this.getI33() - mat.getI33();
        this.setI00(i1);
        this.setI01(i2);
        this.setI02(i3);
        this.setI03(i4);
        this.setI10(i5);
        this.setI11(i6);
        this.setI12(i7);
        this.setI13(i8);
        this.setI20(i9);
        this.setI21(i100);
        this.setI22(i110);
        this.setI23(i120);
        this.setI30(i130);
        this.setI31(i14);
        this.setI32(i15);
        this.setI33(i16);
    }

    public static Matrix4 subtract(Matrix4 a, Matrix4 b) {
        float i1 = a.getI00() - b.getI00();
        float i2 = a.getI01() - b.getI01();
        float i3 = a.getI02() - b.getI02();
        float i4 = a.getI03() - b.getI03();
        float i5 = a.getI10() - b.getI10();
        float i6 = a.getI11() - b.getI11();
        float i7 = a.getI12() - b.getI12();
        float i8 = a.getI13() - b.getI13();
        float i9 = a.getI20() - b.getI20();
        float i100 = a.getI21() - b.getI21();
        float i110 = a.getI22() - b.getI22();
        float i120 = a.getI23() - b.getI23();
        float i130 = a.getI30() - b.getI30();
        float i14 = a.getI31() - b.getI31();
        float i15 = a.getI32() - b.getI32();
        float i16 = a.getI33() - b.getI33();
        return new Matrix4(i1, i2, i3, i4, i5, i6, i7, i8, i9, i100, i110, i120, i130, i14, i15, i16);
    }

    public void scalarMult(float scalar) {
        this.setI00(this.getI00() * scalar);
        this.setI01(this.getI01() * scalar);
        this.setI02(this.getI02() * scalar);
        this.setI03(this.getI03() * scalar);
        this.setI10(this.getI10() * scalar);
        this.setI11(this.getI11() * scalar);
        this.setI12(this.getI12() * scalar);
        this.setI13(this.getI13() * scalar);
        this.setI20(this.getI20() * scalar);
        this.setI21(this.getI21() * scalar);
        this.setI22(this.getI22() * scalar);
        this.setI23(this.getI23() * scalar);
        this.setI30(this.getI30() * scalar);
        this.setI31(this.getI31() * scalar);
        this.setI32(this.getI32() * scalar);
        this.setI33(this.getI33() * scalar);
    }

    public static Matrix4 scalarMult(Matrix4 mat, float scalar) {
        float i1 = mat.getI00() * scalar;
        float i2 = mat.getI01() * scalar;
        float i3 = mat.getI02() * scalar;
        float i4 = mat.getI03() * scalar;
        float i5 = mat.getI10() * scalar;
        float i6 = mat.getI11() * scalar;
        float i7 = mat.getI12() * scalar;
        float i8 = mat.getI13() * scalar;
        float i9 = mat.getI20() * scalar;
        float i100 = mat.getI21() * scalar;
        float i110 = mat.getI22() * scalar;
        float i120 = mat.getI23() * scalar;
        float i130 = mat.getI30() * scalar;
        float i14 = mat.getI31() * scalar;
        float i15 = mat.getI32() * scalar;
        float i16 = mat.getI33() * scalar;
        return new Matrix4(i1, i2, i3, i4, i5, i6, i7, i8, i9, i100, i110, i120, i130, i14, i15, i16);
    }

    public void mult(Matrix4 a) {
        float i1 = (this.getI00() * a.getI00()) + (this.getI01() * a.getI10()) + (this.getI02() * a.getI20()) + (this.getI03() * a.getI30());
        float i2 = (this.getI00() * a.getI01()) + (this.getI01() * a.getI11()) + (this.getI02() * a.getI21() + (this.getI03() * a.getI31()));
        float i3 = (this.getI00() * a.getI02()) + (this.getI01() * a.getI12()) + (this.getI02() * a.getI22() + (this.getI03() * a.getI32()));
        float i4 = (this.getI00() * a.getI03()) + (this.getI01() * a.getI13()) + (this.getI02() * a.getI23() + (this.getI03() * a.getI33()));
        float i5 = (this.getI10() * a.getI00()) + (this.getI11() * a.getI10()) + (this.getI12() * a.getI20() + (this.getI13() * a.getI30()));
        float i6 = (this.getI10() * a.getI01()) + (this.getI11() * a.getI11()) + (this.getI12() * a.getI21() + (this.getI13() * a.getI31()));
        float i7 = (this.getI10() * a.getI02()) + (this.getI11() * a.getI12()) + (this.getI12() * a.getI22() + (this.getI13() * a.getI32()));
        float i8 = (this.getI10() * a.getI03()) + (this.getI11() * a.getI13()) + (this.getI12() * a.getI23() + (this.getI13() * a.getI33()));
        float i9 = (this.getI20() * a.getI00()) + (this.getI21() * a.getI10()) + (this.getI22() * a.getI20() + (this.getI23() * a.getI30()));
        float i100 = (this.getI20() * a.getI01()) + (this.getI21() * a.getI11()) + (this.getI22() * a.getI21() + (this.getI23() * a.getI31()));
        float i110 = (this.getI20() * a.getI02()) + (this.getI21() * a.getI12()) + (this.getI22() * a.getI22() + (this.getI23() * a.getI32()));
        float i120 = (this.getI20() * a.getI03()) + (this.getI21() * a.getI13()) + (this.getI22() * a.getI23() + (this.getI23() * a.getI33()));
        float i130 = (this.getI30() * a.getI00()) + (this.getI31() * a.getI10()) + (this.getI32() * a.getI20() + (this.getI33() * a.getI30()));
        float i14 = (this.getI30() * a.getI01()) + (this.getI31() * a.getI11()) + (this.getI32() * a.getI21() + (this.getI33() * a.getI31()));
        float i15 = (this.getI30() * a.getI02()) + (this.getI31() * a.getI12()) + (this.getI32() * a.getI22() + (this.getI33() * a.getI32()));
        float i16 = (this.getI30() * a.getI03()) + (this.getI31() * a.getI13()) + (this.getI32() * a.getI23() + (this.getI33() * a.getI33()));
        this.setI00(i1);
        this.setI01(i2);
        this.setI02(i3);
        this.setI03(i4);
        this.setI10(i5);
        this.setI11(i6);
        this.setI12(i7);
        this.setI13(i8);
        this.setI20(i9);
        this.setI21(i100);
        this.setI22(i110);
        this.setI23(i120);
        this.setI30(i130);
        this.setI31(i14);
        this.setI32(i15);
        this.setI33(i16);
    }

    public static Matrix4 mult(Matrix4 a, Matrix4 b) {
        float i1 = (a.getI00() * b.getI00()) + (a.getI01() * b.getI10()) + (a.getI02() * b.getI20()) + (a.getI03() * b.getI30());
        float i2 = (a.getI00() * b.getI01()) + (a.getI01() * b.getI11()) + (a.getI02() * b.getI21() + (a.getI03() * b.getI31()));
        float i3 = (a.getI00() * b.getI02()) + (a.getI01() * b.getI12()) + (a.getI02() * b.getI22() + (a.getI03() * b.getI32()));
        float i4 = (a.getI00() * b.getI03()) + (a.getI01() * b.getI13()) + (a.getI02() * b.getI23() + (a.getI03() * b.getI33()));
        float i5 = (a.getI10() * b.getI00()) + (a.getI11() * b.getI10()) + (a.getI12() * b.getI20() + (a.getI13() * b.getI30()));
        float i6 = (a.getI10() * b.getI01()) + (a.getI11() * b.getI11()) + (a.getI12() * b.getI21() + (a.getI13() * b.getI31()));
        float i7 = (a.getI10() * b.getI02()) + (a.getI11() * b.getI12()) + (a.getI12() * b.getI22() + (a.getI13() * b.getI32()));
        float i8 = (a.getI10() * b.getI03()) + (a.getI11() * b.getI13()) + (a.getI12() * b.getI23() + (a.getI13() * b.getI33()));
        float i9 = (a.getI20() * b.getI00()) + (a.getI21() * b.getI10()) + (a.getI22() * b.getI20() + (a.getI23() * b.getI30()));
        float i100 = (a.getI20() * b.getI01()) + (a.getI21() * b.getI11()) + (a.getI22() * b.getI21() + (a.getI23() * b.getI31()));
        float i110 = (a.getI20() * b.getI02()) + (a.getI21() * b.getI12()) + (a.getI22() * b.getI22() + (a.getI23() * b.getI32()));
        float i120 = (a.getI20() * b.getI03()) + (a.getI21() * b.getI13()) + (a.getI22() * b.getI23() + (a.getI23() * b.getI33()));
        float i130 = (a.getI30() * b.getI00()) + (a.getI31() * b.getI10()) + (a.getI32() * b.getI20() + (a.getI33() * b.getI30()));
        float i14 = (a.getI30() * b.getI01()) + (a.getI31() * b.getI11()) + (a.getI32() * b.getI21() + (a.getI33() * b.getI31()));
        float i15 = (a.getI30() * b.getI02()) + (a.getI31() * b.getI12()) + (a.getI32() * b.getI22() + (a.getI33() * b.getI32()));
        float i16 = (a.getI30() * b.getI03()) + (a.getI31() * b.getI13()) + (a.getI32() * b.getI23() + (a.getI33() * b.getI33()));
        return new Matrix4(i1, i2, i3, i4, i5, i6, i7, i8, i9, i100, i110, i120, i130, i14, i15, i16);
    }

    public void invert() {
        float det1 = Matrix3.getDeterminant(new Matrix3(this.i11, this.i12, this.i13, this.i21, this.i22, this.i23, this.i31, this.i32, this.i33));
        float det2 = Matrix3.getDeterminant(new Matrix3(this.i10, this.i12, this.i13, this.i20, this.i22, this.i23, this.i30, this.i32, this.i33));
        float det3 = Matrix3.getDeterminant(new Matrix3(this.i10, this.i11, this.i13, this.i20, this.i21, this.i23, this.i30, this.i31, this.i33));
        float det4 = Matrix3.getDeterminant(new Matrix3(this.i10, this.i11, this.i12, this.i20, this.i21, this.i22, this.i30, this.i31, this.i32));
        float det5 = Matrix3.getDeterminant(new Matrix3(this.i01, this.i02, this.i03, this.i21, this.i22, this.i23, this.i31, this.i32, this.i33));
        float det6 = Matrix3.getDeterminant(new Matrix3(this.i00, this.i02, this.i03, this.i20, this.i22, this.i23, this.i30, this.i32, this.i33));
        float det7 = Matrix3.getDeterminant(new Matrix3(this.i00, this.i01, this.i03, this.i20, this.i21, this.i23, this.i30, this.i31, this.i33));
        float det8 = Matrix3.getDeterminant(new Matrix3(this.i00, this.i01, this.i02, this.i20, this.i21, this.i22, this.i30, this.i31, this.i32));
        float det9 = Matrix3.getDeterminant(new Matrix3(this.i01, this.i02, this.i03, this.i11, this.i12, this.i13, this.i31, this.i32, this.i33));
        float det10 = Matrix3.getDeterminant(new Matrix3(this.i00, this.i02, this.i03, this.i10, this.i12, this.i13, this.i30, this.i32, this.i33));
        float det11 = Matrix3.getDeterminant(new Matrix3(this.i00, this.i01, this.i03, this.i10, this.i11, this.i13, this.i30, this.i31, this.i33));
        float det12 = Matrix3.getDeterminant(new Matrix3(this.i00, this.i01, this.i02, this.i10, this.i11, this.i12, this.i30, this.i31, this.i32));
        float det13 = Matrix3.getDeterminant(new Matrix3(this.i01, this.i02, this.i03, this.i11, this.i12, this.i13, this.i21, this.i22, this.i23));
        float det14 = Matrix3.getDeterminant(new Matrix3(this.i00, this.i02, this.i03, this.i10, this.i12, this.i13, this.i20, this.i22, this.i23));
        float det15 = Matrix3.getDeterminant(new Matrix3(this.i00, this.i01, this.i03, this.i10, this.i11, this.i13, this.i20, this.i21, this.i23));
        float det16 = Matrix3.getDeterminant(new Matrix3(this.i00, this.i01, this.i02, this.i10, this.i11, this.i12, this.i20, this.i21, this.i22));
        Matrix4 minorMat = new Matrix4(det1, det2, det3, det4, det5, det6, det7, det8, det9, det10, det11, det12, det13, det14, det15, det16);
        minorMat.setI00(minorMat.getI00());
        minorMat.setI01(minorMat.getI01() * -1);
        minorMat.setI02(minorMat.getI02());
        minorMat.setI03(minorMat.getI03() * -1);
        minorMat.setI10(minorMat.getI10());
        minorMat.setI11(minorMat.getI11() * -1);
        minorMat.setI12(minorMat.getI12());
        minorMat.setI13(minorMat.getI13() * -1);
        minorMat.setI20(minorMat.getI20());
        minorMat.setI21(minorMat.getI21() * -1);
        minorMat.setI22(minorMat.getI22());
        minorMat.setI23(minorMat.getI23() * -1);
        minorMat.setI30(minorMat.getI30());
        minorMat.setI31(minorMat.getI31() * -1);
        minorMat.setI32(minorMat.getI32());
        minorMat.setI33(minorMat.getI33() * -1);
        minorMat.transpose();
        float det = this.getDeterminant();
        Matrix4 resultMat = Matrix4.scalarMult(minorMat, 1 / det);
        this.setI00(resultMat.getI00());
        this.setI01(resultMat.getI01());
        this.setI02(resultMat.getI02());
        this.setI03(resultMat.getI03());
        this.setI10(resultMat.getI10());
        this.setI11(resultMat.getI11());
        this.setI12(resultMat.getI12());
        this.setI13(resultMat.getI13());
        this.setI20(resultMat.getI20());
        this.setI21(resultMat.getI21());
        this.setI22(resultMat.getI22());
        this.setI23(resultMat.getI23());
        this.setI30(resultMat.getI30());
        this.setI31(resultMat.getI31());
        this.setI32(resultMat.getI32());
        this.setI33(resultMat.getI33());

    }

    public static Matrix4 invert(Matrix4 mat) {
        float det1 = Matrix3.getDeterminant(new Matrix3(mat.i11, mat.i12, mat.i13, mat.i21, mat.i22, mat.i23, mat.i31, mat.i32, mat.i33));
        float det2 = Matrix3.getDeterminant(new Matrix3(mat.i10, mat.i12, mat.i13, mat.i20, mat.i22, mat.i23, mat.i30, mat.i32, mat.i33));
        float det3 = Matrix3.getDeterminant(new Matrix3(mat.i10, mat.i11, mat.i13, mat.i20, mat.i21, mat.i23, mat.i30, mat.i31, mat.i33));
        float det4 = Matrix3.getDeterminant(new Matrix3(mat.i10, mat.i11, mat.i12, mat.i20, mat.i21, mat.i22, mat.i30, mat.i31, mat.i32));
        float det5 = Matrix3.getDeterminant(new Matrix3(mat.i01, mat.i02, mat.i03, mat.i21, mat.i22, mat.i23, mat.i31, mat.i32, mat.i33));
        float det6 = Matrix3.getDeterminant(new Matrix3(mat.i00, mat.i02, mat.i03, mat.i20, mat.i22, mat.i23, mat.i30, mat.i32, mat.i33));
        float det7 = Matrix3.getDeterminant(new Matrix3(mat.i00, mat.i01, mat.i03, mat.i20, mat.i21, mat.i23, mat.i30, mat.i31, mat.i33));
        float det8 = Matrix3.getDeterminant(new Matrix3(mat.i00, mat.i01, mat.i02, mat.i20, mat.i21, mat.i22, mat.i30, mat.i31, mat.i32));
        float det9 = Matrix3.getDeterminant(new Matrix3(mat.i01, mat.i02, mat.i03, mat.i11, mat.i12, mat.i13, mat.i31, mat.i32, mat.i33));
        float det10 = Matrix3.getDeterminant(new Matrix3(mat.i00, mat.i02, mat.i03, mat.i10, mat.i12, mat.i13, mat.i30, mat.i32, mat.i33));
        float det11 = Matrix3.getDeterminant(new Matrix3(mat.i00, mat.i01, mat.i03, mat.i10, mat.i11, mat.i13, mat.i30, mat.i31, mat.i33));
        float det12 = Matrix3.getDeterminant(new Matrix3(mat.i00, mat.i01, mat.i02, mat.i10, mat.i11, mat.i12, mat.i30, mat.i31, mat.i32));
        float det13 = Matrix3.getDeterminant(new Matrix3(mat.i01, mat.i02, mat.i03, mat.i11, mat.i12, mat.i13, mat.i21, mat.i22, mat.i23));
        float det14 = Matrix3.getDeterminant(new Matrix3(mat.i00, mat.i02, mat.i03, mat.i10, mat.i12, mat.i13, mat.i20, mat.i22, mat.i23));
        float det15 = Matrix3.getDeterminant(new Matrix3(mat.i00, mat.i01, mat.i03, mat.i10, mat.i11, mat.i13, mat.i20, mat.i21, mat.i23));
        float det16 = Matrix3.getDeterminant(new Matrix3(mat.i00, mat.i01, mat.i02, mat.i10, mat.i11, mat.i12, mat.i20, mat.i21, mat.i22));
        Matrix4 minorMat = new Matrix4(det1, det2, det3, det4, det5, det6, det7, det8, det9, det10, det11, det12, det13, det14, det15, det16);
        minorMat.setI00(minorMat.getI00());
        minorMat.setI01(minorMat.getI01() * -1);
        minorMat.setI02(minorMat.getI02());
        minorMat.setI03(minorMat.getI03() * -1);
        minorMat.setI10(minorMat.getI10());
        minorMat.setI11(minorMat.getI11() * -1);
        minorMat.setI12(minorMat.getI12());
        minorMat.setI13(minorMat.getI13() * -1);
        minorMat.setI20(minorMat.getI20());
        minorMat.setI21(minorMat.getI21() * -1);
        minorMat.setI22(minorMat.getI22());
        minorMat.setI23(minorMat.getI23() * -1);
        minorMat.setI30(minorMat.getI30());
        minorMat.setI31(minorMat.getI31() * -1);
        minorMat.setI32(minorMat.getI32());
        minorMat.setI33(minorMat.getI33() * -1);
        minorMat.transpose();
        float det = mat.getDeterminant();
        Matrix4 resultMat = Matrix4.scalarMult(minorMat, 1 / det);
        return resultMat;
    }

    public static Matrix4 divide(Matrix4 a, Matrix4 b) {
        b.invert();
        Matrix4 result = Matrix4.mult(a, b);
        return result;
    }

    public void divide(Matrix4 mat) {
        mat.invert();
        this.mult(mat);
    }

    public void negate() {
        this.setI00(this.getI00() * -1);
        this.setI01(this.getI01() * -1);
        this.setI02(this.getI02() * -1);
        this.setI03(this.getI03() * -1);
        this.setI10(this.getI10() * -1);
        this.setI11(this.getI11() * -1);
        this.setI12(this.getI12() * -1);
        this.setI13(this.getI13() * -1);
        this.setI20(this.getI20() * -1);
        this.setI21(this.getI21() * -1);
        this.setI22(this.getI22() * -1);
        this.setI23(this.getI23() * -1);
        this.setI30(this.getI30() * -1);
        this.setI31(this.getI31() * -1);
        this.setI32(this.getI32() * -1);
        this.setI33(this.getI33() * -1);
    }

    public static Matrix4 negate(Matrix4 mat) {
        float i1 = mat.getI00() * -1;
        float i2 = mat.getI01() * -1;
        float i3 = mat.getI02() * -1;
        float i4 = mat.getI03() * -1;
        float i5 = mat.getI10() * -1;
        float i6 = mat.getI11() * -1;
        float i7 = mat.getI12() * -1;
        float i8 = mat.getI13() * -1;
        float i9 = mat.getI20() * -1;
        float i10 = mat.getI21() * -1;
        float i11 = mat.getI22() * -1;
        float i12 = mat.getI23() * -1;
        float i13 = mat.getI30() * -1;
        float i14 = mat.getI31() * -1;
        float i15 = mat.getI32() * -1;
        float i16 = mat.getI33() * -1;

        return new Matrix4(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16);
    }

    public static Matrix4 transpose(Matrix4 mat) {
        float original[][] = {{mat.i00, mat.i01, mat.i02, mat.i03}, {mat.i10, mat.i11, mat.i12, mat.i13}, {mat.i20, mat.i21, mat.i22, mat.i23}, {mat.i30, mat.i31, mat.i32, mat.i33}};
        float transpose[][] = new float[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                transpose[i][j] = original[j][i];
            }
        }
        Matrix4 result = new Matrix4(transpose[0][0], transpose[0][1], transpose[0][2], transpose[0][3], transpose[1][0], transpose[1][1], transpose[1][2], transpose[1][3], transpose[2][0], transpose[2][1], transpose[2][2], transpose[2][3], transpose[3][0], transpose[3][1], transpose[3][2], transpose[3][3]);
        return result;
    }

    public void transpose() {
        float original[][] = {{this.i00, this.i01, this.i02, this.i03}, {this.i10, this.i11, this.i12, this.i13}, {this.i20, this.i21, this.i22, this.i23}, {this.i30, this.i31, this.i32, this.i33}};
        float transpose[][] = new float[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                transpose[i][j] = original[j][i];
            }
        }
        this.i00 = transpose[0][0];
        this.i01 = transpose[0][1];
        this.i02 = transpose[0][2];
        this.i03 = transpose[0][3];
        this.i10 = transpose[1][0];
        this.i11 = transpose[1][1];
        this.i12 = transpose[1][2];
        this.i13 = transpose[1][3];
        this.i20 = transpose[2][0];
        this.i21 = transpose[2][1];
        this.i22 = transpose[2][2];
        this.i23 = transpose[2][3];
        this.i30 = transpose[3][0];
        this.i31 = transpose[3][1];
        this.i32 = transpose[3][2];
        this.i33 = transpose[3][3];
    }

    public float getDeterminant() {
        float detA = this.getI00() * Matrix3.getDeterminant(new Matrix3(this.getI11(), this.getI12(), this.getI13(), this.getI21(), this.getI22(), this.getI23(), this.getI31(), this.getI32(), this.getI33()));
        float detB = this.getI01() * Matrix3.getDeterminant(new Matrix3(this.getI10(), this.getI12(), this.getI13(), this.getI20(), this.getI22(), this.getI23(), this.getI30(), this.getI32(), this.getI33()));
        float detC = this.getI02() * Matrix3.getDeterminant(new Matrix3(this.getI10(), this.getI11(), this.getI13(), this.getI20(), this.getI21(), this.getI23(), this.getI30(), this.getI31(), this.getI33()));
        float detD = this.getI03() * Matrix3.getDeterminant(new Matrix3(this.getI10(), this.getI11(), this.getI12(), this.getI20(), this.getI21(), this.getI22(), this.getI30(), this.getI31(), this.getI32()));
        float determinant = detA - detB + detC - detD;
        return determinant;
    }

    public static float getDeterminant(Matrix4 mat) {
        float detA = mat.getI00() * Matrix3.getDeterminant(new Matrix3(mat.getI11(), mat.getI12(), mat.getI13(), mat.getI21(), mat.getI22(), mat.getI23(), mat.getI31(), mat.getI32(), mat.getI33()));
        float detB = mat.getI01() * Matrix3.getDeterminant(new Matrix3(mat.getI10(), mat.getI12(), mat.getI13(), mat.getI20(), mat.getI22(), mat.getI23(), mat.getI30(), mat.getI32(), mat.getI33()));
        float detC = mat.getI02() * Matrix3.getDeterminant(new Matrix3(mat.getI10(), mat.getI11(), mat.getI13(), mat.getI20(), mat.getI21(), mat.getI23(), mat.getI30(), mat.getI31(), mat.getI33()));
        float detD = mat.getI03() * Matrix3.getDeterminant(new Matrix3(mat.getI10(), mat.getI11(), mat.getI12(), mat.getI20(), mat.getI21(), mat.getI22(), mat.getI30(), mat.getI31(), mat.getI32()));
        float determinant = detA - detB + detC - detD;
        return determinant;
    }

    public void zero() {
        this.i00 = 0;
        this.i01 = 0;
        this.i02 = 0;
        this.i03 = 0;
        this.i10 = 0;
        this.i11 = 0;
        this.i12 = 0;
        this.i13 = 0;
        this.i20 = 0;
        this.i21 = 0;
        this.i22 = 0;
        this.i23 = 0;
        this.i30 = 0;
        this.i31 = 0;
        this.i32 = 0;
        this.i33 = 0;
    }

    public static Matrix4 zero(Matrix4 mat) {
        mat.i00 = 0;
        mat.i01 = 0;
        mat.i02 = 0;
        mat.i03 = 0;
        mat.i10 = 0;
        mat.i11 = 0;
        mat.i12 = 0;
        mat.i13 = 0;
        mat.i20 = 0;
        mat.i21 = 0;
        mat.i22 = 0;
        mat.i23 = 0;
        mat.i30 = 0;
        mat.i31 = 0;
        mat.i32 = 0;
        mat.i33 = 0;
        return mat;
    }
}
