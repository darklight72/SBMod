This fork is initially to fix the /autobuy function after the change from "Lottery" to "Raffle"

All changes including filename and function name changes are to support "Raffle".

Getting the build environment set up correctly took longer than anything else, so if you want to compile this yourself, follow the instructions below.  They are for Eclipse, but can be modified for your IDE of choice.

1) Install Eclipse IDE
2) Install the JDK for your *currently installed* version of Java
3) Download the Forge MDK.  See resources below.
4) Extract the MRK into a folder
5) Open command prompt (cmd.exe) in the folder you extracted in step 4
6) Set a local variable for the JDK, ie: "set JAVA_HOME=c:\Program Files\Java\jdk1.8.0.351"
7) Configure the gradle environment by typing 'gradlew setupDevWorkspace eclipse'
8) When that completes successfully, replace the SRC folder created by gradlew with the one from this project
9) From the command prompt in the forge folder, type 'gradlew.bat build'

If step 7 isn't successful, troubleshoot until it is, that's really all the advice I can offer at this point.  Don't bother doing step 8 and 9 if step 7 doesn't succeed.

Resources:
* Eclipse - https://www.eclipse.org/downloads/packages/
* Forge MDK I used for this build - https://maven.minecraftforge.net/net/minecraftforge/forge/1.12.2-14.23.3.2678/forge-1.12.2-14.23.3.2678-mdk.zip
