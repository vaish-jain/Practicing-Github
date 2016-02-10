/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polyabs;

/**
 *
 * @author Ayush
 */
public class PolyAbs {

    /**
     * @param args the command line arguments
     */
    static Object check(Object ob)
    {
        System.out.println(((abc)ob).x);
        return (abc)ob;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        abc a = new abc();
       // Object p= check(a);
       //Object a =new abc();
        Object l=new Object();
        if(l instanceof abc)
        {abc q= (abc)l;
        System.out.println(q.x);
        }
        abc b;
        //b =(abc) p;
        b=(abc)check(a);
        System.out.println(b.x);
        //comment
        //System.out.println(b.x);
        //System.out.println(b.x);
        //check check
    }
    static class abc
    {
        int x=2;
    }
}
