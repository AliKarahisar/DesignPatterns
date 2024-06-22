public class FactoryMethodPatternDemo {
    public static void main(String[] args) {
        ComputerFactory pcFactory = new PCFactory("16 GB", "1 TB", "2.9 GHz");
        Computer pc = pcFactory.createComputer();
        System.out.println("Factory PC Config::" + pc);

        ComputerFactory serverFactory = new ServerFactory("32 GB", "2 TB", "3.2 GHz");
        Computer server = serverFactory.createComputer();
        System.out.println("Factory Server Config::" + server);
    }
}