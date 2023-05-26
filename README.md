## Requeried Lbraries 
org.junit.jupiter:junit-jupiter:5.9.3

# Projektrapport: Utmaning 1 - Bankkonto

### Kristian Karlson

## Beskrivning av projektet
Inlämningen är testen till Account.class och klassen själv. Bank klassen är till för att begränsa och definiera hur Account ska bete sig.

### Vem har gjort vad
Enskilt arbete
### Vad ni har gjort
Skapat ett program som ska uppfylla kraven för inlämningsuppgiften

## Arbetet och dess genomförande
Skapade Account klass enligt kravspecifikation från uppgiften. Skapade test för att säkerställa korrekt beteende av Account (Röd fas)
Uppdaterade kode i account för att det skulle klara alla tester (Grön fas).
För att testa att förändra koden ändrades return på withdraw och deposit från void till boolean för att bank skulle få kännedom om transaktionen gick igenom.
De befintliga testerna gick igenom och nya skapades för att säkerställa korrekt return,

### Vad som varit svårt
Begränsande av vad som kan komma till account. Det är lurigt att skapa tester till en klass i ett där interaktionen med andra klasser inte är definierad. 

### Beskriv lite olika lösningar du gjort
Använder @BeforeEach och @AfterEach för att skapa test object. 

### Beskriv något som var besvärligt att få till
Utmaningen låg i klura ut alla möjliga saker som kan gå fel i koden 

### Beskriv om du fått byta lösning och varför i sådana fall
-

## Slutsatser

### Vad gick bra
Testerna går igenom och säkerställer att Account klassen fungerar som förväntat.
Koden har bara en grön varning den tycker jag stavar Luhn fel i en kommentar

### Vad gick dåligt
Gick lite för snabbt när jag kopierade några av testerna till andra metoder. Det var några tester inte kollade rätt saker.
Testklassen är svåröverblickbar på grund av storleken. 

### Vad har du lärt dig
De tre delarna i ett test Arrange/Act/Assert.
Har genererat javadoc som finns i i mappen /javadoc/ 

### Vad hade ni gjort annorlunda om ni gjort om projektet
Använt @ParameterizedTest med @ValueSource eller @CsvSource för att påvisa kunskap med testtyperna.

### Vilka möjligheter ser du med de kunskaper du fått under kursen.
Bra kunskaper om hur man skapar tester för metoder och strukturerar dom på känt sätt.
Har man komplicerade metoder som kräver många tester kanske man ska bryta ner tester till en klass per metod