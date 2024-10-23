public class carro extends vehiculo{

    public carro(String marca, String modelo, String combustible) {
        super(marca, modelo, combustible);
    }

    @Override
    String encender() {
     return "el carro esta encendido" ;

    }

    @Override
    String apagar() {
        return "el carro esta apagado" ;    }

    @Override
    String mostrarinfo() {
      return " ";
    }
}
