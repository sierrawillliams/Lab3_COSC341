# Lab3_COSC341_
Lab 3: Quiz Application (20 marks) 

In  this  lab,  you  will  implement  an  Android  quiz  application.  You  have  freedom  in  designing  the 
interface screens (e.g., buttons vs. image buttons and typography, colour, etc), and select strategies 
(e.g., multiple activities, fragments).

Configuration note: 

When  you  create  your  app  on  Android  Studio,  be  sure  to  select  the  option  "Phone  and  Tablet". 
Assignments will be marked using an Android Virtual Device (AVD) running a  Pixel 3a with API 33. 
You must use Android Studio (with Java as the programming language), this is what the TAs will use 
to load, build, and run your code. 

Submission note: 

Upload a zip file containing the following folders to Canvas: Code and APK.  
- The Code folder should include the corresponding Android code.  
- The APK folder should only contain one .apk file.  

Questions 

Use the questions provided in the a3-resources.zip file. See the questions.txt file for the questions, 
options  and  correct  answers.  Also,  there  are  four  images  inside  the  folder,  use  image1.jpg  for 
question 1, image2.jpg for question 2, image3.jpg for question 3 and image4.jpg for question 4. There 
are  no  specific  instructions  to  load  the  questions  into  your  application  (e.g.,  feel  free  to  use 
String/Array to store the questions). However, you MUST ensure that your program will run on the 
TA's machine without requiring any additional resources. 

Requirements:  

[4 marks] Welcome Screen 

Your application should include a Welcome screen. This screen includes: 

[1] A TextView showing the quiz topic name. 

[1] A spinner to show values between 1 and 4. A user can select any number between 1 and 4. 

[1] A button to navigate to the next screen (e.g., the “Load Quiz” button in the image).  

[1] When the user clicks on this button, it opens the Question screen. 

[12 marks] Questions Screen(s) 

A question screen shows a question, an image, and options that are provided in the lab3-resource.zip 
file.  

[2] There should be n number of screens where n is the number of questions selected in the Welcome 

Screen  

[2] A user can’t proceed to the next question without selecting an option.  

[1] A TextView to show a question. 

[2] An ImageView to show the image related to the question. 

[2] Four options with four radio buttons.  

[1] A button (e.g., “Next”) to move to the next question.  

[1] When the user reaches the last question, the button text should be “Finish”.  

[1] Clicking on the "Finish" button opens the Results Screen. 
 
[4 marks] Results Screen 

This interface shows the scores based on user responses to the questions. It includes: 

[2] a TextView showing the correct score. Each question is worth 1 mark.  

[1] A button (e.g., “Done”) to go back to the Welcome screen  

[1] Once in the Welcome screen, the user starts the quiz from the beginning. The application shouldn't 
show any previously selected responses (e.g., response to question 1 in the previous attempt), if the 
user retakes the quiz. 

Other Grading Criteria 

[-2] Source code is very sparsely commented, poorly formatted (indent, spacing) 

[up to -20] Submission instruction not followed (e.g., no APKs) 
