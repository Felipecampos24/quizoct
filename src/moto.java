public class moto extends vehiculo{

    public moto(String marca, String modelo, String combustible) {
        super(marca, modelo, combustible);
    }

    @Override
    String encender() {
        return "la moto esta encendida" ;
    }

    @Override
    String apagar() {
        return "la moto esta apagada" ;
    }

    @Override
    String mostrarinfo() {
    return "";
    }
}
