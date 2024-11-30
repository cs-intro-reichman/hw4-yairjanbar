public class Primes {
    public static void main(String[] args) {
        int n =Integer.parseInt(args[0]);
        int l = n +1; //31
        int count=0; 
        boolean[] arr1 = new boolean[l]; //arr made with 31 palce
        arr1[0]=false; // first place false
        arr1[1]=false;
        for (int m=2;m<l;m++) {
            arr1[m]=true;
        }
        for (int i=2;i<l;i++){
            for(int j=2;j<i;j++) {
                if (i%j==0) { // 
                    arr1[i]=false;
                    break;
                }
            }
        }
        System.out.println("Prime numbers up to " + n + " :");
        for (int k=0;k<arr1.length;k++) {
            if(arr1[k]==true) {
                count++;
                System.out.println(k);
            }
            
        }
        double avg = (double) count/(n)*100;
        System.out.println("There are "+ count + " primes between 2 and " + n + " (" + (int) avg +"% are primes)");


    }
}