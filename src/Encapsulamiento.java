/*Enunciado: Crea una clase CuentaBancaria con los atributos saldo (privado) y numeroCuenta.
Proporciona métodos públicos depositar y retirar para modificar el saldo, y un método verSaldo para mostrar el saldo actual.*/
public class Encapsulamiento {
    public static void main(String[] args) {
        cuentaBancaria cuenta = new cuentaBancaria("123456789", 1000);
        cuenta.verSaldo();
        cuenta.Depositar(500);
        cuenta.Retirar(200);
        cuenta.verSaldo();
    }
    static class cuentaBancaria
    {
        private double Saldo;
        String numeroCuenta;
        public cuentaBancaria(String numeroCuenta,double SaldoI) {
            this.Saldo = SaldoI;
            this.numeroCuenta = numeroCuenta;
        }
        public void Retirar(double cantidad) {
            if (cantidad <= this.Saldo) {
                Saldo -= cantidad;
            } else {
                System.out.println("Saldo Insuficiente");
            }
        }
        public void Depositar(double cantidad) {
            this.Saldo += cantidad;
        }
        public void verSaldo() {
            System.out.println("Saldo: " + this.Saldo);
        }
    }
}
