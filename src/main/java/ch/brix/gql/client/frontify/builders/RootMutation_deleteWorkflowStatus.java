package ch.brix.gql.client.frontify.builders;

public class RootMutation_deleteWorkflowStatus extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.DeleteWorkflowStatus> {
  public RootMutation_deleteWorkflowStatus() {
    super(new ch.brix.gql.client.Call<>("deleteWorkflowStatus", "DeleteWorkflowStatus"));
  }
  public RootMutation_deleteWorkflowStatus args(RootMutation_deleteWorkflowStatus_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_deleteWorkflowStatus onDeleteWorkflowStatus(On_DeleteWorkflowStatus typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
