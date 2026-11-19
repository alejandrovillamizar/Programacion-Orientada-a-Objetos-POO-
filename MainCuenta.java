
package encapsulamiento;

public class MainCuenta {

    public static void main(String[] args) {

        System.out.println("Application Running");

        // Instancia: crear un objeto
        CuentaBancaria cuenta1 =
                new CuentaBancaria("n12345", "Jhoan", 10000);

        // Consultar numero de cuenta
        String cuentaTitular = cuenta1.getNumeroCuenta();
        System.out.println("El numero de cuenta es: " + cuentaTitular);

        // Consultar titular
        String persona = cuenta1.getTitular();
        System.out.println("El titular de la cuenta es: " + persona);

        // Consultar saldo
        double dinero = cuenta1.getSaldo();
        System.out.println("El saldo de la cuenta es: " + dinero);

    }
}
