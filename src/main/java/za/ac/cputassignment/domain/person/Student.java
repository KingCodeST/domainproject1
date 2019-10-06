package za.ac.cputassignment.domain.person;

import org.springframework.boot.autoconfigure.domain.EntityScan;


import javax.persistence.Id;
import java.util.Objects;

@EntityScan
public class Student {

        @Id
        private String id;
        private String studentNum;
        private String firstname,lastname;
        private int age;
        private String gender;
        private String race;


        private Student(){}


        private Student(Builder builder)
        {

            this.studentNum = builder.studentNum;
            this.firstname =builder.firstname;
            this.lastname =builder.lastname;
            this.age =builder.age;
            this.gender=builder.gender;
            this.race =builder.race;

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



    public static class Builder{


        private String studentNum;
        private String firstname,lastname;
        private int age;
        private String gender;
        private String race;


      public Builder studentNum(String studentNum)
      {
          this.studentNum =studentNum;
          return  this;
      }

        public Builder setGender(String gender)
        {
            this.gender =gender;
            return  this;
        }

        public Builder setRace(String race)
        {
            this.race =race;
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

      public Builder copy(Student student){
          this.firstname =student.firstname;
          this.lastname =student.lastname;
          this.age =student.age;
          this.studentNum =student.studentNum;
          this.gender =student.gender;
          this.race =student.race;
          return this;
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
