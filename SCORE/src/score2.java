/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author soufiyan
 */
public class score2 extends score{
    
    private int NbEssaie;
    
    public score2(){
        super();
        NbEssaie=1;
    }
    
    public score2(String Nom){
        super(Nom);
        NbEssaie=1;

    }
        
    
     public void setScore(int Score) {
        super.setScore(Score);
        this.NbEssaie++;
        
    }
    

      

    public int getNbEssaie() {
        return NbEssaie;
    }
 
    /*public void AjouteEssaie(int NbEssaie) {
        this.NbEssaie++;
    }*/

    
}
