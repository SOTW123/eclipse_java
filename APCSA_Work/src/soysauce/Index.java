package soysauce;
public class Index {
    public static void main(String[] args) {    	
        String str1 = "ISI AP CSA";
        String str11 = str1.substring(0, 3);
        String str12 = str1.substring(7);
        String str2 = "isi apcsa";
        String str21 = str2.substring(0, 3);
        String str22 = str2.substring(4, 6);

        String str31 = "ISI";
        Boolean test1 = str31.equals(str11);
        System.out.println(test1);
        
        int Diff = str21.compareTo(str31);
        System.out.println(Diff);
        
        int index = str1.indexOf("P");
        System.out.println(index);
    }
}
