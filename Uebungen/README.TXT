#Übung 1
Erstelle eine HashMap mit den Zahlen von 0 bis 10000000.
Miss wie lange das Füllen der HashMap dauert. Lies anschliessend alle Elemente aus der HashMap aus und miss ebenfalls wie lange dies dauert.
Wiederhole das gleiche für die TreeMap und vergleiche die Ergebnisse!

Aktuelle Zeit in Millisekunden:
long aktuelleZeit = System.currentTimeMillis();

#Übung 2
Erstelle eine ArrayList und eine LinkedList mit je 100000 Elementen.
Miss die Zeit für das Füllen und das Auslesen der Listen. Miss zudem die Zeit, wie lange es dauert, um 100 weitere Elemente am Anfang der Listen hinzuzufügen.

#Übung 3
Schreibe eine Klasse, in welcher du Telefonnummern zu einer Person zuordnen kannst und anschliessend anhand der Telefonnummer suchen kannst. Welche Collection-Klasse eignet sich hier?

#Übung 4
Die HashMap von Java bietet keine direkte Möglichkeit an, um durch alle Elemente zu iterieren. Finde eine Möglichkeit, um trotzdem alle Elemente der HashMap durchlaufen zu können. Lies dazu auch die HashMap API:
http://docs.oracle.com/javase/7/docs/api/java/util/HashMap.html

#Übung 5
Schreibe ein Reservationssystem, in welchem sich Personen für den Kauf eines Gerätes registrieren können. Die Klasse soll zudem eine Methode für das Auslesen der Registrierungen bieten. Diese Methode gibt die Registration zurück und entfernt sie anschliessend aus der Liste. Wenn keine Registration vorhanden ist, soll NULL zurückgegeben werden. Verwende als Queue-Implementation eine LinkedList.

