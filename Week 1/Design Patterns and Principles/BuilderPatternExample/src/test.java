public class test {
    public static void main(String[] args) {
        // Create different configurations of Computer using the Builder
        Computer gamingPC = new Computer.Builder()
                .setCPU("Intel Core i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                
                
                .build();

        Computer homePC = new Computer.Builder()
                .setCPU("Intel Core i5")
                .setRAM("16GB")
                .setStorage("512GB SSD")
                
                .build();

        // Print the configurations
        System.out.println("Gaming PC Configuration:");
        System.out.println("CPU: " + gamingPC.getCPU());
        System.out.println("RAM: " + gamingPC.getRAM());
        System.out.println("Storage: " + gamingPC.getStorage());
        

        System.out.println("\nHome PC Configuration:");
        System.out.println("CPU: " + homePC.getCPU());
        System.out.println("RAM: " + homePC.getRAM());
        System.out.println("Storage: " + homePC.getStorage());
        
    }
}
