package encapsulamiento;

public class AprendizSena {
    private int documento;
    private String nombre;
    private int edad;
    private float NotaFinal;

    public AprendizSena(int documento,String nombre){
        this.documento=documento;
        this.nombre=nombre;
        this.edad=0;
        this.NotaFinal= 2.0f;
    }
    public int getDocumento(){
        return  documento;
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public float getNotaFinal(){
        return NotaFinal;
    }
    public void setEdad(int edad){
        if (edad>=0 && edad<=100){
            this.edad = edad;
        }
        else{
            System.out.printf("Edad invalidad. Debe tener entre o y 100");
        }
    }
    public void setNotaFinal(float notaFinal){
        if (notaFinal>= 0.0 && notaFinal<=5.0){
            this.NotaFinal = notaFinal;
        }
        else {
            System.out.println("Nota invalidad. Debe tener entre 0.0 y 5.0");
        }

    }
    public boolean aprobo(){
        return NotaFinal >= 3.5 && NotaFinal <=5.0;
    }

}
