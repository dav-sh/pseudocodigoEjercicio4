public class Exercise4{
    public static void main(String[] args){
        int ages [] = {2,5,10,11,12,13,14,15,16,17,18,29,30,50,51,52,53,54,55,56};
        int minor = 0;
        int legal = 0;
        for(int i=0; i<20;i++){
            System.out.print("Age "+(i+1)+" is: "+ages[i]+" , ");
            if(ages[i]<=18){
                minor++;
            }else{
                legal++;
            }
        }
        System.out.println("\n");
        System.out.println("minor: "+minor);
        System.out.println("legal: "+legal);
    }
}