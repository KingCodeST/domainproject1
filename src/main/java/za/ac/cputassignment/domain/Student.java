package za.ac.cputassignment.domain;

import java.util.Objects;

public class Student {

        private String studentNum;
        private String firstname,lastname;
        private int age;


        private Student(){}


        private Student(Builder builder)
        {
            this.studentNum = builder.studentNum;
            this.firstname =builder.firstname;
            this.lastname =builder.lastname;
            this.age =builder.age;

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

    public static class Builder{

        private String studentNum;
        private String firstname,lastname;
        private int age;

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
