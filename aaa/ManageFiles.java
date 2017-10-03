/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aaa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Class to manage the files from the program.
 * @author duhnn
 */

public class ManageFiles {

    /*
	 * Method to copy line by line the source file to the destination file
     */
    public static boolean copyFile(File source, File destination) {

        try {
            // Declares new buffer to read line by line
            BufferedReader bufferR = new BufferedReader(
                    new FileReader(source));
            // Declares new fileWriter to write the content of the
            // file
            FileWriter writer = new FileWriter(destination
                    .getAbsoluteFile());
            // Uses bufferedWriter to allow string buffer and copy
            BufferedWriter bufferW = new BufferedWriter(writer);

            String linea;
            // While there are lines in the source file, it writes
            // them to the destination file
            while ((linea = bufferR.readLine()) != null) {
                bufferW.write(linea);
                bufferW.write(System.getProperty("line.separator"));
                // adds line separator
            }

            // Close buffers to liberate memory
            bufferR.close();
            bufferW.close();

            return true;

        } catch (Exception e) {
            return false;
        }
    }

}
