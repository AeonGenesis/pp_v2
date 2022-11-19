## Aufgabe 1

### Portnummern und Dienste im Internet

Computer, die Dienste anbieten, heißen „Server“. Ein Server im Internet besitzt „Ports“ – also gewissermaßen Eingangsbriefkästen, über die er Aufträge entgegennehmen kann. Jeder Port hat eine Nummer zwischen 0 und 65535, durch die der zugehörige Dienst eindeutig angesprochen  
werden kann. So ist beispielsweise das HyperText Transfer Protocol HTTP, über das Web-Seiten angefordert werden können, dem Port 80 zugeordnet. Allgemein ist der Wertebereich der  
Portnummern wie folgt aufgeteilt:

*   Die Ports mit den Nummern von 0 bis 1023 sind „well-known ports“. Sie bieten grundlegende  
    Standarddienste des Internets an. Die folgende Tabelle nennt einige Ports und Dienste:

![image](https://user-images.githubusercontent.com/67957760/202873409-4b5bf0af-626c-49cb-a86f-3503d7160cd0.png)

Die Ports mit den Nummern von 1024 bis 49151 sind „registered ports“. Sie sind bestimmten  
herstellerspezifischen Diensten zugeordnet.

*   Die Ports mit den Nummern von 49152 bis 65535 sind „dynamic ports“. Sie können von jedem  
    Programmierer frei benutzt werden.  
    Stellen Sie ein zuerst ein Struktogramm für ein Programm auf, das folgendes leistet:
*   Einlesen einer Portnummer von der Tastatur. Der Benutzer soll so lange um eine Neueingabe  
    gebeten werden, wie er einen Wert außerhalb des Bereichs 0, ..., 65535 eingibt.
*   Ausgabe der Art des Ports (well-known, registered oder dynamic).
*   Im Fall eines well-known ports: Ausgabe des Diensts dieses Ports (siehe Tabelle oben). Ist die  
    Portnummer nicht in der Tabelle angegeben, soll „Sonstiger Dienst“ ausgegeben werden.
*   Der Vorgang soll beliebig oft wiederholt werden können, bis der Benutzer ein Ende wünscht.

Das Struktogramm muss so detailliert sein, dass alle Schleifen und Verzweigungen des späteren Programms zu erkennen sind. Verwenden Sie da, wo es angemessen ist, eine Mehrfachauswahl/- verzweigung!

Setzen Sie das Struktogramm anschließend in ein Java-Programm um.

## Aufgabe 2

### Verschlüsselung von Wörtern mit der Cäsarchiffre

Die "Cäsarchiffre" ist ein sehr einfaches Verfahren zur Verschlüsselung von Texten. In der heutigen  
Praxis sollte es nicht mehr angewandt werden, da es sehr schnell geknackt werden kann. Da es aber  einfach zu implementieren ist, ist es Gegenstand dieser Aufgabe.  

Das Verfahren hängt ab von einem "Schlüssel" **n**, wobei n eine **natürliche Zahl zwischen 1 und 25**  
ist. 
Ein Wort wird dadurch verschlüsselt, dass jeder Buchstabe ersetzt wird durch den Buchstaben,  
der im Alphabet n Positionen dahinter steht (erreicht man dabei das Ende des Alphabets, so beginnt man wieder vorn bei ’a’). Eine Entschlüsselung geschieht entsprechend.  

Beispiel: Für n=4 wird das Wort "asterix" verschlüsselt zu "ewxivmb".  

Stellen Sie zuerst ein **Struktogramm** auf für ein Verfahren, das Folgendes leistet:  
>• Einlesen einer ganzen Zahl n. Das Einlesen soll so lange wiederholt werden, wie der Benutzer eine Zahl eingibt, die kleiner als 1 oder größer als 25 ist.  
>• Einlesen einer Zeichenkette in einen StringBuffer.  
>• Auswahl, ob die Zeichenkette verschlüsselt oder entschlüsselt werden soll.  
>• Verschlüsseln bzw. Entschlüsseln der Zeichenkette und Abspeichern des Ergebnisses in einen  
neuen StringBuffer. 
	 Es sollen dabei nur Buchstaben ver- bzw. entschlüsselt werden, wobei ein  
Großbuchstabe stets durch einen Großbuchstaben und ein Kleinbuchstabe stets durch einen  
Kleinbuchstaben ersetzt wird. Alle anderen Zeichen sollen unverändert bleiben.  

Das Struktogramm muss so genau sein, dass alle Schleifen und Verzweigungen des späteren  
Programms zu erkennen sind. Zudem muss genau angegeben werden, an welcher Stelle (d.h. mit  
welchem Zeichen) der Zeichenkette das Verfahren jeweils arbeitet.  
Setzen Sie anschließend das Struktogramm in ein Java-Programm um.

## Aufgabe 3

### Ausgabe einer Zahlenfolge

Ein (mehr oder weniger) beliebtes Kinderspiel ist das „Bumm-Spiel“. Es geht dabei darum,  
möglichst schnell zu zählen und dabei alle Zahlen, die durch 7 teilbar sind oder in denen die Ziffer  
7 vorkommt, durch das Wort „bumm“ zu ersetzen. Beispiel:  
> ... 20 bumm 22 23 24 25 26 bumm bumm 29 30 ...  

In dieser Aufgabe sollen Sie die Ausgabe des Bumm-Spiels für den Zahlenbereich von 0 bis 99  
erzeugen. Gehen Sie dabei auf zwei verschiedene Arten vor:  

• Ihr Algorithmus enthält nur eine Schleife, deren Laufindex die Zahlenwerte von 0 bis 99  
durchläuft.  
• Ihr Algorithmus enthält zwei geschachtelte Schleifen. Der Laufindex der äußeren Schleife  
durchläuft für die Zehnerstelle der Zahl den Bereich 0 bis 9, der Laufindex der inneren Schleife tut  
dasselbe für die Einerstelle der Zahl.  

Für die Lösung der Aufgaben arbeiten Sie nur mit Operationen auf Ganzzahlen. Verwenden Sie  
dabei keine Zeichenkette o.ä. 
Erarbeiten Sie für jede der beiden Möglichkeiten zuerst ein  Struktogramm und setzen Sie es erst anschließend in ein Java-Programm um. Auch hier muss das  Struktogramm so detailliert sein, dass alle Schleifen und Verzweigungen des späteren Programms  zu erkennen sind! Zudem soll genau ersichtlich sein, an welcher Stelle welche Ausgabe erfolgt.  

##### Alternativaufgabe für Anspruchsvolle: 
*Lösen Sie die Aufgabe für den allgemeinen Fall.* 
- Der  Benutzer soll zunächst die Grenzen z1 und z2 eines Zahlenintervalls \[z1,z2\] eingeben, wobei das  Programm sicherstellen soll, dass 0\<z1\<z2 gilt. 
- Der Benutzer soll danach eine Ziffer t eingeben,  wobei das Programm sicherstellen soll, dass 2\<t\<9 gilt. 
- Anschließend soll für das Zahlenintervall  und die Ziffer (= den Teiler t) die „Bumm-Ausgabe“ erzeugt werden. 
Zeichen Sie zunächst ein  Struktogramm und setzen Sie es anschließend in ein Programm um. Benutzen Sie für das  Hochzählen der Zahl nur eine Schleife – geschachtelte Hochzählschleifen sind hier nicht sinnvoll,  denn die Anzahl der Stellen der Zahl ist ja nicht von vornherein bekannt.

## Aufgabe 4

### Abtastung und Quantisierung von Funktionen

Eine grundlegende Aufgabe in der Nachrichtentechnik ist die Verarbeitung von zeit- und  
wertkontinuierlichen Signalen - z.B. Eingangsspannung in einem Empfangsgerät oder Schallwellen  
an einem Mikrofon. Die Signale sind also durch Funktionen mit reellwertigem Definitions- und  
Wertebereich (= x- bzw. y-Achse) definiert.  
Damit ein digitales System solche Funktionen verarbeiten kann, müssen sie "**diskretisiert**" werden.  
Man spricht hier bezüglich der x-Achse von "Abtastung" und der y-Achse von "Quantisierung".  
Abtastung bedeutet, dass die Funktionswerte nur in gewissen Abständen gemessen  
werden. Die Quantisierung bildet dann die gemessenen reellen Funktionswerte auf Ganzzahlwerte  
ab. Dabei ist einem ganzen Intervall von reellen Zahlen derselbe Ganzzahlwert zugeordnet (z.B.  
dem reellen Intervall \[1.0,2.0) die ganze Zahl 1).  

![image](https://user-images.githubusercontent.com/67957760/202873390-0334c2b8-70ee-42dd-9550-da4225f25212.png)

Stellen Sie ein zuerst ein Struktogramm für ein Programm auf, das folgendes leistet:  
• Abtastung der Funktion f(x) = 20x²-100x+129.5 im Intervall \[2,4\] mit der Schrittweite 0.1. Die  
Quantisierung soll durch Abrunden auf die nächstniedrigere ganze Zahl erfolgen. Für jeden  
Abtastzeitpunkt sollen der x-Wert, der zugehörige Funktionswert mit Nachkommastellen und das  
Ergebnis der Quantisierung ausgegeben werden.  
• An der Stelle x=2.5 Ausgabe der Meldung "Minimum!".  
Setzen Sie das Struktogramm anschließend in ein Java-Programm um.  
Hinweise:  
• Um Verwirrungen vorzubeugen: f(x) ist nicht die in der Abbildung dargestellte Funktion.  
• Sie können f(x) in ihrem Programm direkt als Rechenausdruck hinschreiben. Berechnen Sie x²  
dabei durch x\*x.  
• Die Quantisierung ergibt sich automatisch durch Zuweisung der Funktionswerte an eine int-  
Variable.
