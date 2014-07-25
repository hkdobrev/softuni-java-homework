class FullHouse {

    static public final int numberOfThrees = 3;
    static public final int numberOfTwos = 2;

    static public final String[] faces = new String[]{
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
        "K",
        "A"
    };

    static public final char[] suits = new char[]{
        '\u2660',
        '\u2665',
        '\u2666',
        '\u2663'
    };
    
    public static void main(String[] args) {
        int numberOfFaces = faces.length;
        int totalNumberOfFullHouses = 0;

        for (int i = 0; i < numberOfFaces; i++) {
            for (int j = 0; j < numberOfFaces; j++) {
                if (i !== j) {
                    totalNumberOfFullHouses += getFullHouses(faces[i], faces[j]);
                }
            }
        }

        System.out.println();
        System.out.println(totalNumberOfFullHouses + " full houses");
    }

    public int getFullHouses(String face1, String face2) {
        int numberOfSuites = suits.length;
        int numberOfFullHouses = 0;

        System.out.print("(");
        
        for (int i = 0; i < numberOfThrees; i++) {
            for (int j = 0; j < numberOfSuites; j++) {
                System.out.print(face1);
            }
        }

        return numberOfFullHouses;
    }
}