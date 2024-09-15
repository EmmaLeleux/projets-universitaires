Auteur: Leleux Emma & Benfyala Marwa

Le but de ce TP est de créer un simulateur de bataille navale, dans lequel le joueur peut intéragir pour tenter de couler les bateaux du joueur adverse. Il faut donc créer un rendu visuel et une classe permettant le jeu possible.

Dans le programme que nous avons réalisé, plusieurs classes sont utilisées: la classe position qui permet e gérer la posision des cellules, la classe cell qui permet de créer et gérer des cellules, la classe ship qui permet de créer et gérer des bateaux, la classe Enum Answer qui énumère les variables MISSED,HIT, et SUNK selon l'effet du tir, la classe Sea qui permet de créer et gérer l'espace de jeu et enfin la classe game qui permet de jouer à une partie.

Toute les fonctions demandé dans le cahier des charges ont étés réalisées et nous avons ajouté un message à l'affichage dans le cas où la partie est gagnée ainsi qu'une commande permettant de continuer à jouer si le joueur saisit les coordonées d'une case non existante. 

Pour compiler les sources du projet, il faut se placer dans le dossier src et utiliser la commande:

javac example/Game.java -d ../classes

pour jouer a une partie ( donc déclencher le main,), il faut se placer dans le dossier classes et utiliser la commande:

java example.Game

pour compiler les tests, il faut se mettre à la source du projet ( le dossier battleship) et utiliser la commande :

javac -classpath test-1.7.jar test/SeaTest.java

pour exécuter ces tests, il faut utiliser la commande:

java -jar test-1.7.jar SeaTest

pour génerer le fichier .jar, il faut se placer dans le dossier classes et utiliser la commande:

jar cvf ../appli.jar example

pour démarrer une partie à l'aide du fichier .jar, il faut se placer dans le dossier tmp et utiliser la commande:

java -classpath appli.jar example.Game
