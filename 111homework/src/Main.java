import java.util.Arrays;

/**
 * @author jzh
 * @version 1.0
 * @date 2022/1/11 8:50
 * 一个六位数分别乘以2、3、4、5、6后还是六位数，而且组成这些六位数的数字不变，
 * 这个六位数是什么数？
 */
public class Main {
    public static void main(String[] args) {
        int i ;
        //初始值为100000  只能是六位数  <1000000
        for ( i= 100000; i < 1000000; i++) {
            if ((i * 2 < 1000000 && i * 3 < 1000000 && i * 4 < 1000000 && i * 5 < 1000000 && i * 6 < 1000000)){
                //把 i 和i 的倍数 变成数组存起来
                int i1 = i;
                String nums1 = String.valueOf(i1);
                int[] one =  new int [nums1.length()];
                for (int k = 0; k < nums1.length(); k++) {
                    one[k] = Integer.parseInt(String.valueOf(nums1.charAt(k)));
                }
                int i2 =  i*2;
                String nums2 = String.valueOf(i2);
                int[] two =  new int [nums2.length()];
                for (int k = 0; k < nums2.length(); k++) {
                    two[k] = Integer.parseInt(String.valueOf(nums2.charAt(k)));
                }
                int i3 =  i*3;
                String nums3 = String.valueOf(i3);
                int[] three =  new int [nums3.length()];
                for (int k = 0; k < nums3.length(); k++) {
                    three[k] = Integer.parseInt(String.valueOf(nums3.charAt(k)));
                }
                int i4 =  i*4;
                String nums4 = String.valueOf(i4);
                int[] four =  new int [nums4.length()];
                for (int k = 0; k < nums4.length(); k++) {
                    four[k] = Integer.parseInt(String.valueOf(nums4.charAt(k)));
                }
                int i5 =  i*5;
                String nums5 = String.valueOf(i5);
                int[] five =  new int [nums5.length()];
                for (int k = 0; k < nums5.length(); k++) {
                    five[k] = Integer.parseInt(String.valueOf(nums5.charAt(k)));
                }
                int i6 =  i*6;
                String nums6 = String.valueOf(i6);
                int[] six =  new int [nums6.length()];
                for (int k = 0; k < nums6.length(); k++) {
                    six[k] = Integer.parseInt(String.valueOf(nums6.charAt(k)));
                }
                //从小到大拍好 进行比较
                Arrays.sort(one);
                Arrays.sort(two);
                Arrays.sort(three);
                Arrays.sort(four);
                Arrays.sort(five);
                Arrays.sort(six);
                if (Arrays.equals(one,two) && Arrays.equals(two,three) && Arrays.equals(three,four) && Arrays.equals(four,five) && Arrays.equals(five,six)){
                    System.out.println("i="+i+"二倍="+ i*2+"四倍"+i*4+"五倍"+i*5+"六倍"+i*6);
                }
            }
        }
    }
}