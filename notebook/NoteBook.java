// this program will build a notebook
// 面向对象程序设计-Java语言-翁恺
import java.util.ArrayList;

public class NoteBook {
    private ArrayList<String> notes = new ArrayList<String>();

    public void add(String s)
    {
        notes.add(s);
    }

    public void add(int location, String s)
    {
        notes.add(location, s);
    }

    public int getSize()
    {
        return notes.size();
    }

    public String getNote(int index) {
        return notes.get(index);
    }

    public void removeNote(int index)
    {
        notes.remove(index);
    }

    public String[] list() {
        String[] a = new String[notes.size()];
        for (int i = 0; i < notes.size(); i++ ) {
            a[i] = notes.get(i);

        }
        // notes.toArray(a);
        return a;
    }
    public static void main(String[] args) {
        NoteBook nb = new NoteBook();
        nb.add("the first line");
        nb.add("the second line");
        nb.add("the third line");
        System.out.println(nb.getSize());
        System.out.println(nb.getNote(1));

        nb.removeNote(1); // remove the second line

        String[] a = nb.list();
        for (String s : a ) {
            System.out.println(s);
        }
    
    }

}