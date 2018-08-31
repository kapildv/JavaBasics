package string;

public class StringReverseUsingRecursion {

    String rev="";
    public void reverser(String str){
        if(str==null || str.length()<=1){
            rev=rev+str;
//            System.out.print(str);
        }else {
            rev= rev+str.charAt(str.length()-1);
            reverser(str.substring(0,str.length()-1));
        }
    }
    public void print(){
        System.out.print(rev);
    }

    public static void main(String[] args){
        StringReverseUsingRecursion stringReverse= new StringReverseUsingRecursion();
        stringReverse.reverser("Kapil");
        stringReverse.print();
    }
}
