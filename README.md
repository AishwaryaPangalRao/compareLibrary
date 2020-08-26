compareLibrary

Reads API Endpoint from Line1 of File1 and Line1 of File2, hit the respective APIs, fetch the responses and compares the same!
Repeat the same for every existing file. 
Implemented with RestAssured, TestNG and MultiThreading. 
Output format: 
line1.file1 [equals/not equals] line1.file2 
and so on...



TestData

File1 and File2 placed in compareLibrary/src/test/resources/testdata folder.
Each line of both files contains a GET API Endpoint.
Handled the Exception case for 
1.Blank lines in the middle.
2.One file has more lines than the Other



MultiThreading

Assuming that the given system has 2-CPU-Cores, the program spawns 2 threads and does the processing.
This can be updated based on the system's configuration.


Running the Tests

runComparator.xml is the file to run this test-suite. 
This is placed in compareLibrary/src/test/resources/test-suite.



Sample Output as seen in console:

https://reqres.in/api/users?page=3 not equals https://reqres.in/api/users?page=4
https://reqres.in/api/users?page=1 equals https://reqres.in/api/users?page=1
 not equals https://reqres.in/api/users/2
https://reqres.in/api/users/5 equals https://reqres.in/api/users/5
https://reqres.in/api/users/6 not equals null
https://reqres.in/api/users/3 equals https://reqres.in/api/users/3
