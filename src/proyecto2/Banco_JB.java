/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.util.LinkedList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author josep_wht3r4a
 */
public class Banco_JB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Cajero ca = new Cajero();
        int op = -1;
        int entrada, ficha = 0;
        int cajero;
        try {
            do {

                entrada = Integer.parseInt(JOptionPane.showInputDialog(null, " tomar una ficha"
                        + "\n1)Si"
                        + "\n2)No"
                        + "\n3)Salir"));
                if (entrada == 1) {
                    ficha += 1;
                    JOptionPane.showMessageDialog(null, "Su ficha es la numero " + ficha);

                    ca.total.add(ficha);
                    ca.ingresar(ca.total);
                    ca.prueba(ca.total);
                }
                if (entrada == 2) {
                    try {
                        do {
                            cajero = Integer.parseInt(JOptionPane.showInputDialog(null, " "
                                    + "Cajero que va atender"
                                    + "\n1)Caja 1"
                                    + "\n2)Caja 2"
                                    + "\n3)Caja 3"
                                    + "\n4)Caja 4"
                                    + "\n5)Ver cola de clientes de las cajas "
                                    + "\n6)Salir"));
                            switch (cajero) {
                                case 1:
                                    if (!ca.caja1.isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "Información caja#1"
                                                + "\nCantidad clientes en la cola: " + ca.caja1.size()
                                                + "\nfichas# " + ca.caja1);
                                        JOptionPane.showMessageDialog(null, "El cliente, con la ficha# " + ca.caja1.pop() + " fue atendido ");
                                        JOptionPane.showMessageDialog(null, "Información caja#1"
                                                + "\nCantidad clientes en la cola: " + ca.caja1.size()
                                                + "\nfichas# " + ca.caja1);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "No hay clientes por atender");
                                    }
                                    break;
                                case 2:
                                    if (!ca.caja2.isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "Información caja#2"
                                                + "\nCantidad clientes en cola " + ca.caja2.size()
                                                + "\nfichas# " + ca.caja2);
                                        JOptionPane.showMessageDialog(null, "El cliente con la ficha# " + ca.caja2.pop() + " fue atendido ");
                                        JOptionPane.showMessageDialog(null, "Información caja#2"
                                                + "\nCantidad clientes en cola " + ca.caja2.size()
                                                + "\nfichas# " + ca.caja2);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "No hay clientes por atender");
                                    }
                                    break;
                                case 3:
                                    if (!ca.caja3.isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "Información caja#3"
                                                + "\nCantidad clientes en la cola: " + ca.caja3.size()
                                                + "\nfichas# " + ca.caja3);
                                        JOptionPane.showMessageDialog(null, "El cliente con la ficha# " + ca.caja3.pop() + " fue atendido ");
                                        JOptionPane.showMessageDialog(null, "Información caja#3"
                                                + "\nCantidad clientes en la cola: " + ca.caja3.size()
                                                + "\nfichas# " + ca.caja3);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "No hay clientes por atender");
                                    }
                                    break;
                                case 4:
                                    if (!ca.caja4.isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "Información caja#4"
                                                + "\nCantidad clientes en la cola: " + ca.caja4.size()
                                                + "\nfichas# " + ca.caja4);
                                        JOptionPane.showMessageDialog(null, "El cliente con la ficha# " + ca.caja4.pop() + " fue atendido ");
                                        JOptionPane.showMessageDialog(null, "Información caja#4"
                                                + "\nCantidad clientes en la cola " + ca.caja4.size()
                                                + "\nfichas# " + ca.caja4);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "No hay clientes por atender");
                                    }
                                    break;
                                case 5:
                                    ca.ClientesCajas();
                                    break;
                                case 6:
                                    JOptionPane.showMessageDialog(null, "a la espera de clientes ");
                                    break;
                            }

                        } while (cajero != 6);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Opción invalida");
                    }
                }
                if (entrada == 3) {
                    JOptionPane.showMessageDialog(null, "Fue un placer servirle");
                }

            } while (entrada != 3);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "opción invalida");

        }

    }
}
