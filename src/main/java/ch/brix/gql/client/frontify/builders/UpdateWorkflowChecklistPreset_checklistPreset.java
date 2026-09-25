package ch.brix.gql.client.frontify.builders;

public class UpdateWorkflowChecklistPreset_checklistPreset extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.WorkflowChecklistPreset> {
  public UpdateWorkflowChecklistPreset_checklistPreset() {
    super(new ch.brix.gql.client.Call<>("checklistPreset", "WorkflowChecklistPreset"));
  }
  public UpdateWorkflowChecklistPreset_checklistPreset onWorkflowChecklistPreset(On_WorkflowChecklistPreset typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
