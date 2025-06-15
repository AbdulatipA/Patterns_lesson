package org.example.patterns_lesson.patterns.builder;

// 1. Product - конечный объект, который мы будем собирать
class Computer {
    private String CPU;
    private String RAM;
    private String storage;
    private String GPU;
    private boolean hasSSD;

    public String getCPU() { return CPU; }
    public String getRAM() { return RAM; }
    public String getStorage() { return storage; }
    public String getGPU() { return GPU; }
    public boolean isHasSSD() { return hasSSD; }


    public void setCPU(String CPU) {
        this.CPU = CPU;
    }
    public void setRAM(String RAM) {
        this.RAM = RAM;
    }
    public void setStorage(String storage) {
        this.storage = storage;
    }
    public void setGPU(String GPU) {
        this.GPU = GPU;
    }
    public void setHasSSD(boolean hasSSD) {
        this.hasSSD = hasSSD;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", storage='" + storage + '\'' +
                ", GPU='" + GPU + '\'' +
                ", hasSSD=" + hasSSD +
                '}';
    }

    static class Builder {
        private String CPU;
        private String RAM;
        private String storage;
        private String GPU;
        private boolean hasSSD;


        public Builder setCPU(String CPU) {
             this.CPU = CPU;
             return this;
        }

        public Builder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        public Builder setHasSSD(boolean hasSSD) {
            this.hasSSD = hasSSD;
            return this;
        }


        public Computer build() {
            Computer computer = new Computer();
            computer.setCPU(CPU);
            computer.setRAM(RAM);
            computer.setStorage(storage);
            computer.setGPU(GPU);
            computer.setHasSSD(hasSSD);
            return computer;
        }
    }

    static Builder builder() {
        return new Builder();
    }
}