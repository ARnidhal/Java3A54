package tn.esprit.gestionzoo.entities;

public abstract non-sealed class Aquatic extends Animal {


    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    protected String habitat;

    public Aquatic() {
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }


    public abstract void  swim();
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if(obj.getClass() != this.getClass())
        {
            return false;
        }
        Aquatic aq = (Aquatic) obj;
        return this.getName().equals(aq.getName()) && this.getAge() == aq.getAge() && this.getHabitat().equals(aq.getHabitat());
    }


    @Override
    public String toString() {
        return super.toString() + ", habitat:" + habitat;
    }
}
