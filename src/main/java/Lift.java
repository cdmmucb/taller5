public class Lift {
    int piso = 1;

    public void goPerson(int pisoPersona){
        System.out.println("Lift en piso "+piso);
        movimientoLift(pisoPersona);
        System.out.println("La persona se sube al ascensor");
    }

    public void goPisoDestino(int pisoDestino){
        System.out.println("Lift al inicio del viaje en piso "+piso);
        movimientoLift(pisoDestino);
        System.out.println("Lift llego al destino");
    }

    public int movimientoLift(int pisoFinal){
        do {
            if(piso>pisoFinal){
                piso--;
                System.out.println("Lift en piso "+piso);
            }else if(piso<pisoFinal){
                piso++;
                System.out.println("Lift en piso "+piso);
            }
        }while (piso != pisoFinal);
        return pisoFinal;
    }
}
