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
                    System.out.print("Seleccione:\na) Indicar la cantidad de lineas del recurso retornado.\n" +
                            "b) Indicar la cantidad de parrafos (p) que contiene el documento HTML.\n" +
                            "c) Indicar la cantidad de imagenes (img) dentro de los parrafos que contiene el archivo HTML.\n" +
                            "d) Indicar la cantidad de formularios (form) que contiene el HTML por categorizando por el metodo implementado POST o GET.\n" +
                            "e) Para cada formulario mostrar los campos del tipo input y su respectivo tipo que contiene en el documento HTML.\n" +
                            "f) Para cada formulario,identificar que el metodo de envio del formulario sea POST y enviar una peticion al servidor con el parametro llamado asignatura y valor practica1 y un header llamado matricula con el valor correspondiente a matricula asignada. Debe mostrar la respuesta por la salida estandar.\n" +
                            "s) Salir\nSeleccion: ");
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
                        case 'S':
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Opcion invalida.");
                    }
                }
            }
        }
