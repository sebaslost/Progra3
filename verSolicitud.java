package com;

import datos.Solicitud;
import datos.AdministradorSolicitudes;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

@Named(value = "verSolicitud")
@Dependent
public class verSolicitud extends Solicitud {

    private List<Solicitud> Solicitud = new ArrayList<Solicitud>();

    public verSolicitud() {
    }

    @PostConstruct
    public void init() {
        Solicitud = AdministradorSolicitudes.getLista();

    }

    public List<Solicitud> getSolicitud() {
        return Solicitud;
    }
}
