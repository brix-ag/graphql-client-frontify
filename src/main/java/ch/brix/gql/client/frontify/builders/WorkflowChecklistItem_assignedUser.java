package ch.brix.gql.client.frontify.builders;

public class WorkflowChecklistItem_assignedUser extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.interfaces.User> {
  public WorkflowChecklistItem_assignedUser() {
    super(new ch.brix.gql.client.Call<>("assignedUser", "User"));
  }
  public WorkflowChecklistItem_assignedUser onAccountUser(On_AccountUser typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public WorkflowChecklistItem_assignedUser onUser(On_User typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
