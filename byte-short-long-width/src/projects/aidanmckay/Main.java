package projects.aidanmckay;

public class Main {

    public static void main(String[] args) {
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Max Byte Value " + myMaxByteValue);
        System.out.println("Min Byte Value " + myMinByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Max Short Value " + myMaxShortValue);
        System.out.println("Min Short Value " + myMinShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Max Long Value " + myMaxLongValue);
        System.out.println("Min Long Value " + myMinLongValue);

        byte myNewByte = (byte)(myMinByteValue / 2 );
        System.out.println("Casted Byte = " + myNewByte);

        // Practice with data types

        byte challengeByte = 118;
        short challengeShort = 18934;
        int challengeInt = 2;

        long challengeLong = 50000L + (10L * (challengeByte + challengeInt + challengeShort));

        System.out.println("Challenge Long = " + challengeLong);

    }
}
