public class Algorithmic
{
public static int getPairValue(int[] array, int pos)
{
return array[pos] + array[pos + 1];
}

public static boolean isOdd(int num)
{
if ( num % 2 == 1) {
return true;
}
return false;
}

public static int getOddPairCount(int[] array)
{
int pairNum = 0;
for ( i = 0; i < array.length-1; i++) {
if ( (array[i] + array[i+1]) % 2 == 1) {
pairNum = pairNum + 1;
}
}
return pairNum;
} 

public static int[] getOddPairArray(int[] array)
{
int[] other = new int[getOddPairCount(array)];
for ( i = 0; i < array.length; i++) {
if ( (array[i] + array[i+1]) % 2 == 1) {
other[i] = array[i] + array[i + 1];
}
return other.toString;
}
} 
}

