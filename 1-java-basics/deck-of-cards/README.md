To run the DeckOfCards program you need to download its external dependencies.

Dependencies:

 - iTextPDF (5.4.5)- Java library to generate PDFs.
   Download from: https://github.com/itext/itextpdf/releases/tag/5.4.5

Run as:

    javac -cp "path/to/itextpdf-5.4.5.jar;*" DeckOfCards.java
    java -cp "path/to/itextpdf-5.4.5.jar;*" DeckOfCards

On Linux or another Unix-like system use `:` instead of `;` as a separator:

    javac -cp "path/to/itextpdf-5.4.5.jar:*" DeckOfCards.java
    java -cp "path/to/itextpdf-5.4.5.jar:*" DeckOfCards


You need to have `arial.ttf` and place it the same directory.

To build as a jar file:

    jar cvfm DeckOfCards.jar manifest.txt DeckOfCards.class

To run the created `DeckOfCards.jar` file:

    java -jar DeckOfCards.jar

> **NOTE**:
> 
> You still need to have the `lib/itextpdf-5.4.5.jar` file in the same dir.
> The `DeckOfCards.jar` is just holding the class path in its manifest, but
> the `itextpdf-5.4.5.jar` file is not bundled within it.
