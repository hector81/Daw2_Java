/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aaa;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.LineBreakMeasurer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 * Interface class named Principal, where the options of the program are shown
 *
 * @author duhnn
 *
 */
public class Principal extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JFileChooser fileChooser;
    private File fileToCopy, destinationFile;
    //Boolean to check if source and destination file have been choosed.
    private boolean fileToCopySelected = false,
            destinationFileSelected = false;

    /**
     * Contructor of the Principal class
     */
    public Principal() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Set bounds of frame
        setBounds(100, 100, 380, 180);
        contentPane = new JPanel();
        //Create empty border and set it on contentPane
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        JPanel panel = new JPanel();
        contentPane.add(panel, BorderLayout.CENTER);
        panel.setLayout(null);

        //Set the position null, to show the panel centered on window.
        setLocationRelativeTo(null);

        //Button to manage the file source
        JButton btnFitxerOrgen = new JButton("Select file");
        btnFitxerOrgen.setBounds(22, 23, 117, 25);
        // Adds listener to the button, to manage events
        btnFitxerOrgen.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                // Opens a JFileChooser when button clicked
                fileChooser = new JFileChooser();
                fileChooser
                        .setDialogTitle("Choose a directory to copy the file");
                int returnVal = fileChooser.showOpenDialog(Principal.this);
                // If a file has been choosed, it's stored in a File variable
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    fileToCopy = fileChooser.getSelectedFile();
                    // set the boolean fileToCopySelected to know that there is
                    // a selected file
                    fileToCopySelected = true;
                }

            }

        });
        panel.add(btnFitxerOrgen);

        //Button to manage the destination file
        JButton btnFitxerDest = new JButton("Destination file");
        btnFitxerDest.setBounds(151, 23, 185, 25);
        btnFitxerDest.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                // Opens a JFileChooser when button clicked
                fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Choose destination file");
                int returnVal = fileChooser.showOpenDialog(Principal.this);
                // If a file has been choosed, it's stored in a File variable
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    destinationFile = fileChooser.getSelectedFile();
                    // set destinationFolderSelected as true, to permit the
                    // program to copy of the file
                    destinationFileSelected = true;
                }

            }
        });
        panel.add(btnFitxerDest);

        //Button to copy source file to destination file
        JButton btnCopiar = new JButton("Copy file");
        btnCopiar.setBounds(207, 88, 117, 25);
        // Add event listener to the copy button
        btnCopiar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                // Check if file has been choosed, and destination folder is
                // selected.
                if (destinationFileSelected && fileToCopySelected) {

                    //Boolean to check if file has been copied.
                    boolean isFileCopied = false;

                    try {

                        if (destinationFile.exists()) {
                            //If file exists, it ask the client to choose between overwrite or exit
                            int selectedOption = JOptionPane.showConfirmDialog(
                                    null, "File exists, do you want to overwrite?",
                                    "Choose selection", JOptionPane.YES_NO_OPTION);
                            if (selectedOption == JOptionPane.YES_OPTION) {
                                //Calls method copyFile from ManageFiles class if option YES is selected
                                isFileCopied = ManageFiles.copyFile(fileToCopy, destinationFile);
                            }
                        } else {
                            //Calls method copyFile from ManageFiles class if file doesn't exists
                            isFileCopied = ManageFiles.copyFile(fileToCopy, destinationFile);

                        }

                        //Show message depending on the result of copyFile method 
                        if (isFileCopied) {
                            JOptionPane.showMessageDialog(getContentPane(), "File "
                                    + fileToCopy.getName() + " copied succesfully.");
                        } else {
                            JOptionPane.showMessageDialog(getContentPane(), "Error copying file");
                        }

                    } catch (Exception e) {
                        //Show the error to user
                        JOptionPane.showMessageDialog(getContentPane(), "Error! " + e);
                    }

                } else // Error messages if there aren't files selected
                if (!destinationFileSelected && !fileToCopySelected) {
                    JOptionPane
                            .showMessageDialog(getContentPane(),
                                    "You must select a source file and a destination file");
                } else if (!destinationFileSelected) {
                    JOptionPane.showMessageDialog(getContentPane(),
                            "You must select a destination file.");
                } else if (!fileToCopySelected) {
                    JOptionPane.showMessageDialog(getContentPane(),
                            "You must select a file to copy.");

                }

            }
        });
        panel.add(btnCopiar);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {

    }
}
