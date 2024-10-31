package de.bht.pr2.lab01;

public class Student {

  //-------------------------------------------
  // Attribute
  private final String name;

  // Matrikelnummer
  private final int registrationNumber;

  // Medieninformatik, Technische Informatik, Druck- und Medientechnik und Screen Based Media
  private final String courseOfStudies;

  // Rückmeldegebühr
  public static final int TUITION_FEE = 312;

  /**
   * This contructor parses a comma-separated row describing a student object.
   *
   * @param dataRow a comma-separated row describing a student object
   */
  public Student(String dataRow) throws StudentParseException, RegistrationNumberException, WrongCourseOfStudiesException, NotPaidTuitionFeeException {
    // TODO: Here goes your code ...
    String[] parts = dataRow.split(",");
    if (parts.length < 4){
      throw new StudentParseException(dataRow);
    }
    this.name = parts[0].trim();
    try{
      this.registrationNumber = Integer.parseInt(parts[1].trim());
    }catch (NumberFormatException e){
      throw new RegistrationNumberException(parts[1].trim());
    }
    this.courseOfStudies = parts[2].trim();
    if(!isValidCourseOfStudies(this.courseOfStudies)){
      throw new WrongCourseOfStudiesException(this.courseOfStudies);
    }
    int paidFee;
    try{
      paidFee = Integer.parseInt(parts[3].trim());
    }catch (NumberFormatException e){
      throw new StudentParseException(dataRow);
    }
    if (paidFee < TUITION_FEE){
      throw new NotPaidTuitionFeeException(paidFee);
    }
  }
  private boolean isValidCourseOfStudies (String course){
    return course.equals("Medieninformatik") || course.equals("Teschnische Informatik") || course.equals("Druck-und Medientechnik") || course.equals("Screen Based Media");
  }
  @Override
  public String toString(){
    return "Student{name ='" + name + "',registrationNumber=" + registrationNumber + ", courseOfStudies='" + courseOfStudies + "'}";
  }
}
