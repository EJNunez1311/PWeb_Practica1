import org.jsoup.Jsoup;
import java.util.Scanner;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

        public class Main {
            public static void main(String[] args) throws IOException {
                Tareas tareas = new Tareas();

                Scanner scanner = new Scanner(System.in);

                char op;
                boolean bye = true;

                while (true) {
                    System.out.print("------------------------------------------------------ \n");
                    System.out.print("Eliga una opcion:\na) Mostrar la cantidad de lineas del recurso retornado.\n" +
                            "b) Cantidad de parrafos (p) que contiene el documento HTML.\n" +
                            "c) Cantidad de imagenes (img) dentro de los parrafos que contiene el archivo HTML.\n" +
                            "d) Cantidad de formularios (form) que contiene el HTML por categorizando por el metodo implementado POST o GET.\n" +
                            "e) Mostrar los campos del tipo input y su respectivo tipo que contiene en el documento HTML.\n" +
                            "f) Identificar de metodo de envio de formulario y enviar una peticion al servidor .\n" +
                            "q) Salir\nSeleccion: ");
                    op = scanner.next().toUpperCase().charAt(0);
                    switch (op) {
                        case 'A':
                            tareas.parteA();
                            break;
                        case 'B':
                            tareas.parteB();
                            break;
                        case 'C':
                            tareas.parteC();
                            break;
                        case 'D':
                            tareas.parteD();
                            break;
                        case 'E':
                            tareas.parteE();
                            break;
                        case 'F':
                            tareas.parteF();
                            break;
                        case 'Q':
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Opcion invalida.");
                    }
                }
            }
        }
