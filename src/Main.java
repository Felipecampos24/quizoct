//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     carro chevrolet = new carro("chevrolet", "camaro","extra");
     camion jac= new camion ("JAC","JKR","ACPM");
     moto suzuki = new moto ("Suzuki","gixxer150","corriente");
     carroelectrico BYD = new carroelectrico ( "BYD","camioneta","energiaelectrica");

        System.out.println(chevrolet.apagar());
        System.out.println(chevrolet.encender());
        chevrolet.mostrarinfo();

        System.out.println(jac.apagar());
        System.out.println(jac.encender());
        jac.mostrarinfo();

        System.out.println(suzuki.apagar());
        System.out.println(suzuki.encender());
        suzuki.mostrarinfo();


    }
}