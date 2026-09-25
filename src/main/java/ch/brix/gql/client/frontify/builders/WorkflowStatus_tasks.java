package ch.brix.gql.client.frontify.builders;

public class WorkflowStatus_tasks extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.WorkflowStatusTaskItems> {
  public WorkflowStatus_tasks() {
    super(new ch.brix.gql.client.Call<>("tasks", "WorkflowStatusTaskItems"));
  }
  public WorkflowStatus_tasks args(WorkflowStatus_tasks_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public WorkflowStatus_tasks onWorkflowStatusTaskItems(On_WorkflowStatusTaskItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
