/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author soufiyan
 */
public class Main {
    
    public static void main(String args[]){
        score2 S =new score2("meeee");
        int tirage;
        
        while(S.getScore()!=21){
            Double D=new Double(6*Math.random()+1);
            tirage=D.intValue();
            
            S.Ajout_Point(tirage);
            System.out.println(S.getScore());
            
            if(S.getScore()>21){
                System.out.println("depassee 21");
                S.setScore(0);
                
             
            }
        }
        
        S.affiche();
        System.out.println("nombre dessai egale   :: " +S.getNbEssaie());
        
        //LANCER UN DES JUSQUAU ATTIENT UN NOBRE DE 21 POINTS
        
        /*
            Double D=new Double(6*Math.random()+1);
            Integer tirage=D.intValue();
        */
        
        
    }
    
    
    
}
