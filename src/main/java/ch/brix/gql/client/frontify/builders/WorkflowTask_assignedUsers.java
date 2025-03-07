package ch.brix.gql.client.frontify.builders;

public class WorkflowTask_assignedUsers extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.interfaces.User>> {
  public WorkflowTask_assignedUsers() {
    super(new ch.brix.gql.client.Call<>("assignedUsers", "User"));
  }
  public WorkflowTask_assignedUsers onAccountUser(On_AccountUser typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public WorkflowTask_assignedUsers onUser(On_User typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
