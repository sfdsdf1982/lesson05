public class LSP {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal animals[] = {cat,dog};
        for (Animal animal : animals) {
            animal.makeVoice();
        }

    }
}
