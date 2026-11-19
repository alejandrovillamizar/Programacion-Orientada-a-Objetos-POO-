package encapsulamiento;

public class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;
    private int velocidad;

    private static final int VELOCIDAD_MAXIMA = 120;
    private static final int VELOCIDAD_MINIMA = 0;

    public Vehiculo(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0; // Inicializamos la velocidad en 0
    }

    public String getPlaca() {
        return placa;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getVelocidad() {
        return velocidad;
    }

    public void acelerar(){
        if (velocidad +10 <= VELOCIDAD_MAXIMA){
            velocidad +=10;
            System.out.println("Acelerando: " + velocidad + " km/h");
        }
        else{
            System.out.println("No se puede superar: " + VELOCIDAD_MAXIMA + " km/h");
        }
    }
    public void frenar(){
        if (velocidad -10 >= VELOCIDAD_MINIMA){
            velocidad -=10;
            System.out.println("Velocidad: " + velocidad + " km/h");
        }
        else{
            velocidad =0;
            System.out.println("Vehiculo detenido");
        }
    }
}
