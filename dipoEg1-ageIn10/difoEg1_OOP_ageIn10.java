import java.util.Scanner;

public class difoEg1_OOP_ageIn10{
    public static Integer readInt(String prompt){
        Scanner scanner = new Scanner(System.in);
        
        Integer value = 0;
        Boolean ok = false;
        while (ok == false){
        try{
            System.out.print(prompt);
            value = Integer.parseInt(scanner.nextLine());
            ok = true;
        }
        catch(Exception e){
            System.out.println("Error "+ e);
        }//catch
        }//while

        scanner.close();
        return value;

    }// readInt()

    static Integer calcAgeIn10(Integer age)
    {
        return age + 10;
    }//calcAgeIn10

    static void handleOutput(Integer age, Integer ageIn10)
    {
        System.out.println("You are "+age+" years old.");
        System.out.println("In 10 years you will be " + ageIn10 + " years old.");
    }

    public static void pause(){
        System.out.println();
        Scanner pause = new Scanner(System.in);
        try  
        {
            pause.nextLine();
        } catch (Exception e) {
            // TODO: handle exception
        }
        
        pause.close();
    }

    public static void main(String[] args)
    {
        //declare
        Integer age;
        Integer ageIn10;
        
        //input
        age = readInt("How old are you?: ");

        //process
        ageIn10 =calcAgeIn10(age);

        //output
        handleOutput(age,ageIn10);

        pause();

       
                               


    }//main
}//class