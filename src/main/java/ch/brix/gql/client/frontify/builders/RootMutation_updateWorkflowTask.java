package ch.brix.gql.client.frontify.builders;

public class RootMutation_updateWorkflowTask extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.UpdateWorkflowTask> {
  public RootMutation_updateWorkflowTask() {
    super(new ch.brix.gql.client.Call<>("updateWorkflowTask", "UpdateWorkflowTask"));
  }
  public RootMutation_updateWorkflowTask args(RootMutation_updateWorkflowTask_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_updateWorkflowTask onUpdateWorkflowTask(On_UpdateWorkflowTask typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
