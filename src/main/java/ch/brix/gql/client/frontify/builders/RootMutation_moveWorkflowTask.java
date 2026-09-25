package ch.brix.gql.client.frontify.builders;

public class RootMutation_moveWorkflowTask extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.MoveWorkflowTask> {
  public RootMutation_moveWorkflowTask() {
    super(new ch.brix.gql.client.Call<>("moveWorkflowTask", "MoveWorkflowTask"));
  }
  public RootMutation_moveWorkflowTask args(RootMutation_moveWorkflowTask_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_moveWorkflowTask onMoveWorkflowTask(On_MoveWorkflowTask typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
