package inheritancePractice;

class University {
    private Person[] people;
    private int count;

    public University(int size) {
        this.people = new Person[size];
        this.count = 0;
    }

    public void addPerson(Person p) {
        if (count < people.length) {
            people[count] = p; // Upcasting: Student/Professor -> Person
            count++;
        } else {
            System.out.println("University is full!");
        }
    }

    public void showPeople() {
        for (int i = 0; i < count; i++) {
            people[i].displayInfo();
            
            // Downcasting example
            if (people[i] instanceof Student) {
                Student s = (Student) people[i]; // Downcasting: Person -> Student
                System.out.println("(Downcasted) Student ID: " + s.getStudentId());
            } else if (people[i] instanceof Professor) {
                Professor p = (Professor) people[i]; // Downcasting: Person -> Professor
                System.out.println("(Downcasted) Specialization: " + p.getSpecialization());
            }
            System.out.println();
        }
    }
}