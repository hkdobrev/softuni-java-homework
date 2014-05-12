import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPCell;

public class DeckOfCards {

    public static final String FILENAME = "Deck-of-Cards.pdf";

    public static final String SPADES = "Spades";
    public static final String HEARTS = "Hearts";
    public static final String DIAMONDS = "Diamonds";
    public static final String CLUBS = "Clubs";

    public static final String[] CARD_COLORS = new String[]{
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

    public static void main(String[] args)
        throws DocumentException, IOException {

        String workingDir = System.getProperty("user.dir");
        String absolutefileName = workingDir + "/" + FILENAME;

        new DeckOfCards().createPdf(absolutefileName);
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
                Paragraph paragraph = new Paragraph(getCard(i, j));
                PdfPCell cell = new PdfPCell(paragraph);
                table.addCell(cell);
            }
        }

        return table;
    }

    protected String getCard(Integer cardType, Integer cardColor) {
        return CARD_TYPES[cardType] + " " + CARD_COLORS[cardColor];
    }
}

