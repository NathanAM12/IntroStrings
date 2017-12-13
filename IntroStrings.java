

public class IntroStrings{
public static void main (String[] args)
throws ArrayIndexOutOfBoundsException
{
  try{
    while (args[0]=="");


  }
  catch(ArrayIndexOutOfBoundsException e){
    System.out.println ("Start the program with \n" + "4 names, no spaces");
    System.exit(0);

  }
  String name[] = new String[8];
  System.out.println("Your beginning string is: \n" + args[0]);
  for(int i = 0; i < args[0].length(); i++){
    if(i >= 10){
      System.out.print(i-10);
    } else {
      System.out.print(i);
    }
  }
  System.out.println("");

  System.out.println(args[0].substring(10));
  System.out.println(args[0].substring(7,10));
  System.out.println(args[0].substring(3,7));
  System.out.println(args[0].substring(0,3));
  name[0] = args[0];
  name[1] = name[0].substring(0, 3);
  name[2] = name[0].substring(3,7);
  name[3] = name[0].substring(7,10);
  name[4] = name[0].substring(10);
  name[5] = name[1].toLowerCase();
  System.out.println(name[5]);
  System.out.println(name[5].toUpperCase());

  System.out.println(name[1] == args[0].substring(0, 3));
  System.out.println(name[1].equals(args[0].substring(0, 3)));
  System.out.println("compare ben to john" + name[1].compareTo(name[2]));
  System.out.println("BcdefghiJ" + "\n87654321");
  System.out.println("compare john to ben" + name[2].compareTo(name[2]));
  System.out.println("BcdefghJ" + "\n12345678");
  name[6] = "      (6) Spaces (2)  ";
  System.out.println(name[6] + ", the length is :" + name[6].length());
  System.out.println(name[6].trim() + ", the length is :" + name[6].length());
  name[7] = name[6].trim();
  System.out.println(name[7] + ", the length is :" + name[7].length());
}
}
