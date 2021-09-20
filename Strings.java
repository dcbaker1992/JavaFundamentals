public class Strings {
    //this determines a strings length
    public static void main(String[] asrgs){
        String ninja = "Coding Dojo is Awesome";
        int length = ninja.length();
        System.out.println("The String length is : " + length );
    //the out put will be "The String length is : 22"
    


    //this is a concatenate example
        String string1 = "my name is ";
        String string2 = "Dillon";
        String string3 = string1.concat(string2);
        System.out.println(string3);

        //output will be "my name is Dillon"



        //another way to concat a string
        String ninja1 = String.format("Hi %s, you owe me $%.2f !", "Jack", 25.0);
        System.out.println(ninja1);
// Will print out Hi Jack, you owe me $25.00 !
// Where %s is expecting a string
// And %.2f is expecting a float data type. The value 2 will just place two values to right of the decimal point.
    }
}

