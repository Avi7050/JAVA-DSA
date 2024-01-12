class SquarePattern{
    static void pattern1(int n){
        for(int i = 0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n){
        int num = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(num+" ");
            }
            num++;
            System.out.println();
        }
    }
    public static void pattern3(int n){
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(j+" ");
            }
            
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
        pattern3(5);
    }
}