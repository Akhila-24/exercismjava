class RnaTranscription {

    String transcribe(String dnaStrand) {
        String s="";
        for(int k=0;k<dnaStrand.length();k++)
            {
                char i=dnaStrand.charAt(k);
                if(i=='G')
                    s=s+'C';
                else
                    if(i=='C')
                        s=s+'G';
                    else
                        if(i=='T')
                            s=s+'A';
                        else
                            if(i=='A')
                                s=s+'U';
                
            }
        return s;
    }

}
