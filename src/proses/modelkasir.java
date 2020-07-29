/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proses;
/**
 *
 * @author ALAN
 */
public class modelkasir {
    
    public int harga(String id){
        int hargat=0;
        for(int i=0;i<allobject.trans.getTransaksi().size();i++){
            if(id.equals(allobject.trans.getTransaksi().get(i).getidreg())){
                for(int j=0;j<allobject.trans.getTransaksi().get(i).get_index();j++){
                    hargat=hargat+allobject.trans.getTransaksi().get(i).getpesan().get(j).getharga();
                }
            }
        }
        return hargat;
    }
    
    public int kembalian(int bayar,int harga){
        int kembali = bayar-harga;
        return kembali;
    }
    
    public String struck(String id){
        String struk = null;
        for(int i=0;i<allobject.trans.getTransaksi().size();i++){
            if(id.equals(allobject.trans.getTransaksi().get(i).getidreg())){
                //for(int j=0;j<allobject.trans.transaksi.get(i).get_index();j++){
                    struk="nama = "+allobject.trans.getTransaksi().get(i).get_namaPembeli()+"\n"
                            + "id transaksi = "+allobject.trans.getTransaksi().get(i).getidreg()+"\n"
                            + "nama sales   = "+allobject.trans.getTransaksi().get(i).get_namaSales()+"\n";
                //}
            }
        }
        return struk;
    }
    public void remove_transaksi(String id){
        for(int i=0;i<allobject.trans.getTransaksi().size();i++){
            if(id.equals(allobject.trans.getTransaksi().get(i).getidreg())){
                allobject.trans.getTransaksi().remove(i);
            }
        }
    }
    public String cetak(String id){
        String prin="";
        for(int i=0;i<allobject.trans.getTransaksi().size();i++){
            if(id.equals(allobject.trans.getTransaksi().get(i).getidreg())){
                for(int j=0;j<allobject.trans.getTransaksi().get(i).get_index();j++){
                prin+="nama = "+allobject.trans.getTransaksi().get(i).getpesan().get(j).getnama()+"\n"
                        + "id   = "+allobject.trans.getTransaksi().get(i).getpesan().get(j).getid()+"\n"
                        + "harga = "+allobject.trans.getTransaksi().get(i).getpesan().get(j).getharga()+"\n";
//                System.out.println("nama = "+allobject.trans.getTransaksi().get(i).getpesan().get(j).getnama());
//                System.out.println("id   = "+allobject.trans.getTransaksi().get(i).getpesan().get(j).getid());
//                System.out.println("harga = "+allobject.trans.getTransaksi().get(i).getpesan().get(j).getharga());
                }
            }
            //System.out.println(transaksi.get(i).getidreg());
            
        }
        return prin;
    }
}
