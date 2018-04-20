import java.util.Random;
import java.util.Scanner;

class RandomNumber {
    public static void main(String[] args) {
        int x;
        System.out.print("Your age: ");
        Scanner s = new Scanner(System.in);
        x=s.nextInt();
        System.out.println("oh!! so age is: "+x);

        //flush the scanner
        s.nextLine();
        String y;
        System.out.print("Your name: ");
        y=s.nextLine();
        System.out.println("woww.. nice name..."+y);

        // Random number program begins

        Random rand = new Random();
        int j=1;
        int yourAnswer;
        int myAnswer;
        while (j<=3){
            int magicNumber = rand.nextInt(3+1)+1;

            System.out.println(j+" + "+magicNumber+" = ");
            myAnswer = j+magicNumber;
            yourAnswer = s.nextInt();
            if(yourAnswer == myAnswer)
                System.out.println("good.. Im impressed");
            else
                System.out.println("I\'m Sorry...");

            j++;
        }
    }
}