/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apprecado;

/**
 *
 * @author s.lucas
 */
public class teste {
    public static void main(String[] args) {
        pessoa p1;
        pessoa p2;
        
        p1 = new pessoa();
        p2 = new pessoa(2, "cururu da silva", "(51) 9.9923-4567", "cururu@cururu.net");
        pessoa p3 = new pessoa();
        p3.setNome("Zebra da Silva");
        p3.setCelular("(51)9.2456-7890");
        p3.setEmail("zebra@umdoistres.com");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        
        System.out.println("p1" + p1.getNome() + "p2" + p2.getNome() + "p3" + p3.getNome());
    }
}
