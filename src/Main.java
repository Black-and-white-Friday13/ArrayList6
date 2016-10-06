import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++)
        {
            list.add(reader.readLine());
        }

        ArrayList<String> result = doubleValues(list);

        for (String j : result)
        {
            System.out.println(j);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list)
    {
        for (int i = 0; i < list.size(); i+=2)
        {
            list.add(i, list.get(i));
        }

        return list;
    }
}
