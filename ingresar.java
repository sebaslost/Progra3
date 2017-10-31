package com;

import datos.Solicitud;
import datos.AdministradorSolicitudes;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import org.primefaces.context.RequestContext;

@Named(value = "ingresar")
@RequestScoped
public class ingresar extends Solicitud {

    public ingresar() {
    }

    public String guardarInformacion() {
        AdministradorSolicitudes.agregar(this);
        return "verSolicitud";
    }

    public void validar() {
        RequestContext context = RequestContext.getCurrentInstance();
        boolean salida = AdministradorSolicitudes.existedetalleCaso(this.getDetalleCaso());
        context.execute("obtener(" + salida + ")");
    }
}
