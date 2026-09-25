package ch.brix.gql.client.frontify.builders;

public class WorkflowStatus_assignedUsers extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.interfaces.User>> {
  public WorkflowStatus_assignedUsers() {
    super(new ch.brix.gql.client.Call<>("assignedUsers", "User"));
  }
  public WorkflowStatus_assignedUsers onAccountUser(On_AccountUser typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public WorkflowStatus_assignedUsers onUser(On_User typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
