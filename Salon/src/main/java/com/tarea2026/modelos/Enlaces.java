/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarea2026.modelos;

/**
 *
 * @author PC TECHNOLOGY
 */
public class Enlaces {
    private String enlace,enIm1,enIm2,enNEMP;

    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }

    public String getEnIm1() {
        return enIm1;
    }

    public void setEnIm1(String enIm1) {
        this.enIm1 = enIm1;
    }

    public String getEnIm2() {
        return enIm2;
    }

    public void setEnIm2(String enIm2) {
        this.enIm2 = enIm2;
    }

    public String getEnNEMP() {
        return enNEMP;
    }

    public void setEnNEMP(String enNEMP) {
        this.enNEMP = enNEMP;
    }

    
    public Enlaces(String enlace, String enIm1, String enIm2) {
        this.enlace = enlace;
        this.enIm1 = enIm1;
        this.enIm2 = enIm2;
    }

    public Enlaces(String enlace, String enIm1, String enIm2, String enNEMP) {
        this.enlace = enlace;
        this.enIm1 = enIm1;
        this.enIm2 = enIm2;
        this.enNEMP = enNEMP;
    }
    
    
    
}
