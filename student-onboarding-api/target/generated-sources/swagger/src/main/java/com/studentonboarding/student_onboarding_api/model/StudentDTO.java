package com.studentonboarding.student_onboarding_api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StudentDTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-09-23T09:50:06.032350+05:30[Asia/Kolkata]")


public class StudentDTO   {
  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("degree")
  private String degree = null;

  @JsonProperty("specialization")
  private String specialization = null;

  @JsonProperty("institution")
  private String institution = null;

  @JsonProperty("cgpa")
  private Double cgpa = null;

  @JsonProperty("year")
  private Integer year = null;

  @JsonProperty("location")
  private String location = null;

  public StudentDTO firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
   **/
  @Schema(description = "")
  
    public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public StudentDTO degree(String degree) {
    this.degree = degree;
    return this;
  }

  /**
   * Get degree
   * @return degree
   **/
  @Schema(description = "")
  
    public String getDegree() {
    return degree;
  }

  public void setDegree(String degree) {
    this.degree = degree;
  }

  public StudentDTO specialization(String specialization) {
    this.specialization = specialization;
    return this;
  }

  /**
   * Get specialization
   * @return specialization
   **/
  @Schema(description = "")
  
    public String getSpecialization() {
    return specialization;
  }

  public void setSpecialization(String specialization) {
    this.specialization = specialization;
  }

  public StudentDTO institution(String institution) {
    this.institution = institution;
    return this;
  }

  /**
   * Get institution
   * @return institution
   **/
  @Schema(description = "")
  
    public String getInstitution() {
    return institution;
  }

  public void setInstitution(String institution) {
    this.institution = institution;
  }

  public StudentDTO cgpa(Double cgpa) {
    this.cgpa = cgpa;
    return this;
  }

  /**
   * Get cgpa
   * @return cgpa
   **/
  @Schema(description = "")
  
    public Double getCgpa() {
    return cgpa;
  }

  public void setCgpa(Double cgpa) {
    this.cgpa = cgpa;
  }

  public StudentDTO year(Integer year) {
    this.year = year;
    return this;
  }

  /**
   * Get year
   * @return year
   **/
  @Schema(description = "")
  
    public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  public StudentDTO location(String location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
   **/
  @Schema(description = "")
  
    public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudentDTO studentDTO = (StudentDTO) o;
    return Objects.equals(this.firstName, studentDTO.firstName) &&
        Objects.equals(this.degree, studentDTO.degree) &&
        Objects.equals(this.specialization, studentDTO.specialization) &&
        Objects.equals(this.institution, studentDTO.institution) &&
        Objects.equals(this.cgpa, studentDTO.cgpa) &&
        Objects.equals(this.year, studentDTO.year) &&
        Objects.equals(this.location, studentDTO.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, degree, specialization, institution, cgpa, year, location);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentDTO {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    degree: ").append(toIndentedString(degree)).append("\n");
    sb.append("    specialization: ").append(toIndentedString(specialization)).append("\n");
    sb.append("    institution: ").append(toIndentedString(institution)).append("\n");
    sb.append("    cgpa: ").append(toIndentedString(cgpa)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
