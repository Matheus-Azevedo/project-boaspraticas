package br.unipe.boaspraticas.exercicios.oc;


// Identifique quais são as regras que , neste exemplo, a classe Customer não segue em relação a Object Calisthenics:
// Antes de olhar o arquivo texto com as respostas, tente descrever o que você identificou.
public class Customer {
    private String name;
    private int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Getters e Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

