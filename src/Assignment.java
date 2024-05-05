public class Assignment {
    public static void main(String[] args) {
        int arr[]={};
        int n=arr.length;

        int []result=MissingNumber(arr);
        System.out.println("Missing number is "+result[0]);
        System.out.println("Duplicate number is "+result[1]);

    }
    private static int [] MissingNumber(int[] arr){

            if(arr==null|| arr.length<2){
                throw new NullPointerException("Input should not be null");
            }


        int n=arr.length;
        int duplicate=-1, missingNumber=-1;

        for(int i=1;i<=n;i++){
            int count=0;
            for(int num:arr){
                if(num==i){
                    count++;
                }

            }
            if(count==2){
                duplicate=i;
            }else if(count==0){
                missingNumber=i;
            }
        }
        return new int[]{missingNumber,duplicate};

    }
}
