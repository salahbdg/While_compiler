package TAC;

// Représente un label utilise pour les sauts dans le code 3 adresses
public class Label extends Instruction {
    private String name; 
    private static int cpt = 0; 

    public Label(String name) {
        this.name = name + "_" + cpt;
        cpt++;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return name + ":";
    }
}
