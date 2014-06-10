CSCI 3171 Group 7

We added some open source mods into our work.
References:
MapWriter Mod
https://github.com/daveyliam/mapwriter

This project can be import to eclipse, if eclipse cannot open/run the project correctly, please do the following steps:

1) Run "gradlew setupDecompWorkspace" in the mapwriter folder.

2) Run "gradlew eclipse" if using the eclipse IDE. If it does not work you may
   need to copy the eclipse folder from a Forge src release into the mapwriter
   folder and retry the command.

3) Open eclipse and set the workspace directory to mapwriter/eclipse.