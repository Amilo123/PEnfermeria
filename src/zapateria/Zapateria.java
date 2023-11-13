/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zapateria;
import javax.swing.JOptionPane;
/**
 *
 * @author 22PROGB04
 */
public class Zapateria {
String color;
String marca;
String tipo;
double precio;


    public Zapateria() {
    }
    
    public Zapateria(String color, String marca, String tipo, double precio) {
        this.color = color;
        this.marca = marca;
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }
    
    public String getTipo(){
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Zapateria{" + "color=" + color + ", marca=" + marca + ", tipo=" + tipo + ", precio=" + precio + '}';
    }

    public double CalcularPrecio(double precio){
        double descuento = (precio*(0.10));
        double Total_Pagar = precio-descuento;
        
        if(precio<=150){
            System.out.println(+precio);
        }else{
            System.out.println(+Total_Pagar);
        }
        
        return Total_Pagar;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
         
        String color = JOptionPane.showInputDialog("Introduce \nel color");
        String marca = JOptionPane.showInputDialog("Introduce la marca");
        String tipo = JOptionPane.showInputDialog("Introduce el tipo de zapato");
        String preciotexto = JOptionPane.showInputDialog("Introduce el precio");
        double precio = Double.parseDouble(preciotexto);
        
        String color2 = JOptionPane.showInputDialog("Introduce \nel color");
        String marca2 = JOptionPane.showInputDialog("Introduce la marca");
        String tipo2 = JOptionPane.showInputDialog("Introduce el tipo de zapato");
        String precio2texto = JOptionPane.showInputDialog("Introduce el precio");
        double precio2 = Double.parseDouble(precio2texto);
        
        Zapateria zapato1 = new Zapateria(color, marca, tipo, precio);
        System.out.println(zapato1);
        double resultado =zapato1.CalcularPrecio(precio);
        System.out.println("El precio es de "+resultado);
        
        Zapateria zapato2 = new Zapateria(color2, marca2, tipo2, precio2);
        System.out.println(zapato2);
        double resultado2 =zapato2.CalcularPrecio(precio2);
        System.out.println("El precio es de "+resultado2);
    }
    
}
