## Aufgabe 2
# Verschlüsselung von Wörtern mit der Cäsarchiffre

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
