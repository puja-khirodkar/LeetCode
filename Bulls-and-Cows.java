class Solution {
    public String getHint(String secret, String guess) {
        
        assert secret.length() == guess.length();
        
        final int N = secret.length();
        
        int[] bulls = new int[N];
        int[] cows = new int[N];
        
        int bullsCount=0, cowsCount=0;
        
        // Check Bulls
        for(int i=0;i<N;i++){
            if(guess.charAt(i) == secret.charAt(i)){
                bullsCount += 1;
                bulls[i] = 1;
            }
        }
        
        for(int i = 0; i < N; i++){
            if(bulls[i] == 1) {
                continue;
            }

            for(int j = 0; j < N; j++){    
                if(bulls[j] != 1 && cows[j] != 1 && guess.charAt(i) == secret.charAt(j)){
                    cows[j] = 1;
                    cowsCount += 1;
                    break;
                } 
            }   
        }
    
        return  "" + bullsCount + "A"+ cowsCount + "B";
    }
    
    public void pa(int arr[]) {
        System.out.print("[");
        for (int i = 0; i< arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length -1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
        System.out.println();
    }
}
