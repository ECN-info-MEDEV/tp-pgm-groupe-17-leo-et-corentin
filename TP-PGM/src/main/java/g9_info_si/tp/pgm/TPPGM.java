/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package g9_info_si.tp.pgm;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.*;

/**
 *
 * @author coco
 */
public class TPPGM {
    
    private String source;
    
    /**
    * Constructeur de TPPGM 
    * @param source : Source du fichier 
    */
    public TPPGM(String source) {
        this.source = source;
    }
    
    
    /**
     * Fonction de lecture d'un fichier PGM
     */
    private void lecture(){
        try{
            String ligne=" ";
            BufferedReader fichier = new BufferedReader(new FileReader(source));
            StringTokenizer tokenizer = new StringTokenizer(ligne, " ");
            ligne = fichier.readLine();
            ligne = fichier.readLine();
            ligne = fichier.readLine();
            int x = parseInt(tokenizer.nextToken());
            int y = parseInt(tokenizer.nextToken());
            int compteurX = 0;
            int compteurY = 0;
            int [][] matrice = new int[x][y];
            ligne = fichier.readLine();
            ligne = fichier.readLine();
            while (ligne != null){
                while(tokenizer.hasMoreTokens()){
                    matrice[compteurX][compteurY] = parseInt(tokenizer.nextToken());
                    compteurX+=1;
                }
                compteurX = 0;
                compteurY+=1;
                ligne = fichier.readLine();
            }
            System.out.println(matrice);
            fichier.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void seuillage(ArrayList<Integer> mat, int seuil){
        
    }
    
    

    public static void main(String[] args) {
        JFrame Frame = new JFrame("Analyse d'image");
        JPanel panneau = new JPanel();
        FlowLayout gest = new FlowLayout();
        
        panneau.setLayout(gest);
        
        
        JButton ecr = new JButton("Écrire");
        panneau.add(ecr);
        ecr.addActionListener((ActionEvent e) -> {
           System.out.println("test 1");
        });
        JButton lir = new JButton("Lire");
        panneau.add(lir);
        lir.addActionListener((ActionEvent e) -> {
           lecture();
        });
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
