import java.util.ArrayList;

public class BoBai{

    public static ArrayList<String> ListSo() {
        ArrayList<String> listSo = new ArrayList<>();
        listSo.add("3");
        listSo.add("4");
        listSo.add("5");
        listSo.add("6");
        listSo.add("7");
        listSo.add("8");
        listSo.add("9");
        listSo.add("10");
        listSo.add("J");
        listSo.add("Q");
        listSo.add("K");
        listSo.add("A");
        listSo.add("2");
        return listSo;
    }

    public static ArrayList<String> ListChat(){
        ArrayList<String> listChat = new ArrayList<>();
        listChat.add("Bich");
        listChat.add("Chuon");
        listChat.add("Ro");
        listChat.add("Co");
        return listChat;
    }

    public static ArrayList<String> ListBai(){
        ArrayList<String> ListBai = new ArrayList<>();
        for(int i=0 ; i < BoBai.ListSo().size() ; i++){
            for(int j=0 ; j < BoBai.ListChat().size() ; j++){
                ListBai.add(BoBai.ListSo().get(i) + " " + BoBai.ListChat().get(j));
            }
        }
        return ListBai;
    }

    public static ArrayList<String> HoanVi(ArrayList<String> list1){
        String temp = "";
        for(int m=0; m < list1.size(); m++){
            for(int n=m+1; n < list1.size(); n++){
                if( (list1.get(m).equals(list1.get(n))) == false ){    
                    temp = list1.get(m);
                    list1.set(m,list1.get(n));
                    list1.set(n,temp);
                }
            }
        }
        return list1;
    }
    
    public static ArrayList<String> XepBai(int soNhap){
        ArrayList<String> BaiBoc = new ArrayList<>();
        int k=1;
        while(k<=soNhap){
            int random = (int)(Math.random()*BoBai.ListBai().size());
            BaiBoc.add(BoBai.ListBai().get(random));            
            k++;        
            
            for(int o=0; o < BaiBoc.size() ; o++){
                for(int p=o+1; p < BaiBoc.size() ; p++){
                    if(BaiBoc.get(o).equals(BaiBoc.get(p))){
                        BaiBoc.remove(o);
                        k-=1;    
                    }
                }
            }
        }

        System.out.println("Bai vua boc: " + BaiBoc);
        
        ArrayList<String> BaiXep = new ArrayList<>();      

        //Tang dan

        for(int i=0; i < BoBai.ListBai().size() ; i++){
            for(int j=0; j < BaiBoc.size() ; j++){
                k = soNhap;
                if(BoBai.ListBai().get(i).equals(BaiBoc.get(j))){
                    BaiXep.add(BaiBoc.get(j));
                }
            }
        }

        //Giam dan

        // ArrayList<String> ListBaiNguoc = new ArrayList<>(); 
        // ListBaiNguoc = BoBai.HoanVi(ListBai());

        // for(int z=0; z < ListBaiNguoc.size() ; z++){
        //     for(int t=0; t < BaiBoc.size() ; t++){
        //         k = soNhap;
        //         if(ListBaiNguoc.get(z).equals(BaiBoc.get(t))){
        //             BaiXep.add(BaiBoc.get(t));
        //         }
        //     }
        // }

        return BaiXep;
    }
}