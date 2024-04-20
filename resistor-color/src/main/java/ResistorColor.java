class ResistorColor {
    private String[] MnemonicsMap;

    public ResistorColor() {
        MnemonicsMap = new String[]{"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    }

    public String[] getMnemonicsMap() {
        return MnemonicsMap;
    }

    int colorCode(String color) {
        int arrLength = MnemonicsMap.length;
        for(int iterator=0;iterator<arrLength;iterator++) {
            if(MnemonicsMap[iterator].equals(color)) {
                return iterator;
            }
        }
        return -1;
    }

    String[] colors() {
        return MnemonicsMap;
    }
}
