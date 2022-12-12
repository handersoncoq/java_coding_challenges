package com.coqhanderson.codingChallenges.batch2;

public class BasicsLearning {

    public static void main(String[] args) {
//
//        // array
//        int[] newArray = {2, 3, 4, 1, 5};
//        // for loop
//        for (int i = 0; newArray[i] < newArray.length; i++){
//            System.out.println(i + "," + newArray[i] + ", " + Arrays.toString(newArray));
//        }
//        // matrix
//        int[][] matrix = {{1,3,2,1}, {3, 2, 1, 0}};
//        System.out.println(Arrays.deepToString(matrix));

          // arithmetics
//        int div = 5 / 2;
//        float fDiv = 5.0f / 2.0f;
//        System.out.println(div);
//        System.out.println(fDiv);

          // increments
//        int percent = 1;
//        int z = percent;
//        int y = ++percent;
//        int w = 1;
//        w += y;
//        System.out.println(percent);
//        System.out.println(z);
//        System.out.println(y);
//        System.out.println(w);

//        // casting (type conversion)
//
//        // implicit casting or automatic conversion
//        // byte -> short -> int -> long -> float -> double
//        short percent = 1;        // 2 bytes
//        System.out.println(y);      // results? short gets converted to int

//        // explicit casting
//        double percent = 1.5;
//        int y = (int)percent + 1;
//        System.out.println(y);        // result will be in int

//        // wrapper class
          // Integer.parseInt(), Double.parseDouble, etc... convert string to numbers
//        String percent = "1";
//        int y = Integer.parseInt(percent) + 2;
//        System.out.println(y);

//        // the Math class can also be used for conversion
//        // Math.ceil(), Math.floor(), Math.round()
//        // Math.max() and Math.min() return the greater and the smallest number respectively
//        // Math.random() generates random numbers from 0 to 1
//        // Math.random()*100 provides random numbers from 0 to 100
//        float percent = 1.1f;
//        int y = Math.round(percent) + 2;
//        int z = Math.max(1, 2);
//        int w = (int) (Math.random()*100);
//        System.out.println(y);
//        System.out.println(z);
//        System.out.println(w);

//        // number formatting
//        // use the NumberFormat class to format numbers ($ 123,235,475)
//
//        // two step-way
//        NumberFormat currency = NumberFormat.getCurrencyInstance();
//        String netWorth = currency.format(1254524552.7);
//        System.out.println(netWorth);
//        // method chaining
//        String percent = NumberFormat.getPercentInstance().format(0.5);
//        System.out.println(percent);

//        // Reading input from the user
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter your name: ");        // this will not take space into consideration
//        String inputName = input.next();                // and will take the first argument before any space of tab
//        System.out.println("Your name is "+inputName);
//
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter your full name: ");
//        String fullName = input.nextLine();             // using nextLine will take in space and tab
//        System.out.println("Your full name is "+fullName);
//
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter your last name: ");
//        String fullName = input.nextLine().trim();      // use trim to avoid spaces before and after
//        System.out.println("Your name is "+fullName);

        // comparison operators

//        // Boolean expression
//        int temperature = 70;
//        boolean isWarm = temperature > 60 && temperature < 100;
//        System.out.println(isWarm);

//        // ternary operator
//        // a combination of a boolean and comparison operators
//        Scanner input = new Scanner(System.in);
//        System.out.print("Income: ");
//        int income = input.nextInt();
//        String isHighIncome = income >= 120000 ? "Fisrt" : "Economy";
//        System.out.println(isHighIncome);

//        // switch statements
//        // cannot use the long type integer
//        Scanner input = new Scanner(System.in);
//        System.out.print("Job Title: ");
//        String jobTitle = input.nextLine();
//
//        switch(jobTitle){
//
//            case "Accountant":
//                System.out.print("Salary: $50000");
//                break;
//            case "Software Developer":
//                System.out.print("Salary: $95000");
//                break;
//            case "Data Analyst":
//                System.out.print("Salary: $70000");
//                break;
//            default:
//                System.out.print("Salary: $40000");
//        }

//        // For loop
//        for(int i = 5; i > 0; i--)
//            System.out.println("Bonswa: "+i+ " fwa");

//        // While loop
//        // used when the number of iterations are unknown
//        Scanner userInput = new Scanner(System.in);
//        String input = "";
//        while(!input.equals("logout")){
//            System.out.print("login or logout? ");
//            input = userInput.next().toLowerCase();
//            System.out.println("User enters "+input);
//        }

//        // Do-While loop
//        // used when the number of iterations are unknown
//        Scanner userInput = new Scanner(System.in);
//        String input = "";
//        do{
//            System.out.print("login or logout? ");
//            input = userInput.next().toLowerCase();
//            System.out.println("User enters "+input);
//        }
//        while(!input.equals("logout"));

        // Keyword break vs continues
        // break: terminates the loop and ignores the next statements
        // continues: returns to the beginning of the loop when certain condition is met
//        Scanner userInput = new Scanner(System.in);
//        String input = "";
//        while(!input.equals("logout")){
//
//            System.out.print("What do you want to do?  ");
//            input = userInput.next().toLowerCase();
//            if(input.equals("login"))
//                continue;
//            if(input.equals("logout"))
//                break;
//            System.out.println("User enters "+input);
//        }

        // for-each loop
        String[] fruits = {"Mango", "Banana", "Orange"};
        for(String fruit : fruits){
            System.out.println(fruit);
        }


    }
}
