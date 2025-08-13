

public static void main(String[] args)
    {
        //declare
        MyClass app = new MyClass();
        Integer age;
        Integer ageIn10;
        
        //input
        age = app.readInt("How old are you?: ");

        //process
        ageIn10 = app.calcAgeIn10(age);

        //output
        app.handleOutput(age,ageIn10);

        app.pause();

       
                               


    }//main