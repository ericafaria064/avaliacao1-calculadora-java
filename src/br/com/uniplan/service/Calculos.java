/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.uniplan.service;

/**
 *
 * @author Usuario
 */
public class Calculos {

    private static int VALOR_MEDIA = 6;

    private double avaliacao1;
    private double avaliacao2;
    private double avaliacao3;

    public double getAvaliacao1() {
        return avaliacao1;
    }

    public void setAvaliacao1(double avaliacao1) {
        this.avaliacao1 = avaliacao1;
    }

    public double getAvaliacao2() {
        return avaliacao2;
    }

    public void setAvaliacao2(double avaliacao2) {
        this.avaliacao2 = avaliacao2;
    }

    public double getAvaliacao3() {
        return avaliacao3;
    }

    public void setAvaliacao3(double avaliacao3) {
        this.avaliacao3 = avaliacao3;
    }

    public double soma() {
        double result = this.avaliacao1 + this.avaliacao2 + this.avaliacao3;
        return result;
    }

    public double media() {
        double result = soma() / 3;
        return result;
    }

    public String situacao() {
        if (media() >= VALOR_MEDIA) {
            return "Aprovado";
        }
        return "Reprovado";
    }

}
