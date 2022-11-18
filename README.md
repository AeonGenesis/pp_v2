## Aufgabe 1

### Portnummern und Dienste im Internet

Computer, die Dienste anbieten, heißen „Server“. Ein Server im Internet besitzt „Ports“ – also gewissermaßen Eingangsbriefkästen, über die er Aufträge entgegennehmen kann. Jeder Port hat eine Nummer zwischen 0 und 65535, durch die der zugehörige Dienst eindeutig angesprochen  
werden kann. So ist beispielsweise das HyperText Transfer Protocol HTTP, über das Web-Seiten angefordert werden können, dem Port 80 zugeordnet. Allgemein ist der Wertebereich der  
Portnummern wie folgt aufgeteilt:

*   Die Ports mit den Nummern von 0 bis 1023 sind „well-known ports“. Sie bieten grundlegende  
    Standarddienste des Internets an. Die folgende Tabelle nennt einige Ports und Dienste:

<table><tbody><tr><td>21</td><td>ftp</td></tr><tr><td>23</td><td>telnet</td></tr><tr><td>25</td><td>smtp</td></tr><tr><td>80</td><td>http</td></tr><tr><td>143</td><td>imap</td></tr></tbody></table>

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

## Verschlüsselung von Wörtern mit der Cäsarchiffre

Die "Cäsarchiffre" ist ein sehr einfaches Verfahren zur Verschlüsselung von Texten. In der heutigen  
Praxis sollte es nicht mehr angewandt werden, da es sehr schnell geknackt werden kann. Da es aber  
einfach zu implementieren ist, ist es Gegenstand dieser Aufgabe.  
Das Verfahren hängt ab von einem "Schlüssel" n, wobei n eine natürliche Zahl zwischen 1 und 25  
ist. Ein Wort wird dadurch verschlüsselt, dass jeder Buchstabe ersetzt wird durch den Buchstaben,  
der im Alphabet n Positionen dahinter steht (erreicht man dabei das Ende des Alphabets, so beginnt  
man wieder vorn bei ’a’). Eine Entschlüsselung geschieht entsprechend.  
Beispiel: Für n=4 wird das Wort "asterix" verschlüsselt zu "ewxivmb".  
Stellen Sie zuerst ein Struktogramm auf für ein Verfahren, das Folgendes leistet:  
• Einlesen einer ganzen Zahl n. Das Einlesen soll so lange wiederholt werden, wie der Benutzer  
eine Zahl eingibt, die kleiner als 1 oder größer als 25 ist.  
• Einlesen einer Zeichenkette in einen StringBuffer.  
• Auswahl, ob die Zeichenkette verschlüsselt oder entschlüsselt werden soll.  
• Verschlüsseln bzw. Entschlüsseln der Zeichenkette und Abspeichern des Ergebnisses in einen  
neuen StringBuffer. Es sollen dabei nur Buchstaben ver- bzw. entschlüsselt werden, wobei ein  
Großbuchstabe stets durch einen Großbuchstaben und ein Kleinbuchstabe stets durch einen  
Kleinbuchstaben ersetzt wird. Alle anderen Zeichen sollen unverändert bleiben.  
Das Struktogramm muss so genau sein, dass alle Schleifen und Verzweigungen des späteren  
Programms zu erkennen sind. Zudem muss genau angegeben werden, an welcher Stelle (d.h. mit  
welchem Zeichen) der Zeichenkette das Verfahren jeweils arbeitet.  
Setzen Sie anschließend das Struktogramm in ein Java-Programm um.
