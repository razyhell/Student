import java.util.Arrays;
import java.util.Scanner;
class Methods {
    public int getindex(String a) {
        int in = a.indexOf('+');
        if (in == (-1)) {
            in = a.indexOf('-');
            if (in == (-1)) {
                in = a.indexOf('/');
                if (in == (-1)) {
                    in = a.indexOf('*');
                }
            }
        }
        return in;
    }

    public int tointarabic(String a, String[] nums) {
        int first = 0;
        for (int i = 0; i < nums.length; i++) {
            if (a.equals(nums[i])) {
                first = i + 1;
                break;
            }
        }
        return first;
    }
    public int tointrome(String a, String[]nums3, String[]nums) {
        int number = 0;
        for(int i = 0; i<nums3.length; i++) {
            if(a.equals(nums3[i])) {
                number=i+1;
            }
        }
        return number;
    }
    public boolean isarabic (String a, String b, String[]nums) {
        boolean isone = false;
        boolean istwo = false;
        boolean result = false;
        for (String num : nums) {
            if (a.equals(num)) {
                isone = true;
                break;
            }
        }
        for (String num : nums) {
            if (b.equals(num)) {
                istwo = true;
                break;
            }
        }
        if(isone&&istwo) {
            result=true;
        }
        return result;
    }
public boolean isrome (String a, String b, String[]nums3) {
        boolean isone = false;
        boolean istwo = false;
        boolean result = false;
    for (String s : nums3) {
        if (a.equals(s)) {
            isone = true;
            break;
        }
    }
    for (String s : nums3) {
        if (b.equals(s)) {
            istwo = true;
            break;
        }
    }
        if(isone&&istwo) {result=true;}
        return result;
}
public int calculator (int a, int b, char z) {
        int result = 0;
        switch(z) {
            case '+':
                result=a+b;
                break;
            case '-':
                result=a-b;
                break;
            case '*':
                result=a*b;
                break;
            case '/':
                result=a/b;
                break;
            default:
                break;
        }
        return result;
}

}
    public class Calc {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Methods mymethods = new Methods();
            String[] nums = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
            String[] nums2 = {"I", "II", "III", "IV",
                    "V", "VI", "VII", "VIII", "IX",
                    "X", "XI", "XII", "XIII", "XIV", "XV",
                    "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
            String[] nums3 = Arrays.copyOf(nums2, 10);
            String a = sc.nextLine();
            int index = mymethods.getindex(a);
            String firstnum = a.substring(0, index);
            String secondnum = a.substring(index + 1);
            char znak = a.charAt(index);
            boolean isarabic = mymethods.isarabic(firstnum,secondnum,nums);
            boolean isrome = mymethods.isrome(firstnum,secondnum,nums3);
            if(isarabic) {
                int  firstnumber = mymethods.tointarabic(firstnum,nums);
                int secondnumber = mymethods.tointarabic(secondnum,nums);
                System.out.print(mymethods.calculator(firstnumber,secondnumber,znak));
            } else if(isrome) {
                int firstnumber = mymethods.tointrome(firstnum,nums3,nums);
                int secondnumber = mymethods.tointrome(secondnum,nums3,nums);
                int resultat = mymethods.calculator(firstnumber,secondnumber,znak);
                String resultatrome=nums2[resultat-1];
                System.out.print(resultatrome);
            }
            if(!isarabic && !isrome) {
                throw new RuntimeException("Error");
            }
        }
    }