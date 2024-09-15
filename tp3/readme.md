auteurs: Leleux Emma & Le Guen Romain

Les objectifs de ce tp sont:
-d'apprendre à écrire une classe
-d'apprendre à rédiger une documentation
-d'utiliser une méthodologie rigoureuse basée sur les tests unitaires.

Le tp consiste à créer des classes permerttant de créer et gérer une station de location de vélos ainsi que de créer et gérer les vélos qui s'y trouvent. Pour ce tp, nous avons créé 5 classes.

-la classe BikeModel, de type enum, qui permet de définir les models possibles de vélo (classique, électrique ou des vélos 2 places).

-la classe Bike qui permet de créer un vélo en choisissant son nom et sont model

-la classe BikeMain qui, lorsqu'on l'exécute,  créer deux vélos et les compare afin de savoir si ce sont les mêmes ou non

-la classe BikeStation qui permet de créer et de gérer une station de location de vélo en choisissant son nom et sa capacité. Elle permet également de déposer un vélo au premier emplacement de libre et de prendre un vélo d'un emplacement choisi.

-la classe BikeStationMain qui, lorsqu'on l'exécute, créer une station de 10 emplacement nommée Timoleon, place 2 vélos sur les deux premiers emplacements de cette station et tente de prendre un vélo à l'emplacement choisi par l'utilisateur. Elle indique à l'utisisateur si le vélo a pu être prit ou non.

Il y a également 2 classes de test: BikeTest et BikeStationTest qui permettent de tester les différentes fonctions des classes précédentes.



Pour générer la documentation, il faut se placer dans le dossier fichiers-tp à l'aide du terminal de commande et exécuter la commande javadoc Bike.java -d docs ainsi que la commande javadoc BikeStaion.java -d docs
Un nouveau dossier nommé docs est alors créé dans le dossier fichiers-tp. On retrouve toutes les documentations des fonctions utiliser dans ce projet dans ce dossier docs. 
Pour les consulter, il faut se rendre dans le dossier docs et ouvrir la page nommée index.html à l'aide d'un navigateur.


pour compiler les différentes classes du projet il faut se placer dans le dossier fichiers-tp et utiliser les commandes:

javac Bike.java

javac BikeMain.java

javac BikeStation.java

javac BikeStationMain.java

une fois ces classes compiler, on peut alors compiler les classes de test en se plaçant dans le dossier fichiers-tp  et en utilisant les commandes:

javac -classpath test-1.7.jar test/BikeTest.java

javac -classpath test-1.7.jar test/BikeStationTest.java

Après avoir compiler les classes de tests, on peut executer les test en se plaçant dans le dossier fichiers-tp et en utilisant la commande:
java -jar test-1.7.jar BikeTest
pour tester les fonctions du fichier Bike.java et la commande 
java -jar test-1.7.jar BikeStationTest
pour tester les fonctions du fichiers BikeStation.java


On peut ensuite exécuter le programme BikeMain en se plaçant dans le dossier fichiers-tp et en utilisant la commande:
java BikeMain

une fois le programme exécuté, le terminal devrait alors afficher:
les vélos sont différents
bike id: b001, model : CLASSICAL, price: 15

Enfin, on peut exécuter le programme BikeStationMain en se plaçant dans le dossier fichiers-tp et en utilisant la commande BikeStationMain suivit d'un nombre de notre choix, par exemple:
java BikeStationMain 1

Pour cet exemple, le terminal devrait afficher:
le vélo choisi est le b002 et son prix de location est de 15

autre exemple, pour la commande:
java BikeStationMain 7
Le programme affichera 
il n'y a pas de vélo à cet emplacement

si aucun nombre n'est pécisé, le programme affichera:
il manque un argument




