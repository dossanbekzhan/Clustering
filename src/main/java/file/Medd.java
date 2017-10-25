package file;

/**
 * Created by beka on 10/23/17.
 */
public class Medd {
    private String name;
    private int position;

    public Medd(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
