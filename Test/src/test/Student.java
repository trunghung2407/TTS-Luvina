/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author X1 GEN 4
 */
class Student  implements Comparable<Student> // cai lại method compareTo
{   private String code;
    private String name;
    private Integer score;
    public void setCode(String code) {
        this.code = code;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setScore(Integer score) {
        this.score = score;
    }
    public Student(String code, String name, Integer score) {
        this.code = code;
        this.score = score;
        this.name = name;
    }
    public Integer getScore() {
        return score;
    }
    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return "(" + code + "," + score + ")";
    }
//    public int compareTo(Object other)
//    {
//          Student otherStu = (Student) other;
//          return code.compareTo(otherStu.code);
//    }
    public int compareTo(Student other) {
          return this.name.compareTo(other.name);
//        int i1= code.compareTo(other.code);
//        if (i1!=0) return i1;
//        // =0
//        int i2=name.compareTo(other.name);
//        if (i2!=0) return i2;
//        int i3=score.compareTo(other.score);
//        return i3;
        // code, name, score
//          if (this.score.equals(other.score))
//              return 0;
//          else
//               if (this.score>other.score)
//                    return 1;
//               else 
//                   return -1;          
    }
}

