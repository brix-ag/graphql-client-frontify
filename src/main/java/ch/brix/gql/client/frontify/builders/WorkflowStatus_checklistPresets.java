package ch.brix.gql.client.frontify.builders;

public class WorkflowStatus_checklistPresets extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.WorkflowChecklistPreset>> {
  public WorkflowStatus_checklistPresets() {
    super(new ch.brix.gql.client.Call<>("checklistPresets", "WorkflowChecklistPreset"));
  }
  public WorkflowStatus_checklistPresets onWorkflowChecklistPreset(On_WorkflowChecklistPreset typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
