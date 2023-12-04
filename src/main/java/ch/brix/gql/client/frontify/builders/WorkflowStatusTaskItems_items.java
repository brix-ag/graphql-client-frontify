package ch.brix.gql.client.frontify.builders;

public class WorkflowStatusTaskItems_items extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.WorkflowTask>> {
  public WorkflowStatusTaskItems_items() {
    super(new ch.brix.gql.client.Call<>("items", "WorkflowTask"));
  }
  public WorkflowStatusTaskItems_items onWorkflowTask(On_WorkflowTask typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
