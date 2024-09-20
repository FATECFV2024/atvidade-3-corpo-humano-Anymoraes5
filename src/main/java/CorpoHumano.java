package main.java;

public class CorpoHumano {
    private int massa;
    private double volume;
    private int densidade;
    private float altura;

    public CorpoHumano(int massa, double volume, int densidade, float altura) {
        this.massa = massa;
        this.volume = volume;
        this.densidade = densidade;
        this.altura = altura;
    }

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getDensidade() {
        return densidade;
    }

    public void setDensidade(int densidade) {
        this.densidade = densidade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public double calcularIMC(){
        return massa/(altura*altura);
    }

}
