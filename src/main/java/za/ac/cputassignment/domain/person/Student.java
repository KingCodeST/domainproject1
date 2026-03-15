package za.ac.cputassignment.domain.person;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Objects;

@Entity
@Table(name = "students", uniqueConstraints = {
        @UniqueConstraint(columnNames = "studentNum")
})
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false, unique = true, length = 20)
    @NotBlank(message = "Student number is required")
    private String studentNum;

    @Column(nullable = false, length = 50)
    @NotBlank(message = "First name is required")
    @Size(min = 2, max = 50, message = "First name must be between 2 and 50 characters")
    private String firstname;

    @Column(nullable = false, length = 50)
    @NotBlank(message = "Last name is required")
    @Size(min = 2, max = 50, message = "Last name must be between 2 and 50 characters")
    private String lastname;

    @Column(nullable = false)
    @Min(value = 15, message = "Age must be at least 15")
    @Max(value = 120, message = "Age must be 120 or less")
    private int age;

    @Column(length = 20)
    private String gender;

    @Column(length = 20)
    private String race;

    private Student() {
    }

    private Student(Builder builder) {
        this.studentNum = builder.studentNum;
        this.firstname = builder.firstname;
        this.lastname = builder.lastname;
        this.age = builder.age;
        this.gender = builder.gender;
        this.race = builder.race;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public String getRace() {
        return race;
    }

    public String getStudentNum() {
        return studentNum;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public static class Builder {
        private String studentNum;
        private String firstname;
        private String lastname;
        private int age;
        private String gender;
        private String race;

        public Builder studentNum(String studentNum) {
            this.studentNum = studentNum;
            return this;
        }

        public Builder firstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public Builder lastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder race(String race) {
            this.race = race;
            return this;
        }

        public Builder copy(Student student) {
            this.firstname = student.firstname;
            this.lastname = student.lastname;
            this.age = student.age;
            this.studentNum = student.studentNum;
            this.gender = student.gender;
            this.race = student.race;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentNum.equals(student.studentNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentNum);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", studentNum='" + studentNum + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", race='" + race + '\'' +
                '}';
    }
}
