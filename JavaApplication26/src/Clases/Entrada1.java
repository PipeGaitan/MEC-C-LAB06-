package Clases;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import javax.swing.ImageIcon;

public class Entrada1 {
    private int time;
    public Entrada1 (int milisec){
    this.time=milisec;
    }
    public void run (){
        while(true){
            int num= (int) (Math.random()*(6)+1);
            String ruta ="src\\Imagenes\\"+num+".png";
            ImageIcon imagen= new ImageIcon(ruta);
            
            
        
        
        
        }
     
    
    
    }
            
}
