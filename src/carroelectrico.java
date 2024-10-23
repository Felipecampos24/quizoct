public class carroelectrico extends vehiculo implements vehiculoelectrico{

    public carroelectrico(String marca, String modelo, String combustible) {
        super(marca, modelo, combustible);
    }



    @Override
    public void cargarbateria() {
    }

    @Override
    public void nivelbateria() {

    }

    @Override
    String encender() {
        return "el carro electrico esta encendido";
    }

    @Override
    String apagar() {
        return "el carro electrico esta apagado";
    }

    @Override
    String mostrarinfo() {
        return "";
    }
}
