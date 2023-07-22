# OOP modulzáró

Készíts egy új, verziókezelt projektet!
A feladatotkat külön-külön package-ekben oldd meg, ezeket a package-eket neked kell létrehoznod! (Mindegyik package-ed tartalmazhat main() metódust, ahol tesztelhetsz, de nem kötelező.)
Ha kész vagy, pushold fel a megoldásaid (természetesen előbb is pusholhatsz) és küldd el Andrisnak a repód linkjét!

# person package
Hozz létre egy Person osztályt (getterekkel, setterekkel és legalább 1 konstruktorral), amely a következő információkat tárolja egy személyről:
név (name)
életkor (age)
nem (gender)
hobbik (hobbies)
barátok listája (friends)
1 pont 
Garantáld, hogy ne lehessen nemet változtatni! 1 pont
Oldd meg, hogy meg le lehessen kérdezni a népességet (hányszor lett példányosítva a Person osztály)! 3 pont
A gender legyen egy enum 1 pont, ami több nyelven is (angol, magyar) legyen lekérdezhető! 2 pont
Ezen kívül hozz létre egy metódust a Person osztályban, amely lehetővé teszi új barátok hozzáadását a személy barátok listájához 1 pont  és garantálja hogy a barátság kétirányú! 2 pont
Írd felül a toString metódust! 1 pont 
Plusz pont: a toString metódus nem fut rekurzióra 1 pont


Pontozás: 12 + 1 pont 

# bank package
Készíts egy bankszámlát reprezentáló BankAccount osztályt, amely tartalmazza a számla tulajdonosának nevét (accountName), az egyenleget (balance) és egy egyedi számlaszámot (accountNumber). 1 pont

Valósítsd meg, hogy egy számla létrehozása után a számlatulajdonos neve (és természetesen az egyenlege is) változhasson, ám a számlaszáma nem! 1,5 pont


Az osztálynak meg kell valósítania a számlával kapcsolatos alábbi műveleteket és az osztálynak saját kivételeket kell dobnia helytelen műveletek esetén:

getAccountNumber:: Visszaadja a számlaszámot. 0,5 pont
getAccountName: Visszaadja a számlatulajdonos nevét. 0,5 pont
getBalance: Visszaadja az egyenleget. 0,5 pont
deposit: Befizeti a megadott összeget a számlára. 1 pont
withdraw: Kiveszi a megadott összeget a számláról, ha van elegendő pénz a számlán. 2 pont
transfer: Átutalja a megadott összeget a jelenlegi számláról a cél számlára, ha van elegendő pénz a számlán. 2 pont
isValidAccountNumber: Osztályszintű metódus, mely ellenőrzi, hogy a megadott számlaszám érvényes-e. Azt a számlaszámot tekintjük érvényesnek, ahol a számjegyek összege legalább 20 és az első és az utolsó számjegyének a paritása megegyezik. (Paritás = páros vagy páratlan) Használhatod az Integer.parseInt() metódust! 3 pont

Ügyelj arra, hogy a kért metódusokat valósítsd meg, a paraméterlistákat neked kell kitalálnod!
Plusz pont: helyes paraméterlisták 1 pont

Pontozás: 12 + 1 pont

# zoo package

Készíts egy állatkertet, amelyben különböző típusú állatok élnek. Az állatok lehetnek emlősök (Mammal), madarak (Bird) vagy hüllők (Reptile). 
Az emlősök között legyenek legalább kutya (Dog) és macska (Cat), a madarak között legalább sas (Eagle) és pingvin (Penguin), a hüllők között pedig kígyó (Snake) és teknős (Turtle) osztályok! 2 pont
Minden állatnak van egy neve és egy életkora 0,5 pont. Az állatok képesek kiadni hangot, de különböző hangokat adnak ki a típusuktól függően.1 pont
Írj marker interface-eket:
elevenszülő (Viviparous)
tojással szaporodik (Oviparous)
tud repülni (Flyable) 0,5 pont
és használd őket a megfelelő helyeken! 1 pont

Az állatkert csak egy listát tartalmazzon az állatok tárolására! Lehessen új állatot felvenni, egy meglévő állatot “kidobni”, 1 pont illetve kilistázni őket különböző módonokon: (erre használhatsz több metódust is) összes állat, 0,5 pont emlősök, madarak, hüllők 2,5 pont.
Plusz pont: OOP koncepciók precíz követése 1 pont


Pontozás: 9 + 1 pont


# shape package
Írj egy programot ami különböző geometriai formáknak képes kiszámolni a kerületét (perimeter) 1 pont és területét (area) 1 pont!
kör (Circle) 1 pont
kerület = 2*r*Pi
terület = r*r*Pi
négyzet (Square) 1 pont
kerület = 4*a
terület = a*a 
téglalap (Rectangle) 1 pont
kerület = 2*(a+b)
terület = a*b
Használd a tanult OOP koncepciókat! 2 pont
A Pi értékét a Math.PI-vel érheted el!
Plusz pont: OOP koncepciók precíz követése 1 pont

Pontozás: 7 + 1 pont
