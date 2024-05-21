
 interface ArrayOperation {

    public void performOperation();
}

class Sorting implements ArrayOperation{
    int arr[];
    Sorting(int[] arr){
        this.arr = arr;
    }

    @Override
    public void performOperation(){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; i<arr.length; j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}

class Insert implements ArrayOperation{
    @Override
    
}

public class ArrayOperationApp {

    public static void main(String[] args) {
        
    }
}