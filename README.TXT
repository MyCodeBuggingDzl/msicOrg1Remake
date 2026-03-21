Question 4. 
What might the header of a listAllFiles method in the MusicOrganizer
 class look like? What sort of return type should it have?
Does it need to take any parameters? (Notebook-3)

The header would be public void listAllFiles(){...}

Question 5.
We know that the first file name is stored at index zero in the ArrayList 
and the list stores the file names as strings, so could we write the body 
of listAllFiles along the following lines: System.out.println(files.get(0));
 System.out.println(files.get(1));
 System.out.println(files.get(2));
 etc.
 Notebook-4: How many println statements would be required to complete the method?
 
 As much as there is in the collection since we don't know how many
 
 
 
 Part 4: While loop
 
 1. 
     boolean missing = true;
     while(missing){
         if(the keys are in the next place){
             missing = false;
         }
     }
     
     boolean found = false;
     while(!found){
         if(the keys are in the next place){
             found = true;
         }
     }
  
     
2.
     public int multipleOfFives()
     {
         int x = 5
         while( x >= 10 && x <= 95){
             x = x*5;
             x++;
         }
     }
     
     
     
3-4.
    public int sumLoop( int a, int b)
    {
        int initial = 0;
        int value = a;
        while( value <= b){
            initial = initial + value;
            value++;
        }
        return initial;
    }
    