package Java8Features;

class Student {
    Student() {
        System.out.println("Created");
    }
}

interface Factory {
    Student create();
}
