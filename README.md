# HZ_Program
CheckersGame door Alwyn Voorhoeve en Arne Soyez


Design patterns: 
- Factory pattern
- Composite pattern
- Command pattern

Bij het maken van de CheckersGame hebben mijn teamgenoot Arne en ik verschillende design pattern toegepast om de structuur, leesbaarheid en onderhoudbaarheid van de code te verbeteren. Wij hebben dit gedaan door middel van pair programming, met sessies op mijn computer. Dit is de reden waarom de meeste changes vanaf mijn computer gepushed zijn. 

De Design Patterns

Factory Method pattern
We hebben dit pattern gebruikt om de damstenen te maken. De CheckersPieceFactory class doet het werk om pieces (damstukken) te maken, zodat we gemakkelijk nieuwe stuktypen kunnen toevoegen, zoals de verschillende stukken van player 1 en player 2.

Singleton Patroon
Om te zorgen dat er maar 1 board is hebben we het Singleton pattern gebruikt. De CheckersBoard class beheert 1 bord, zodat er tijdens het spel niet per ongeluk meerdere borden worden aangemaakt.

Strategy Patroon
Voor de logica van zetten in het spel hebben we het Strategy pattern gebruikt. We hebben een MoveValidator-interface gedefined en concrete implementations gemaakt voor normale en slagzetten. Hierdoor kunnen we in de toekomst gemakkelijk nieuwe soorten zetten toevoegen.

Samenwerking bij Pair Programming

We begonnen met alle requirements op rijtje te zetten, zoals dat er een bord moet zijn, 2 soorten stukken, dat ze kunnen bewegen en de namen van de vakken van het bord, daarna keken we welke design patterns in dit project zouden passen door te kijken welke het project zouden kunnen verbeteren. We zorgden ervoor dat we allebei begrepen wat we wilden doen voordat we iets gingen coderen. Ook wisselden we regelmatig tussen typen en controleren, wat ervoor zorgde dat we af en toe een soort break hadden van al het typen. Elk stukje code werd meteen beoordeeld zodat we weinig fouten over het hoofd zagen.
Als we op een probleem stuitten, bespraken we verschillende oplossingen voordat we de meest effectieve aanpak kozen.

Integratie van Designpatronen
We werkten samen aan het implementeren van elk designpatroon, waarbij we ervoor zorgden dat beide teamleden bijdroegen aan de uiteindelijke oplossing.

Testen tijdens het Programmeren
Na elke functie voerden we tests uit om er zeker van te zijn dat onze code stap voor stap correct was.

Conclusie

Door samen pair programming te doen en door de design patterns toe te passen, hebben we een gemakkelijk uit te breiden versie van Checkers gemaakt.



# CheckersGame

## Welkom!

In deze Github-repo staat de coole code van het damspel in Java. Alwyn en ik, Arne, hebben hier samen aan gewerkt, en het is echt een toffe samenwerking geweest!

## Hoe We Samengewerkt Hebben

### Samen Programmeren

We hebben vooral veel samen achter de computer gezeten. Alwyn en ik hebben om beurten getypt en gekeken naar wat de ander deed. Dit heet 'pair programming'. Het zorgt ervoor dat we slimme ideeën delen en fouten snel ontdekken.

### Allebei Even Belangrijk

We wilden zeker weten dat we allebei evenveel bijdroegen. Dus, we wisselden regelmatig af tussen wie typte en wie controleerde. Op die manier waren we altijd fris en konden we goed overleggen.

### Design Patterns

We hebben ook slimme trucjes gebruikt, 'design patterns' genaamd, om onze code georganiseerd te houden. We kozen de patronen die het beste pasten bij ons project, zodat het makkelijk uit te breiden is.


### Slim Beginnen met Spelstukken

Voor het maken van damstenen gebruiken we het **Factory Method-patroon**. Dat is als een sjabloon om snel nieuwe stukken te maken. Zo kunnen we makkelijk nieuwe soorten stukken toevoegen. Check de README voor meer info hierover.

### Altijd Maar Één Spelbord

We zorgen ervoor dat er maar **één spelbord** is door het **Singleton-patroon** te gebruiken. Dit voorkomt dat er per ongeluk meerdere borden worden gemaakt. Als je nieuwsgierig bent, staat er meer over in de README.

### Slimme Zetten Bedenken

Voor het checken van zetten gebruiken we het **Strategy-patroon**. We hebben een slimme manier bedacht om zetten goed te keuren. Met dit trucje kunnen we later makkelijk nieuwe soorten zetten toevoegen. Lees de README voor meer details.

## Tot Slot

Onze teamwork en leuke ideeën, hebben gezorgd voor een cool damspel. Het is niet alleen goed voor nu, maar het maakt het ook makkelijk om het spel in de toekomst nog leuker te maken!

---
