package in.ashokit.entities;

  @Entity
  @Table(name="DC_CHILDREN")
  @Data
public class DCChildreenEntity {

  @Id
  @Generatedvalue
  private Integer childId;
  private LocalDate dob;
  private Long childSsn;
}
