This fork is initially to fix the /autobuy function after the change from "Lottery" to "Raffle"

All changes including filename and function name changes are to support "Raffle".

Getting the build environment set up correctly took longer than anything else, so if you want to compile this yourself, follow the instructions below.  They are for Eclipse, but can be modified for your IDE of choice.

1) Install Eclipse IDE
2) Download the Forge MDK.  See resources below.
3) Extract the MRK into a folder, the location doesn't matter
4) Open command prompt (cmd.exe) in the folder you extracted in step 3, and type 'gradlew setupDevWorkspace eclipse'
5) When that completes, replace the SRC folder created by gradlew with the one from this project
6) From the command prompt in the forge folder, type 'gradlew.bat build'

Resources:
* Eclipse - https://www.eclipse.org/downloads/packages/
* Forge MDK I used for this build - https://maven.minecraftforge.net/net/minecraftforge/forge/1.12.2-14.23.3.2678/forge-1.12.2-14.23.3.2678-mdk.zip
