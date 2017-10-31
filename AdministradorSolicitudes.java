package datos;

import java.util.ArrayList;
import java.util.List;

public class AdministradorSolicitudes {

    private static List<Solicitud> lista = lista = new ArrayList<>();

    public static void agregar(Solicitud Solicitud) {
        lista.add(Solicitud);
    }

    public static List<Solicitud> getLista() {
        return lista;
    }

    public static boolean existedetalleCaso(String detalleCaso) {
        return lista.stream().anyMatch((Solicitud) -> (Solicitud.getDetalleCaso().equals(detalleCaso)));
    }

    public static Solicitud obtenerSolicitud(String detalleCaso) {
        for (Solicitud Solicitud : lista) {
            if (Solicitud.getDetalleCaso().equals(detalleCaso)) {
                return Solicitud;
            }

        }
        return null;
    }
}
