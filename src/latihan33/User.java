/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan33;

/**
 *
 * @author lutfi
 */
class User {
    private final String username = "RizkiAdam";
    private final String password = "terbaikselalu";
    private boolean statusAkun;
    
    private boolean cekAkun(String parUserName, String parPassword){
        return parUserName.equals(this.username) && parPassword.equals(this.password);
    }
    
    private void hasilLogin(Boolean status, String parUserName){
        if (status) {
            System.out.println("******HALLO "+parUserName.toUpperCase()+"******");
        }else{
            System.out.println("Ooops, Username atau Password anda Salah");
        }
    }
    
    public void PengecekkanLogin(String parUserName, String parPassword){
        statusAkun = cekAkun(parUserName, parPassword);
        hasilLogin(statusAkun, parUserName);
    }
}
