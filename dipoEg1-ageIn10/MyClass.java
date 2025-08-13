import java.util.Scanner;

public class MyClass{
    public  Integer readInt(String prompt){
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

    public Integer calcAgeIn10(Integer age)
    {
        return age + 10;
    }//calcAgeIn10

    public void handleOutput(Integer age, Integer ageIn10)
    {
        System.out.println("You are "+age+" years old.");
        System.out.println("In 10 years you will be " + ageIn10 + " years old.");
    }

    public void pause(){
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

    
}//class