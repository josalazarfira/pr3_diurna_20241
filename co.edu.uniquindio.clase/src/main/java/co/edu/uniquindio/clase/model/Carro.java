package co.edu.uniquindio.clase.model;

import co.edu.uniquindio.clase.services.ICarroVolador;

public class Carro extends Vehiculo implements ICarroVolador {


    @Override
    public void encender() {
        System.out.println("Empujando el carro");
    }

    @Override
    public void abriendoSistemaVuelo(int motor) {
        System.out.println("Iniciar mototes:"+ motor);
    }
}
