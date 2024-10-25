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





   

=------ Project Deadline 2  ------

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
Some pngs and backgrouds have been edited in powerpoint


// 24/10/24
Since the buttons were created using the x,y coordinates using the batch.draw ( and according to the latest tutorial we can't do it like that ), ill use tage , Drawable, ImageButton, Texture and Actors implementations in the code to update. 
Further i had not made the birds classe, pig class and structure class which will be extended or implemented by the sub classes. For now i have hardcoded the blocks so i am not implementing the Structure class. It will be handlded later.


// 25/10/2024
I have made a single pig class. Thier objects have been used to distinguish between the sizes and health. I will update the classes and make separate classes for 3 pigs which inherit a single class pig

different themese will be handled later.

Class relationships is implemented through UML and Use Case Diagram





