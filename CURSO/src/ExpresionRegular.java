import java.util.ArrayList;

public class ExpresionRegular {
    String nombre;
    String ip;

    public ExpresionRegular(String nombre, String ip) {
        this.nombre = nombre;
        this.ip = ip;
    }

    public static boolean valirdarNombre(String nombre) {
        // return nombre.matches("[A-Z]{1}[a-z]{2,16} [A-Z]{1}[a-z]{2,16}");
        return nombre.matches("^[[A-Z]{1}[a-z]{2,16} ]{2}$");
    }

    public static boolean validarIPv4(String ip) {
        return ip.matches(
                "^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]).){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");
    }

    public static void bloquearNavegacion(ArrayList<ExpresionRegular> lsIps, String ipDenied) {
        System.out.println("\n\n\tHistorial de navegación de Juanito\n");
        for (ExpresionRegular pagina : lsIps) {
            if (validarIPv4(ipDenied) && pagina.ip.equals(ipDenied)) {
                System.out.println("\tJuanito ha sido restringido de ingresar a: ¡<" + pagina.nombre.toUpperCase()
                        + ">! con dirección IP: " + pagina.ip);
                continue;
            }
            System.out.println("Juanito ingreso a: <" + pagina.nombre + "> con dirección IP: " + pagina.ip);
        }
    }

    public static void main(String[] args) throws Exception {

        /*
         * CLASES DE IP'S
         *
         * CLASE A = 0.0.0.0 → 127.255.255.255 USADA POR EMPRESAS CON MILLONES DE
         * DISPOSITIVOS
         * CLASE B = 128.0.0.0 → 191.255.255.255 USADA PARA CONECTARSE A INTERNET GLOBAL
         * CLASE C = 192.0.0.0 → 223.255.255.255 USADA PARA CONECTARSE A INTERNET LOCAL
         * CLASE D = 224.0.0.0 → 239.255.255.255 USADA PARA MULTIDIFUCIÓN DE DATOS /
         * PARA GRUPOS
         * CLASE E = 240.0.0.0 → 247.255.255.255 USO ESPECIAL CON FINES EXPERIMENTALES
         */
        System.out.println("\n\tVerificar validez de IP's\n");
        System.out.println("186.47.107.1:\t" + validarIPv4("186.47.107.1"));
        System.out.println("0.0.238.0.:\t" + validarIPv4("0.0.238.0."));
        System.out.println("0.00.000.0:\t" + validarIPv4("0.00.000.0"));
        System.out.println("017.25.01.9:\t" + validarIPv4("017.25.01.9"));

        ArrayList<ExpresionRegular> lsDominios = new ArrayList<ExpresionRegular>();
        ExpresionRegular dom1 = new ExpresionRegular("www.youtube.com", "142.250.217.78");
        lsDominios.add(dom1);
        ExpresionRegular dom2 = new ExpresionRegular("www.google.com", "142.250.217.68");
        lsDominios.add(dom2);
        ExpresionRegular dom3 = new ExpresionRegular("www.facebook.com", "157.240.3.35");
        lsDominios.add(dom3);
        ExpresionRegular dom4 = new ExpresionRegular("www.messenger.com", "157.240.3.20");
        lsDominios.add(dom4);
        ExpresionRegular dom5 = new ExpresionRegular("www.pinterest.com", "146.75.40.84");
        lsDominios.add(dom5);
        ExpresionRegular dom6 = new ExpresionRegular("www.mega.com", "54.247.79.157");
        lsDominios.add(dom6);
        ExpresionRegular dom7 = new ExpresionRegular("www.titok.com", "23.72.90.8");
        lsDominios.add(dom7);
        ExpresionRegular dom8 = new ExpresionRegular("www.tinder.com", "52.84.150.60");
        lsDominios.add(dom8);
        ExpresionRegular dom9 = new ExpresionRegular("www.shoxniex.com", "104.21.17.15");
        lsDominios.add(dom9);
        ExpresionRegular dom10 = new ExpresionRegular("www.runonetworks.com", "104.198.69.101");
        lsDominios.add(dom10);
        ExpresionRegular dom11 = new ExpresionRegular("www.twitter.com", "104.244.42.1");
        lsDominios.add(dom11);

        bloquearNavegacion(lsDominios, lsDominios.get(7).ip);
    }
}
