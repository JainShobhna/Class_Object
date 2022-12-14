public class MainSG {

    public static void main(String args[]) {

        Garvi G = new Garvi("Sajna", "Hindi", 3);
        System.out.println("Height of Garvi is : " + G.getHeight());
        G.dance();
        boolean result = G.isSongPerfact();

        
        if (result){
            System.out.println("TEST PASSED!!!");
        }
        else{
            System.out.println("TEST FAILeD .... :(");
        }


    }
}
