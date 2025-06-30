package ex_15_Arrays_Part1;

public class lab157_highest_number2way {
    public static void main(String[] args) {

                int[] array = {56, 78, 98, 34, 65, 76};

                int max = array[0]; // maan lo pehla number hi sabse bada hai
                int secondMax = Integer.MIN_VALUE; // shuru me maan lo second sabse chhota

                for (int i = 0; i < array.length; i++) {
                    if (array[i] > max) {
                        // agar naya number sabse bada nikla
                        secondMax = max; // purana max ab second ban gaya
                        max = array[i];  // aur naya max set karo
                    } else if (array[i] > secondMax && array[i] != max) {
                        // agar naya number max se chhota lekin second se bada hai
                        secondMax = array[i]; // toh second max set karo
                    }
                }

                System.out.println("Sabse bada number: " + max);
                System.out.println("Doosra sabse bada number: " + secondMax);
            }
        }


