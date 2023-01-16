package lesson9.computer;

import java.util.Arrays;

public class Computer {

    private GraphicCard graphicCard;
    private double price;
    private Chip chip;
    private Memory[] memory;
    private SolidDrive solidDrive;

    public Computer(GraphicCard graphicCard, double price, Chip chip, Memory[] memory, SolidDrive solidDrive) {
        this.graphicCard = graphicCard;
        this.price = price;
        this.chip = chip;
        this.memory = memory;
        this.solidDrive = solidDrive;
    }

    public GraphicCard getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(GraphicCard graphicCard) {
        this.graphicCard = graphicCard;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Chip getChip() {
        return chip;
    }

    public void setChip(Chip chip) {
        this.chip = chip;
    }

    public Memory[] getMemory() {
        return memory;
    }

    public void setMemory(Memory[] memory) {
        this.memory = memory;
    }

    public SolidDrive getSolidDrive() {
        return solidDrive;
    }

    public void setSolidDrive(SolidDrive solidDrive) {
        this.solidDrive = solidDrive;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "graphicCard=" + graphicCard +
                ", price=" + price +
                ", chip=" + chip +
                ", memory=" + Arrays.toString(memory) +
                ", solidDrive=" + solidDrive +
                '}';
    }
}
