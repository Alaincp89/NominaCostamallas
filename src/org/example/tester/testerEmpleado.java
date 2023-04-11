package org.example.tester;

import org.example.contabilidad_cm.Empleado;

public class testerEmpleado {

    public static void main (String [] args){

        Empleado emple1 = new Empleado("Alain Cervantes",1,"1143424477",
                "Cra 68#74-80", "Barranquilla", "3024104012") {
            @Override
            public void imprimir() {

                System.out.println(toString());
            }

            @Override
            public int pago() {
                return 0;
            }
        };
        emple1.imprimir();
    }
}
