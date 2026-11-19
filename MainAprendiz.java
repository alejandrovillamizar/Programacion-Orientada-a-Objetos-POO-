package encapsulamiento;

public class MainAprendiz{
    public static void main(String[] args) {
        AprendizSena a = new AprendizSena(1093140372 , "Brayan villamizar");
        a.setEdad(20);
        a.setNotaFinal(4.2f);
        a.setNotaFinal(7.0f); // Invalidod - sera rechazado por la clase
        System.out.println("Aprendiz: " + a.getNombre() );
        System.out.println("Edad: " + a.getEdad());
        System.out.println("nota: " + a.getNotaFinal());
        System.out.println("Aprobo? " + (a.aprobo() ? "si" : "No"));
    }
}