# Uppg3

Uppgift: Tredje utmaningen - ArrayList
Beskrivning:

Du ska skapa en namnlista med CRUD funktionalitet
Man saka kunna skapa namn, lista alla namn, ändra namn och radera namn
Om man försöke radera eller ändra ett namn som inte finns ska programmet säga till
om att namnet inte finns.'

Pseudokod
Skapa en ArrayList för att hålla koll på namnen
LOOP:
    Visa meny
    OM val: Skapa
       Fråga om ett namn
       Spara namn
    OM val: Radera
       Fråga om ett namn
       OM namn finns
           Radera namnet ur listan
    OM val: Uppdatera
        Fråga om ett namn
        OM namn finns i listan
               Fråga om ersättningsnamn
               Ersätt namnet med ersättningsnamn
    OM val: Lista
            OM det finns personer i listan
                Visa listan
    OM val: Avsluta


    Bryt loopen
LOOP END:

Vid inlämning, skicka in kodfilerna (*.java) bara

Exempel:
+---------------------------------------+
| Den coola namnlistan      |
+---------------------------------------+
| Listan innehåller 0 namn |
| 1) Mata in ett namn          |
| 2) Radera ett namn           |
| 3) Ändra ett namn             |
| 4) Lista alla namn             |
+----------------------------------------+
> 1
Vilket namn vill du skpaa
> Marcus

+---------------------------------------+
| Den coola namnlistan      |
+---------------------------------------+
| Listan innehåller 1 namn |
| 1) Mata in ett namn          |
| 2) Radera ett namn           |
| 3) Ändra ett namn             |
| 4) Lista alla namn             |
+----------------------------------------+
> 3
Vilket namn vill du ändra
1 - Marcus
> 1
Ange nytt namn
> Mr Datafreak
Namnet "Marcus" är nu ändrat till "Mr Datafreak"

+---------------------------------------+
| Den coola namnlistan      |
+---------------------------------------+
| Listan innehåller 1 namn |
| 1) Mata in ett namn          |
| 2) Radera ett namn           |
| 3) Ändra ett namn             |
| 4) Lista alla namn             |
+----------------------------------------+
> 2
Vilket namn vill du radera
> Pelle
Pelle finns inte i listan