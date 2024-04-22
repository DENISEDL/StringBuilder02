public class UnicodeExtractor {
    private String inputString;

    public UnicodeExtractor(String inputString) {
        this.inputString = inputString;
    }

    public String getUnicodeCharAtIndex(int index) {
        StringBuilder result = new StringBuilder();

        // Verifica se l'indice è valido
        if (index < 0 || index >= inputString.length()) {
            return "Errore: Indice non valido";
        }

        // Estrae il carattere in Unicode
        char character = inputString.charAt(index);
        int unicodeValue = (int) character;

        // Aggiunge il risultato al StringBuilder
        result.append("Il carattere Unicode alla posizione ")
                .append(index)
                .append(" nella stringa è: ")
                .append(unicodeValue);

        return result.toString();
    }
}
