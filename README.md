# Angry-Birds

UML and UML case diagrams. For that we are using LucidChart Software - 
https://lucid.app/lucidchart/1512c635-a9ab-4f1a-ad98-dd0ce128c3df/edit?viewport_loc=-752%2C-355%2C3933%2C1819%2CHWEp-vi-RSFO&invitationId=inv_2c810ab5-e396-41da-8c4c-b32aecb27aee

UML Use Case - 
https://lucid.app/lucidchart/5c5190a1-8a69-4ed8-b0c4-28152f49835e/edit?viewport_loc=-451%2C-792%2C5739%2C2498%2C.Q4MUjXso07N&invitationId=inv_78d1f8e2-50cf-4a2b-a154-d2bf7e7dccb1


I have tried to make the game simple 

Starting Screen ( Home ) : displays three option --> 
1. Start game ---> Level 1 Starts. User needs to Win the level 1 to reach Level 2 and similary for 3. 
2. Load game ---> User can start the game from where he last saved the game 
3. My flock ---> All birds available and details

Level
1. Level 1 --> theme Forest, 3 random birds available, fixed structure and pigs position ( contains small and medium pigs pigs, wooden and glass blocks ), save game, 
2. Level 2 --> theme Japan, 3 random birds available, fixed structure and pigs position ( contains medium and large pigs , glass and steel block ),save game
3. Level 3 --> Himalayas, 3 random birds available, fixed stucture and pgs position ( contains a mix of small , medium and large birds, steel and tnt blocks ),save game 

Catapult --> fied position 

Birds
1.Red bird --> medium speed, ability power impact
2.Black bird --> medium speed, ability explode
3.White bird --> medium speed, ability drop egg
4.Yellow bird --> faster speed ability
5.Terence bird ( big red bird ) --> more impact and damage abiltiy 


Pigs 
1. Small 
2. Medium 
3. Large


Structure 
1. for level 1  --> a mix of wood and glass 
2. for level 2  ---> a mix of glass and steel
3. for level 3  ---> a mix of steel and tnts

Blocks
1. Wood
2. Steel 
3. Glass
4. TNT

Theme 
1. Forest 
2. Japan
3. Himalaya





   

------- Project Deadline 2  ------

We are using the libgdx to make the basic flow of the angry birds game . Basic Flow here means just the clickable prototype. The workable prototype is required for deadline 3. 
LigGdX setup was done on 15 Oct. 
Project name - AngryBirds 

Basic layout is as follows 
- Loading Screen

- MainMenu Screen - Start Game, Load Game, ViewmyFlock, Exit buttons are there in the MainMenu
  - Start Game button leads to ->
    SelectLevel Screen - Level 1, Level 2, Level 3 ( for this deadline only im pointing all the levels to one screen )
  - Load Game button leads to - >
    LoadGame Screen - User can load the previously loaded Game
  - ViewMyFlock button leads to -> 
    BirdFamily Screen - Contains info about birds - names , powers 
  - Exit button exits the game

- Selecting a level from the SelectLevel Screen will lead the the MainGame Screen
  - It has background
  - Catapult at the left 
  - The bird on the catapult
  - Below it is the bird set ( user can choose any bird but after launching he/she cant use the same bird twice unless some extra card is awarded according to the points. This feature is extra, i might or might not include it )
  - After some distance is the Structure -> Structure is the combination of Blocks and Pigs ( Wood, Glass, Stone, TNT )

 - MainGame Screen has the Pause button at the top right. It will lead to ->
   -  PauseScreen - Save Game Button , Exit Button ( Leads to the MainMenu ), Resume Button
   -  LooseScreenbutton
   -  Winscreenbutton

 - Win Screen ->
   - If all the Pigs are finished ( This might not be implemented since the game is not workable but screen is made) .. 
- Loose Screen ->
   - If all the birds are finished but not the pigs ( this might not implemented since the game is not workable but screen is made )..




Basic Flow -
User Enters and sees the loading screen for 4 seconds ( as of now ) and then sees the MainMenuScreen , in which he/she can choose to the start game, load the previous game, ViewFlock, Exit,
Startbutton leads the SelectLevelScreen and display three levels. User can choose any ( as of now ) and a back button ( leads to the Main menu )
level1- theme not implemented , just simple png files for all levels
     have the win screena and loose the screen which are target by left and right side button, in the mid is the PauseButton
         PauseButton has Resume, Save game ( saves current instance ) , exit ( leads to the MainMenu )
        -  LooseScreenbutton - Select Level( try again screen - 3 seconds delay )
        -  Winscreenbutton 
                 - Nextbutton - Level1 -> level2 -> level3 -> Select Level Screen
                 - Exitbutton- Maine menu

Pause button - 
Swithces to the Puase screen 
Resume - back to current level
Save Game -
    Saves the current instance of the class.
    Resume - leads back to the current level
    Exit - Leads to main Menu
Exit - Leads to the Main menu




A varied Variety of References have been used - be it the pngs , jps , or the concepts,
https://libgdx.com/wiki/start/a-simple-game
https://happycoding.io/tutorials/libgdx/game-screens
https://libgdx.com/wiki/graphics/2d/spritebatch-textureregions-and-sprites
https://youtu.be/a8MPxzkwBwo?si=x3NcpJs8ZxIF0uSU
https://www.remove.bg/upload
https://imageresizer.com/resize/download/671800170db566a561439b54
https://www.pngwing.com/
https://libgdx.com/wiki/graphics/2d/scene2d/scene2d
https://imageresizer.com/
https://www.remove.bg/
https://in.pinterest.com/
https://wallpapercave.com/
Some pngs and backgrouds have been edited in powerpoint


// 24/10/24
Since the buttons were created using the x,y coordinates using the batch.draw ( and according to the latest tutorial we can't do it like that ), ill use tage , Drawable, ImageButton, Texture and Actors implementations in the code to update. 
Further i had not made the birds classe, pig class and structure class which will be extended or implemented by the sub classes. For now i have hardcoded the blocks so i am not implementing the Structure class. It will be handlded later.


// 25/10/2024
I have made a single pig class. Thier objects have been used to distinguish between the sizes and health. I will update the classes and make separate classes for 3 pigs which inherit a single class pig

different themese will be handled later.

Class relationships is implemented through UML and Use Case Diagram

UML Diagram - https://lucid.app/lucidchart/8f251e85-7c0e-457a-8d16-44ce9aa0a5b3/edit?viewport_loc=-952%2C-17336%2C26285%2C12527%2C0_0&invitationId=inv_a5b779b6-f14d-48b6-b77d-43e6469c78ee
Use Case Diagram - https://lucid.app/lucidchart/a5707ff0-7418-4b7a-ad10-40c94d1d468f/edit?viewport_loc=161%2C-1498%2C4867%2C2922%2C0_0&invitationId=inv_a7bcba06-2223-49b0-8eba-ec743aeab54e


27/10/2024
-------------------------- STEPS TO RUN THE GAME IN INTELLIJ IDEA -------------------------------------
  - Step 1: Download the BirdsAngry zip file from the github repository.
  - Step 2: Unzip the file in desktop.
  - Step 3: Now Open the Intellij Idea and select the BirdsArgry File and open it.
  - Step 4: Now Search for 'lwjgl3' file open it, lwjgl3-> src -> main -> java -> com.BirdsAngry.lwjgl3.
  - Step 5: Now in com.BirdsAngry.lwjgl3, Select Lwjgl3Launcher.
  - Step 6: Now After opening it, click on the Run option at top right corner and the game will start.








-- Project Deadline 3 ---

// 27/11/24
I had created blocks and pigs through the draw method in render. 
Now there are separate classes for - 
   redbird 
   yellobird
   bluebird
   blackbird
   terencebird
   pig
   ironblock
   glassblock
   woodblock
   tnt

these classes extends the reseptive classes and the actor ( Scene2D ) for actions and implemenets serialisable for storing the current state of the objects of the above classes. 
Objects of these classes are added and removed from the stage based upon the positions and movements.


Functioning
- Physics is not handled for blocks and Pigs ( falling and rolling )
- User can drag the bird on the catapult and release it , it follows the trajectory withtin the screen window it bounces adding a bouncing effect 
- if the bird overlaps with the coordinates of the pigs or the blocks the health is reduced
 - i have set the health for the block to be 1
 - and for pigs its different based on size 
 - the the health reaches a particular low then the pig is removed ( less the -50 ) , same with the blocks ( less than 0 )

 The winscreen is displayed if all pigs are dead. Winscreen has exit and next buttons. User can either exit to the Main menu or enter into next level 

 Theres no switch bird method
 so its sequential , firstbird touches the ground , next bird appears on the catapult. 
 When the last bird touches the ground loosescreen appears which leads to select level 1 screen

 Serilisation has been implemented
 When the user clicks the pause button, objects on the screen are serialised based on the current_level_status and stored in the "level1.txt" file. So Save game button acts a dummy only here. theres also resume button which leads to the current_level upon click

 Serialisation is runtime here
 though its stored and it can be loaded but upon entering the game User doesnt have a current_level status and somehow its necessary to deserialise. 

 For deserialisation , createloadgame class has been implemented. 
 Upon the load game click, it checks the current_level instance. If its level 1 it deserialise the objects and make the entire screen again based upon the args passed to the createloadgame constructor.
 same with level2 and level3
 if theres no current_level instance it simply shows the nosavedgame screen  ( even though its doable to load the saved game from txt file . I have mentioned the same issue above )

 Issues -
 since the game state is being saved in the render method . There might be issues of bird not appearing based upon the frame rate.
 since the current_level_status ( which is statis ) has been used for the save and load, there might be issue with loading game. 

Bonus - 
- blue bird splits into three upon the click
- even though i had mentioned to include the bombing effect for tnts and blackbird , but the same has not been implemented in view of the shortage of time for the deadline.

UML Class and Use Case
 https://lucid.app/lucidchart/e10b4688-5ef1-4409-8b54-02346c0b6bf2/edit?viewport_loc=60475%2C12124%2C64102%2C27903%2CHWEp-vi-RSFO&invitationId=inv_0e79dc77-1265-4e9a-ab87-c3e8e03bf353
 https://lucid.app/lucidchart/a5707ff0-7418-4b7a-ad10-40c94d1d468f/edit?viewport_loc=-967%2C-1822%2C8500%2C3700%2C0_0&invitationId=inv_a7bcba06-2223-49b0-8eba-ec743aeab54e

 
 References and links
 https://angrybirdsfanon.fandom.com/wiki/Red_Pig?file=Red_pig.png
 https://www.youtube.com/watch?v=Uxhb3IHKMQk&ab_channel=LetsMakeAutomationEasy-PradeepNailwal
 https://www.geeksforgeeks.org/serialization-in-java/
 https://stackoverflow.com/questions/19958597/libgdx-catapult-trajectory


-------------------------- STEPS TO RUN THE GAME IN INTELLIJ IDEA -------------------------------------
  - Step 1: Download the UpdatedBirdsAngry zip file from the github repository.
  - Step 2: Unzip the file in desktop.
  - Step 3: Now Open the Intellij Idea and select the BirdsArgry File and open it.
  - Step 4: Now Search for 'lwjgl3' file open it, lwjgl3-> src -> main -> java -> com.BirdsAngry.lwjgl3.
  - Step 5: Now in com.BirdsAngry.lwjgl3, Select Lwjgl3Launcher.
  - Step 6: Now After opening it, click on the Run option at top right corner and the game will start.


28/11/24
I have added different sctructures for different levels 
Two Junit test has also been implemented to check if all the pigs are dead by simply mimicking the objects anf level1 methods. Other one is to check the bird position.
Junit test is giving dependency errors 





