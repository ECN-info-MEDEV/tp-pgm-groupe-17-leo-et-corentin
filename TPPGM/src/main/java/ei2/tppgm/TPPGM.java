/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ei2.tppgm;

import java.io.BufferedReader;
import java.io.FileReader;
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
    private void lecture(){
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void seuillage(ArrayList<Integer> mat, int seuil){
        
    }
    
    public static void main(String[] args) {
        
    }
}
