
package mundopc;

import com.portafolio.sbp199414.github.io.mundopc.*;


public class MundoPC {
    public static void main(String[] args) {
        
        Monitor monitorHP = new Monitor ("HP",13);
        Teclado tecladoHP = new Teclado("Bluetooh","HP");
        Raton ratonHP = new Raton("USB", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP",monitorHP,tecladoHP,ratonHP);
        
        Monitor monitorGamer = new Monitor ("Gamer",34);
        Teclado tecladoGamer = new Teclado("Bluetooh","Gamer");
        Raton ratonGamer = new Raton("Bluetooh", "Gamer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer",monitorGamer,tecladoGamer,ratonGamer);
        
        Orden ordenUno = new Orden();
        ordenUno.agregarComputadoras(computadoraHP);
        ordenUno.agregarComputadoras(computadoraGamer);
        ordenUno.mostrarOrden();
    }
}
