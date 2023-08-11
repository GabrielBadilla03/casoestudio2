package programacion.casoestudio;

import javax.swing.JOptionPane;

public class casodeestudio2 {
    public static void main(String[] args) {
        datos Datos = new datos(null, null, 0, null, null, 0, null);
        Datos.guardardatosfijos();
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "Seleccione una opción:\n" +
                    "1. Guardar Datos Normal\n" +
                    "2. Calcular Deudas\n" +
                    "3. Salir"));

            switch (opcion) {
                case 1:
                    Datos.guardardatonormal();
                    break;
                case 2:
                    Datos.deu("guillermo");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "¡Hasta luego!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida. Por favor, elija una opción válida.");
                    break;
            }
        } while (opcion != 3);
    }
}
