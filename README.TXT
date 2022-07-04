(for terminal run)
in folder src/javask run:
javac Main.java Artifact.java Masterpiece.java Painting.java Sculpture.java
then in folder src (cd ..) run:
java javask.Main N movement condition
e.g jva javask.Main 10 impressionism good

project uses package javask

class Main:
>has main static method
>uses an arraylist of Artifacts to create and store Masterpieces
>uses random to create positive integers and randomly initialize objects
>has auction static method

class Artifact:
>is abstract
>has protected fields
>has final fields which get initialized in constructor and don't change
>has basic methods getInfo and getIndex
>has abstract methods which are implemented in child classses
>has static field num which counts the number of Artifacts(used for index)
which is increased by 1 every tume an Artifact is created

class Masterpiece:
>is abstract
>extends Artifact
>has some extra protected fields which are final , get initialized
by the constructor and cannot be changed
>Overrides getInfo to print extra information

class Painting:
>extends Masterpiece
>has some extra protected fields which are final , get initialized
by the constructor and cannot be changed
>Overrides getInfo to print extra information
>Overrides both versions of abstract method 'evaluate'

class Sculpture:
>extends Masterpiece
>has some extra protected fields which are final , get initialized
by the constructor and cannot be changed
>Overrides getInfo to print extra information
>Overrides both versions of abstract method 'evaluate'