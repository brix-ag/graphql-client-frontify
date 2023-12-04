package ch.brix.gql.client.frontify.builders;

public class EmbeddedContent_workflowTask extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.WorkflowTask> {
  public EmbeddedContent_workflowTask() {
    super(new ch.brix.gql.client.Call<>("workflowTask", "WorkflowTask"));
  }
  public EmbeddedContent_workflowTask onWorkflowTask(On_WorkflowTask typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
