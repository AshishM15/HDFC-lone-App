public class TrapedRainWater {
    
    public static int trappingRainWater(int hight[]){

        int n=hight.length;
        //calculete left max boundery - Array
       int leftmax[]=new int[n];
       leftmax[0]=hight[0];

       for(int i=1;i<n;i++){
        leftmax[i]=Math.max(hight[i], leftmax[i-1]);
       }
       //calculate right max boundery - Array
       int rightmax[]=new int[n];
       rightmax[n-1]=hight[n-1];
       for(int i=n-2;i>=0;i--){
        rightmax[i]=Math.max(hight[i], rightmax[i+1]);
       }

       //loops

       int trapedWatter=0;

       for(int i=1;i<n;i++){
        int watterLevel = Math.min(leftmax[i], rightmax[i]);

         trapedWatter += watterLevel - hight[i];
       }
       return trapedWatter;
    }
    public static void main(String[] args) {
        int hight[]= {4,2,0,6,3,2,5};
        

        System.out.println(trappingRainWater(hight));
    }
}
