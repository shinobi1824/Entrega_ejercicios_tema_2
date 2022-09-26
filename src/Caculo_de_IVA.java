    public class Caculo_de_IVA {
        public static void main(String[] args) {
            Double precio= 100.27D;


            mensajes(precio);


        }
        static Double calculaIva(Double precio){
            Double iva= 0.19D;

            return precio * iva;
        }
        static void mensajes(Double precio){
            Double ivaCalculado;

            ivaCalculado = calculaIva(precio);
            System.out.println("Calculo de I.V.A.:");
            System.out.println("Precio: "+ precio);
            System.out.println("I.V.A.: " + ivaCalculado);
            System.out.println("Total: " + suma(precio,ivaCalculado));
        }
        static Double suma(Double a, Double b){
            return a+b;
        }
    }