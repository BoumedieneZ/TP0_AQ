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

# Exercice 2 : Implémentation et Tests de la Classe Stack

## Description de la Classe Stack

La classe `Stack` implémente une pile d’entiers avec les opérations classiques suivantes :

- `push(int element)`: ajoute un élément au sommet de la pile.
- `pop()`: retire et renvoie l'élément au sommet de la pile.
- `peek()`: renvoie l'élément au sommet de la pile sans le retirer.
- `isEmpty()`: renvoie `true` si la pile est vide, sinon `false`.
- `size()`: renvoie le nombre d'éléments dans la pile.

La pile est basée sur un tableau interne, dont la capacité initiale est de 10. Si la pile est pleine, le tableau est agrandi automatiquement.

## Tests Unitaires pour la Classe Stack

Nous avons écrit une série de tests unitaires pour vérifier le bon fonctionnement de chaque méthode de la classe `Stack`.

### Explications des Tests

#### Test de la Méthode `push` :

- Ajoute deux éléments (5 et 10) à la pile et vérifie que la taille de la pile est de 2.

#### Test de la Méthode `pop` :

- Ajoute deux éléments (5 et 10) à la pile, puis retire et vérifie que l'élément retiré est bien 10 et que la taille de la pile est maintenant de 1.

#### Test de la Méthode `peek` :

- Ajoute deux éléments (5 et 10) à la pile, puis vérifie que l'élément au sommet est 10 sans le retirer, et que la taille de la pile reste de 2.

#### Test de la Méthode `isEmpty` :

- Vérifie que la pile est initialement vide, ajoute un élément (5) et vérifie que la pile n'est plus vide.

#### Test de la Méthode `size` :

- Vérifie que la taille initiale de la pile est 0, ajoute deux éléments (5 et 10) et vérifie que la taille de la pile est de 1 puis de 2.

#### Test de la Méthode `expandArray` :

- Ajoute 15 éléments à la pile pour vérifier que le tableau interne s'agrandit correctement lorsque la capacité initiale est dépassée, et vérifie que la taille de la pile est de 15.

## Résultat des Tests

Tous les tests ont été exécutés avec succès, sans aucune erreur. Cela confirme que les méthodes de la classe `Stack` fonctionnent correctement et que le tableau interne s'agrandit comme attendu lorsque la capacité initiale est dépassée.

# Exercice 03 : Explication des Tests pour la Suite de Fibonacci

## Cas de Base

### testFibonacciBaseCases

Ce test vérifie que les valeurs de base de la suite de Fibonacci sont correctes :
- F(0) doit être 0.
- F(1) doit être 1.

## Cas Généraux

### testFibonacciGeneralCases

Ce test vérifie que la méthode retourne les bonnes valeurs pour plusieurs termes de la suite de Fibonacci :
- F(2), F(3), F(4), F(5), F(6), et F(7).

## Cas d'Erreur

### testFibonacciNegativeInput

Ce test vérifie que la méthode lève une exception `IllegalArgumentException` avec le message "n must be positive" lorsqu'un argument négatif est passé à la méthode de calcul de Fibonacci.

# Exercice 04 : Explication des Tests pour la Détection des Nombres Premiers

## Nombres Premiers

### testIsPrimeWithPrimes

Ce test vérifie que la méthode retourne `true` pour plusieurs nombres premiers :
- 2, 3, 5, 7, 11, 13, 17, 19, 23.

## Nombres Non Premiers

### testIsPrimeWithNonPrimes

Ce test vérifie que la méthode retourne `false` pour plusieurs nombres non premiers :
- 0, 1, 4, 6, 8, 9, 10, 12, 14.

## Nombres Négatifs

### testIsPrimeWithNegativeNumbers

Ce test vérifie que la méthode retourne `false` pour plusieurs nombres négatifs :
- -1, -2, -3, -4, -5.

# Exercice 05 : Explication des Tests pour le Calcul du Factoriel

## Nombres Positifs

### testFactorialWithPositiveNumbers

Ce test vérifie que la méthode retourne les valeurs correctes pour les nombres positifs et zéro :
- 0! = 1
- 1! = 1
- 2! = 2
- 3! = 6
- 4! = 24
- 5! = 120
- 6! = 720
- 7! = 5040

## Nombres Négatifs

### testFactorialWithNegativeNumbers

Ce test vérifie que la méthode lance une `IllegalArgumentException` pour les nombres négatifs.


---

Merci d'avoir consulté ce projet. Si vous avez des questions ou des suggestions, n'hésitez pas à me contacter.
