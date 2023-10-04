
    class Yate extends Embarcacion implements validacion {
        private int numCamarotes;

        public Yate(Capitan capitan, double precioBase, double valorAdicional, int añoFabricacion, double eslora, int numCamarotes) {
            super(capitan, precioBase, valorAdicional, añoFabricacion, eslora);
            this.numCamarotes = numCamarotes;
        }

        public void validar() {
            if (numCamarotes > 7) {
                System.out.println("Este yate es de lujo.");
            } else {
                System.out.println("Este yate es estándar.");
            }
        }
    }


