CSCI 3130 Group 7

Installation
—————————————————————————————————————

Only /src, /eclipse folders are necessary for our Minecraft Forge.

Please copy /src folders to your Minecraft Forge folder and replace the original one and MERGE /eclipse folder with /eclipse folder in the Forge, then it can be run successfully.

Please copy all .ogg files to /eclipse/assets/sounds/mob/zombie and copy sounds.json to /eclipse/assets. These file will be used for NPC’s sound.

If eclipse cannot open the project, Just run “./gradlew eclipse” and then the problem will be solved.


External Resources
—————————————————————————————————————
We added some open source mods into our work.
References:

- MapWriter Mod
https://github.com/daveyliam/mapwriter


Development Environment
————————————————————————————————————

mobs mod, which contains some customized entities.

mymod mod, which contains our mod specific items we have now and in the future.

Giantitem mod, which makes items giant. //Contains junit test cases for this mod.

Timer mod, which limits player's time usage to reach the top of the mountain. //still working on this. <_<

Folder Info
—————————————————————————————————————

test folder, which contains all junit test file for our project.

assets folder, which includes our mods' textures,e.g. blocks, items, entities, etc.

Ant file is located in /build.xml

—————————————————————————————————————

