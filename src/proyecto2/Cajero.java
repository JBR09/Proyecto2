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
public class Cajero {

    Scanner e = new Scanner(System.in);
    private String nombre;
    private int NumeroCaja, cantidadClientes, ficha, contador;
    public LinkedList total = new LinkedList();
    public LinkedList caja1 = new LinkedList();
    public LinkedList caja2 = new LinkedList();
    public LinkedList caja3 = new LinkedList();
    public LinkedList caja4 = new LinkedList();

    public Cajero() {
    }

    public Cajero(String nombre, int NumeroCaja, int cantidadClientes, int ficha, int contador) {
        this.nombre = nombre;
        this.NumeroCaja = NumeroCaja;
        this.cantidadClientes = cantidadClientes;
        this.ficha = ficha;
        this.contador = contador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroCaja() {
        return NumeroCaja;
    }

    public void setNumeroCaja(int NumeroCaja) {
        this.NumeroCaja = NumeroCaja;
    }

    public int getCantidadClientes() {
        return cantidadClientes;
    }

    public void setCantidadClientes(int cantidadClientes) {
        this.cantidadClientes = cantidadClientes;
    }

    public int getFicha() {
        return ficha;
    }

    public void setFicha(int ficha) {
        this.ficha = ficha;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public LinkedList getTotal() {
        return total;
    }

    public void setTotal(LinkedList total) {
        this.total = total;
    }

    public LinkedList getCaja1() {
        return caja1;
    }

    public void setCaja1(LinkedList caja1) {
        this.caja1 = caja1;
    }

    public LinkedList getCaja2() {
        return caja2;
    }

    public void setCaja2(LinkedList caja2) {
        this.caja2 = caja2;
    }

    public LinkedList getCaja3() {
        return caja3;
    }

    public void setCaja3(LinkedList caja3) {
        this.caja3 = caja3;
    }

    public LinkedList getCaja4() {
        return caja4;
    }

    public void setCaja4(LinkedList caja4) {
        this.caja4 = caja4;
    }

// ingresar cliente
    public void ingresar(LinkedList g) {
        //System.out.println(t.peek());// primer elemento de la lista pero este no lo saca
        //System.out.println(t.peekFirst());//primer elemento de la lista pero este no lo saca
        //System.out.println(t.peekLast());// ultimo elemento de la lista pero no lo saca 
        //System.out.println(t.poll());//primer elemento de la lista y si lo saca
        //System.out.println(t.pollFirst());//primer elemento de la lista y si lo saca
        //System.out.println(t.pollLast());//ultimo elemento de la lista y si lo saca
        //System.out.println(t.pop());//primer elemento de la lista y si lo saca

        do {
            if (caja1.isEmpty() && !total.isEmpty()) {
                Object obtener = total.poll();
                caja1.add(obtener);
                JOptionPane.showMessageDialog(null, "Usted va ser atendido en la caja#1 " + caja1);
            }
            if (caja2.isEmpty() && !caja1.isEmpty() && !total.isEmpty()) {
                Object obtener = total.poll();
                caja2.add(obtener);
                JOptionPane.showMessageDialog(null, "Usted va ser atendido en la caja#2 " + caja2);

            }
            if (caja3.isEmpty() && !caja1.isEmpty() && !caja2.isEmpty() && !total.isEmpty()) {
                Object obtener = total.poll();
                caja3.add(obtener);
                JOptionPane.showMessageDialog(null, "Usted va ser atendido en la caja#3 " + caja3);

            }
            if (caja4.isEmpty() && !caja1.isEmpty() && !caja2.isEmpty() && !caja3.isEmpty() && !total.isEmpty()) {
                Object obtener = total.poll();
                caja4.add(obtener);
                JOptionPane.showMessageDialog(null, "Usted va ser atendido en la caja#4 " + caja4);

            }

        } while (caja1.isEmpty() && caja2.isEmpty() && caja3.isEmpty() && caja4.isEmpty());

    }

    public void ClientesCajas() {
        JOptionPane.showMessageDialog(null, "Clientes en espera de ser atendidos"
                + "\nCaja#1: " + "Cantidad de clientes " + caja1.size() + " Fichas# " + caja1
                + "\nCaja#2: " + "Cantidad de clientes " + caja2.size() + " Fichas# " + caja2
                + "\nCaja#3: " + "Cantidad de clientes " + caja3.size() + " Fichas# " + caja3
                + "\nCaja#4: " + "Cantidad de clientes " + caja4.size() + " Fichas# " + caja4);
    }

    public void prueba(LinkedList g) {
        do {
            if (caja1.size() <= caja2.size() && caja1.size() <= caja3.size() && caja1.size() <= caja4.size() && !total.isEmpty()) {
                Object obtener = total.poll();
                caja1.add(obtener);
                JOptionPane.showMessageDialog(null, "Usted va ser atendido en la caja#1 " + caja1);
            } else {
                if (caja2.size() <= caja1.size() && caja2.size() <= caja3.size() && caja2.size() <= caja4.size() && !total.isEmpty()) {
                    Object obtener = total.poll();
                    caja2.add(obtener);
                    JOptionPane.showMessageDialog(null, "Usted va ser atendido en la caja#2 " + caja2);
                } else {
                    if (caja3.size() <= caja1.size() && caja3.size() <= caja2.size() && caja3.size() <= caja4.size() && !total.isEmpty()) {
                        Object obtener = total.poll();
                        caja3.add(obtener);
                        JOptionPane.showMessageDialog(null, "Usted va ser atendido en la caja#3 " + caja3);
                    } else {
                        if (caja4.size() <= caja1.size() && caja4.size() <= caja2.size() && caja4.size() <= caja3.size() && !total.isEmpty()) {
                            Object obtener = total.poll();
                            caja4.add(obtener);
                            JOptionPane.showMessageDialog(null, "Usted va ser atendido en la caja#4 " + caja4);
                        }
                    }
                }
            }

        } while (!total.isEmpty());

    }
}
