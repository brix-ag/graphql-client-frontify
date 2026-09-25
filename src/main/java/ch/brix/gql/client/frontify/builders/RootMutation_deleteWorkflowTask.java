package ch.brix.gql.client.frontify.builders;

public class RootMutation_deleteWorkflowTask extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.DeleteWorkflowTask> {
  public RootMutation_deleteWorkflowTask() {
    super(new ch.brix.gql.client.Call<>("deleteWorkflowTask", "DeleteWorkflowTask"));
  }
  public RootMutation_deleteWorkflowTask args(RootMutation_deleteWorkflowTask_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_deleteWorkflowTask onDeleteWorkflowTask(On_DeleteWorkflowTask typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
