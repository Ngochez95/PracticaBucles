package relojampm;

import javax.swing.JOptionPane;

public class RelojAMPM {

    public static void main(String[] args) {
        int horas, minutos, segundos;
        int horaIngreso = 0, minitosIngreso, segundosIngreso;
        do {
            horaIngreso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese hora de inicio"));
        } while (horaIngreso < 0 || horaIngreso > 23);
        do {
            minitosIngreso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese minutos de inicio"));
        } while (minitosIngreso < 0 || minitosIngreso > 59);
                do {            
            segundosIngreso= Integer.parseInt(JOptionPane.showInputDialog("Ingrese segundos de inicio"));
        } while (segundosIngreso<0 || segundosIngreso>59);
        
        for (horas = horaIngreso; horas <= 23; horas++) {
            for (minutos = minitosIngreso; minutos <= 59; minutos++) {
                for (segundos = segundosIngreso; segundos <= 59; segundos++) {
                    if (horas < 12) {
                        System.out.println(horas + ":" + minutos + ":" + segundos + " AM");
                    } else if (horas == 12 && minutos == 0 && segundos == 0) {
                        System.out.println(horas + ":" + minutos + ":" + segundos + " MD");
                    } else if (horas >= 12 && horas < 13) {
                        System.out.println((horas) + ":" + minutos + ":" + segundos + " PM");
                    } else {
                        System.out.println((horas - 12) + ":" + minutos + ":" + segundos + " PM");

                    }
                    segundosIngreso=0;

                }
            }

        }
    }

}
