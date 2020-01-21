/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_class;

/**
 *
 * @author emreduman
 */
public abstract class abstractDatabase 
{
    public void add()//gövdeli method
    {
        System.out.println("Adding...");
    } 
    
    public void delete()
    {
        System.out.println("Deleting...");
    }

    abstract void update(int a);//soyut method
    abstract void get(int a);
}

