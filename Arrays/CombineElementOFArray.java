package Arrays;

public class CombineElementOFArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        String res = "";

        for(int i=0;i<arr.length;i++){
            res += ""+arr[i];
        }
        int n = (Integer.parseInt(res)+1);
        String s = Integer.toString(n);
        int j=0;
        String  arr1[] = new String[s.length()];
        System.out.println("S length : "+s.length());
        System.out.println("arr1 length : "+arr1.length);
        for(int i=0;i<s.length();i++){
            arr1[j] = ""+s.charAt(i);
            j++;
        }

        for(int i=0;i<arr1.length;i++){
            System.out.println("Elements are : "+arr1[i]);
        }
    }
}
