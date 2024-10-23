public class camion extends vehiculo{

    public camion(String marca, String modelo, String combustible) {
        super(marca, modelo, combustible);
    }

    @Override
    String encender() {
        return "el camion esta encendido" ;
    }

    @Override
    String apagar() {
        return "el camion esta apagado" ;    }

    @Override
    String mostrarinfo() {
     return "";
    }
}
