/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ei2.tppgm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author leo20
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
    private int[][] lecture(){
        try{
            String ligne;
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
            return(matrice);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * 
     * @param matrice : Le tableau des niveau de gris
     * @param nomFichier : Le nom du fichier qu'on veut cr??er, ou ??diter
     */
    private void ecriture(int[][] matrice, String nomFichier){
        int coordX = matrice.length;
        int coordY = matrice[0].length;
        String toAdd ="";
        BufferedWriter bw = null;
        
        try{
            //Cr??ation du bufferedWriter
            bw = new BufferedWriter(new FileWriter(nomFichier));
            //Ecriture des premi??res lignes
            bw.write("P2");
            bw.newLine();
            bw.write("#");
            bw.newLine();
            bw.write(coordX+" "+coordY);
            bw.write("255");
            bw.newLine();
            for (int i = 0; i < coordX-1; i++) {
                for (int j = 0; j < coordY-1; j++){
                    toAdd += matrice[i][j]+" ";
                }
                bw.write(toAdd);
                toAdd="";
                bw.newLine();
            }
        }
        //Gestion de l'exception si le fichier n'a pas pu ??tre cr????
        catch(FileNotFoundException ex){
            ex.printStackTrace();
        }
        //Gestion de l'exception si il y a un probl??me au cours de l'??criture du fichier
        catch(IOException ex){
            ex.printStackTrace();
        }
    }
    public static void seuillage(ArrayList<Integer> mat, int seuil){
        
    }
    
    public static void main(String[] args) {
        
    }
}
