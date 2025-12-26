# Feather Falling No Trample Crops

## About
The mod changes the functionality of trample crops to do a check if the player has feather falling boots equipped. At the present moment, the mod only supports Fabric, Neoforge and Paper 1.21.11. I won't support Forge or Quilt unless I need to. I will also only be support versions from 1.21.11+. No backporting.

## Installation
To install it on Fabric, or NeoForge first you must install the Fabric or Neoforge installer. Or have the Modrinth app or a similar installation manager.

[Fabric](https://fabricmc.net/use/installer/) (for one version)

[NeoForged](https://neoforged.net) (for one version)

[Modrinth](https://modrinth.com/app) (for multiple installations)

[Paper](https://papermc.io) (for servers)

After having an instance of fabric installed, you must either navigate to the mods folder (Minecraft Launcher Fabric / NeoForged) or directly install it through the modrinth launcher.

### Fabric / NeoForged
**Windows**

On Windows press WIN + R and in the box that shows up type appdata then hit enter. From there you should see a folder called .minecraft. Once inside there, you should see a folder called mods. In there put the mod .jar for the correct version.

**Mac**

Open Finder Window. In the top bar, select Go → Go to folder. Type in "~/Library/Application Support/minecraft". In there put the mod .jar for the correct version.

**Linux** *(On Ubuntu could vary from distro)*

Open Files and navigate to home. From there, press CTR + H to show hidden folders. From there, navigate to .minecraft. Then go to the mods folder and place the mod .jar for the correct version.

### Modrinth
In the modrinth app go to your installation of fabric or neoforged and there should be a tab called install mods. Click on this and search for this project. Then hit install. If you have trouble with this there are tutorials online, however it is quite straight forward.

### Paper
After downloading PaperMC navigate to where you installed it and place the .jar file for the version in the Plugins folder. Then start up the server.

## How it works
It is extremely simple and just adds a mixin that adds a check to the onLandedUpon function in the FarmlandBlock class. The check checks if the entity is a player and that they are wearing boots that have feather falling on them.
