package lesson9.computer;

import java.util.ArrayList;

public class MyComputers {
    public static void main(String[] args) {

        ArrayList<Computer> myComputers = new ArrayList<>();
        myComputers.add(new Computer(
                                    new GraphicCard(400, "nvidia"),
                                    1000,
                                    new Chip("chip1", 100,5),
                                    new Memory[]{
                                            new Memory(1, "memory1"),
                                            new Memory(2, "memory2"),
                                            new Memory(3, "memory3"),
                                            new Memory(4, "memory4"),
                                    },
                                    new SolidDrive("solid-drive", 10)
        ));
        myComputers.add(new Computer(
                                    new GraphicCard(500, "nvidia1"),
                                    2000,
                                    new Chip("chip2", 200,6),
                                    new Memory[]{
                                            new Memory(1, "memory1"),
                                            new Memory(1, "memory1"),
                                            new Memory(3, "memory3"),
                                            new Memory(4, "memory4"),
                                    },
                                    new SolidDrive("solid-drive2", 20)
        ));
        myComputers.add(new Computer(
                                    new GraphicCard(600, "nvidia2"),
                                    3000,
                                    new Chip("chip3", 200,5),
                                    new Memory[]{
                                            new Memory(1, "memory1"),
                                            new Memory(2, "memory2"),
                                            new Memory(3, "memory3"),
                                            new Memory(4, "memory4"),
                                    },
                                    new SolidDrive("solid-drive3", 10)
        ));
        myComputers.add(new Computer(
                                    new GraphicCard(100, "nvidia3"),
                                    4000,
                                    new Chip("chip4", 100,5),
                                    new Memory[]{
                                            new Memory(1, "memory1"),
                                            new Memory(2, "memory2"),
                                            new Memory(3, "memory3"),
                                            new Memory(4, "memory4"),
                                    },
                                    new SolidDrive("solid-drive4", 10)
        ));

        myComputers.forEach(computer -> System.out.println(computer));

    }
}
