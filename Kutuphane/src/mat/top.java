/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mat;

/**
 *
 * @author Cengoo
 */
public class top {
    
    public int topla(int x,int y)
    {
        return x+y;
    }
    public int fak(int x)
    {
        if(x<=1)
            return 1;
        else
            return x*fak(x-1);
    }
    
}
