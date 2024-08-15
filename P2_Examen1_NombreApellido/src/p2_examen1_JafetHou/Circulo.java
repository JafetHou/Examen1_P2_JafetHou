
package p2_examen1_JafetHou;


public class Circulo extends Figura{
    
    private double radio;
    
    public Circulo(double radio) {
        this.radio = radio;
    }
    
    @Override
    double calcularArea() {
        return 3.1416*(radio*radio);
    }
}
