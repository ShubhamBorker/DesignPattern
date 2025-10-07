package org.example.Creational.Builder;

import java.util.Locale;

public class House {
    private final String foundation;
    private final String structure;
    private final String roof;
    private final boolean hasGarage;
    private final boolean hasSwimmingPool;
    private final boolean hasGarden;

    private House(Builder builder) {
        this.foundation = builder.foundation;
        this.structure = builder.structure;
        this.roof = builder.roof;
        this.hasGarage = builder.hasGarage;
        this.hasGarden = builder.hasGarden;
        this.hasSwimmingPool = builder.hasSwimmingPool;
    }

    public static class Builder{
        private final String foundation;
        private final String structure;
        private final String roof;
        private boolean hasGarage;
        private boolean hasSwimmingPool;
        private boolean hasGarden;

        public Builder(String foundation, String structure, String roof) {
            this.foundation = foundation;
            this.structure = structure;
            this.roof = roof;
        }

        public Builder withGarage(boolean value){
        this.hasGarage =value;
        return this;
        }

        public Builder withSwimmingPool(boolean value){
            this.hasSwimmingPool = value;
            return this;
        }
        public Builder withGarden(boolean value){
            this.hasGarden = value;
            return this;
        }
        public House build(){
            return new House(this);
        }
    }

    @Override
    public String toString(){
        return "House{" +
                "foundation='" + foundation + '\'' +
                ", structure='" + structure + '\'' +
                ", roof='" + roof + '\'' +
                ", hasGarage=" + hasGarage +
                ", hasGarden=" + hasGarden +
                ", hasSwimmingPool=" + hasSwimmingPool +
                '}';

    }
    }
