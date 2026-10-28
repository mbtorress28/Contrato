package Clases;

public class MenuContrato {

int opcion = 0;

do {
        System.out.println("\"\\n--- MENU CONTRATOS ---\"");
        System.out.println("Elija una opcion");
        System.out.println("1.Agregar contrato");
        System.out.println("2.Listar contratos");
        System.out.println("3.Verificar si esta vigente");
        System.out.println("4.Rescindir contrato");
        System.out.println("5.Salir");

        switch (opcion)
        {
            case 1:
                    break;
            case 2:
                    break;
            case 3:
                    break;
            case 4:
                    break;
            case 5:
                System.out.println("Saliendo del menu contratos...");
                    break;
            default:
                System.out.println("La opcion es invalida, intente de nuevo");

        }
        while (opcion!=5);

    }
}
