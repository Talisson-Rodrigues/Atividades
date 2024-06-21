public class ProgramaAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        

        Dog d1 = new Dog();
        d1.setName("Rex");
        d1.setAge(5);
        d1.setBreed("Pitbull");

        System.out.println("--------------------");
        System.out.println("Nome: " + d1.getName());
        System.out.println("Idade: " + d1.getAge());
        System.out.println("Raca: " + d1.getBreed());

       Cat c1 = new Cat();
        c1.setName("Branquinho");
        c1.setAge(5);
        c1.setFurColor("Branco-acinzentado");

        System.out.println("--------------------");
        System.out.println("Nome: " + c1.getName());
        System.out.println("Idade: " + c1.getAge());
        System.out.println("Raca: " + c1.getFurColor());
        System.out.println("--------------------"); 

        animal.voice();
    }
}