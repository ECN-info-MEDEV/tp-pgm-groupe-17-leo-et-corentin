/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package g9_info_si.tp.pgm;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author coco
 */
public class TPPGM {
    
    
    

    public static void main(String[] args) {
        JFrame Frame = new JFrame("Analyse d'image");
        JPanel panneau = new JPanel();
        GridLayout gest = new GridLayout(2,3);
        
        panneau.setLayout(gest);
        panneau.add(new JButton("Écrire"));
        panneau.add(new JButton("Lire"));
        panneau.add(new JButton("Histogramme"));
        panneau.add(new JButton("Seuillage"));
        panneau.add(new JButton("Agrandir"));
        panneau.add(new JButton("Rétrécir"));
        Frame.setContentPane(panneau); 
        Frame.pack();
        Frame.setVisible(true);
        
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
}
