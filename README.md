# HZ_Program
CheckersGame door Alwyn Voorhoeve en Arne Soyez
Repository: https://github.com/asoyez/HZ_Program

### Gebruikte Design patterns: 
- Factory pattern
- Composite pattern
- Command pattern

Bij het maken van de CheckersGame hebben mijn teamgenoot Arne en ik verschillende design pattern toegepast om de structuur, leesbaarheid en onderhoudbaarheid van de code te verbeteren. Wij hebben dit gedaan door middel van pair programming, met sessies op mijn computer. Dit is de reden waarom de meeste changes vanaf mijn computer gepushed zijn. 

## De Design Patterns


### Factory Method-pattern:

Waarom: Het Factory Method-patroon wordt gebruikt om de creatie van spelstukken (damstenen) te beheren.

Wat doet het: In dit damspel is er een CheckersPieceFactory class die de logica bevat om damstenen te maken. Het zorgt voor een gestructureerde manier om nieuwe stuktypen toe te voegen zonder het hoofdprogramma aan te passen. Dit patroon maakt het gemakkelijk om in de toekomst nieuwe damstukken toe te voegen.


### Singleton-pattern:

Waarom: Het Singleton-patroon zorgt ervoor dat er slechts één instantie van het spelbord (CheckersBoard) is.

Wat doet het: In het damspel wil je niet dat er meerdere borden tegelijkertijd zijn. Het Singleton-patroon garandeert dat er maar één bord is, waardoor verwarring en fouten worden voorkomen. Dit patroon zorgt voor een unieke instantie van het bord die overal toegankelijk is.


### Strategy-patroon:

Waarom: Het Strategy-patroon wordt gebruikt voor de validatielogica van zetten in het spel.

Wat doet het: In het damspel moeten zetten gevalideerd worden, en het Strategy-patroon biedt een manier om verschillende strategieën voor validatie te definiëren. We hebben een interface genaamd MoveValidator gedefinieerd en concrete implementaties voor gewone zetten en sla-zetten. Hierdoor kunnen we in het spel makkelijk schakelen tussen verschillende manieren om zetten te checken. Het biedt flexibiliteit voor toekomstige uitbreidingen, zoals het toevoegen van nieuwe soorten zetten. 


### Samenwerking bij Pair Programming

We begonnen met alle requirements op rijtje te zetten, zoals dat er een bord moet zijn, 2 soorten stukken, dat ze kunnen bewegen en de namen van de vakken van het bord, daarna keken we welke design patterns in dit project zouden passen door te kijken welke het project zouden kunnen verbeteren. We zorgden ervoor dat we allebei begrepen wat we wilden doen voordat we iets gingen coderen. Ook wisselden we regelmatig tussen typen en controleren, wat ervoor zorgde dat we af en toe een soort break hadden van al het typen. Elk stukje code werd meteen nagechecked zodat we weinig fouten over het hoofd zagen.
Als we op een probleem stuitten, bespraken we verschillende oplossingen voordat we de meest effectieve aanpak kozen. We werkten samen aan het implementeren van elk designpatroon, waarbij we ervoor zorgden dat beide teamleden bijdroegen aan de uiteindelijke oplossing.

## Conclusie

Door samen pair programming te doen en door de design patterns toe te passen, hebben we een gemakkelijk uit te breiden versie van Checkers gemaakt.


---
