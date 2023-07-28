/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.modelo;

import prog.modelo.Curso;
import java.util.Comparator;

public class Comparacion implements Comparator<Curso>{

    @Override
    public int compare(Curso e1, Curso e2){
       if(e1.getHoras() > e2.getHoras()){
           return -1;
       }else if(e1.getHoras() < e2.getHoras()){
           return 0;
       }else{
           return 1;
       }
    }
}
