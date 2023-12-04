package ch.brix.gql.client.frontify.builders;

public class RootMutation_createWorkflowStatus extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CreateWorkflowStatus> {
  public RootMutation_createWorkflowStatus() {
    super(new ch.brix.gql.client.Call<>("createWorkflowStatus", "CreateWorkflowStatus"));
  }
  public RootMutation_createWorkflowStatus args(RootMutation_createWorkflowStatus_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_createWorkflowStatus onCreateWorkflowStatus(On_CreateWorkflowStatus typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
