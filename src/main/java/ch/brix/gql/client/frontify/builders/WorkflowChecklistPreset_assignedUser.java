package ch.brix.gql.client.frontify.builders;

public class WorkflowChecklistPreset_assignedUser extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.interfaces.User> {
  public WorkflowChecklistPreset_assignedUser() {
    super(new ch.brix.gql.client.Call<>("assignedUser", "User"));
  }
  public WorkflowChecklistPreset_assignedUser onAccountUser(On_AccountUser typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public WorkflowChecklistPreset_assignedUser onUser(On_User typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
