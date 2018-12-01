/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prolab3;

/**
 *
 * @author ryuzaki
 */
public class manipulatorRobot extends robot {
    private int yukTasimaKapasitesi;
    private int kolUzunlugu;
    private int tasimaHızı;
          
    public manipulatorRobot()
    {
        
    }
    public int getYukTasimaKapasitesi()
    {
        return this.yukTasimaKapasitesi;
    }
    public void setYukTasimaKapasitesi(int yukTasimaKapasitesi)
    {
        this.yukTasimaKapasitesi=yukTasimaKapasitesi;
    }
    public int getKolUzunlugu()
    {
        return this.kolUzunlugu;
    }
    public void setKolUzunlugu(int kolUzunlugu)
    {
        this.kolUzunlugu=kolUzunlugu;
    }
    public int getYukTasimaHizi()
    {
        return this.tasimaHızı;
    }
    public void setYukTasimaHizi(int tasimaHızı)
    {
        this.tasimaHızı=tasimaHızı;
    }
}
