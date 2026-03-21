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