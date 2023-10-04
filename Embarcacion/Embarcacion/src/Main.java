
    public class Main {
        public static void main(String[] args) {
            // Ejemplo de uso
            Capitan capitan1 = new Capitan("Juan", "Perez", "12345");
            Velero velero1 = new Velero(capitan1, 1000.0, 0.0, 2022, 10.5, 5);
            Yate yate1 = new Yate(capitan1, 2000.0, 0.0, 2021, 15.0, 8);

            double montoVelero1 = velero1.calcularAlquiler();
            double montoYate1 = yate1.calcularAlquiler();

            System.out.println("Monto de alquiler del Velero 1: $" + montoVelero1);
            System.out.println("Monto de alquiler del Yate 1: $" + montoYate1);

            velero1.validar();
            yate1.validar();
        }
    }
