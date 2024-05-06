# Exercice 01 :
## Tests unitaires pour la classe Person

Le fichier `PersonTest.java` contient des tests unitaires pour la classe `Person`, visant à valider le bon fonctionnement des méthodes `getFullName()` et `isAdult()`.

## Méthode `setup()`

La méthode `setup()` est annotée avec `@BeforeEach`, s'exécutant avant chaque test. Elle initialise une instance de `Person` avec le nom "Boumediene Kadaben" et un âge de 17 ans pour créer un contexte de test cohérent.

## Test `getFullNameTest()`

Ce test vérifie si `getFullName()` retourne correctement le nom complet de la personne. Le résultat attendu est "Boumediene Kadaben".

## Test `isAdult()`

Ce test confirme que `isAdult()` renvoie `true` lorsque l'âge est supérieur ou égal à 18 ans. Dans ce cas, l'âge est 17 ans, donc `isAdult()` devrait renvoyer `false`.

## Test `isNotAdult()`

Ce test assure que `isAdult()` renvoie `false` lorsque l'âge est inférieur à 18 ans. Comme précédemment, avec un âge de 17 ans, le résultat attendu est `false`.

Ces tests garantissent le comportement correct des méthodes `getFullName()` et `isAdult()` dans différentes situations, contribuant ainsi à la robustesse de la classe `Person`.
