class Christmas
{
    public static void main(String args[])
    {
        String s="On the $ day of Christmas my true love gave to me: ";
        String mainstring="";
        String temp="";
        for(int i=1;i<=12;i++)
        {
            switch(i)
            {
                case 1:
                temp=s.replace("$","first");
                mainstring="a patridge in a pear tree";
                System.out.println(temp+mainstring);
                break;
                case 2:
                temp=s.replace("$","second");
                mainstring="two turtle doves ,and"+mainstring;
                System.out.println(temp+mainstring);
                break;
                case 3:
                temp=s.replace("$","third");
                mainstring="three french hens , "+mainstring;
                System.out.println(temp+mainstring);
                break;
                case 4:
                temp=s.replace("$","fourth");
                mainstring="four calling birds ,"+mainstring;
                System.out.println(temp+mainstring);
                break;
                case 5:
                temp=s.replace("$","fifth");
                mainstring="five gold rings ,"+mainstring;
                System.out.println(temp+mainstring);
                break;
                case 6:
                temp=s.replace("$","sixth");
                mainstring="six geese-a-laying ,"+mainstring;
                System.out.println(temp+mainstring);
                break;
                case 7:
                temp=s.replace("$","seventh");
                mainstring="seven swans-a-Swimming ,"+mainstring;
                System.out.println(temp+mainstring);
                break;
                case 8:
                temp=s.replace("$","eighth");
                mainstring="eight maids-a-milking ,"+mainstring;
                System.out.println(temp+mainstring);
                break;
                case 9:
                temp=s.replace("$","ninth");
                mainstring="nine ladies dancing ,"+mainstring;
                System.out.println(temp+mainstring);
                break;
                case 10:
                temp=s.replace("$","tenth");
                mainstring="ten lords-a-leaping ,"+mainstring;
                System.out.println(temp+mainstring);
                break;
                case 11:
                temp=s.replace("$","eleventh");
                mainstring="eleven pipers piping ,"+mainstring;
                System.out.println(temp+mainstring);
                break;
                case 12:
                temp=s.replace("$","twelfth");
                mainstring="twelve days drumming ,"+mainstring;
                System.out.println(temp+mainstring);
                break;

            }
        }

    }
}