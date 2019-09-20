package za.ac.cputassignment.domain.person;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

import java.util.Objects;

@EntityScan
public class Student {

        @Id
        private String id;
        private String studentNum;
        private String firstname,lastname;
        private int age;


        private Student(){}


        private Student(Builder builder)
        {
            this.id =builder.id;
            this.studentNum = builder.studentNum;
            this.firstname =builder.firstname;
            this.lastname =builder.lastname;
            this.age =builder.age;

        }

    public String getId() {
        return id;
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

    @Override
    public void profile() {

    }

    @Override
    public void editProfile() {

    }

    @Override
    public void userName() {

    }

    @Override
    public void passWord() {

    }

    public static class Builder{

        private String id;
        private String studentNum;
        private String firstname,lastname;
        private int age;

        private Builder id(String id)
        {
            this.id =id;
            return this;
        }

      public Builder studentNum(String studentNum)
      {
          this.studentNum =studentNum;
          return  this;
      }

      public  Builder firstname(String firstname)
      {
          this.firstname =firstname;
          return  this;
      }

      public Builder lastname(String lastname)
      {
          this.lastname =lastname;
          return  this;
      }

      public  Builder age(int age)
      {
          this.age =age;
          return  this;
      }

      public Student build()
      {
          return  new Student(this);
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
                "studentNum='" + studentNum + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }
}
