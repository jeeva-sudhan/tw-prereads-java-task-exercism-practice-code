class RnaTranscription {

    String transcribe(String dnaStrand) {
        String result = "";
        int length = dnaStrand.length();
        char ch = '\u0000';
        for(int iterator=0;iterator<length;iterator++) {
            ch = dnaStrand.charAt(iterator);
            if(ch == 'G') {
              result += 'C';
            }
            else if(ch == 'C') {
                result += 'G';
            }
            else if(ch == 'T') {
                result += 'A';
            }
            else if(ch == 'A') {
                result += 'U';
            }
        }
        return result;
    }

}
