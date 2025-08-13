public static void main(String[] args){
    //declare
    Integer age;
    Integer ageIn10;
    
    //input
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your age: ");
    age = Integer.parseInt(scanner.nextLine());

    //process
    ageIn10 = age + 10;

    //output
    System.out.println("You are "+age+" years old.");
    System.out.println("In 10 years you will be" + ageIn10 + " years old.");

    //pause for viewing
    scanner.nextLine();
    scanner.close();


}