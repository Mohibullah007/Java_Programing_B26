package day36_overloading_methods;

import my_utilities.ArrayUtil;

import java.util.Arrays;

public class AddElements {


        public static void main(String[] args) {

            int [] a = {1, 2, 3};
            int [] b = addElement(a, 4);
            System.out.println(Arrays.toString(b));

            String [] a1 = {"ahmad", "mahmod", "fatih"};
            String [] b1 = addElement(a1, "karim");
            System.out.println(Arrays.toString(b1));


            int[] y = {5, 23, 6, 21};
            int[] z = {3, 23, 6};
            System.out.println(Arrays.toString(addElement(y, z)));

        }

        public static int [] addElement(int [] original, int elementToAdd){
            int [] newArray = new int[original.length + 1];

            for(int i = 0; i < original.length; i++){
                newArray[i] = original[i];
            }
            // Instead of doing a loop ourselves, we could have used Arrays.copyOf()
            newArray[newArray.length - 1] = elementToAdd; // adding the new element to the end of the new array
            return newArray;
        }

        public static String [] addElement(String [] original, String element){
            String [] newString = new String[original.length + 1];
            newString = Arrays.copyOf(original, original.length + 1);
            newString[newString.length -1] = element;

            return newString;
        }

        public static int [] addElement(int [] original, int [] elementsToAdd){
            int [] newArray = new int[original.length + elementsToAdd.length];

            for (int i = 0, j = 0; i < newArray.length; i++){
                if (i < original.length){
                    newArray[i] = original[i];
                    // add the elements from the original array in the new array
                }else {
                    // added the new elements to the new array
                    newArray[i] = elementsToAdd[j++];
                }
            }


            return newArray;
        }

    }