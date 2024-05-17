class Program_4 {
    private String name;
    private int id;

    Program_4() {
        System.out.println("Default constructor called.");
        name = "Prajapati Manav";
        id = 158;
    }

    Program_4(String name, int id) {
        System.out.println("Parameterized constructor called.");
        this.name = name;
        this.id = id;
    }
    String getName() {
        return name;
    }
    int getId()
    {
        return id;
    }
    public static void main(String[] args)
    {
        Program_4 obj1 = new Program_4();
        System.out.println("Name: " + obj1.getName() + ", ID: " + obj1.getId());

        Program_4 obj2 = new Program_4("Prajapati Manav", 158);
        System.out.println("Name: " + obj2.getName() + ", ID: " + obj2.getId());
    }
}