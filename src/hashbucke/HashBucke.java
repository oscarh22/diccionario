/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashbucke;

import java.util.Hashtable;
import java.util.InputMismatchException;
import java.util.Map.Entry;
import java.util.Scanner;

public class HashBucke {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {

            System.out.println("1. Español");
            System.out.println("2. Ingles");
            System.out.println("3. Salir");

           

                System.out.println("Escribe una de las opciones");
                opcion = leer.nextInt();

                switch (opcion) {
                    case 1:

                        Hashtable<String, String> diccionario = new Hashtable<String, String>();
                        diccionario.put("yo", "me");
                        diccionario.put("tu", "you");
                        diccionario.put("perro", "dog");
                        diccionario.put("mesa", "table");
                        diccionario.put("gato", "cat");
                        diccionario.put("jeans", "jeans");
                        diccionario.put("zapatos", "shoes");
                        diccionario.put("blusa", "blouse");
                        diccionario.put("rojo", "red");
                        diccionario.put("portatil", "laptop");
                        diccionario.put("arbol", "tree");
                        diccionario.put("pizarron", "whiteboard");
                        diccionario.put("pan", "bread");
                        diccionario.put("cafe", "coffee");
                        diccionario.put("jugar", "play");
                        diccionario.put("frijoles", "beans");
                        diccionario.put("puerta", "door");
                        diccionario.put("pared", "wall");
                        diccionario.put("mesa", "table");
                        diccionario.put("manzana", "apple");
                        diccionario.put("platano", "banana");
                        diccionario.put("naranja", "orange");
                        diccionario.put("aguacate", "avocado");
                        diccionario.put("computadora", "computer");
                        diccionario.put("maestro", "teacher");
                        diccionario.put("mascarilla", "facemask");
                        diccionario.put("doctor", "doctor");
                        diccionario.put("abril", "april");
                        diccionario.put("volar", "fly");
                        diccionario.put("pajaro", "bird");
                        diccionario.put("dibujar", "drawing");
                        // Esto va a realizar la "inversión" del diccionario (ingles-español)
                        /**
                         * Hashtable<String, String> dictionary = new Hashtable<String,String
                         * >(); for (String key : diccionario.keySet()) {
                         * dictionary.put(diccionario.get(key), key); }
                         */
                        StringBuilder phrase = new StringBuilder();

                        /* System.out.println("Dame la palabra a traducir");
                        String frase = sc.next().toLowerCase();
                        // sc.close(); //Cerrar el Scanner
                        
                        // Separamos las palabras por espacio e iteramos sobre cada una de ellas
                        for (String palabra : frase.split(" ")) {
                            // buscamos en el mapa
                            // dependiendo del idioma, buscaríamos en diccionario o dictionary
                            String word = diccionario.get(palabra);
                            // Si no existe, dejamos en Español
                            if (word == null) {
                                word = palabra;
                            }
                            // "concatenamos"
                            if (phrase.length() != 0) {
                                phrase.append(" ");
                            }
                            phrase.append(word);
                        }*/
                        System.out.println(phrase.toString());
                        System.out.println("Palabra a traducir (Spanish-English)");
                        String clave = sc.next().toLowerCase();
                        //sc.close();
                        System.out.println("La traducción de la palabra " + clave + " es " + diccionario.get(clave));
                        if (diccionario.get(clave) == null) {
                            System.out.println("La palabra no existe ingresa otra");
                            clave = sc.next().toLowerCase();
                            System.out.println("La traducción de la palabra " + clave + " es " + diccionario.get(clave));
                            sc.close();
                        }

                        break;
                    case 2:

                        Hashtable<String, String> diccionari = new Hashtable<String, String>();
                        diccionari.put("me", "yo");
                        diccionari.put("you", "tu");
                        diccionari.put("dog", "perro");
                        diccionari.put("table", "mesa");
                        diccionari.put("cat", "gato");
                        diccionari.put("jeans", "jeans");
                        diccionari.put("shoes", "zapatos");
                        diccionari.put("blouse", "blusa");
                        diccionari.put("red", "rojo");
                        diccionari.put("laptop", "portatil");
                        diccionari.put("tree", "arbol");
                        diccionari.put("whiteboard", "pizarron");
                        diccionari.put("bread", "pan");
                        diccionari.put("coffee", "cafe");
                        diccionari.put("play", "jugar");
                        diccionari.put("beans", "frijoles");
                        diccionari.put("door", "puerta");
                        diccionari.put("wall", "pared");
                        diccionari.put("table", "mesa");
                        diccionari.put("apple", "manzana");
                        diccionari.put("banana", "platano");
                        diccionari.put("orange", "naranja");
                        diccionari.put("avocado", "aguacate");
                        diccionari.put("computer", "computadora");
                        diccionari.put("teacher", "maestro");
                        diccionari.put("facemask", "mascarilla");
                        diccionari.put("doctor", "doctor");
                        diccionari.put("april", "abril");
                        diccionari.put("fly", "volar");
                        diccionari.put("bird", "pajaro");
                        diccionari.put("drawing", "dibujar");
                        // Esto va a realizar la "inversión" del diccionario (ingles-español)
                        /**
                         * Hashtable<String, String> dictionary = new Hashtable<String,String
                         * >(); for (String key : diccionario.keySet()) {
                         * dictionary.put(diccionario.get(key), key); }
                         */
                        StringBuilder orden = new StringBuilder();
                        /* System.out.println("Dame la palabra a traducir");
                        String frases = sc.next().toLowerCase();
                        // sc.close(); //Cerrar el Scanner
                      
                        // Separamos las palabras por espacio e iteramos sobre cada una de ellas
                        for (String palabra : frases.split(" ")) {
                            // buscamos en el mapa
                            // dependiendo del idioma, buscaríamos en diccionario o dictionary
                            String word = diccionari.get(palabra);
                            // Si no existe, dejamos en Español
                            if (word == null) {
                                word = palabra;
                            }
                            // "concatenamos"
                            if (orden.length() != 0) {
                                orden.append(" ");
                            }
                           orden.append(word);
                        }*/
                        System.out.println(orden.toString());
                        System.out.println("Palabra a traducir (English-Spanish)");
                        String claves = sc.next().toLowerCase();
                        //sc.close();
                        System.out.println("La traducción de la palabra " + claves + " es " + diccionari.get(claves));
                        if (diccionari.get(claves) == null) {
                            System.out.println("La palabra no existe ingresa otra");
                            clave = sc.next().toLowerCase();
                            System.out.println("La traducción de la palabra " + claves + " es " + diccionari.get(claves));
                            sc.close();
                        }

                        break;

                    case 3:
                        salir = true;
                        break;

                }
            }

        }

    }


 


