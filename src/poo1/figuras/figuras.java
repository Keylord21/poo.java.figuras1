package poo1.figuras;
import javax.swing.JOptionPane;

public class figuras {

    public void cuadrado() {
        int lado , area ;
        lado = Integer.parseInt(JOptionPane.showInputDialog("Digite el lado del cuadrado"));
        area = lado * lado ;
        JOptionPane.showMessageDialog(null, "El area del cuadrado es: "+ area);
    }
    public void triangulo() {
        double base,altura,area ;
        base= Double.parseDouble(JOptionPane.showInputDialog(null , "Digite la base del triangulo"));
        altura = Double.parseDouble(JOptionPane.showInputDialog(null , "Digite la altura del triangulo"));
        area = (base * altura)/2 ;
        JOptionPane.showMessageDialog(null, "El area del triangulo es :" + area);
    }
    public void rectangulo(){
        int base , altura , area ;
        base = Integer.parseInt(JOptionPane.showInputDialog("Digite la base del rectangulo"));
        altura = Integer.parseInt(JOptionPane.showInputDialog("Digite la altura del rectangulo")); 
        area = (base * altura);
        JOptionPane.showMessageDialog (null, "El area del rectangulo es : "+ area);
    }
    public void circulo (){
        double radio , area, pi ;
        pi = 3.14 ;
        radio = Double.parseDouble(JOptionPane.showInputDialog(null , "Digite el radio del circulo"));
        area = (pi * (radio*2));
        JOptionPane.showMessageDialog(null, "El area del circulo es :" + area);
    }
}
