package Factory_Method;

interface AnimalInterface{
    void Speak();
}

class Duck implements AnimalInterface{
    @Override
    public void Speak(){
        System.out.println("Duck speaks");
    }
}

class Tiger implements AnimalInterface{
    @Override
    public void Speak() {
        System.out.println("Tiger speaks");
    }
}



