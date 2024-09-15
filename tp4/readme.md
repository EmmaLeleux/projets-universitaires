auteurs: Leleux Emma & Le Guen Romain

**Objectifs**

Les objectifs de ce tp sont:
-d'apprendre à écrire une classe de test
-d'apprendre exécuter das tests

Dans ce tp, les classes Robot, box et conveyerBelt ainsi que la classe de test BoxTest nous étaient fournies. Le but de ce tp était donc de rédiger la classe de test RobotTest.
Cette classe permet de tester les fonctions de la classe Robot.java et d'effectuer ces tests. Nous avons donc créé la classe de test RobotTest.java qui contient une fonction 
de test pour chaque cas possible des fonctions de Robot.java



**Documentation**

Pour générer la documentation, il faut se placer dans le dossier src qui se trouve dans le dossier fichiers-tp4 à l'aide du terminal de commande et exécuter les commandes:
javadoc example example.util -d ../docs
Un nouveau dossier nommé docs est alors créé dans le dossier fichiers-tp4. On retrouve toutes les documentations des fonctions utiliser dans ce projet dans ce dossier docs.
Pour les consulter, il faut se rendre dans le dossier docs et ouvrir la page nommée index.html à l'aide d'un navigateur.

**Compilation**

Pour compiler les différentes classes du projet il faut se placer dans le dossier src qui se trouve dans le dossier fichiers-tp4 et utiliser la commande:
javac example/Robot.java -d ../classes


une fois ces classes compiler, on peut alors compiler les classes de test en se plaçant dans le dossier fichiers-tp4  et en utilisant les commandes:
javac -classpath test-1.7.jar test/BoxTest.java
javac -classpath test-1.7.jar test/RobotTest.java


**exécution des tests**

Après avoir compiler les classes de tests, on peut executer les tests en se plaçant dans le dossier fichiers-tp4 et en utilisant les commandes:
java -jar test-1.7.jar BoxTest
java -jar test-1.7.jar RobotTest



**exécution du programme**

On peut ensuite exécuter le programme Main d ela classe Robot en se plaçant dans le dossier classes et en utilisant la commande:
java example.Robot


**création du jar exécutable**

On peut également créer un jar exécutable, pour cela, il faut se placer dans le dossier classes et exécuter la commande:
jar cvfm ../appli.jar ../manifest-ex example