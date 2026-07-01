package in.ashokit.entities;

@Entity
  @Table(name="DCEducationEntity")
  @Data
public class DCEducationEntity {

  @Id
  @GeneratedValue 
  private Integer eduId;
  private Long caseNum;
  private String highestQualification;
  private Integer graduationYear;
  
}
