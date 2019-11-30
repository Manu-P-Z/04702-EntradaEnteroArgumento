/* 
 * Copyright 2019 Manu Portolés.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.app;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Manu Portolés
 */
public final class App {

    //Scanner
    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    //Constantes
    public static final String MSG_USR = "Introducir número ......: ";
    public static final String MSG_OUT = "Número introducido .....: ";
    public static final String MSG_ERR = "ERROR: Entrada Incorrecta ";

    public final void launchApp() {

        //Cabecera
        System.out.println("INTRODUCCIÓN ENTERO");
        System.out.println("===================");

        //Introducir Dato
        int n = (int) obtener(MSG_USR, MSG_ERR);

        //Separador
        System.out.println("---");

        //Mostrar Dato
        System.out.printf("%s %d%n", MSG_OUT, n);
    }

    //Obtener entero
    public static final double obtener(String msgUsr, String msgErr) {
        //Numero a devolver
        double numero = 0;
        boolean valido;
        //Proceso de entrada
        do {
            System.out.print(msgUsr);
            try {

                numero = SCN.nextDouble();
                valido = true;

            } catch (Exception e) {
                System.out.println(msgErr);
                valido = false;
            } finally {
                SCN.nextLine();
            }
        } while (valido == false);

        return numero;
    }

}
