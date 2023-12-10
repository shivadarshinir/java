class HelloWorld {
    public static void main(String[] args) 
    { 
        int marks = 85;
        if (marks >= 85 && marks <= 100)
        {
            System.out.println("Distinction");
        }
        else if (marks >= 35 && marks <= 84)
        {
            System.out.println("First class");
        }
        else if (marks >= 0 && marks <= 34)
        {
            System.out.println("Failed, better luck next time");
        }
    }
}
