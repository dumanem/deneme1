/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_class;

/** I CLONED THIS PROJECT FROM DENEME1 RESPIRATORY AND I WROTE THIS COMMENT 
 * TO COMPARE!!!!!!!!
 *
 * @author emreduman
 */
public class Abstract_class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //abstractDatabase data=new abstractDatabase(); ERROR
        //INTTERFACEler gibi object can not be created
        
        abstractDatabase data1=new MySQLDatabase();
        data1.add();
        data1.delete();
        data1.get(1);
        data1.update(2);//davcvdhcvhdsvchdsvchvd
        
        abstractDatabase data2=new mongoDatabase();
        data2.get(3);
        data2.update(4);//degisiklik yapıyorum
        //midterm için
       
    }
    
}
