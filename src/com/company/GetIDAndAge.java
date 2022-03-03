//Jack Alexander
//3/2/2022
//Program#3
//This program checks if age and id are valid using try and catch.
package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GetIDAndAge {
    public static void main(String[] args) {
        int id = -1, age = -1;
        Scanner keyboard = new Scanner(System.in);

        // loop that continues until id and age entered both are 0
        do
        {
            try {
                // input id and age
                System.out.print("Enter ID: ");
                id = keyboard.nextInt();
                System.out.print("Enter age: ");
                age = keyboard.nextInt();

                // validate user doesn't wants to exit
                if(age != 0 || id != 0)
                {
                    // validate age, if not valid throw exception
                    if(age < 0 || age > 119)
                        throw new DataEntryException(age);
                    // validate id, if not valid throw exception
                    if(id < 0 || id > 999)
                        throw new DataEntryException(id);
                    System.out.println("ID and Age OK.");
                }

            }catch(InputMismatchException e)
            {
                // input is not integer
                System.out.println("Input mismatch");
                keyboard.nextLine(); // discard the "\n" left by nextInt
            }catch(DataEntryException e)
            {
                System.out.println(e.getMessage());
            }

        }while(!(id == 0 && age == 0));
    }

}

