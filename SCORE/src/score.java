/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author soufiyan
 */
public class score {
    private String Nom;
     private int Score;
     private int Score_Max;
    
    public void affiche(){
        System.out.println("le nom du joueur   :  "+this.Nom +"   son score est  :   "+this.Score +"   avec un score maximal ::  "+ this.Score_Max);
    }
    
    //initialisation 
    public score(){
        this.Nom="inconnu";
        this.Score=0;
        this.Score_Max=100;
    }
    //surchage du constructeur
  
    public score(String Nom){
        this();//mot cle this 
        this.Nom=Nom;
    }
    //Le score doit toujours être un nombre positif inférieur ou égal à scoMax. Cependant un programme
//peut attribuer n'importe quelle valeur au champ leScore. Pour empêcher cela déclarer ce champ
//avec le préfixe "private".

    public int getScore() {
        return this.Score;
    }

    public void setScore(int Score) {
        if(this.Score +Score<=Score_Max){
        this.Score = Score;
        }else{
            this.Score=Score_Max;
            System.out.println("le score impriquee est superieur strictement au scor maximal");
            
        }
    }
    //Ecrire une méthode permettant d'ajouter des points au score.
    
    public void Ajout_Point(int point){
        this.Score+=point;
    }
    
    
    
    
}
