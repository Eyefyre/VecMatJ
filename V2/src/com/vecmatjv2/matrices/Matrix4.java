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
public class Matrix4 {

    private final ArrayList<Float> indexes;

    /**
     *
     * @param i00
     * @param i01
     * @param i02
     * @param i03
     * @param i10
     * @param i11
     * @param i12
     * @param i13
     * @param i20
     * @param i21
     * @param i22
     * @param i23
     * @param i30
     * @param i31
     * @param i32
     * @param i33
     */
    public Matrix4(float i00, float i01, float i02, float i03, float i10, float i11, float i12, float i13, float i20, float i21, float i22, float i23, float i30, float i31, float i32, float i33) {
        indexes = new ArrayList<>();
        this.indexes.add(i00);
        this.indexes.add(i01);
        this.indexes.add(i02);
        this.indexes.add(i03);
        this.indexes.add(i10);
        this.indexes.add(i11);
        this.indexes.add(i12);
        this.indexes.add(i13);
        this.indexes.add(i20);
        this.indexes.add(i21);
        this.indexes.add(i22);
        this.indexes.add(i23);
        this.indexes.add(i30);
        this.indexes.add(i31);
        this.indexes.add(i32);
        this.indexes.add(i33);
    }

    /**
     *
     * @param list
     */
    public Matrix4(ArrayList<Float> list) {
        indexes = list;
    }

    /**
     *
     */
    public Matrix4() {
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
    public float getI03() {
        return this.indexes.get(3);
    }

    /**
     *
     * @param i03
     */
    public void setI03(float i03) {
        this.indexes.set(3, i03);
    }

    /**
     *
     * @return
     */
    public float getI10() {
        return this.indexes.get(4);
    }

    /**
     *
     * @param i10
     */
    public void setI10(float i10) {
        this.indexes.set(4, i10);
    }

    /**
     *
     * @return
     */
    public float getI11() {
        return this.indexes.get(5);
    }

    /**
     *
     * @param i11
     */
    public void setI11(float i11) {
        this.indexes.set(5, i11);
    }

    /**
     *
     * @return
     */
    public float getI12() {
        return this.indexes.get(6);
    }

    /**
     *
     * @param i12
     */
    public void setI12(float i12) {
        this.indexes.set(6, i12);
    }

    /**
     *
     * @return
     */
    public float getI13() {
        return this.indexes.get(7);
    }

    /**
     *
     * @param i13
     */
    public void setI13(float i13) {
        this.indexes.set(7, i13);
    }

    /**
     *
     * @return
     */
    public float getI20() {
        return this.indexes.get(8);
    }

    /**
     *
     * @param i20
     */
    public void setI20(float i20) {
        this.indexes.set(8, i20);
    }

    /**
     *
     * @return
     */
    public float getI21() {
        return this.indexes.get(9);
    }

    /**
     *
     * @param i21
     */
    public void setI21(float i21) {
        this.indexes.set(9, i21);
    }

    /**
     *
     * @return
     */
    public float getI22() {
        return this.indexes.get(10);
    }

    /**
     *
     * @param i22
     */
    public void setI22(float i22) {
        this.indexes.set(10, i22);
    }

    /**
     *
     * @return
     */
    public float getI23() {
        return this.indexes.get(11);
    }

    /**
     *
     * @param i23
     */
    public void setI23(float i23) {
        this.indexes.set(11, i23);
    }

    /**
     *
     * @return
     */
    public float getI30() {
        return this.indexes.get(12);
    }

    /**
     *
     * @param i30
     */
    public void setI30(float i30) {
        this.indexes.set(12, i30);
    }

    /**
     *
     * @return
     */
    public float getI31() {
        return this.indexes.get(13);
    }

    /**
     *
     * @param i31
     */
    public void setI31(float i31) {
        this.indexes.set(13, i31);
    }

    /**
     *
     * @return
     */
    public float getI32() {
        return this.indexes.get(14);
    }

    /**
     *
     * @param i32
     */
    public void setI32(float i32) {
        this.indexes.set(14, i32);
    }

    /**
     *
     * @return
     */
    public float getI33() {
        return this.indexes.get(15);
    }

    /**
     *
     * @param i33
     */
    public void setI33(float i33) {
        this.indexes.set(15, i33);
    }

    /**
     *
     * @param mat
     */
    public void add(Matrix4 mat) {
        for (int i = 0; i < mat.indexes.size(); i++) {
            float r = this.indexes.get(i) + mat.indexes.get(i);
            this.indexes.set(i, r);
        }
    }

    /**
     *
     * @param a
     * @param b
     * @return
     */
    public static Matrix4 add(Matrix4 a, Matrix4 b) {
        Matrix4 mat = new Matrix4();
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
    public void subtract(Matrix4 mat) {
        for (int i = 0; i < mat.indexes.size(); i++) {
            float r = this.indexes.get(i) - mat.indexes.get(i);
            this.indexes.set(i, r);
        }
    }

    /**
     *
     * @param a
     * @param b
     * @return
     */
    public static Matrix4 subtract(Matrix4 a, Matrix4 b) {
        Matrix4 mat = new Matrix4();
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
            float r = this.indexes.get(i) * scalar;
            this.indexes.set(i, r);
        }
    }

    /**
     *
     * @param mat
     * @param scalar
     * @return
     */
    public static Matrix4 scalarMult(Matrix4 mat, float scalar) {
        Matrix4 mat2 = new Matrix4();
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

    /**
     *
     * @param a
     * @param b
     * @return
     */
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

    /**
     *
     */
    public void invert() {
        float det1 = Matrix3.getDeterminant(new Matrix3(this.getI11(), this.getI12(), this.getI13(), this.getI21(), this.getI22(), this.getI23(), this.getI31(), this.getI32(), this.getI33()));
        float det2 = Matrix3.getDeterminant(new Matrix3(this.getI10(), this.getI12(), this.getI13(), this.getI20(), this.getI22(), this.getI23(), this.getI30(), this.getI32(), this.getI33()));
        float det3 = Matrix3.getDeterminant(new Matrix3(this.getI10(), this.getI11(), this.getI13(), this.getI20(), this.getI21(), this.getI23(), this.getI30(), this.getI31(), this.getI33()));
        float det4 = Matrix3.getDeterminant(new Matrix3(this.getI10(), this.getI11(), this.getI12(), this.getI20(), this.getI21(), this.getI22(), this.getI30(), this.getI31(), this.getI32()));
        float det5 = Matrix3.getDeterminant(new Matrix3(this.getI01(), this.getI02(), this.getI03(), this.getI21(), this.getI22(), this.getI23(), this.getI31(), this.getI32(), this.getI33()));
        float det6 = Matrix3.getDeterminant(new Matrix3(this.getI00(), this.getI02(), this.getI03(), this.getI20(), this.getI22(), this.getI23(), this.getI30(), this.getI32(), this.getI33()));
        float det7 = Matrix3.getDeterminant(new Matrix3(this.getI00(), this.getI01(), this.getI03(), this.getI20(), this.getI21(), this.getI23(), this.getI30(), this.getI31(), this.getI33()));
        float det8 = Matrix3.getDeterminant(new Matrix3(this.getI00(), this.getI01(), this.getI02(), this.getI20(), this.getI21(), this.getI22(), this.getI30(), this.getI31(), this.getI32()));
        float det9 = Matrix3.getDeterminant(new Matrix3(this.getI01(), this.getI02(), this.getI03(), this.getI11(), this.getI12(), this.getI13(), this.getI31(), this.getI32(), this.getI33()));
        float det10 = Matrix3.getDeterminant(new Matrix3(this.getI00(), this.getI02(), this.getI03(), this.getI10(), this.getI12(), this.getI13(), this.getI30(), this.getI32(), this.getI33()));
        float det11 = Matrix3.getDeterminant(new Matrix3(this.getI00(), this.getI01(), this.getI03(), this.getI10(), this.getI11(), this.getI13(), this.getI30(), this.getI31(), this.getI33()));
        float det12 = Matrix3.getDeterminant(new Matrix3(this.getI00(), this.getI01(), this.getI02(), this.getI10(), this.getI11(), this.getI12(), this.getI30(), this.getI31(), this.getI32()));
        float det13 = Matrix3.getDeterminant(new Matrix3(this.getI01(), this.getI02(), this.getI03(), this.getI11(), this.getI12(), this.getI13(), this.getI21(), this.getI22(), this.getI23()));
        float det14 = Matrix3.getDeterminant(new Matrix3(this.getI00(), this.getI02(), this.getI03(), this.getI10(), this.getI12(), this.getI13(), this.getI20(), this.getI22(), this.getI23()));
        float det15 = Matrix3.getDeterminant(new Matrix3(this.getI00(), this.getI01(), this.getI03(), this.getI10(), this.getI11(), this.getI13(), this.getI20(), this.getI21(), this.getI23()));
        float det16 = Matrix3.getDeterminant(new Matrix3(this.getI00(), this.getI01(), this.getI02(), this.getI10(), this.getI11(), this.getI12(), this.getI20(), this.getI21(), this.getI22()));
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

    /**
     *
     * @param mat
     * @return
     */
    public static Matrix4 invert(Matrix4 mat) {
        float det1 = Matrix3.getDeterminant(new Matrix3(mat.getI11(), mat.getI12(), mat.getI13(), mat.getI21(), mat.getI22(), mat.getI23(), mat.getI31(), mat.getI32(), mat.getI33()));
        float det2 = Matrix3.getDeterminant(new Matrix3(mat.getI10(), mat.getI12(), mat.getI13(), mat.getI20(), mat.getI22(), mat.getI23(), mat.getI30(), mat.getI32(), mat.getI33()));
        float det3 = Matrix3.getDeterminant(new Matrix3(mat.getI10(), mat.getI11(), mat.getI13(), mat.getI20(), mat.getI21(), mat.getI23(), mat.getI30(), mat.getI31(), mat.getI33()));
        float det4 = Matrix3.getDeterminant(new Matrix3(mat.getI10(), mat.getI11(), mat.getI12(), mat.getI20(), mat.getI21(), mat.getI22(), mat.getI30(), mat.getI31(), mat.getI32()));
        float det5 = Matrix3.getDeterminant(new Matrix3(mat.getI01(), mat.getI02(), mat.getI03(), mat.getI21(), mat.getI22(), mat.getI23(), mat.getI31(), mat.getI32(), mat.getI33()));
        float det6 = Matrix3.getDeterminant(new Matrix3(mat.getI00(), mat.getI02(), mat.getI03(), mat.getI20(), mat.getI22(), mat.getI23(), mat.getI30(), mat.getI32(), mat.getI33()));
        float det7 = Matrix3.getDeterminant(new Matrix3(mat.getI00(), mat.getI01(), mat.getI03(), mat.getI20(), mat.getI21(), mat.getI23(), mat.getI30(), mat.getI31(), mat.getI33()));
        float det8 = Matrix3.getDeterminant(new Matrix3(mat.getI00(), mat.getI01(), mat.getI02(), mat.getI20(), mat.getI21(), mat.getI22(), mat.getI30(), mat.getI31(), mat.getI32()));
        float det9 = Matrix3.getDeterminant(new Matrix3(mat.getI01(), mat.getI02(), mat.getI03(), mat.getI11(), mat.getI12(), mat.getI13(), mat.getI31(), mat.getI32(), mat.getI33()));
        float det10 = Matrix3.getDeterminant(new Matrix3(mat.getI00(), mat.getI02(), mat.getI03(), mat.getI10(), mat.getI12(), mat.getI13(), mat.getI30(), mat.getI32(), mat.getI33()));
        float det11 = Matrix3.getDeterminant(new Matrix3(mat.getI00(), mat.getI01(), mat.getI03(), mat.getI10(), mat.getI11(), mat.getI13(), mat.getI30(), mat.getI31(), mat.getI33()));
        float det12 = Matrix3.getDeterminant(new Matrix3(mat.getI00(), mat.getI01(), mat.getI02(), mat.getI10(), mat.getI11(), mat.getI12(), mat.getI30(), mat.getI31(), mat.getI32()));
        float det13 = Matrix3.getDeterminant(new Matrix3(mat.getI01(), mat.getI02(), mat.getI03(), mat.getI11(), mat.getI12(), mat.getI13(), mat.getI21(), mat.getI22(), mat.getI23()));
        float det14 = Matrix3.getDeterminant(new Matrix3(mat.getI00(), mat.getI02(), mat.getI03(), mat.getI10(), mat.getI12(), mat.getI13(), mat.getI20(), mat.getI22(), mat.getI23()));
        float det15 = Matrix3.getDeterminant(new Matrix3(mat.getI00(), mat.getI01(), mat.getI03(), mat.getI10(), mat.getI11(), mat.getI13(), mat.getI20(), mat.getI21(), mat.getI23()));
        float det16 = Matrix3.getDeterminant(new Matrix3(mat.getI00(), mat.getI01(), mat.getI02(), mat.getI10(), mat.getI11(), mat.getI12(), mat.getI20(), mat.getI21(), mat.getI22()));
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

    /**
     *
     * @param a
     * @param b
     * @return
     */
    public static Matrix4 divide(Matrix4 a, Matrix4 b) {
        b.invert();
        Matrix4 result = Matrix4.mult(a, b);
        return result;
    }

    /**
     *
     * @param mat
     */
    public void divide(Matrix4 mat) {
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
    public static Matrix4 negate(Matrix4 mat) {
        Matrix4 mat2 = new Matrix4();
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
    public static Matrix4 transpose(Matrix4 mat) {
        float original[][] = {{mat.getI00(), mat.getI01(), mat.getI02(), mat.getI03()}, {mat.getI10(), mat.getI11(), mat.getI12(), mat.getI13()}, {mat.getI20(), mat.getI21(), mat.getI22(), mat.getI23()}, {mat.getI30(), mat.getI31(), mat.getI32(), mat.getI33()}};
        float transpose[][] = new float[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                transpose[i][j] = original[j][i];
            }
        }
        Matrix4 result = new Matrix4(transpose[0][0], transpose[0][1], transpose[0][2], transpose[0][3], transpose[1][0], transpose[1][1], transpose[1][2], transpose[1][3], transpose[2][0], transpose[2][1], transpose[2][2], transpose[2][3], transpose[3][0], transpose[3][1], transpose[3][2], transpose[3][3]);
        return result;
    }

    /**
     *
     */
    public void transpose() {
        float original[][] = {{this.getI00(), this.getI01(), this.getI02(), this.getI03()}, {this.getI10(), this.getI11(), this.getI12(), this.getI13()}, {this.getI20(), this.getI21(), this.getI22(), this.getI23()}, {this.getI30(), this.getI31(), this.getI32(), this.getI33()}};
        float transpose[][] = new float[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                transpose[i][j] = original[j][i];
            }
        }
        this.indexes.set(0, transpose[0][0]);
        this.indexes.set(1, transpose[0][1]);
        this.indexes.set(2, transpose[0][2]);
        this.indexes.set(3, transpose[0][3]);
        this.indexes.set(4, transpose[1][0]);
        this.indexes.set(5, transpose[1][1]);
        this.indexes.set(6, transpose[1][2]);
        this.indexes.set(7, transpose[1][3]);
        this.indexes.set(8, transpose[2][0]);
        this.indexes.set(9, transpose[2][1]);
        this.indexes.set(10, transpose[2][2]);
        this.indexes.set(11, transpose[2][3]);
        this.indexes.set(12, transpose[3][0]);
        this.indexes.set(13, transpose[3][1]);
        this.indexes.set(14, transpose[3][2]);
        this.indexes.set(15, transpose[3][3]);
    }

    /**
     *
     * @return
     */
    public float getDeterminant() {
        float detA = this.getI00() * Matrix3.getDeterminant(new Matrix3(this.getI11(), this.getI12(), this.getI13(), this.getI21(), this.getI22(), this.getI23(), this.getI31(), this.getI32(), this.getI33()));
        float detB = this.getI01() * Matrix3.getDeterminant(new Matrix3(this.getI10(), this.getI12(), this.getI13(), this.getI20(), this.getI22(), this.getI23(), this.getI30(), this.getI32(), this.getI33()));
        float detC = this.getI02() * Matrix3.getDeterminant(new Matrix3(this.getI10(), this.getI11(), this.getI13(), this.getI20(), this.getI21(), this.getI23(), this.getI30(), this.getI31(), this.getI33()));
        float detD = this.getI03() * Matrix3.getDeterminant(new Matrix3(this.getI10(), this.getI11(), this.getI12(), this.getI20(), this.getI21(), this.getI22(), this.getI30(), this.getI31(), this.getI32()));
        float determinant = detA - detB + detC - detD;
        return determinant;
    }

    /**
     *
     * @param mat
     * @return
     */
    public static float getDeterminant(Matrix4 mat) {
        float detA = mat.getI00() * Matrix3.getDeterminant(new Matrix3(mat.getI11(), mat.getI12(), mat.getI13(), mat.getI21(), mat.getI22(), mat.getI23(), mat.getI31(), mat.getI32(), mat.getI33()));
        float detB = mat.getI01() * Matrix3.getDeterminant(new Matrix3(mat.getI10(), mat.getI12(), mat.getI13(), mat.getI20(), mat.getI22(), mat.getI23(), mat.getI30(), mat.getI32(), mat.getI33()));
        float detC = mat.getI02() * Matrix3.getDeterminant(new Matrix3(mat.getI10(), mat.getI11(), mat.getI13(), mat.getI20(), mat.getI21(), mat.getI23(), mat.getI30(), mat.getI31(), mat.getI33()));
        float detD = mat.getI03() * Matrix3.getDeterminant(new Matrix3(mat.getI10(), mat.getI11(), mat.getI12(), mat.getI20(), mat.getI21(), mat.getI22(), mat.getI30(), mat.getI31(), mat.getI32()));
        float determinant = detA - detB + detC - detD;
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
    public static Matrix4 zero(Matrix4 mat) {
        for (int i = 0; i < mat.indexes.size(); i++) {
            mat.indexes.set(i, 0f);
        }
        return mat;
    }
}
