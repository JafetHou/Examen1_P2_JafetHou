
package p2_examen1_JafetHou;

import java.util.ArrayList;


class FiguraCompuesta extends Figura {
    private ArrayList<Figura> figuras = new ArrayList<>();
    
    public void agregarFigura(Figura figura) {
        figuras.add(figura);
    }
    
    @Override
    double calcularArea() {
        double area = 0;
        for (Figura figura : figuras) {
            area += figura.calcularArea();
        }
        return area;
    }
}

