package ch.brix.gql.client.frontify.builders;

public class RootMutation_updateWorkflowStatus extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.UpdateWorkflowStatus> {
  public RootMutation_updateWorkflowStatus() {
    super(new ch.brix.gql.client.Call<>("updateWorkflowStatus", "UpdateWorkflowStatus"));
  }
  public RootMutation_updateWorkflowStatus args(RootMutation_updateWorkflowStatus_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_updateWorkflowStatus onUpdateWorkflowStatus(On_UpdateWorkflowStatus typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
