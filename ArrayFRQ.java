public class pairs {
public static int getPairValue(int[] array, int pos)

{
return Math.abs(array[pos] - array[pos+1]);
}

public static boolean isEven(int num)

{
If (num % 2 == 0) {
return true;
}
return false;
}

public static int getEvenPairCount(int[] array)

{
int pairNum = 0;
for (int i = 0; i < array.length-1; i++) {
if ( (array[i] + array[i+1]) % 2 == 0) {
pairNum = pairNum + 1;
}
}
return pairNum;
}

public static int[] getEvenPairArray(int[] array)

{
int[] evenPair = new int[getOddPairCount(array)];
int j = 0;
for (int i = 0; i < array.length-1; i++) {
if ( (array[i] + array[i+1]) % 2 == 0) {
other[j++] = array[i] + array[i + 1];
}
}
return evenPair;
}
}

