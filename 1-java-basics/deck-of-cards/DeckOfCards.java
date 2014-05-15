import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPCell;

public class DeckOfCards {

    public static final String FILENAME = "Deck-of-Cards.pdf";

    public static final char SPADES = '\u2660';
    public static final char HEARTS = '\u2665';
    public static final char DIAMONDS = '\u2666';
    public static final char CLUBS = '\u2663';

    public static final char[] CARD_COLORS = new char[]{
        SPADES,
        HEARTS,
        DIAMONDS,
        CLUBS
    };

    public static final String[] CARD_TYPES = new String[]{
        "A",
        "2",
        "3",
        "4",
        "5",
        "6",
        "7",
        "8",
        "9",
        "10",
        "J",
        "Q",
        "K"
    };

    public static String FONT_PATH = "arial.ttf";
    public static final float fontSize = 75f;
    public static final int fontStyle = 0;
    public static final BaseColor blackColor = BaseColor.BLACK;
    public static final BaseColor redColor = BaseColor.RED;

    protected static BaseFont baseFont;
    protected static Font blackFont;
    protected static Font redFont;

    public static void main(String[] args)
        throws DocumentException, IOException {

        String workingDir = System.getProperty("user.dir");
        String absolutefileName = workingDir + "/" + FILENAME;

        baseFont = BaseFont.createFont(workingDir + "/" + FONT_PATH, "UTF-8", BaseFont.EMBEDDED);
        blackFont = new Font(baseFont, fontSize, fontStyle, blackColor);
        redFont = new Font(baseFont, fontSize, fontStyle, redColor);

        DeckOfCards deck = new DeckOfCards();
        deck.createPdf(absolutefileName);
    }

    public void createPdf(String fileName)
        throws DocumentException, IOException {
        Document document = new Document();

        PdfWriter.getInstance(document, new FileOutputStream(fileName));

        document.open();

        document.add(getTable());

        document.close();
    }

    public PdfPTable getTable() {
        PdfPTable table = new PdfPTable(4);

        Integer i;
        Integer j;
        Integer numberOfCardTypes = CARD_TYPES.length;
        Integer numberOfCardColors = CARD_COLORS.length;

        for (i = 0; i < numberOfCardTypes; i++) {
            for (j = 0; j < numberOfCardColors; j++ ) {
                Paragraph card = getCard(CARD_TYPES[i], CARD_COLORS[j]);
                PdfPCell cell = new PdfPCell(card);
                table.addCell(cell);
            }
        }

        return table;
    }

    public Paragraph getCard(String cardType, char cardColor) {
        Phrase type = new Phrase(cardType, blackFont);
        Phrase color = new Phrase(cardColor);

        switch (cardColor) {
            case SPADES:
            case CLUBS:
                color.setFont(blackFont);
            break;
            case HEARTS:
            case DIAMONDS:
                color.setFont(redFont);
            break;
        }

        Paragraph card = new Paragraph();

        card.add(type);
        card.add(color);

        return card;
    }
}

