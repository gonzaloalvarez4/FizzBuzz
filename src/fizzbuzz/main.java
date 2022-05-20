/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class main{
public static void main(String[] args) {
        int a= new FizzBuzz().pedirNumero();
        List<Par> x= new FizzBuzz().FizzBuzz(a);
        for(int i=0;i<x.size();i++){
            System.out.println(x.get(i));}
        
    }
}