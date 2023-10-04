

class  Velero extends Embarcacion implements validacion {
        private int numMastiles;

    public Velero(Capitan capitan, double precioBase, double valorAdicional, int añoFabricacion, double eslora, int numMastiles) {
            super(capitan, precioBase, valorAdicional, añoFabricacion, eslora);
            this.numMastiles = numMastiles;
        }

        public void validar() {
            if (numMastiles > 4) {
                System.out.println("Este velero es grande.");
            } else {
                System.out.println("Este velero es estándar.");
            }
        }
    }

