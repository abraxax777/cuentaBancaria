public class Main {
    public static void main(String[] args) {
        // instansiar la clase
        Cuenta miCuenta = new Cuenta("123456", "ahorro", 150000);
        System.out.println("sando minimo: " +miCuenta.getSaldoMinimo());
        miCuenta.consignar(80000);
        System.out.println("saldo actual: "+ miCuenta.getSaldoActual());
        miCuenta.setNumero("212151");
        System.out.println(miCuenta.toString());
        System.out.println("---------------");

        Cuenta pedroCuenta = new Cuenta("000000", "ahorro", 20000);
        System.out.println(pedroCuenta.toString());

    }
}
