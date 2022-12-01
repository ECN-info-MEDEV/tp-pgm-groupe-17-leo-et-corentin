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
        FlowLayout gest = new FlowLayout();
        
        panneau.setLayout(gest);
        
        
        JButton ecr = new JButton("Écrire");
        panneau.add(ecr);
        EcritureActionListener instance = new EcritureActionListener(Frame);
        ecr.addActionListener(instance);
        panneau.add(new JButton("Lire"));
        panneau.add(new JButton("Histogramme"));
        panneau.add(new JButton("Seuillage"));
        panneau.add(new JButton("Agrandir"));
        panneau.add(new JButton("Rétrécir"));
        
        
//        JMenuBar barmen = new JMenuBar();
//        JMenu jym = new JMenu("Choisir une option");
//        barmen.add(jym);
//        jym.add(new JMenuItem("Lire"));
//        jym.add(new JMenuItem("Écrire"));
//        jym.add(new JMenuItem("Histogramme"));
//        jym.add(new JMenuItem("Seuillage"));
//        jym.add(new JMenuItem("Modifier Taille"));
//        
//        panneau.add(barmen);
        
        Frame.setContentPane(panneau); 
        Frame.pack();
        Frame.setVisible(true);
        
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
}
