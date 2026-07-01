package in.ashokit.entities;

  @Entity
  @Table(name="DC_INCOME")
  @Data
public class DCIncomeEntity {

  @Id
  @GeneratedValue
  private Integer incomeId;
  private Long caseNum;
  private Double empIncome;
  private Double propertyIncome;
}
